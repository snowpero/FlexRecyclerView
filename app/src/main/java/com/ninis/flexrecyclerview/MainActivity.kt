package com.ninis.flexrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ninis.flexrecyclerview.network.ApiService
import com.ninis.flexrecyclerview.network.RetrofitManager
import com.ninis.flexrecyclerview.adapter.FlexAdapter
import com.ninis.flexrecyclerview.adapter.FooterAdapter
import com.ninis.flexrecyclerview.adapter.HeaderAdapter
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.data.ImageItemModel
import com.ninis.flexrecyclerview.data.TextItemModel
import com.ninis.flexrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by lazy {
        MainViewModel(RetrofitManager.getRetrofitService(ApiService::class.java))
    }

    val itemDecoration: DividerItemDecoration by lazy {
        DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL)
    }

    val flexAdapter = FlexAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.rvMainList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ConcatAdapter(
                HeaderAdapter(),
                flexAdapter,
                FooterAdapter()
            )
            ContextCompat.getDrawable(this@MainActivity, R.drawable.recyclerview_vertical_divider)?.let {
                itemDecoration.setDrawable(
                    it
                )
            }
            addItemDecoration(itemDecoration)
        }

        viewModel.getData()
//        setTestData()

        viewModel.listItems.observe(this, Observer {
            flexAdapter.setItem(it)
        })
    }

    private fun setTestData() {
        val testItems = ArrayList<BaseItemModel>()
        testItems.add(TextItemModel())
        testItems.add(ImageItemModel())
        for( i in 1..10 ) {
            testItems.add(BaseItemModel())
        }
        testItems.add(ImageItemModel())

        flexAdapter.items.addAll(testItems)
        flexAdapter.notifyDataSetChanged()
    }
}

package com.android.learningdays.fragment

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.android.learningdays.R
import com.android.learningdays.adapter.HomeData
import com.android.learningdays.adapter.HomeFragmentAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //得到从MainActivity传过来的参数，然后弹出来
        val args = arguments!!.getString("Home")
        Toast.makeText(this.context!!, args, Toast.LENGTH_LONG).show()


        //初始化Recycler view
        rclv_home.apply {
            this.adapter =
                HomeFragmentAdapter(
                    listOf(
                        HomeData(userName = "Header", age = 18, image = ""),
                        HomeData(userName = "Nylon-1", age = 28, image = ""),
                        HomeData(userName = "Nylon-2", age = 28, image = ""),
                        HomeData(userName = "Nylon-3", age = 28, image = ""),
                        HomeData(userName = "Nylon-4", age = 28, image = ""),
                        HomeData(userName = "Nylon-5", age = 28, image = ""),
                        HomeData(userName = "Nylon-6", age = 28, image = ""),
                        HomeData(userName = "Nylon-7", age = 28, image = "")
                    )
                )
            layoutManager = LinearLayoutManager(this@HomeFragment.context, VERTICAL, false)

            addItemDecoration(DividerItemDecoration(this@HomeFragment.context, HORIZONTAL))
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
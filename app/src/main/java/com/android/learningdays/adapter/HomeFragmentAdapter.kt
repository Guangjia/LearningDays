package com.android.learningdays.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.learningdays.R
import org.w3c.dom.Text

class HomeFragmentAdapter(val list: List<HomeData>) :
    RecyclerView.Adapter<SealedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SealedViewHolder {
        return if (viewType == HEADER) {
            SealedViewHolder.HeaderViewHolder(
                LayoutInflater.from(parent.context!!).inflate(
                    R.layout.header,
                    parent,
                    false
                )
            )
        } else {
            SealedViewHolder.ItemViewHolder(
                LayoutInflater.from(parent.context!!).inflate(
                    R.layout.item,
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SealedViewHolder, position: Int) {
        when (holder) {
            is SealedViewHolder.HeaderViewHolder -> holder.onBind(list[position])
            is SealedViewHolder.ItemViewHolder -> holder.onBind(list[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            HEADER
        } else ITEM
    }

    companion object {
        const val HEADER = 0
        const val ITEM = 1

    }
}

data class HomeData(
    val userName: String,
    val age: Int,
    val image: String
)


sealed class SealedViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    class HeaderViewHolder(headerView: View) : SealedViewHolder(headerView) {
        fun onBind(data: HomeData) {
            itemView.findViewById<TextView>(R.id.header).text =
                data.userName + "Welcome to learn recyclerview"
        }
    }

    class ItemViewHolder(itemView: View) : SealedViewHolder(itemView) {
        fun onBind(data: HomeData) {
            itemView.findViewById<TextView>(R.id.itemId).text = data.userName
        }
    }
}
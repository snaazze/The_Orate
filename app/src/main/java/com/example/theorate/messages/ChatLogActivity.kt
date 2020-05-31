package com.example.theorate.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.theorate.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chat_log.*


class ChatLogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_log)
        supportActionBar?.title = "Chat Log"
        val adapter =GroupAdapter<ViewHolder>()

        adapter.add(ChatItem())
        adapter.add(ChatItem())
        adapter.add(ChatItem())
        adapter.add(ChatItem())
        recyclerview_chatlog.adapter= adapter
    }
}
class ChatItem: Item<ViewHolder>()
{
    override fun bind(viewHolder: ViewHolder, position: Int) {

    }
    override fun getLayout(): Int
    {
        return R.layout.chat_from_row
    }
}
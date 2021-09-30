package au.edu.swin.sdmd.w07_booklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookList = findViewById<RecyclerView>(R.id.bookList)

        bookList.adapter = BookAdaptor()
        bookList.layoutManager = LinearLayoutManager(this)
    }

}
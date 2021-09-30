package au.edu.swin.sdmd.w07_booklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBooksList()
    }

    fun showBooksList(){
        val bookList = findViewById<RecyclerView>(R.id.bookList)

        val books = listOf<Book>()

        val book0 = Book("C++ Programming",8.8,R.drawable.cpp_textbook)
        val book1 = Book("C# Programming",8.8,R.drawable.csharp_textbook)
        val book2 = Book("eForensic Processes",8.8,R.drawable.eforensic_textbook)
        val book3 = Book("Java Programming",8.8,R.drawable.java_textbook)
        val book4 = Book("JavaScript Programming",8.8,R.drawable.javascript_textbook)
        val book5 = Book("Kotlin Programming",8.8,R.drawable.kotlin_textbook)
        val book6 = Book("Networking Configuring",8.8,R.drawable.networking_textbook)
        val book7 = Book("Node.js Programming",8.8,R.drawable.nodejs_textbook)
        val book8 = Book("PHP Programming",8.8,R.drawable.php_textkbook)
        val book9 = Book("Python Programming",8.8,R.drawable.python_textbook)

        books.toMutableList().add(book0)
        books.toMutableList().add(book1)
        books.toMutableList().add(book2)
        books.toMutableList().add(book3)
        books.toMutableList().add(book4)
        books.toMutableList().add(book5)
        books.toMutableList().add(book6)
        books.toMutableList().add(book7)
        books.toMutableList().add(book8)
        books.toMutableList().add(book9)

        bookList.adapter = BookAdaptor(books)
        bookList.layoutManager = LinearLayoutManager(this)
    }
}
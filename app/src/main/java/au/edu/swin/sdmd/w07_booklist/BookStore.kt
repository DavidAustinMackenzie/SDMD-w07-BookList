package au.edu.swin.sdmd.w07_booklist

object BookStore {
    val books = listOf(
        Book("C++ Programming",1.0f,R.drawable.cpp_textbook),
    Book("C# Programming",3.0f,R.drawable.csharp_textbook),
    Book("eForensic Processes",4.0f,R.drawable.eforensic_textbook),
    Book("Java Programming",2.5f,R.drawable.java_textbook),
    Book("JavaScript Programming",1.0f,R.drawable.javascript_textbook),
    Book("Kotlin Programming",1.5f,R.drawable.kotlin_textbook),
    Book("Networking Configuring",5.0f,R.drawable.networking_textbook),
    Book("Node.js Programming",3.5f,R.drawable.nodejs_textbook),
    Book("PHP Programming",4.0f,R.drawable.php_textkbook),
    Book("Python Programming",1.5f,R.drawable.python_textbook)
    )

    val count = books.size
}
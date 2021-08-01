package shadow.step.homework2codelabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnExample1: Button
    private lateinit var btnExample2: Button
    private lateinit var btnExample3: Button
    private lateinit var btnExample4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "Hello from MainActivity onCreate()")
        //widgets
        btnExample1 = findViewById(R.id.btnOpenExample1)
        btnExample2 = findViewById(R.id.btnOpenExample2)
        btnExample3 = findViewById(R.id.btnOpenExample3)
        btnExample4 = findViewById(R.id.btnOpenExample4)

        init()
    }

    private fun init() {
        navigation()
    }

    private fun navigation() {
        btnExample1.setOnClickListener {
            val intent = Intent(this, Example1::class.java)
            startActivity(intent)
        }
        btnExample2.setOnClickListener {
            val intent = Intent(this, Example2::class.java)
            startActivity(intent)
        }
        btnExample3.setOnClickListener {
            val intent = Intent(this, Example3one::class.java)
            startActivity(intent)
        }
        btnExample4.setOnClickListener {
            val intent = Intent(this, Example4::class.java)
            startActivity(intent)
        }
    }
}
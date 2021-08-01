package shadow.step.homework2codelabs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Example3two : AppCompatActivity() {

    private lateinit var btnSend: Button
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private var message: String? = null
    private val TAG: String = Example3two::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example3two)

        btnSend = findViewById(R.id.btnSend2)
        editText = findViewById(R.id.edittext2)
        textView = findViewById(R.id.tvActivity2)
        getIntentString()
        sendMessage()
    }

    private fun getIntentString() {
        val message = intent.getStringExtra("toSecondActivity")
        textView.text = message
    }

    private fun sendMessage() {
        btnSend.setOnClickListener {
            val intent = Intent(this, Example3one::class.java)
            message = editText.text.toString()
            intent.putExtra("toFirstActivity", message)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

}
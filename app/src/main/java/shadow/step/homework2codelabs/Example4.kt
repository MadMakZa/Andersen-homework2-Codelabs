package shadow.step.homework2codelabs

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat

class Example4 : AppCompatActivity() {

    private lateinit var editWebSite1: EditText
    private lateinit var editWebSite2: EditText
    private lateinit var shareEditText: EditText
    private lateinit var openWebSite1: Button
    private lateinit var openWebSite2: Button
    private lateinit var buttonShare: Button
    private lateinit var buttonPhoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example4)
        //widgets
        editWebSite1 = findViewById(R.id.edit_site1)
        editWebSite2 = findViewById(R.id.edit_site2)
        shareEditText = findViewById(R.id.share_edittext)
        openWebSite1 = findViewById(R.id.btn_open_website1)
        openWebSite2 = findViewById(R.id.btn_open_website2)
        buttonShare = findViewById(R.id.btn_share)
        buttonPhoto = findViewById(R.id.btn_pic)

        init()
    }

    private fun init() {
        openWebSites()
        shareText()
        createPhoto()
    }

    private fun createPhoto() {
        buttonPhoto.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            try {
                startActivityForResult(takePictureIntent, 1)
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }
    }

    private fun shareText() {
        buttonShare.setOnClickListener {
            val txt = shareEditText.text.toString()
            val mimeType = "text/plain"

            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser()
        }
    }

    private fun openWebSites() {
        openWebSite1.setOnClickListener {
            var url = openWebSite1.text.toString()
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "http://$url"
            }
            val webpage: Uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (url.isNotEmpty()) {
                startActivity(intent)
            } else {
                Log.d("ImplicitIntents", "Can't handle this!")
            }
        }
        openWebSite2.setOnClickListener {
            var loc = openWebSite2.text.toString()
            if (!loc.startsWith("geo:0,0?q=") && !loc.startsWith("geo:0,0?q=")) {
                loc = "http://$loc"
            }
            val webpage: Uri = Uri.parse(loc)
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (loc.isNotEmpty()) {
                startActivity(intent)
            } else {
                Log.d("ImplicitIntents", "Can't handle this!")
            }
        }
    }
}
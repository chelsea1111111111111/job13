package com.app.job13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.R
import com.app.job13.MainActivity2

class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var nisEdit : EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "nama"
    private val CLASS_KEY: String = "kelas"
    private val NIS_KEY: String = "nis"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.app.job13.R.layout.activity_main)
        namaEdit = findViewById(com.app.job13.R.id.namaEdit)
        kelasEdit = findViewById(com.app.job13.R.id.kelasEdit)
        nisEdit = findViewById(com.app.job13.R.id.nisEdit)
        submitBtn = findViewById(com.app.job13.R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(CLASS_KEY, kelasEdit.text.toString())
            intent.putExtra(NIS_KEY, nisEdit.text.toString())
            startActivity(intent)
        }
    }
}

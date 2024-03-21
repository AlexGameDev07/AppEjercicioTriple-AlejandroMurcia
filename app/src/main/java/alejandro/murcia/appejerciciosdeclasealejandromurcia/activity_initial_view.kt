package alejandro.murcia.appejerciciosdeclasealejandromurcia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_initial_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_initial_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEjercicio1 = findViewById<Button>(R.id.btnEjercicio1)
        btnEjercicio1.setOnClickListener {
            val ejercicio1Screen = Intent(this, activity_first_exercise::class.java)
            startActivity(ejercicio1Screen)

        }

        val btnEjercicio2 = findViewById<Button>(R.id.btnEjercicio2)
        btnEjercicio2.setOnClickListener {
            val ejercicio2Screen = Intent(this, activity_second_exercise::class.java)
            startActivity(ejercicio2Screen)
        }

        val btnEjercicio3 = findViewById<Button>(R.id.btnEjercicio3)
        btnEjercicio3.setOnClickListener {
            val ejercicio3Screen = Intent(this, activity_third_exercise::class.java)
            startActivity(ejercicio3Screen)
        }
    }
}
package alejandro.murcia.appejerciciosdeclasealejandromurcia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_third_exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_exercise)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNum = findViewById<EditText>(R.id.txtNum)
        val btnComprobar = findViewById<Button>(R.id.btnComprobar)
        val lbComprobación = findViewById<TextView>(R.id.lbComprobacion)

        val objNumero = Numero()
        btnComprobar.setOnClickListener {
            lbComprobación.text = objNumero.Verificar(txtNum.text.toString().toInt())
        }
    }
}
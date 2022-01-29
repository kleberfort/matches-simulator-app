package fort.kleber.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fort.kleber.simulator.databinding.ActivityDetailBinding
import fort.kleber.simulator.databinding.ActivityMainBinding



class DetailActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}
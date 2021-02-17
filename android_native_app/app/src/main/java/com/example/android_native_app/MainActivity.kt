package com.example.android_native_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**---------------------------------------------------*/
        val flutterEngine = FlutterEngine(this)
        flutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )

        FlutterEngineCache
            .getInstance()
            .put("my_engine_id", flutterEngine)


        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = CustomFlutterActivy
                .withCachedEngine("my_engine_id")
                .build(this@MainActivity)
            startActivity(intent)

        }
        /**---------------------------------------------------*/
    }
}
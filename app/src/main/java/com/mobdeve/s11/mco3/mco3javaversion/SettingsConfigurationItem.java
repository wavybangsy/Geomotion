package com.mobdeve.s11.mco3.mco3javaversion;

import android.os.Bundle;
import android.widget.TextView;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class SettingsConfigurationItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings_configuration_item);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        String anomalyLabel = getIntent().getStringExtra("ANOMALY_LABEL");

        TextView anomalyLabelView = findViewById(R.id.anomalyLabelTextViewItem);

        anomalyLabelView.setText(anomalyLabel);
    }
}
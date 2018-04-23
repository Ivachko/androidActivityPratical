package com.example.pierre.androidactivitypratrical;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActiviteSuivante extends Activity implements View.OnClickListener {
    private Button mbButton;
    private EditText mbText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String passedText = intent.getStringExtra("passedText");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_suivante);
        mbText= (EditText)findViewById(R.id.editText);
        mbText.setText(passedText+" "+mbText.getText());
        mbButton = (Button)findViewById(R.id.submit);
        mbButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mbButton){
            finish();
    }
}

}

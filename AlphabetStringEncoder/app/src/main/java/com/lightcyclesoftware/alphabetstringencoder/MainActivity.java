package com.lightcyclesoftware.alphabetstringencoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.exampleText)
    EditText exampleTextView;
    @BindView(R.id.encodeButton)
    Button encodeButton;
    @BindView(R.id.encodedText)
    TextView encodedTextView;

    @OnClick(R.id.encodeButton)
    public void encode() {
        encodedTextView.setText(AlphabetStringEncoder.encodeString(exampleTextView.getText().toString().trim()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}

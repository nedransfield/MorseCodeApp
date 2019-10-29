package com.example.morsecodeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText = findViewById(R.id.inputText);
        final TextView outputText = findViewById(R.id.outputText);

        Button submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                char[] inputChars = input.toCharArray();
                ArrayList<String> outputChars = new ArrayList<>();
                for (char c: inputChars) {
                    switch(c) {
                        case ' ':
                            outputChars.add(" / "); break;
                        case 'a':
                        case 'A':
                            outputChars.add(".-"); break;
                        case 'b':
                        case 'B':
                            outputChars.add("-..."); break;
                        case 'c':
                        case 'C':
                            outputChars.add("-.-."); break;
                        case 'd':
                        case 'D':
                            outputChars.add("-.."); break;
                        case 'e':
                        case 'E':
                            outputChars.add("."); break;
                        case 'f':
                        case 'F':
                            outputChars.add("..-."); break;
                        case 'g':
                        case 'G':
                            outputChars.add("--."); break;
                        case 'h':
                        case 'H':
                            outputChars.add("...."); break;
                        case 'i':
                        case 'I':
                            outputChars.add(".."); break;
                        case 'j':
                        case 'J':
                            outputChars.add(".---"); break;
                        case 'k':
                        case 'K':
                            outputChars.add("-.-"); break;
                        case 'l':
                        case 'L':
                            outputChars.add(".-.."); break;
                        case 'm':
                        case 'M':
                            outputChars.add("--"); break;
                        case 'n':
                        case 'N':
                            outputChars.add("-."); break;
                        case 'o':
                        case 'O':
                            outputChars.add("---"); break;
                        case 'p':
                        case 'P':
                            outputChars.add(".--."); break;
                        case 'q':
                        case 'Q':
                            outputChars.add("--.-"); break;
                        case 'r':
                        case 'R':
                            outputChars.add(".-."); break;
                        case 's':
                        case 'S':
                            outputChars.add("..."); break;
                        case 't':
                        case 'T':
                            outputChars.add("-"); break;
                        case 'u':
                        case 'U':
                            outputChars.add("..-"); break;
                        case 'v':
                        case 'V':
                            outputChars.add("...-"); break;
                        case 'w':
                        case 'W':
                            outputChars.add(".--"); break;
                        case 'x':
                        case 'X':
                            outputChars.add("-..-"); break;
                        case 'y':
                        case 'Y':
                            outputChars.add("-.--"); break;
                        case 'z':
                        case 'Z':
                            outputChars.add("--.."); break;
                        case '0':
                            outputChars.add("-----"); break;
                        case '1':
                            outputChars.add(".----"); break;
                        case '2':
                            outputChars.add("..---"); break;
                        case '3':
                            outputChars.add("...--"); break;
                        case '4':
                            outputChars.add("....-"); break;
                        case '5':
                            outputChars.add("....."); break;
                        case '6':
                            outputChars.add("-...."); break;
                        case '7':
                            outputChars.add("--..."); break;
                        case '8':
                            outputChars.add("---.."); break;
                        case '9':
                            outputChars.add("----."); break;
                        case ',':
                            outputChars.add("--..--"); break;
                        case '.':
                            outputChars.add(".-.-.-"); break;
                        case '?':
                            outputChars.add("..--.."); break;
                        case '!':
                            outputChars.add("-.-.--"); break;
                        case ':':
                            outputChars.add("---..."); break;
                        case ';':
                            outputChars.add("-.-.-"); break;
                        case '/':
                            outputChars.add("-..-."); break;
                        case '-':
                            outputChars.add("-....-"); break;
                        case '(':
                            outputChars.add("-.--."); break;
                        case ')':
                            outputChars.add("-.--.-"); break;
                        case '@':
                            outputChars.add(".--.-."); break;

                    }
                }
                String[] outputArray = new String[outputChars.size()];
                for (int i = 0; i < outputArray.length; i++) {
                    outputArray[i] = outputChars.get(i);
                }
                String output = String.join("  ", outputArray);
                outputText.setText(output);
            }
        });
    }
}

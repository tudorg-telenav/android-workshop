package telenav.androidworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }

    public void butonApasat(View view){
        Toast.makeText(this, "Esti ascultator!", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }

}

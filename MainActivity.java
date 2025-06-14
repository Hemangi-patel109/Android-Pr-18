package com.example.practical_17;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity {
private MediaPlayer mediaPlayer; 
  private Button btnPlay, btnStop;
  @Override
protected void onCreate(Bundle savedInstanceState) { 
  super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main); btnPlay = findViewById(R.id.btnPlay); btnStop = findViewById(R.id.btnStop);
mediaPlayer = MediaPlayer.create(this, R.raw.music); 
  btnPlay.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
if (!mediaPlayer.isPlaying()) { mediaPlayer.start();
}
}
});
btnStop.setOnClickListener(new View.OnClickListener() {
  @Override
public void onClick(View v) { if (mediaPlayer.isPlaying()) {
mediaPlayer.pause();
mediaPlayer.seekTo(0); // Reset audio to start
}
}
});
}
@Override
protected void onDestroy() { super.onDestroy();
if (mediaPlayer != null) { mediaPlayer.release();
mediaPlayer = null;
}
}
}

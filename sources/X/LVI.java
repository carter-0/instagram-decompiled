package X;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class LVI implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ ConstraintLayout A00;

    public LVI(ConstraintLayout constraintLayout) {
        this.A00 = constraintLayout;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return true;
        }
        this.A00.setVisibility(0);
        return true;
    }
}

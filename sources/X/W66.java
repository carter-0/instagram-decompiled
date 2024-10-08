package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.base.IgFrameLayout;

public final class W66 implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ IgFrameLayout A00;

    public W66(IgFrameLayout igFrameLayout) {
        this.A00 = igFrameLayout;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return true;
        }
        this.A00.setVisibility(0);
        return true;
    }
}

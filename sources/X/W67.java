package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.base.IgFrameLayout;

public final class W67 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IgFrameLayout A01;
    public final /* synthetic */ U4E A02;

    public W67(IgFrameLayout igFrameLayout, U4E u4e, int i) {
        this.A01 = igFrameLayout;
        this.A02 = u4e;
        this.A00 = i;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new W66(this.A01));
        mediaPlayer.setOnCompletionListener(new W62(this.A02, this.A00));
        mediaPlayer.setVideoScalingMode(1);
    }
}

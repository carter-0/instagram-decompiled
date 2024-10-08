package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* renamed from: X.OgT  reason: case insensitive filesystem */
public final class C71262OgT implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ OGN A01;

    public C71262OgT(VideoView videoView, OGN ogn) {
        this.A00 = videoView;
        this.A01 = ogn;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        mediaPlayer.setLooping(true);
        this.A00.start();
        OGN ogn = this.A01;
        ogn.A03.setVisibility(4);
        ogn.A02.setVisibility(0);
    }
}

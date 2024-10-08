package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

public final class LVC implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;

    public LVC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                mediaPlayer.release();
                return;
            case 2:
                i = 0;
                0qQ.A0B(mediaPlayer, 0);
                break;
            case 3:
                i = 0;
                break;
            case 4:
                0qQ.A0B(mediaPlayer, 0);
                try {
                    mediaPlayer.seekTo(0);
                    VideoView videoView = ((K5C) this.A01).A01;
                    if (videoView == null) {
                        0qQ.A0F("videoPlayerView");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        videoView.start();
                        return;
                    }
                } catch (IllegalStateException e) {
                    0wb.A07("DirectClipsPreviewViewModel mediaPlayer.seekTo failed", e);
                    return;
                }
            default:
                K4P k4p = (K4P) this.A01;
                K4J k4j = k4p.A01;
                if (k4j == null) {
                    JTO.A1K();
                    throw AnonymousClass00P.createAndThrow();
                }
                M7V m7v = new M7V(k4j, k4p.A00);
                if (k4j.A06) {
                    k4j.A07.postDelayed(m7v, 2500);
                    return;
                }
                return;
        }
        mediaPlayer.seekTo(i);
        ((VideoView) this.A01).start();
    }
}

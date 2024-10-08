package X;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class LVJ implements MediaPlayer.OnPreparedListener {
    public final int A00;
    public final Object A01;

    public LVJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                RoundedCornerFrameLayout roundedCornerFrameLayout = ((C65707LyM) this.A01).A03.A09;
                if (roundedCornerFrameLayout != null) {
                    roundedCornerFrameLayout.setVisibility(0);
                }
                mediaPlayer.setVolume(0.0f, 0.0f);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
                return;
            case 2:
                0qQ.A0B(mediaPlayer, 0);
                mediaPlayer.setLooping(true);
                float f = 1.0f;
                if (((K5C) this.A01).A05) {
                    f = 0.0f;
                }
                mediaPlayer.setVolume(f, f);
                try {
                    mediaPlayer.start();
                    return;
                } catch (IllegalStateException e) {
                    0wb.A07("DirectClipsPreviewViewModel mediaPlayer.start failed", e);
                    return;
                }
            case 3:
                0qQ.A0B(mediaPlayer, 0);
                mediaPlayer.setLooping(true);
                mediaPlayer.setVolume(0.0f, 0.0f);
                IgEditText igEditText = ((C68449NIn) this.A01).A0H;
                if (igEditText == null) {
                    0qQ.A0F("noteEditText");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    C69979NvJ.A00(igEditText);
                    return;
                }
            case 4:
                mediaPlayer.setOnInfoListener(new LVI((ConstraintLayout) this.A01));
                mediaPlayer.setVideoScalingMode(1);
                return;
            case 5:
                mediaPlayer.setLooping(true);
                C51969G9p.A1M(this.A01);
                return;
            default:
                return;
        }
    }
}

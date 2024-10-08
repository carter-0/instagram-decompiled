package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Jbi  reason: case insensitive filesystem */
public final class C59919Jbi implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ VideoPreviewView A00;

    public C59919Jbi(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        VideoPreviewView videoPreviewView = this.A00;
        C66529MVh mVh = videoPreviewView.A03;
        if (i != 3 || mVh == null) {
            return false;
        }
        videoPreviewView.removeCallbacks(videoPreviewView.A05);
        mVh.DXS(videoPreviewView);
        videoPreviewView.post(videoPreviewView.A06);
        return false;
    }
}

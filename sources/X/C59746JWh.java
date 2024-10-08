package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.JWh  reason: case insensitive filesystem */
public final class C59746JWh implements Runnable {
    public final /* synthetic */ VideoPreviewView A00;

    public C59746JWh(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    public final void run() {
        VideoPreviewView videoPreviewView = this.A00;
        C66529MVh mVh = videoPreviewView.A03;
        if (mVh != null) {
            mVh.DaQ(videoPreviewView.A00.getCurrentPosition(), videoPreviewView.A00.getDuration());
            videoPreviewView.postDelayed(this, 100);
        }
    }
}

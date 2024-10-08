package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Jbf  reason: case insensitive filesystem */
public final class C59916Jbf implements Runnable {
    public final /* synthetic */ VideoPreviewView A00;

    public C59916Jbf(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    public final void run() {
        VideoPreviewView videoPreviewView = this.A00;
        C66529MVh mVh = videoPreviewView.A03;
        if (mVh != null) {
            mVh.DXT(videoPreviewView);
        }
    }
}

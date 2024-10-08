package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Ljk  reason: case insensitive filesystem */
public final class C64884Ljk implements C66529MVh {
    public final /* synthetic */ KKY A00;

    public final void DZ7(VideoPreviewView videoPreviewView, float f) {
    }

    public final void DaQ(int i, int i2) {
    }

    public C64884Ljk(KKY kky) {
        this.A00 = kky;
    }

    public final void DES(String str) {
        C66529MVh mVh = this.A00.A02;
        if (mVh != null) {
            mVh.DES(str);
        }
    }

    public final void DO5(VideoPreviewView videoPreviewView, int i, int i2) {
        KKY kky = this.A00;
        kky.A00(false);
        kky.A04.requestLayout();
        C66529MVh mVh = kky.A02;
        if (mVh != null) {
            mVh.DO5(videoPreviewView, i, i2);
        }
    }

    public final void DXS(VideoPreviewView videoPreviewView) {
        C66529MVh mVh = this.A00.A02;
        if (mVh != null) {
            mVh.DXS(videoPreviewView);
        }
    }

    public final void DXT(VideoPreviewView videoPreviewView) {
        C66529MVh mVh = this.A00.A02;
        if (mVh != null) {
            mVh.DXT(videoPreviewView);
        }
    }

    public final void Dmo(JXT jxt) {
        KKY kky;
        View view;
        boolean z;
        if (jxt == JXT.PAUSED) {
            kky = this.A00;
            view = kky.A01;
            z = true;
        } else if (jxt == JXT.STARTED) {
            kky = this.A00;
            view = kky.A01;
            z = false;
        } else {
            return;
        }
        ViewPropertyAnimator animate = view.animate();
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        animate.alpha(f).setDuration((long) kky.A00).setListener(new C71157OeW(0, view, z)).start();
    }
}

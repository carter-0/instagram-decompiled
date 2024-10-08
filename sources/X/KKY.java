package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;

public final class KKY extends C60686JpX {
    public final int A00 = 300;
    public final View A01;
    public final C66529MVh A02;
    public final C64884Ljk A03;
    public final IgCaptureVideoPreviewView A04;

    public KKY(View view, C66529MVh mVh) {
        super(view);
        this.A02 = mVh;
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = (IgCaptureVideoPreviewView) AnonymousClass7TF.A0F(view, R.id.video_preview_item_view);
        this.A04 = igCaptureVideoPreviewView;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.video_preview_item_play_btn);
        igCaptureVideoPreviewView.A00 = 0.5625f;
        igCaptureVideoPreviewView.A02 = AnonymousClass4M7.FILL;
        LY0.A00(this.itemView, 26, this);
        A00(true);
        this.A03 = new C64884Ljk(this);
    }

    public final void A00(boolean z) {
        this.A04.setVisibility(DbW.A01(z ^ true ? 1 : 0));
        super.A00(z);
    }
}

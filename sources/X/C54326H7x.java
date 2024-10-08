package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.H7x  reason: case insensitive filesystem */
public final class C54326H7x extends C64883Ljj {
    public final /* synthetic */ C55955HqJ A00;
    public final /* synthetic */ boolean A01;

    public final void DO5(VideoPreviewView videoPreviewView, int i, int i2) {
        videoPreviewView.setVisibility(0);
        videoPreviewView.A06();
        C55955HqJ hqJ = this.A00;
        boolean z = this.A01;
        hqJ.A00 = z;
        hqJ.A01.setVolume(C51970G9q.A01(z ? 1 : 0));
    }

    public C54326H7x(C55955HqJ hqJ, boolean z) {
        this.A00 = hqJ;
        this.A01 = z;
    }
}

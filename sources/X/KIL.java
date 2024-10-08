package X;

import android.view.View;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.pendingmedia.model.ClipInfo;

public final class KIL extends C64883Ljj {
    public final /* synthetic */ C61445K7x A00;
    public final /* synthetic */ ClipInfo A01;

    public KIL(C61445K7x k7x, ClipInfo clipInfo) {
        this.A00 = k7x;
        this.A01 = clipInfo;
    }

    public final void DO5(VideoPreviewView videoPreviewView, int i, int i2) {
        AnonymousClass514 r0;
        C61445K7x k7x = this.A00;
        AnonymousClass6ST r02 = k7x.A05;
        if (r02 != null) {
            r02.dismiss();
            k7x.A05 = null;
        }
        boolean z = true;
        k7x.A08 = true;
        if (i != i2) {
            z = false;
        }
        k7x.A07 = z;
        k7x.A01.setVisibility(DbW.A01(z ^ true ? 1 : 0));
        C3499682q A002 = C61445K7x.A00(k7x);
        if (k7x.A07) {
            r0 = AnonymousClass514.SQUARE;
        } else {
            r0 = ((JWE) A002).A01.A06;
            r0.getClass();
        }
        ((JWE) A002).A01.A05 = r0;
        k7x.A03.setVisibility(0);
        k7x.A03.A06();
        View view = k7x.A00;
        view.getClass();
        LYB.A00(view, 3, this);
    }
}

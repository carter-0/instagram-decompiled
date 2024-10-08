package X;

import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.NBy  reason: case insensitive filesystem */
public final class C68361NBy extends AnonymousClass8GD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C343047pa A01;
    public final /* synthetic */ C340307l3 A02;
    public final /* synthetic */ C71018OYt A03;

    public final void A01(Exception exc) {
    }

    public C68361NBy(C343047pa r1, C340307l3 r2, C71018OYt oYt, int i) {
        this.A03 = oYt;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C71018OYt oYt = this.A03;
        ScalingTextureView scalingTextureView = oYt.A02;
        if (scalingTextureView.isAvailable() && scalingTextureView.getSurfaceTexture() != null) {
            int i = this.A00;
            float f = ((float) i) * 1.0f;
            C343047pa r1 = this.A01;
            if (r1 != null) {
                scalingTextureView.A02 = i;
                scalingTextureView.A01 = (int) ((f * ((float) r1.A02)) / ((float) r1.A01));
                ScalingTextureView.A00(scalingTextureView);
                C71409Ok8.A01(AnonymousClass7TH.A06(oYt.A04), 39, oYt, this.A02);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}

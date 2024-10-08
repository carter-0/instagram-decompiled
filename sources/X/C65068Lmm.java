package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Lmm  reason: case insensitive filesystem */
public final class C65068Lmm implements B23 {
    public final int A00;
    public final Object A01;

    public C65068Lmm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DH0(Bitmap bitmap) {
        switch (this.A00) {
            case 0:
                C353498Hw.A0G(bitmap, (C353498Hw) this.A01);
                return;
            case 1:
                C59767JXi jXi = (C59767JXi) this.A01;
                IgImageView igImageView = jXi.A0R;
                if (igImageView.getVisibility() == 0) {
                    igImageView.setImageDrawable(JTQ.A08(jXi.A0L, bitmap));
                    return;
                }
                return;
            default:
                2YL r2 = (2YL) this.A01;
                MHN.A03(bitmap, r2, C318116oQ.A00(r2), 7);
                return;
        }
    }

    public final void DH1() {
        switch (this.A00) {
            case 0:
                C64169LRs.A02(((C353498Hw) this.A01).A11, AnonymousClass05K.A0N, "Frame retrieving failed", 2131974093);
                return;
            case 1:
                ((C59767JXi) this.A01).A0R.setVisibility(8);
                return;
            default:
                return;
        }
    }
}

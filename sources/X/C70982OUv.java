package X;

import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* renamed from: X.OUv  reason: case insensitive filesystem */
public final class C70982OUv {
    public final /* synthetic */ OmniGridView A00;

    public final void A00(int i) {
        int i2;
        C68056MzN mzN;
        OmniGridView omniGridView = this.A00;
        OmniGridView.A02(omniGridView, i);
        0fh.A01("OmniGridView.updateTransparencyForLayoutPosition", 1296748016);
        try {
            C249703kE A0X = omniGridView.A0G.A0X(i, false);
            if (!(A0X instanceof C68056MzN) || (mzN = (C68056MzN) A0X) == null) {
                i2 = 629145732;
            } else {
                if (!mzN.equals(omniGridView.A03)) {
                    OmniGridLayoutManager omniGridLayoutManager = omniGridView.A0I;
                    N48 n48 = omniGridLayoutManager.A07;
                    float f = 1.0f;
                    if (AnonymousClass7TF.A1P(n48.A04)) {
                        float A002 = ((C68152N2s) n48.A09.get(i)).A02.A00(omniGridLayoutManager.A1a());
                        if (A002 < 0.5f) {
                            float f2 = (A002 * 1.4f) + 0.3f;
                            if (f2 < 0.3f) {
                                f = 0.3f;
                            } else if (f2 <= 1.0f) {
                                f = f2;
                            }
                        }
                    }
                    0fh.A01("GridItemViewHolder.setTransparency", -1866985560);
                    mzN.A02.setAlpha(f);
                    0fh.A00(990969580);
                }
                i2 = -521769283;
            }
            0fh.A00(i2);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    public C70982OUv() {
    }

    public C70982OUv(OmniGridView omniGridView) {
        this.A00 = omniGridView;
    }
}

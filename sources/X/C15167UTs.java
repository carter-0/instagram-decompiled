package X;

import android.view.View;

/* renamed from: X.UTs  reason: case insensitive filesystem */
public final class C15167UTs extends C299025uS {
    public int A00;
    public int A01;
    public C307996Sh A02;
    public C307786Rm A03;

    public static final boolean A00(C15167UTs uTs) {
        C307996Sh r2 = uTs.A02;
        C307786Rm r6 = uTs.A03;
        if (!(r2 == null || r6 == null)) {
            C245663dH r3 = r2.A01;
            if (!(uTs.A01 == 0 || uTs.A00 == 0 || (r3.A01() == uTs.A01 && r3.A00() == uTs.A00))) {
                C308006Si r32 = C307996Sh.A04;
                C307996Sh A032 = r32.A03(r32.A01(r6.A00, uTs.A02, r6, C307806Ro.A00(uTs.A03), -1), r2.A00, (Object) null, C244873bt.A00(View.MeasureSpec.makeMeasureSpec(uTs.A01, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(uTs.A00, SN3.MAX_SIGNED_POWER_OF_TWO)));
                uTs.A02 = A032;
                super.setRenderTree(A032.A01);
                return true;
            }
        }
        return false;
    }

    public final void setRenderResult(C307996Sh r2, C307786Rm r3) {
        C245663dH r0;
        this.A03 = r3;
        this.A02 = r2;
        if (!A00(this)) {
            if (r2 != null) {
                r0 = r2.A01;
            } else {
                r0 = null;
            }
            super.setRenderTree(r0);
        }
    }

    public void setRenderTree(C245663dH r3) {
        throw new UnsupportedOperationException("setRenderTree should only be called in conjunction with also setting the BloksModel");
    }
}

package X;

import android.graphics.Bitmap;

/* renamed from: X.IHc  reason: case insensitive filesystem */
public final class C56907IHc implements B3L {
    public final /* synthetic */ C53799GuS A00;

    public final void D0v() {
    }

    public C56907IHc(C53799GuS guS) {
        this.A00 = guS;
    }

    public final void CyH(Bitmap bitmap) {
        if (bitmap == null) {
            0wj r2 = 0wj.A01;
            0qQ.A07(r2);
            r2.EFR(164832702, "memu_onboarding");
            return;
        }
        this.A00.A01.invoke(new HIP(bitmap));
    }

    public final void D0x(Exception exc) {
        0wj r2 = 0wj.A01;
        0qQ.A07(r2);
        r2.EFR(164832702, "memu_onboarding");
    }
}

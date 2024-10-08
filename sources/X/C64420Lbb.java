package X;

import android.graphics.Bitmap;

/* renamed from: X.Lbb  reason: case insensitive filesystem */
public final class C64420Lbb implements C346267ut {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C364988mL A01;
    public final /* synthetic */ LAM A02;
    public final /* synthetic */ C63927LDk A03;
    public final /* synthetic */ C64149LQm A04;
    public final /* synthetic */ C367428qj A05;

    public C64420Lbb(Bitmap bitmap, C364988mL r2, LAM lam, C63927LDk lDk, C64149LQm lQm, C367428qj r6) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A03 = lDk;
        this.A05 = r6;
        this.A04 = lQm;
        this.A02 = lam;
    }

    public final void DGm() {
        try {
            C364988mL r2 = this.A01;
            C367428qj r6 = this.A05;
            r2.A0C(new MA3(this.A00, r2, this.A02, this.A03, this.A04, r6));
        } catch (RuntimeException e) {
            this.A00.recycle();
            this.A03.A00(e);
        }
    }
}

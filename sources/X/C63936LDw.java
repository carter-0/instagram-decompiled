package X;

import android.graphics.Bitmap;

/* renamed from: X.LDw  reason: case insensitive filesystem */
public final class C63936LDw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C3516889w A04;
    public final /* synthetic */ String A05;

    public C63936LDw(C3516889w r1, String str, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = str;
    }

    public final void A00(int i, Bitmap bitmap) {
        C3516889w r3 = this.A04;
        int i2 = r3.A00;
        int i3 = this.A01;
        if (i2 == i3) {
            int i4 = this.A03;
            int i5 = this.A00;
            String str = this.A05;
            Bitmap A09 = 1MF.A09(bitmap, i4, i5, 0, false);
            0qQ.A07(A09);
            AnonymousClass7TF.A0D().post(new MA0(A09, r3, str, this.A02 + i, i3));
        }
    }
}

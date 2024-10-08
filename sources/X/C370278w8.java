package X;

import android.graphics.Bitmap;

/* renamed from: X.8w8  reason: invalid class name and case insensitive filesystem */
public final class C370278w8 implements C370288w9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Bitmap A03;
    public final /* synthetic */ AnonymousClass84L A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;

    public C370278w8(Bitmap bitmap, AnonymousClass84L r2, String str, C62320sa r4, int i, int i2, int i3) {
        this.A04 = r2;
        this.A05 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = bitmap;
        this.A06 = r4;
    }

    public final /* bridge */ /* synthetic */ void DYh(Object obj) {
        Number number = (Number) obj;
        AnonymousClass84L r4 = this.A04;
        r4.A00.A01 = null;
        if (number != null) {
            if (number.intValue() <= 1) {
                String str = this.A05;
                int i = this.A02;
                int i2 = this.A00;
                int i3 = this.A01;
                Bitmap bitmap = this.A03;
                C62320sa r6 = this.A06;
                0qQ.A0B(str, 0);
                0qQ.A0B(r6, 5);
                AnonymousClass84M r1 = r4.A01;
                r1.A02 = new C379899Vt(r4, str, r6, i, i2, i3);
                r1.A01 = new C370298wA(bitmap);
                r1.A00();
            } else {
                this.A06.invoke();
            }
            this.A03.recycle();
        }
    }
}

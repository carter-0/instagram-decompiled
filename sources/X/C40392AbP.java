package X;

import android.graphics.Bitmap;

/* renamed from: X.AbP  reason: case insensitive filesystem */
public final class C40392AbP implements B23 {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8A0 A02;
    public final /* synthetic */ AnonymousClass89v A03;
    public final /* synthetic */ AnonymousClass51M A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ 0sL A08;

    public final void DH0(Bitmap bitmap) {
        AnonymousClass8A0 r7 = this.A02;
        C3516889w r4 = r7.A03;
        String str = this.A05;
        int i = this.A01;
        0qQ.A0B(str, 0);
        C3516989y r2 = r4.A08;
        r2.put(new C376619Ir(str, i, 2), bitmap);
        r4.A07.A0B(r2);
        0sL r5 = this.A07;
        0sL r42 = this.A08;
        if (r42 != null) {
            if (182.A06(0Tu.A05, r7.A01, 36315438842973407L)) {
                r42.invoke(bitmap, str);
                this.A06.invoke();
            }
        }
        if (r5 != null) {
            r5.invoke(bitmap, str);
        }
        this.A06.invoke();
    }

    public C40392AbP(AnonymousClass8A0 r1, AnonymousClass89v r2, AnonymousClass51M r3, String str, C62320sa r5, 0sL r6, 0sL r7, int i, boolean z) {
        this.A02 = r1;
        this.A05 = str;
        this.A01 = i;
        this.A07 = r6;
        this.A08 = r7;
        this.A06 = r5;
        this.A04 = r3;
        this.A03 = r2;
        this.A00 = z;
    }

    public final void DH1() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass8A0 r1 = this.A02;
            AnonymousClass51M r3 = this.A04;
            int i = this.A01;
            AnonymousClass8A0.A01(r1, this.A03, r3, this.A05, new AnonymousClass9NK(r1, 3), this.A07, this.A08, i, true, false);
            return;
        }
        this.A06.invoke();
    }
}

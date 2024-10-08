package X;

import java.util.List;

/* renamed from: X.AmB  reason: case insensitive filesystem */
public final /* synthetic */ class C40965AmB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C340697lg A01;

    public /* synthetic */ C40965AmB(C340697lg r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C340697lg r0 = this.A01;
        int i = this.A00;
        C340597lW r7 = r0.A00;
        List list = r7.A0X.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            boolean A1S = AnonymousClass7TF.A1S(i, 2);
            C342707p2 r02 = r7.A08;
            if (r02 != null) {
                C342727p4 r3 = C342717p3.A0e;
                int A0A = AnonymousClass7TG.A0A((Number) r02.A02(r3));
                int i3 = 2;
                if (A1S) {
                    if (A0A != 0) {
                    }
                } else if (A0A != 2) {
                }
                C342707p2 r2 = r7.A08;
                C342757p7 r1 = new C342757p7();
                if (!A1S) {
                    i3 = 0;
                }
                r1.A01(r3, Integer.valueOf(i3));
                r2.A04(r1.A00());
            }
            ((C340707lh) list.get(i2)).DPS(i);
        }
    }
}

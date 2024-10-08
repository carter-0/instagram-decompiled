package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I1v  reason: case insensitive filesystem */
public final class C56566I1v {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public List A05 = 0sn.A00;
    public final C52893GeT A06;
    public final ArrayList A07;
    public final List A08 = AnonymousClass7TE.A1C();

    public static final int A00(C56566I1v i1v) {
        return ((int) Math.sqrt((((double) i1v.A06.A02.A00) * 1.0d) / ((double) i1v.A04))) + 1;
    }

    public final int A01(int i) {
        C52893GeT geT = this.A06;
        int i2 = geT.A02.A00;
        if (i2 <= 0) {
            return 0;
        }
        if (i >= i2) {
            throw AnonymousClass7TE.A0w("ItemIndex > total count");
        } else if (!geT.A00) {
            return i / this.A04;
        } else {
            ArrayList arrayList = this.A07;
            int A1K = 0sr.A1K(arrayList, new GLV(i, 0), arrayList.size());
            if (A1K < 0) {
                A1K = (-A1K) - 2;
            }
            int A002 = A00(this) * A1K;
            int i3 = ((C55577Hjx) arrayList.get(A1K)).A00;
            if (i3 <= i) {
                int i4 = 0;
                while (i3 < i) {
                    int i5 = i3 + 1;
                    int A022 = A02(i3);
                    i4 += A022;
                    int i6 = this.A04;
                    if (i4 >= i6) {
                        A002++;
                        int i7 = i4;
                        i4 = A022;
                        if (i7 == i6) {
                            i4 = 0;
                        }
                    }
                    int A003 = A00(this);
                    if (A002 % A003 == 0 && A002 / A003 >= arrayList.size()) {
                        arrayList.add(new C55577Hjx(i5 - (AnonymousClass7TF.A1R(i4) ? 1 : 0), 0));
                    }
                    i3 = i5;
                }
                if (i4 + A02(i) > this.A04) {
                    return A002 + 1;
                }
                return A002;
            }
            throw AnonymousClass7TE.A0w("currentItemIndex > itemIndex");
        }
    }

    public final int A02(int i) {
        C56473Hz5 hz5 = C56473Hz5.A01;
        C56473Hz5.A00 = this.A04;
        AnonymousClass6It AX1 = this.A06.A02.AX1(i);
        return (int) ((C56048Hrx) ((IFE) AX1.A02).A00.invoke(hz5, Integer.valueOf(i - AX1.A01))).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0020, code lost:
        r8 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C55578Hjy A03(int r11) {
        /*
            r10 = this;
            X.GeT r6 = r10.A06
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x003d
            int r4 = r10.A04
            int r5 = r11 * r4
            X.6Ir r0 = r6.A02
            int r0 = r0.A00
            int r0 = r0 - r5
            if (r4 <= r0) goto L_0x0012
            r4 = r0
        L_0x0012:
            r0 = 0
            if (r4 >= r0) goto L_0x0016
            r4 = 0
        L_0x0016:
            java.util.List r0 = r10.A05
            int r0 = r0.size()
            if (r4 != r0) goto L_0x0026
            java.util.List r8 = r10.A05
        L_0x0020:
            X.Hjy r0 = new X.Hjy
            r0.<init>(r5, r8)
            return r0
        L_0x0026:
            java.util.ArrayList r8 = X.DbS.A0v(r4)
            r3 = 0
        L_0x002b:
            if (r3 >= r4) goto L_0x003a
            r1 = 1
            X.Hrx r0 = new X.Hrx
            r0.<init>(r1)
            r8.add(r0)
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003a:
            r10.A05 = r8
            goto L_0x0020
        L_0x003d:
            int r4 = A00(r10)
            int r2 = r11 / r4
            java.util.ArrayList r3 = r10.A07
            int r1 = r3.size()
            r0 = 1
            int r1 = r1 - r0
            int r9 = java.lang.Math.min(r2, r1)
            int r4 = r4 * r9
            java.lang.Object r0 = r3.get(r9)
            X.Hjx r0 = (X.C55577Hjx) r0
            int r5 = r0.A00
            java.lang.Object r0 = r3.get(r9)
            X.Hjx r0 = (X.C55577Hjx) r0
            int r7 = r0.A01
            int r0 = r10.A01
            if (r4 > r0) goto L_0x008d
            if (r0 > r11) goto L_0x008d
            int r5 = r10.A02
            int r7 = r10.A03
            r4 = r0
        L_0x006b:
            int r2 = A00(r10)
            int r0 = r4 % r2
            if (r0 != 0) goto L_0x008b
            int r1 = r11 - r4
            r0 = 2
            if (r0 > r1) goto L_0x008b
            if (r1 >= r2) goto L_0x008b
            r8 = 1
            r10.A00 = r9
            java.util.List r0 = r10.A08
            r0.clear()
        L_0x0082:
            if (r4 <= r11) goto L_0x00a2
            java.lang.String r0 = "currentLine > lineIndex"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x008b:
            r8 = 0
            goto L_0x0082
        L_0x008d:
            int r0 = r10.A00
            if (r9 != r0) goto L_0x006b
            int r2 = r11 - r4
            java.util.List r1 = r10.A08
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006b
            int r5 = X.C51971G9r.A0I(r1, r2)
            r4 = r11
            r7 = 0
            goto L_0x006b
        L_0x00a2:
            if (r4 >= r11) goto L_0x00e8
            X.6Ir r2 = r6.A02
            int r0 = r2.A00
            if (r5 >= r0) goto L_0x00e8
            if (r8 == 0) goto L_0x00b1
            java.util.List r0 = r10.A08
            X.G9w.A0x(r5, r0)
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            int r0 = r10.A04
            if (r1 >= r0) goto L_0x00c9
            int r0 = r2.A00
            if (r5 >= r0) goto L_0x00c9
            if (r7 != 0) goto L_0x00c0
            int r7 = r10.A02(r5)
        L_0x00c0:
            int r1 = r1 + r7
            int r0 = r10.A04
            if (r1 > r0) goto L_0x00c9
            int r5 = r5 + 1
            r7 = 0
            goto L_0x00b2
        L_0x00c9:
            int r4 = r4 + 1
            int r1 = A00(r10)
            int r0 = r4 % r1
            if (r0 != 0) goto L_0x00a2
            int r0 = r2.A00
            if (r5 >= r0) goto L_0x00a2
            int r1 = r4 / r1
            int r0 = r3.size()
            if (r0 != r1) goto L_0x0118
            X.Hjx r0 = new X.Hjx
            r0.<init>(r5, r7)
            r3.add(r0)
            goto L_0x00a2
        L_0x00e8:
            r10.A01 = r11
            r10.A02 = r5
            r10.A03 = r7
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r4 = r5
            r3 = 0
        L_0x00f4:
            int r0 = r10.A04
            if (r3 >= r0) goto L_0x0020
            X.6Ir r0 = r6.A02
            int r0 = r0.A00
            if (r4 >= r0) goto L_0x0020
            if (r7 != 0) goto L_0x0104
            int r7 = r10.A02(r4)
        L_0x0104:
            int r3 = r3 + r7
            int r0 = r10.A04
            if (r3 > r0) goto L_0x0020
            int r4 = r4 + 1
            if (r7 <= 0) goto L_0x011f
            long r1 = (long) r7
            X.Hrx r0 = new X.Hrx
            r0.<init>(r1)
            r8.add(r0)
            r7 = 0
            goto L_0x00f4
        L_0x0118:
            java.lang.String r0 = "invalid starting point"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x011f:
            java.lang.String r0 = "The span value should be higher than 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56566I1v.A03(int):X.Hjy");
    }

    public C56566I1v(C52893GeT geT) {
        this.A06 = geT;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C55577Hjx(0, 0));
        this.A07 = A1C;
    }
}

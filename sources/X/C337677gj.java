package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7gj  reason: invalid class name and case insensitive filesystem */
public final class C337677gj implements C337647gg {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = Integer.MAX_VALUE;
    public final SparseArray A03 = new SparseArray();
    public final C337667gi A04;
    public final C337647gg A05;

    public final void EHQ(int i, int i2) {
        this.A05.EHQ(i, 0);
    }

    public final void EHg(Integer num, Object obj, int i) {
        this.A05.EHg(num, obj, 0);
    }

    public static ArrayList A00(SparseArray sparseArray, int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i;
        while (i3 < i + i2) {
            Object obj = sparseArray.get(i3);
            if (obj != null) {
                arrayList.add(obj);
                i3++;
            } else {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", new Object[]{Integer.valueOf(i3)}));
            }
        }
        return arrayList;
    }

    public final void A01() {
        int i = this.A02;
        if (i != Integer.MAX_VALUE) {
            if (i == 1) {
                int i2 = this.A01;
                int i3 = this.A00;
                SparseArray sparseArray = this.A03;
                ArrayList A002 = A00(sparseArray, i2, i3);
                int i4 = this.A00;
                if (i4 > 1) {
                    this.A05.CNW(A002, this.A01, i4);
                } else {
                    C337647gg r2 = this.A05;
                    int i5 = this.A01;
                    r2.CNR((C338367hq) sparseArray.get(i5), i5);
                }
            } else if (i == 2) {
                int i6 = this.A01;
                int i7 = this.A00;
                SparseArray sparseArray2 = this.A03;
                ArrayList A003 = A00(sparseArray2, i6, i7);
                int i8 = this.A00;
                if (i8 > 1) {
                    this.A05.FLK(A003, this.A01, i8);
                } else {
                    C337647gg r22 = this.A05;
                    int i9 = this.A01;
                    r22.FJV((C338367hq) sparseArray2.get(i9), i9);
                }
            } else if (i == 3) {
                int i10 = this.A00;
                C337647gg r1 = this.A05;
                int i11 = this.A01;
                if (i10 > 1) {
                    r1.AOZ(i11, i10);
                } else {
                    r1.AOO(i11);
                }
            }
            this.A02 = Integer.MAX_VALUE;
            this.A03.clear();
        }
    }

    public final void AOO(int i) {
        int i2;
        if (this.A02 != 3 || (i2 = this.A01) < i || i2 > i + 1) {
            A01();
            this.A01 = i;
            this.A00 = 1;
            this.A02 = 3;
            return;
        }
        this.A00++;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CNR(X.C338367hq r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            r3 = 1
            if (r0 != r3) goto L_0x0021
            int r2 = r4.A01
            if (r6 < r2) goto L_0x0021
            int r1 = r4.A00
            int r0 = r2 + r1
            if (r6 > r0) goto L_0x0021
            if (r6 < r0) goto L_0x0021
            int r0 = r1 + 1
            r4.A00 = r0
            int r0 = java.lang.Math.min(r6, r2)
            r4.A01 = r0
        L_0x001b:
            android.util.SparseArray r0 = r4.A03
            r0.put(r6, r5)
            return
        L_0x0021:
            r4.A01()
            r4.A01 = r6
            r4.A00 = r3
            r4.A02 = r3
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337677gj.CNR(X.7hq, int):void");
    }

    public final void Crl(C338387hs r2, boolean z) {
        this.A05.Crl(r2, z);
    }

    public final void EHf(Integer num, int i, int i2) {
        this.A05.EHf(num, i, i2);
    }

    public final boolean Ez4() {
        return this.A05.Ez4();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FJV(X.C338367hq r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            r3 = 2
            if (r0 != r3) goto L_0x0024
            int r1 = r4.A01
            int r0 = r4.A00
            int r2 = r1 + r0
            if (r6 > r2) goto L_0x0024
            int r0 = r6 + 1
            if (r0 < r1) goto L_0x0024
            int r1 = java.lang.Math.min(r6, r1)
            r4.A01 = r1
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = r0 - r1
            r4.A00 = r0
        L_0x001e:
            android.util.SparseArray r0 = r4.A03
            r0.put(r6, r5)
            return
        L_0x0024:
            r4.A01()
            r4.A01 = r6
            r0 = 1
            r4.A00 = r0
            r4.A02 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337677gj.FJV(X.7hq, int):void");
    }

    public C337677gj(C337667gi r2, C337647gg r3) {
        this.A05 = r3;
        this.A04 = r2;
    }

    public final void AOZ(int i, int i2) {
        A01();
        this.A05.AOZ(i, i2);
    }

    public final void CNW(List list, int i, int i2) {
        A01();
        this.A05.CNW(list, i, i2);
    }

    public final void Coc(int i, int i2) {
        A01();
        this.A05.Coc(i, i2);
    }

    public final void FLK(List list, int i, int i2) {
        A01();
        this.A05.FLK(list, i, i2);
    }
}

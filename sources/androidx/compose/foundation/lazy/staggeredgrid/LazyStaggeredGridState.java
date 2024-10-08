package androidx.compose.foundation.lazy.staggeredgrid;

import X.00k;
import X.0qQ;
import X.0sP;
import X.AnonymousClass0eM;
import X.AnonymousClass5PH;
import X.AnonymousClass5R7;
import X.AnonymousClass5aS;
import X.AnonymousClass6H4;
import X.AnonymousClass6H6;
import X.AnonymousClass6H8;
import X.AnonymousClass6HC;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C284905Ot;
import X.C284945Oz;
import X.C286015Tp;
import X.C287605aT;
import X.C288895cf;
import X.C305096Gn;
import X.C305126Gq;
import X.C305206Gy;
import X.C305216Gz;
import X.C51967G9n;
import X.C51969G9p;
import X.C51971G9r;
import X.C55371Hgd;
import X.C56872IFt;
import X.C58161InR;
import X.C58876Iz1;
import X.GW7;
import X.I24;
import X.I48;
import X.IFB;
import X.IFH;
import X.IGX;
import X.J6G;
import X.JEF;
import X.JLD;
import X.JP9;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LazyStaggeredGridState implements C305096Gn {
    public static final C286015Tp A0M = C305126Gq.A00(C58876Iz1.A00, JEF.A00);
    public float A00;
    public int A01 = -1;
    public AnonymousClass5R7 A02;
    public int A03;
    public boolean A04 = true;
    public final C305096Gn A05 = new C305216Gz(J6G.A00(this, 48));
    public final C287605aT A06 = new AnonymousClass5aS();
    public final AwaitFirstLayoutModifier A07 = new Object();
    public final AnonymousClass6H6 A08 = new AnonymousClass6H6();
    public final AnonymousClass6H4 A09 = new AnonymousClass6H4();
    public final AnonymousClass6HC A0A = new AnonymousClass6HC();
    public final AnonymousClass6H8 A0B = new AnonymousClass6H8((0sP) null);
    public final I24 A0C = new I24();
    public final I48 A0D;
    public final C284945Oz A0E = C51969G9p.A0S(false);
    public final C284945Oz A0F = C51969G9p.A0S(false);
    public final C284945Oz A0G;
    public final C284945Oz A0H = GW7.A00();
    public final C284945Oz A0I = GW7.A00();
    public final C288895cf A0J = new C56872IFt(this, 1);
    public final Map A0K = AnonymousClass7TE.A1H();
    public final IFB A0L = new IFB(this);

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object EKT(X.C54609HKs r7, X.AnonymousClass4D7 r8, X.0sL r9) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.MED.A04(r5, r8)
            if (r0 == 0) goto L_0x005e
            r4 = r8
            X.MED r4 = (X.MED) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 2
            if (r0 == 0) goto L_0x0038
            if (r0 == r5) goto L_0x0028
            if (r0 != r2) goto L_0x0064
            X.0eS.A00(r1)
        L_0x0025:
            X.0gF r3 = X.C60340gF.A00
        L_0x0027:
            return r3
        L_0x0028:
            java.lang.Object r9 = r4.A03
            X.0sL r9 = (X.0sL) r9
            java.lang.Object r7 = r4.A02
            X.HKs r7 = (X.C54609HKs) r7
            java.lang.Object r0 = r4.A01
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r0
            X.0eS.A00(r1)
            goto L_0x004c
        L_0x0038:
            X.0eS.A00(r1)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A07
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r9
            r4.A00 = r5
            java.lang.Object r0 = r0.A00(r4)
            if (r0 == r3) goto L_0x0027
            r0 = r6
        L_0x004c:
            X.6Gn r1 = r0.A05
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r2
            java.lang.Object r0 = r1.EKT(r7, r4, r9)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x005e:
            X.MED r4 = new X.MED
            r4.<init>(r6, r8, r5)
            goto L_0x0015
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.EKT(X.HKs, X.4D7, X.0sL):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.IGX r13, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r14, float r15) {
        /*
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00d1
            java.util.List r1 = r13.A0D
            boolean r0 = r1.isEmpty()
            r9 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d1
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a3
            r12 = 1
            java.lang.Object r0 = X.00k.A0K(r1)
        L_0x0019:
            X.IFH r0 = (X.IFH) r0
            int r10 = r0.A07
            int r0 = r14.A01
            if (r10 == r0) goto L_0x00d1
            r14.A01 = r10
            java.util.LinkedHashSet r8 = X.DbS.A0y()
            X.Hk0 r7 = r13.A0B
            int[] r6 = r7.A01
            int r5 = r6.length
            r4 = 0
        L_0x002d:
            if (r4 >= r5) goto L_0x00aa
            X.I24 r3 = r14.A0C
            if (r12 == 0) goto L_0x004c
            int r10 = r10 + 1
            int r2 = r3.A00
            int[] r0 = r3.A01
            int r0 = r0.length
            int r2 = r2 + r0
        L_0x003b:
            if (r10 >= r2) goto L_0x0051
            int r1 = r3.A01(r10)
            if (r1 == r4) goto L_0x0052
            r0 = -1
            if (r1 == r0) goto L_0x0052
            r0 = -2
            if (r1 == r0) goto L_0x0052
            int r10 = r10 + 1
            goto L_0x003b
        L_0x004c:
            int r10 = r3.A02(r10, r4)
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            if (r10 < 0) goto L_0x00aa
            int r0 = r13.A06
            if (r10 >= r0) goto L_0x00aa
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r0 = r8.contains(r3)
            if (r0 != 0) goto L_0x00aa
            r8.add(r3)
            java.util.Map r2 = r14.A0K
            boolean r0 = r2.containsKey(r3)
            if (r0 != 0) goto L_0x0098
            X.HpY r0 = r13.A0C
            boolean r1 = r0.A00(r10)
            r0 = r4
            if (r1 == 0) goto L_0x00a0
            r0 = 0
            if (r5 == r9) goto L_0x00a0
            int[] r1 = r7.A00
            r11 = r1[r0]
            int r0 = r5 - r9
            r1 = r1[r0]
            r0 = r6[r0]
            int r1 = r1 + r0
            int r1 = r1 - r11
        L_0x0085:
            X.6Gj r11 = r13.A0A
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
            if (r11 != r0) goto L_0x009b
            long r0 = X.C288985co.A01(r1)
        L_0x008f:
            X.6H8 r11 = r14.A0B
            X.JP9 r0 = r11.A00(r10, r0)
            r2.put(r3, r0)
        L_0x0098:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x009b:
            long r0 = X.C288985co.A00(r1)
            goto L_0x008f
        L_0x00a0:
            r1 = r6[r0]
            goto L_0x0085
        L_0x00a3:
            r12 = 0
            java.lang.Object r0 = X.00k.A0I(r1)
            goto L_0x0019
        L_0x00aa:
            java.util.Map r0 = r14.A0K
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x00b0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00b0
            java.lang.Object r0 = r1.getValue()
            X.JP9 r0 = (X.JP9) r0
            r0.cancel()
            r2.remove()
            goto L_0x00b0
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A00(X.IGX, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.A06.BI6() != r11) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r10, int r11) {
        /*
            r9 = this;
            X.I48 r4 = r9.A0D
            X.5dh r2 = r4.A05
            int r0 = r2.BI6()
            r7 = 0
            if (r0 != r10) goto L_0x0014
            X.5dh r0 = r4.A06
            int r0 = r0.BI6()
            r5 = 0
            if (r0 == r11) goto L_0x001a
        L_0x0014:
            r5 = 1
            X.6H4 r0 = r9.A09
            r0.A06()
        L_0x001a:
            X.5Oz r0 = r9.A0G
            java.lang.Object r8 = r0.getValue()
            X.IGX r8 = (X.IGX) r8
            int[] r0 = X.C55371Hgd.A01
            java.util.List r3 = r8.A0D
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0081
            java.lang.Object r0 = X.00k.A0I(r3)
            X.JLD r0 = (X.JLD) r0
            X.IFH r0 = (X.IFH) r0
            int r1 = r0.A07
            java.lang.Object r0 = X.00k.A0K(r3)
            X.JLD r0 = (X.JLD) r0
            X.IFH r0 = (X.IFH) r0
            int r0 = r0.A07
            if (r10 > r0) goto L_0x0081
            if (r1 > r10) goto L_0x0081
            r0 = 1
            X.GLV r1 = new X.GLV
            r1.<init>(r10, r0)
            int r0 = r3.size()
            int r0 = X.0sr.A1K(r3, r1, r0)
            java.lang.Object r1 = X.00k.A0O(r3, r0)
            X.JLD r1 = (X.JLD) r1
            if (r1 == 0) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            X.6Gj r3 = r8.A0A
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
            X.IFH r1 = (X.IFH) r1
            long r1 = r1.A03
            if (r3 != r0) goto L_0x007d
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
        L_0x006c:
            int r5 = (int) r1
            int r5 = r5 + r11
            int[] r3 = r8.A02
            int r2 = r3.length
            int[] r1 = new int[r2]
        L_0x0073:
            if (r7 >= r2) goto L_0x00bc
            r0 = r3[r7]
            int r0 = r0 + r5
            r1[r7] = r0
            int r7 = r7 + 1
            goto L_0x0073
        L_0x007d:
            r0 = 32
            long r1 = r1 >> r0
            goto L_0x006c
        L_0x0081:
            X.0sL r3 = r4.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            int[] r0 = r4.A02
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r3.invoke(r1, r0)
            int[] r5 = (int[]) r5
            int r3 = r5.length
            int[] r1 = new int[r3]
            r0 = 0
        L_0x0098:
            if (r0 >= r3) goto L_0x009f
            r1[r0] = r11
            int r0 = r0 + 1
            goto L_0x0098
        L_0x009f:
            r4.A02 = r5
            int r0 = X.I48.A00(r5)
            r2.EZz(r0)
            r4.A03 = r1
            int r1 = X.I48.A01(r5, r1)
            X.5dh r0 = r4.A06
            r0.EZz(r1)
            X.6Gv r0 = r4.A04
            r0.A00(r10)
            r0 = 0
            r4.A00 = r0
            goto L_0x00c9
        L_0x00bc:
            r4.A03 = r1
            int[] r0 = r4.A02
            int r1 = X.I48.A01(r0, r1)
            X.5dh r0 = r4.A06
            r0.EZz(r1)
        L_0x00c9:
            X.5R7 r0 = r9.A02
            if (r0 == 0) goto L_0x00d0
            r0.AWL()
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A01(int, int):void");
    }

    public final void A02(IGX igx, boolean z) {
        0sP r6;
        Object obj;
        Object obj2;
        this.A00 -= igx.A00;
        this.A0G.Epw(igx);
        I48 i48 = this.A0D;
        if (z) {
            int[] iArr = igx.A02;
            i48.A03 = iArr;
            i48.A06.EZz(I48.A01(i48.A02, iArr));
        } else {
            int[] iArr2 = igx.A0F;
            int A002 = I48.A00(iArr2);
            List list = igx.A0D;
            int size = list.size();
            int i = 0;
            while (true) {
                r6 = null;
                if (i >= size) {
                    obj = r6;
                    break;
                }
                obj = list.get(i);
                if (((IFH) obj).A07 == A002) {
                    break;
                }
                i++;
            }
            IFH ifh = (IFH) obj;
            if (ifh != null) {
                obj2 = ifh.A0D;
            } else {
                obj2 = r6;
            }
            i48.A00 = obj2;
            i48.A04.A00(A002);
            if (i48.A01 || igx.A06 > 0) {
                i48.A01 = true;
                Snapshot A022 = AnonymousClass5PH.A02();
                if (A022 != null) {
                    r6 = A022.A05();
                }
                Snapshot A032 = AnonymousClass5PH.A03(A022);
                try {
                    int[] iArr3 = igx.A02;
                    i48.A02 = iArr2;
                    i48.A05.EZz(I48.A00(iArr2));
                    i48.A03 = iArr3;
                    i48.A06.EZz(I48.A01(iArr2, iArr3));
                } finally {
                    AnonymousClass5PH.A06(A022, A032, r6);
                }
            }
            if (this.A01 != -1 && AnonymousClass7TE.A1b(list)) {
                int i2 = ((IFH) ((JLD) 00k.A0I(list))).A07;
                int i3 = ((IFH) ((JLD) 00k.A0K(list))).A07;
                int i4 = this.A01;
                if (i2 > i4 || i4 > i3) {
                    this.A01 = -1;
                    Map map = this.A0K;
                    Iterator A0v = AnonymousClass7TF.A0v(map);
                    while (A0v.hasNext()) {
                        ((JP9) A0v.next()).cancel();
                    }
                    map.clear();
                }
            }
        }
        boolean z2 = false;
        if (igx.A0F[0] != 0 || igx.A02[0] > 0) {
            z2 = true;
        }
        C51967G9n.A16(this.A0E, z2);
        C51967G9n.A16(this.A0F, igx.A01);
        this.A03++;
    }

    public final float APi(float f) {
        return this.A05.APi(f);
    }

    public final boolean AkV() {
        return C51971G9r.A1W(this.A0E);
    }

    public final boolean AkW() {
        return C51971G9r.A1W(this.A0F);
    }

    public final boolean CbH() {
        return this.A05.CbH();
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.A0D = new I48(new C58161InR(this, 0), iArr, iArr2);
        IGX igx = C55371Hgd.A00;
        C305206Gy r1 = C305206Gy.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A0G = new ParcelableSnapshotMutableState(r1, igx);
    }
}

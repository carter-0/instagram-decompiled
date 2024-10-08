package androidx.compose.foundation.lazy;

import X.002;
import X.00k;
import X.0qQ;
import X.0sP;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass0eM;
import X.AnonymousClass4D7;
import X.AnonymousClass5PH;
import X.AnonymousClass5R7;
import X.AnonymousClass5aS;
import X.AnonymousClass6H4;
import X.AnonymousClass6H6;
import X.AnonymousClass6H8;
import X.AnonymousClass6HA;
import X.AnonymousClass6HB;
import X.AnonymousClass6HC;
import X.AnonymousClass6JK;
import X.AnonymousClass6JM;
import X.AnonymousClass9L6;
import X.C262224Cq;
import X.C268024cd;
import X.C284885Or;
import X.C284905Ot;
import X.C284945Oz;
import X.C286015Tp;
import X.C287605aT;
import X.C287725af;
import X.C287765aj;
import X.C287795am;
import X.C287805an;
import X.C287955b5;
import X.C288895cf;
import X.C305066Gi;
import X.C305076Gk;
import X.C305086Gl;
import X.C305096Gn;
import X.C305106Go;
import X.C305116Gp;
import X.C305126Gq;
import X.C305146Gs;
import X.C305156Gt;
import X.C305166Gu;
import X.C305186Gw;
import X.C305206Gy;
import X.C305216Gz;
import X.C376929Jw;
import X.C377339Ll;
import X.C54609HKs;
import X.C59676JTh;
import X.C60340gF;
import X.GQU;
import X.GW7;
import X.GW8;
import X.JP9;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

public final class LazyListState implements C305096Gn {
    public static final C286015Tp A0O = C305126Gq.A00(C305116Gp.A00, C305106Go.A00);
    public float A00;
    public C287955b5 A01;
    public C305076Gk A02;
    public AnonymousClass5R7 A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public final C287605aT A07;
    public final AnonymousClass6HB A08;
    public final C305156Gt A09;
    public final C305166Gu A0A;
    public final AwaitFirstLayoutModifier A0B;
    public final AnonymousClass6H6 A0C;
    public final AnonymousClass6H4 A0D;
    public final AnonymousClass6HC A0E;
    public final AnonymousClass6H8 A0F;
    public final C284945Oz A0G;
    public final C284945Oz A0H;
    public final C284945Oz A0I;
    public final C284945Oz A0J;
    public final C284945Oz A0K;
    public final C288895cf A0L;
    public final C305096Gn A0M;
    public final C305186Gw A0N;

    public final Object A04(AnonymousClass4D7 r3, int i, int i2) {
        Object EKT = EKT(C54609HKs.A01, r3, new C376929Jw(this, (AnonymousClass4D7) null, i, i2));
        if (EKT != 1Hj.A02) {
            return C60340gF.A00;
        }
        return EKT;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object EKT(X.C54609HKs r7, X.AnonymousClass4D7 r8, X.0sL r9) {
        /*
            r6 = this;
            r5 = 2
            boolean r0 = X.C376739Jd.A00(r5, r8)
            if (r0 == 0) goto L_0x005e
            r4 = r8
            X.9Jd r4 = (X.C376739Jd) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r1) goto L_0x0028
            if (r0 != r5) goto L_0x0064
            X.0eS.A00(r3)
        L_0x0025:
            X.0gF r2 = X.C60340gF.A00
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.Object r9 = r4.A03
            X.0sL r9 = (X.0sL) r9
            java.lang.Object r7 = r4.A02
            X.HKs r7 = (X.C54609HKs) r7
            java.lang.Object r0 = r4.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.0eS.A00(r3)
            goto L_0x004c
        L_0x0038:
            X.0eS.A00(r3)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A0B
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r9
            r4.A00 = r1
            java.lang.Object r0 = r0.A00(r4)
            if (r0 == r2) goto L_0x0027
            r0 = r6
        L_0x004c:
            X.6Gn r1 = r0.A0M
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.EKT(r7, r4, r9)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x005e:
            X.9Jd r4 = new X.9Jd
            r4.<init>(r6, r8, r5)
            goto L_0x0015
        L_0x0064:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.EKT(X.HKs, X.4D7, X.0sL):java.lang.Object");
    }

    public final int A00() {
        return this.A0A.A03.BI6();
    }

    public final int A01() {
        return this.A0A.A04.BI6();
    }

    public final C305086Gl A02() {
        return (C305086Gl) this.A0I.getValue();
    }

    public final Object A03(AnonymousClass4D7 r8, int i, int i2) {
        C305186Gw r1 = this.A0N;
        Object EKU = r1.EKU(r8, new LazyAnimateScrollKt$animateScrollToItem$2(r1, ((C305076Gk) this.A0I.getValue()).A0C, (AnonymousClass4D7) null, i, i2, 100));
        1Hj r0 = 1Hj.A02;
        if (EKU != r0) {
            EKU = C60340gF.A00;
        }
        if (EKU != r0) {
            return C60340gF.A00;
        }
        return EKU;
    }

    public final void A05(int i, int i2) {
        C305166Gu r1 = this.A0A;
        if (!(r1.A03.BI6() == i && r1.A04.BI6() == i2)) {
            this.A0D.A06();
        }
        C305166Gu.A00(r1, i, i2);
        r1.A00 = null;
        AnonymousClass5R7 r0 = this.A03;
        if (r0 != null) {
            r0.AWL();
        }
    }

    public final void A06(C305076Gk r18, boolean z, boolean z2) {
        Object obj;
        int i;
        0sP r4;
        C305076Gk r3 = r18;
        if (z) {
            this.A04 = true;
        } else if (this.A04) {
            this.A02 = r3;
            return;
        }
        AnonymousClass6JK r7 = r3.A0B;
        boolean z3 = false;
        if (!((r7 == null || r7.A07 == 0) && r3.A01 == 0)) {
            z3 = true;
        }
        this.A0G.Epw(Boolean.valueOf(z3));
        this.A0H.Epw(Boolean.valueOf(r3.A02));
        this.A00 -= r3.A00;
        this.A0I.Epw(r3);
        C305166Gu r6 = this.A0A;
        if (z2) {
            int i2 = r3.A01;
            if (((float) i2) >= 0.0f) {
                r6.A04.EZz(i2);
            } else {
                throw new IllegalStateException(002.A0I("scrollOffset should be non-negative (", ')', i2));
            }
        } else {
            if (r7 != null) {
                obj = r7.A0B;
            } else {
                obj = null;
            }
            r6.A00 = obj;
            if (r6.A01 || r3.A06 > 0) {
                r6.A01 = true;
                int i3 = r3.A01;
                int i4 = 0;
                if (((float) i3) >= 0.0f) {
                    if (r7 != null) {
                        i4 = r7.A07;
                    }
                    C305166Gu.A00(r6, i4, i3);
                } else {
                    throw new IllegalStateException(002.A0I("scrollOffset should be non-negative (", ')', i3));
                }
            }
            if (this.A05) {
                C305146Gs r42 = (C305146Gs) this.A09;
                if (r42.A00 != -1) {
                    List list = r3.A0D;
                    if (!list.isEmpty()) {
                        if (r42.A02) {
                            i = ((AnonymousClass6JK) ((AnonymousClass6JM) 00k.A0K(list))).A07 + 1;
                        } else {
                            i = ((AnonymousClass6JK) ((AnonymousClass6JM) 00k.A0I(list))).A07 - 1;
                        }
                        if (r42.A00 != i) {
                            r42.A00 = -1;
                            JP9 jp9 = r42.A01;
                            if (jp9 != null) {
                                jp9.cancel();
                            }
                            r42.A01 = null;
                        }
                    }
                }
            }
        }
        if (z) {
            float f = r3.A03;
            C268024cd r43 = r3.A0C;
            C262224Cq r62 = r3.A0E;
            C305076Gk r0 = C305066Gi.A00;
            if (f > r43.F06(1.0f)) {
                Snapshot A022 = AnonymousClass5PH.A02();
                if (A022 != null) {
                    r4 = A022.A05();
                } else {
                    r4 = null;
                }
                Snapshot A032 = AnonymousClass5PH.A03(A022);
                try {
                    float floatValue = ((Number) this.A01.A05.getValue()).floatValue();
                    C287955b5 r72 = this.A01;
                    if (r72.A03) {
                        this.A01 = GQU.A01(r72, floatValue - f, 0.0f, 30);
                        1Eo.A05(19B.A00, new C59676JTh((Object) this, (AnonymousClass4D7) null, 7), r62);
                    } else {
                        this.A01 = new C287955b5((C287725af) null, C287765aj.A02, Float.valueOf(-f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                        1Eo.A05(19B.A00, new C59676JTh((Object) this, (AnonymousClass4D7) null, 8), r62);
                    }
                } finally {
                    AnonymousClass5PH.A06(A022, A032, r4);
                }
            }
        }
        this.A06++;
    }

    public final float APi(float f) {
        return this.A0M.APi(f);
    }

    public final boolean AkV() {
        return ((Boolean) this.A0G.getValue()).booleanValue();
    }

    public final boolean AkW() {
        return ((Boolean) this.A0H.getValue()).booleanValue();
    }

    public final boolean CbH() {
        return this.A0M.CbH();
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyListState(C305156Gt r10, int i, int i2) {
        this.A09 = r10;
        this.A0A = new C305166Gu(i, i2);
        this.A0N = new C305186Gw(this);
        C305076Gk r2 = C305066Gi.A00;
        C305206Gy r1 = C305206Gy.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A0I = new ParcelableSnapshotMutableState(r1, r2);
        this.A07 = new AnonymousClass5aS();
        this.A0M = new C305216Gz(new AnonymousClass9L6(this, 18));
        this.A05 = true;
        this.A0L = new GW8(this);
        this.A0B = new Object();
        this.A0D = new AnonymousClass6H4();
        this.A0C = new AnonymousClass6H6();
        this.A0F = new AnonymousClass6H8(new C377339Ll(this, i, 0));
        this.A08 = new AnonymousClass6HA(this);
        this.A0E = new AnonymousClass6HC();
        this.A0J = GW7.A00();
        C284885Or r22 = C284885Or.A00;
        0qQ.A0C(r22, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0H = new ParcelableSnapshotMutableState(r22, false);
        0qQ.A0C(r22, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0G = new ParcelableSnapshotMutableState(r22, false);
        this.A0K = GW7.A00();
        C287805an r23 = C287765aj.A02;
        Float valueOf = Float.valueOf(0.0f);
        this.A01 = new C287955b5((C287725af) ((C287795am) r23).A01.invoke(valueOf), r23, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Gt, X.6Gs, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LazyListState() {
        /*
            r3 = this;
            r2 = 0
            X.6Gs r1 = new X.6Gs
            r1.<init>()
            r0 = -1
            r1.A00 = r0
            r3.<init>(r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.<init>():void");
    }
}

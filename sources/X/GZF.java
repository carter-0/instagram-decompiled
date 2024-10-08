package X;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

public final class GZF implements C305096Gn {
    public static final C286015Tp A0b = C305126Gq.A00(C52627Ga1.A00, C52626Ga0.A00);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public JP9 A0A;
    public C284945Oz A0B;
    public C284945Oz A0C;
    public C268024cd A0D;
    public boolean A0E;
    public boolean A0F;
    public final C305096Gn A0G;
    public final C287605aT A0H;
    public final AwaitFirstLayoutModifier A0I;
    public final C305196Gx A0J;
    public final AnonymousClass6H6 A0K;
    public final AnonymousClass6HC A0L;
    public final AnonymousClass6H8 A0M;
    public final C52613GZm A0N;
    public final C289495dh A0O;
    public final C289495dh A0P;
    public final C284945Oz A0Q;
    public final C284945Oz A0R;
    public final C284945Oz A0S;
    public final C284945Oz A0T;
    public final C284945Oz A0U;
    public final C284945Oz A0V;
    public final C284945Oz A0W;
    public final C284945Oz A0X;
    public final C270284gU A0Y;
    public final C270284gU A0Z;
    public final C288895cf A0a;

    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public GZF(C62320sa r10, float f, int i) {
        double d = (double) f;
        if (-0.5d > d || d > 0.5d) {
            throw AnonymousClass7TE.A0w(002.A0Z("currentPageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
        }
        this.A0X = C51970G9q.A0S(C51965G9l.A0M(0));
        this.A0J = new C52612GZl(this);
        this.A0N = new C52613GZm(this, f, i);
        this.A02 = i;
        this.A07 = Long.MAX_VALUE;
        this.A0G = new C305216Gz(J6G.A00(this, 49));
        this.A0E = true;
        this.A04 = -1;
        GZQ gzq = C52610GZj.A00;
        C305206Gy r1 = C305206Gy.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A0C = new ParcelableSnapshotMutableState(r1, gzq);
        this.A0D = C52610GZj.A01;
        this.A0H = new AnonymousClass5aS();
        this.A0O = new ParcelableSnapshotMutableIntState(-1);
        this.A0P = new ParcelableSnapshotMutableIntState(i);
        this.A0Y = C58682Ivr.A00(C289465dd.A00(), this, 19);
        this.A0Z = C58682Ivr.A00(C289465dd.A00(), this, 20);
        this.A0M = new AnonymousClass6H8((0sP) null);
        this.A0K = new AnonymousClass6H6();
        this.A0I = new Object();
        this.A0W = C51969G9p.A0S((Object) null);
        this.A0a = new C56872IFt(this, 2);
        this.A09 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0L = new AnonymousClass6HC();
        this.A0V = GW7.A00();
        this.A0U = GW7.A00();
        this.A0R = C51969G9p.A0S(false);
        this.A0Q = C51969G9p.A0S(false);
        this.A0T = C51969G9p.A0S(false);
        this.A0S = C51969G9p.A0S(false);
        this.A0B = C51969G9p.A0S(r10);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A01(X.C54609HKs r6, X.GZF r7, X.AnonymousClass4D7 r8, X.0sL r9) {
        /*
            r5 = 2
            boolean r0 = X.MED.A04(r5, r8)
            if (r0 == 0) goto L_0x007a
            r4 = r8
            X.MED r4 = (X.MED) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r0) goto L_0x0046
            if (r1 != r5) goto L_0x0080
            java.lang.Object r7 = r4.A01
            X.GZF r7 = (X.GZF) r7
            X.0eS.A00(r2)
        L_0x0029:
            r1 = -1
            X.5dh r0 = r7.A0O
            r0.EZz(r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0032:
            X.0eS.A00(r2)
            r4.A01 = r7
            r4.A02 = r6
            r4.A03 = r9
            r4.A00 = r0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r7.A0I
            java.lang.Object r0 = r0.A00(r4)
            if (r0 != r3) goto L_0x0055
            return r3
        L_0x0046:
            java.lang.Object r9 = r4.A03
            X.0sL r9 = (X.0sL) r9
            java.lang.Object r6 = r4.A02
            X.HKs r6 = (X.C54609HKs) r6
            java.lang.Object r7 = r4.A01
            X.GZF r7 = (X.GZF) r7
            X.0eS.A00(r2)
        L_0x0055:
            X.6Gn r2 = r7.A0G
            boolean r0 = r2.CbH()
            if (r0 != 0) goto L_0x006a
            X.GZm r0 = r7.A0N
            X.5dh r0 = r0.A05
            int r1 = r0.BI6()
            X.5dh r0 = r7.A0P
            r0.EZz(r1)
        L_0x006a:
            r4.A01 = r7
            r0 = 0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.EKT(r6, r4, r9)
            if (r0 != r3) goto L_0x0029
            return r3
        L_0x007a:
            X.MED r4 = new X.MED
            r4.<init>(r7, r8, r5)
            goto L_0x0015
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZF.A01(X.HKs, X.GZF, X.4D7, X.0sL):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.Ikp, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.AnonymousClass5b9 r15, X.AnonymousClass4D7 r16, int r17) {
        /*
            r14 = this;
            r8 = r15
            r5 = r17
            r12 = 0
            r4 = r16
            boolean r0 = r4 instanceof X.C58057Ikp
            if (r0 == 0) goto L_0x0091
            r3 = r4
            X.Ikp r3 = (X.C58057Ikp) r3
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r3.A01 = r2
        L_0x0018:
            java.lang.Object r7 = r3.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A01
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r6) goto L_0x005c
            if (r0 != r4) goto L_0x0097
            X.0eS.A00(r7)
        L_0x0029:
            X.0gF r2 = X.C60340gF.A00
        L_0x002b:
            return r2
        L_0x002c:
            X.0eS.A00(r7)
            X.GZm r1 = r14.A0N
            X.5dh r0 = r1.A05
            int r0 = r0.BI6()
            if (r5 != r0) goto L_0x0044
            X.5PZ r0 = r1.A04
            float r0 = r0.B6X()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            goto L_0x0029
        L_0x0044:
            int r0 = r14.A04()
            if (r0 == 0) goto L_0x0029
            r3.A02 = r14
            r3.A03 = r15
            r3.A00 = r5
            r3.A01 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r14.A0I
            java.lang.Object r0 = r0.A00(r3)
            if (r0 == r2) goto L_0x002b
            r1 = r14
            goto L_0x0069
        L_0x005c:
            int r5 = r3.A00
            java.lang.Object r8 = r3.A03
            X.5b9 r8 = (X.AnonymousClass5b9) r8
            java.lang.Object r1 = r3.A02
            X.GZF r1 = (X.GZF) r1
            X.0eS.A00(r7)
        L_0x0069:
            int r13 = A00(r1, r5)
            int r0 = r1.A05()
            float r0 = (float) r0
            float r12 = r12 * r0
            X.6Gx r9 = r1.A0J
            r0 = 8
            X.JFw r11 = new X.JFw
            r11.<init>(r1, r0)
            r10 = 0
            r3.A02 = r10
            r3.A03 = r10
            r3.A01 = r4
            X.XFe r0 = X.C52610GZj.A01
            androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2 r7 = new androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r9.EKU(r3, r7)
            if (r0 != r2) goto L_0x0029
            return r2
        L_0x0091:
            X.Ikp r3 = new X.Ikp
            r3.<init>(r14, r4)
            goto L_0x0018
        L_0x0097:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZF.A06(X.5b9, X.4D7, int):java.lang.Object");
    }

    public final Object EKT(C54609HKs hKs, AnonymousClass4D7 r3, 0sL r4) {
        return A01(hKs, this, r3, r4);
    }

    public final float A02() {
        C268024cd r1 = this.A0D;
        C21114XFe xFe = C52610GZj.A01;
        float F06 = r1.F06(56.0f);
        C284945Oz r2 = this.A0C;
        return Math.min(F06, ((float) ((GZQ) r2.getValue()).A05) / 2.0f) / ((float) ((GZQ) r2.getValue()).A05);
    }

    public final int A03() {
        return this.A0N.A05.BI6();
    }

    public final int A04() {
        return AnonymousClass7TE.A0M(DbT.A0r(this.A0B.getValue()));
    }

    public final int A05() {
        C284945Oz r2 = this.A0C;
        return ((GZQ) r2.getValue()).A05 + ((GZQ) r2.getValue()).A06;
    }

    public final void A07(int i, float f) {
        C52613GZm gZm = this.A0N;
        gZm.A05.EZz(i);
        gZm.A02.A00(i);
        gZm.A04.EWt(f);
        gZm.A00 = null;
        AnonymousClass5R7 r0 = (AnonymousClass5R7) this.A0W.getValue();
        if (r0 != null) {
            r0.AWL();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A08(GZQ gzq, boolean z) {
        Object obj;
        int i;
        int i2;
        0sP r3;
        int A002;
        float A012;
        int i3;
        boolean z2;
        float f;
        JP9 jp9;
        JP9 jp92;
        C52613GZm gZm = this.A0N;
        if (z) {
            gZm.A04.EWt(gzq.A00);
        } else {
            C52640GaE gaE = gzq.A0B;
            if (gaE != null) {
                obj = gaE.A06;
            } else {
                obj = null;
            }
            gZm.A00 = obj;
            if (gZm.A01 || AnonymousClass7TE.A1b(gzq.A0F)) {
                gZm.A01 = true;
                if (gaE != null) {
                    i2 = gaE.A03;
                } else {
                    i2 = 0;
                }
                float f2 = gzq.A00;
                gZm.A05.EZz(i2);
                gZm.A02.A00(i2);
                gZm.A04.EWt(f2);
            }
            if (this.A04 != -1) {
                List list = gzq.A0F;
                if (AnonymousClass7TE.A1b(list)) {
                    if (this.A0F) {
                        i = ((C52640GaE) ((JLG) 00k.A0K(list))).A03 + gzq.A04 + 1;
                    } else {
                        i = (((C52640GaE) ((JLG) 00k.A0I(list))).A03 - gzq.A04) - 1;
                    }
                    if (this.A04 != i) {
                        this.A04 = -1;
                        JP9 jp93 = this.A0A;
                        if (jp93 != null) {
                            jp93.cancel();
                        }
                        this.A0A = null;
                    }
                }
            }
        }
        C284945Oz r6 = this.A0C;
        r6.Epw(gzq);
        C51967G9n.A16(this.A0R, gzq.A02);
        C52640GaE gaE2 = gzq.A0C;
        boolean z3 = false;
        if (!((gaE2 == null || gaE2.A03 == 0) && gzq.A01 == 0)) {
            z3 = true;
        }
        C51967G9n.A16(this.A0Q, z3);
        if (gaE2 != null) {
            this.A02 = gaE2.A03;
        }
        this.A03 = gzq.A01;
        Snapshot A022 = AnonymousClass5PH.A02();
        if (A022 != null) {
            r3 = A022.A05();
        } else {
            r3 = null;
        }
        Snapshot A032 = AnonymousClass5PH.A03(A022);
        try {
            float f3 = this.A01;
            if (Math.abs(f3) > 0.5f && this.A0E) {
                AnonymousClass6Gj r8 = C51970G9q.A0Q(r6).A09;
                AnonymousClass6Gj r7 = AnonymousClass6Gj.Vertical;
                float signum = Math.signum(f3);
                C284945Oz r5 = this.A0X;
                long j = ((C289295dM) r5.getValue()).A00;
                if (r8 == r7) {
                    A012 = C289295dM.A02(j);
                } else {
                    A012 = C289295dM.A01(j);
                }
                if (signum == Math.signum(-A012) || (((int) C289295dM.A01(((C289295dM) r5.getValue()).A00)) == 0 && ((int) C289295dM.A02(((C289295dM) r5.getValue()).A00)) == 0)) {
                    float f4 = this.A01;
                    List list2 = gzq.A0F;
                    if (!list2.isEmpty()) {
                        if (f4 > 0.0f) {
                            z2 = true;
                            i3 = ((C52640GaE) ((JLG) 00k.A0K(list2))).A03 + gzq.A04 + 1;
                        } else {
                            z2 = false;
                            i3 = (((C52640GaE) ((JLG) 00k.A0I(list2))).A03 - gzq.A04) - 1;
                        }
                        if (i3 >= 0 && i3 < A04()) {
                            if (i3 != this.A04) {
                                if (!(this.A0F == z2 || (jp92 = this.A0A) == null)) {
                                    jp92.cancel();
                                }
                                this.A0F = z2;
                                this.A04 = i3;
                                this.A0A = this.A0M.A00(i3, this.A09);
                            }
                            if (z2) {
                                f = (float) ((((C52640GaE) ((JLG) 00k.A0K(list2))).A01 + (gzq.A05 + gzq.A06)) - gzq.A07);
                            } else {
                                f = (float) (gzq.A08 - ((C52640GaE) ((JLG) 00k.A0I(list2))).A01);
                                f4 = -f4;
                            }
                            if (f < f4 && (jp9 = this.A0A) != null) {
                                jp9.Cli();
                            }
                        }
                    }
                }
            }
            AnonymousClass5PH.A06(A022, A032, r3);
            this.A07 = C52610GZj.A00(gzq, A04());
            int A042 = A04();
            AnonymousClass6Gj r32 = gzq.A09;
            AnonymousClass6Gj r2 = AnonymousClass6Gj.Horizontal;
            long A0m = G9t.A0m(gzq.A0J);
            if (r32 == r2) {
                A002 = C51965G9l.A04(A0m);
            } else {
                A002 = C289005cr.A00(A0m);
            }
            this.A08 = (long) C229632nm.A03(gzq.A0A.E3C(A002, gzq.A05, -gzq.A08, gzq.A03, 0, A042), 0, A002);
        } catch (Throwable th) {
            AnonymousClass5PH.A06(A022, A032, r3);
            throw th;
        }
    }

    public final float APi(float f) {
        return this.A0G.APi(f);
    }

    public final boolean AkV() {
        return C51971G9r.A1W(this.A0Q);
    }

    public final boolean AkW() {
        return C51971G9r.A1W(this.A0R);
    }

    public final boolean CbH() {
        return this.A0G.CbH();
    }

    public static final int A00(GZF gzf, int i) {
        if (gzf.A04() > 0) {
            return C229632nm.A03(i, 0, gzf.A04() - 1);
        }
        return 0;
    }
}

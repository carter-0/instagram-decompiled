package com.instagram.igsignalsproducts.clips.tab;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.0sn;
import X.14i;
import X.182;
import X.19E;
import X.2SP;
import X.2bA;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0lh;
import X.AnonymousClass0vF;
import X.AnonymousClass12U;
import X.AnonymousClass19S;
import X.AnonymousClass562;
import X.AnonymousClass565;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C262224Cq;
import X.C51966G9m;
import X.C51971G9r;
import X.C61110lV;
import X.C61480nO;
import X.C61610nw;
import X.C62320sa;
import X.C63286KuV;
import X.C63287KuW;
import X.C63291Kua;
import X.C63719L4d;
import X.C63773L6f;
import X.C65375LsG;
import X.C65379LsK;
import X.C66209MIq;
import X.DbS;
import X.DbW;
import X.DbX;
import X.JTO;
import X.JTP;
import X.JTR;
import X.KSW;
import X.KSg;
import X.LDC;
import X.LDV;
import X.MG8;
import X.ML0;
import X.OCU;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import java.util.List;

public final class IgSignalsClipsOpenTabTracker implements C61110lV, AnonymousClass0lh {
    public int A00;
    public long A01 = -1;
    public IgSignalsDcpPredictor A02;
    public KSW A03;
    public OCU A04;
    public LDV A05;
    public boolean A06;
    public final Handler A07;
    public final UserSession A08;
    public final C61480nO A09;
    public final KSg A0A;
    public final C63719L4d A0B;
    public final C65379LsK A0C;
    public final C62320sa A0D;
    public final C262224Cq A0E;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r9, X.0sP r10) {
        /*
            r8 = this;
            r6 = 0
            boolean r0 = X.C66147MDz.A02(r6, r9)
            if (r0 == 0) goto L_0x0081
            r7 = r9
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r7.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r1) goto L_0x0087
            java.lang.Object r5 = r7.A03
            X.Kov r5 = (X.C62943Kov) r5
            java.lang.Object r10 = r7.A02
            X.0sP r10 = (X.0sP) r10
            java.lang.Object r4 = r7.A01
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r4 = (com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker) r4
            X.0eS.A00(r2)
        L_0x002f:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 == 0) goto L_0x0076
            X.KSW r3 = r4.A03
            if (r3 == 0) goto L_0x004f
            X.0qQ.A0B(r5, r6)
            X.LDU r2 = new X.LDU
            r2.<init>(r3, r3, r5)
            r1 = 46
            X.PqU r0 = new X.PqU
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r3, (java.lang.Object) r4)
            r2.A00 = r0
            X.566 r0 = r2.A02
            r0.EJc(r2)
        L_0x004f:
            X.0gF r4 = X.C60340gF.A00
        L_0x0051:
            return r4
        L_0x0052:
            X.0eS.A00(r2)
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r5 = r8.A02
            if (r5 == 0) goto L_0x0076
            X.KSW r0 = r8.A03
            if (r0 == 0) goto L_0x0076
            X.C66147MDz.A00(r8, r10, r5, r7, r1)
            X.4Cq r3 = r5.A07
            r2 = 0
            r1 = 44
            X.MGs r0 = new X.MGs
            r0.<init>(r5, r2, r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r3)
            java.lang.Object r2 = r0.A0E(r7)
            if (r2 == r4) goto L_0x0051
            r4 = r8
            goto L_0x002f
        L_0x0076:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r1)
            r10.invoke(r0)
            goto L_0x004f
        L_0x0081:
            X.MDz r7 = new X.MDz
            r7.<init>(r8, r9, r6)
            goto L_0x0015
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker.A00(X.4D7, X.0sP):java.lang.Object");
    }

    public final void A02(Integer num) {
        num.intValue();
        LDV ldv = this.A05;
        if (ldv != null) {
            ldv.A00 = JTR.A0O(this.A0D) - ldv.A02;
            ldv.A01 = num;
            this.A0C.A01(ldv);
            this.A05 = null;
            return;
        }
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            C65379LsK lsK = this.A0C;
            C65379LsK.A00(lsK);
            0sn r0 = lsK.A00;
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            LDV ldv2 = (LDV) 00k.A0L(r0);
            if (ldv2 != null && ldv2.A01 == AnonymousClass05K.A01) {
                ldv2.A00 += (long) (((int) (JTR.A0O(this.A0D) - this.A01)) + this.A00);
                ldv2.A01 = num2;
                lsK.A01(ldv2);
            }
        }
        this.A00 = 0;
    }

    public final void A01() {
        C51971G9r.A1P(this, this.A0E, 10);
    }

    public /* synthetic */ IgSignalsClipsOpenTabTracker(UserSession userSession) {
        Integer num;
        long j;
        Long A10;
        AnonymousClass0vF A0W = JTP.A0W(C61610nw.A00(), "IgSignalsClipsOpenTab");
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(A0W).AOJ(507027573, 3));
        C65379LsK lsK = new C65379LsK(userSession);
        ML0 ml0 = ML0.A00;
        2bA.A06(userSession);
        0qQ.A0B(userSession, 1);
        DbW.A1N(A022, 3, ml0);
        this.A08 = userSession;
        this.A09 = A0W;
        this.A0E = A022;
        this.A0C = lsK;
        this.A0D = ml0;
        C63291Kua kua = KSg.A04;
        KSg kSg = new KSg(userSession);
        kSg.A00 = AnonymousClass562.A00(userSession).A00(kSg, JTO.A1C(kua, 62), new C66209MIq(kua, 2));
        this.A0A = kSg;
        this.A0B = new C63719L4d(userSession, lsK);
        this.A07 = AnonymousClass7TF.A0D();
        AnonymousClass565 r0 = kSg.A00;
        if (r0 != null) {
            r0.A00 = lsK;
            14i.A05(this);
            0Tu r3 = 0Tu.A05;
            int A042 = DbS.A04(r3, userSession, 36611370678032606L);
            if (A042 > 0 && 2SP.A01.A06(0, A042) == 0) {
                C65375LsG lsG = new C65375LsG(userSession);
                AnonymousClass565 r02 = kSg.A00;
                if (r02 != null) {
                    r02.A03.add(lsG);
                }
            }
            String A043 = 182.A04(r3, userSession, 36892845654803398L);
            long A012 = 182.A01(r3, userSession, 36611370678229215L);
            if (A012 == 1) {
                num = AnonymousClass05K.A00;
            } else if (A012 == 2) {
                num = AnonymousClass05K.A01;
            } else if (A012 == 3) {
                num = AnonymousClass05K.A0C;
            } else {
                num = null;
            }
            if (A043.length() > 0 && num != null) {
                List A0x = DbX.A0x(A043);
                if (A0x.size() == 3) {
                    String A1G = C51966G9m.A1G(A0x, 0);
                    A1G = A1G == null ? "undefined" : A1G;
                    String A1G2 = C51966G9m.A1G(A0x, 1);
                    A1G2 = A1G2 == null ? "undefined" : A1G2;
                    String A1G3 = C51966G9m.A1G(A0x, 2);
                    if (A1G3 == null || (A10 = AnonymousClass7TE.A10(A1G3)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    C63286KuV.A00(num);
                    IgSignalsDcpPredictor igSignalsDcpPredictor = new IgSignalsDcpPredictor(userSession, new C63773L6f(j, A1G, A1G2), num);
                    this.A02 = igSignalsDcpPredictor;
                    LDC A002 = C63287KuW.A00(182.A04(r3, userSession, 36892845655000007L));
                    if (A002 != null) {
                        List list = igSignalsDcpPredictor.A04;
                        if (list.size() < 1) {
                            list.add(A002);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("productCore");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1307504408);
        C51971G9r.A1P(this, this.A0E, 9);
        AnonymousClass0fD.A0A(1117969150, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(1696149590);
        MG8.A01(this, this.A0E, 44);
        AnonymousClass0fD.A0A(1979564557, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        C51971G9r.A1P(this, this.A0E, 12);
    }
}

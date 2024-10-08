package com.instagram.igsignalsproducts.ttnc;

import X.14i;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0lh;
import X.AnonymousClass4D7;
import X.AnonymousClass59G;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C51967G9n;
import X.C51971G9r;
import X.C60340gF;
import X.C61110lV;
import X.C61262Jzu;
import X.C61480nO;
import X.C61929KSa;
import X.C61932KSh;
import X.C62320sa;
import X.C62943Kov;
import X.C63727L4l;
import X.C63774L6g;
import X.C64087LMf;
import X.JTR;
import X.JVU;
import X.KSV;
import X.LDD;
import X.LM4;
import X.LSL;
import X.LT2;
import X.MGA;
import X.MGJ;
import X.MSQ;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class IgSignalsTtncEstimator implements C61110lV, AnonymousClass0lh {
    public C62943Kov A00;
    public LSL A01;
    public C61932KSh A02;
    public boolean A03;
    public boolean A04;
    public final double A05;
    public final long A06;
    public final UserSession A07;
    public final C61480nO A08;
    public final MSQ A09;
    public final LM4 A0A;
    public final LDD A0B;
    public final AnonymousClass0eM A0C;
    public final C62320sa A0D;
    public final C262224Cq A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final void A03() {
        long A0O = JTR.A0O(this.A0D);
        AnonymousClass7TE.A1Z(new MGA((Object) this, (AnonymousClass4D7) null, 21, A0O), this.A0E);
    }

    public final void A04() {
        long A0O = JTR.A0O(this.A0D);
        AnonymousClass7TE.A1Z(new MGA((Object) this, (AnonymousClass4D7) null, 22, A0O), this.A0E);
    }

    public final void A05(Integer num, boolean z) {
        long A0O = JTR.A0O(this.A0D);
        AnonymousClass7TE.A1Z(new MGJ(this, num, (AnonymousClass4D7) null, A0O, z), this.A0E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006b, code lost:
        if (r14 != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IgSignalsTtncEstimator(com.instagram.common.session.UserSession r17) {
        /*
            r16 = this;
            X.LDD r10 = new X.LDD
            r9 = r17
            r10.<init>(r9)
            r13 = 0
            android.content.Context r0 = X.C60960kU.A00
            X.LM4 r8 = new X.LM4
            r8.<init>(r0)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36603287549580185(0x820a7f00011399, double:3.211404663738602E-306)
            int r2 = X.DbS.A04(r7, r9, r0)
            if (r2 <= 0) goto L_0x00c1
            r1 = 0
            X.2SP r0 = X.2SP.A01
            int r0 = r0.A06(r1, r2)
            if (r0 != 0) goto L_0x00c1
            X.LsH r6 = new X.LsH
            r6.<init>(r9)
        L_0x002a:
            r0 = 36321812572940067(0x810a7f00022723, double:3.033398755102635E-306)
            boolean r14 = X.182.A06(r7, r9, r0)
            r0 = 36603287549776794(0x820a7f0004139a, double:3.2114046638629386E-306)
            X.182.A01(r7, r9, r0)
            r0 = 36321812573660967(0x810a7f000d2727, double:3.033398755558535E-306)
            boolean r12 = X.182.A06(r7, r9, r0)
            r0 = 36321812573857577(0x810a7f00102729, double:3.033398755682872E-306)
            boolean r11 = X.182.A06(r7, r9, r0)
            r0 = 37166237503652269(0x840a7f000b01ad, double:3.5674164815113054E-306)
            double r4 = X.182.A00(r7, r9, r0)
            r0 = 36603287550301085(0x820a7f000c139d, double:3.2114046641945024E-306)
            long r2 = X.182.A01(r7, r9, r0)
            r0 = 36321812573005604(0x810a7f00032724, double:3.0333987551440806E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 != 0) goto L_0x006d
            r15 = 0
            if (r14 == 0) goto L_0x006e
        L_0x006d:
            r15 = 1
        L_0x006e:
            X.0nx r1 = X.C61610nw.A00()
            java.lang.String r0 = "IgSignalsTtncEstimator"
            X.0vF r14 = X.JTP.A0W(r1, r0)
            X.12U r7 = new X.12U
            r7.<init>(r14)
            r1 = 1002435370(0x3bbff32a, float:0.005857845)
            r0 = 3
            X.0nV r0 = r7.AOJ(r1, r0)
            X.19S r1 = X.19E.A02(r0)
            X.ML1 r0 = X.ML1.A00
            r7 = 1
            X.C51969G9p.A1S(r9, r7, r1)
            r7 = 18
            X.0qQ.A0B(r0, r7)
            r7 = r16
            r7.<init>()
            r7.A07 = r9
            r7.A0B = r10
            r7.A0A = r8
            r7.A09 = r6
            r7.A0G = r12
            r7.A0H = r11
            r7.A05 = r4
            r7.A06 = r2
            r7.A0F = r15
            r7.A00 = r13
            r7.A08 = r14
            r7.A0E = r1
            r7.A0D = r0
            X.0eO r1 = X.0eO.A02
            X.ML2 r0 = X.ML2.A00
            X.0eM r0 = X.AnonymousClass0eN.A00(r1, r0)
            r7.A0C = r0
            X.14i.A05(r7)
            return
        L_0x00c1:
            r6 = r13
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (X.AnonymousClass7TE.A1a(r0) != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r7, X.AnonymousClass4D7 r8, X.0sP r9) {
        /*
            r3 = 39
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x0088
            r6 = r8
            X.MDx r6 = (X.C66145MDx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r2 = r6.A00
            r1 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r1) goto L_0x008e
            java.lang.Object r9 = r6.A02
            X.0sP r9 = (X.0sP) r9
            java.lang.Object r7 = r6.A01
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r7 = (com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r7
            X.0eS.A00(r0)
        L_0x002c:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0068
        L_0x0032:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r5 = -1
            r7 = 0
            X.LMf r0 = new X.LMf
            r3 = r1
            r0.<init>(r1, r3, r5, r7)
            r9.invoke(r0)
        L_0x0040:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0043:
            X.0eS.A00(r0)
            X.Kov r4 = r7.A00
            if (r4 == 0) goto L_0x0068
            boolean r0 = r4 instanceof com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor
            if (r0 == 0) goto L_0x0068
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r4 = (com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor) r4
            X.C66145MDx.A00(r7, r9, r6, r1)
            X.4Cq r3 = r4.A07
            r2 = 0
            r1 = 44
            X.MGs r0 = new X.MGs
            r0.<init>(r4, r2, r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r3)
            java.lang.Object r0 = r0.A0E(r6)
            if (r0 != r5) goto L_0x002c
            return r5
        L_0x0068:
            X.LSL r3 = r7.A01
            if (r3 == 0) goto L_0x0032
            r0 = 8
            X.MPA r2 = X.MPA.A00(r9, r0)
            X.LMf r0 = r3.A00
            if (r0 == 0) goto L_0x007a
            r2.invoke(r0)
            goto L_0x0040
        L_0x007a:
            java.util.List r1 = r3.A01
            X.L1b r0 = new X.L1b
            r0.<init>(r2)
            r1.add(r0)
            X.LSL.A00(r3)
            goto L_0x0040
        L_0x0088:
            X.MDx r6 = new X.MDx
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator.A00(com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator, X.4D7, X.0sP):java.lang.Object");
    }

    public static final C60340gF A01(IgSignalsTtncEstimator igSignalsTtncEstimator, C63727L4l l4l, long j, boolean z) {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        LSL lsl = igSignalsTtncEstimator.A01;
        if (lsl != null) {
            C61262Jzu jzu = lsl.A07;
            Integer num4 = jzu.A03;
            Integer num5 = AnonymousClass05K.A00;
            if (num4 == num5) {
                if (z) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A01;
                }
                jzu.A03 = num2;
                jzu.A00 = (int) (j - jzu.A04);
                int i2 = -1;
                if (l4l == null || (num3 = l4l.A01) == null) {
                    i = -1;
                } else {
                    i = num3.intValue();
                }
                jzu.A02 = i;
                if (l4l != null) {
                    i2 = C51967G9n.A04(l4l.A00, -1);
                }
                jzu.A01 = i2;
            }
            if (lsl.A00 == null) {
                LSL.A01(lsl, new C64087LMf(-1.0d, -1.0d, -1, false));
            }
            igSignalsTtncEstimator.A01 = null;
            igSignalsTtncEstimator.A04 = true;
            igSignalsTtncEstimator.A03 = false;
            C63774L6g A002 = igSignalsTtncEstimator.A0B.A00();
            C61262Jzu jzu2 = lsl.A07;
            A002.A00 = jzu2;
            A002.A01 = true;
            if (!(jzu2.A07 == AnonymousClass05K.A0N || (num = jzu2.A03) == num5)) {
                int i3 = jzu2.A00;
                if (num != AnonymousClass05K.A0C || (i3 >= 300 && i3 <= 15000)) {
                    List list = A002.A02;
                    list.add(jzu2);
                    if (list.size() > 120) {
                        list.remove(0);
                    }
                    C61929KSa kSa = lsl.A08;
                    if (kSa != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        KSV ksv = kSa.A01;
                        if (ksv == null) {
                            ksv = LT2.A02(kSa, currentTimeMillis);
                            kSa.A01 = ksv;
                        }
                        if (z) {
                            ksv.A01(AnonymousClass7TE.A1I(new IgSignalsFeature(7000000, "time_to_new_content_ms", (double) jzu2.A00)));
                        }
                    }
                }
            }
        }
        return C60340gF.A00;
    }

    public final AnonymousClass59G A02(long j) {
        AnonymousClass0eM r4 = this.A0C;
        ((Calendar) AnonymousClass7TE.A14(r4)).setTime(new Date(j));
        return new AnonymousClass59G(Integer.valueOf(((Calendar) AnonymousClass7TE.A14(r4)).get(7)), Integer.valueOf(((Calendar) AnonymousClass7TE.A14(r4)).get(11)), Integer.valueOf(((Calendar) AnonymousClass7TE.A14(r4)).get(12)));
    }

    public final void onSessionWillEnd() {
        if (JVU.A01(this.A07, AnonymousClass05K.A0N)) {
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-113461692);
        C51971G9r.A1P(this, this.A0E, 13);
        AnonymousClass0fD.A0A(660028481, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1983392353, AnonymousClass0fD.A03(-1320739631));
    }
}

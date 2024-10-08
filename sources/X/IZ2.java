package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class IZ2 implements C233432vi {
    public int A00;
    public final UserSession A01;
    public final C233222vJ A02;
    public final C55659HlI A03;
    public final LinkedHashSet A04 = DbS.A0y();

    public final C233612w1 AMC() {
        return new IZ6(this, 2);
    }

    public final AnonymousClass4lJ AN3() {
        return new C57365IYw(this, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b5, code lost:
        if (r0.A05.A02(r13, r24, r3.A01) != false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if (r17 >= ((long) r3)) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec A[LOOP:0: B:35:0x00e6->B:37:0x00ec, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJE(X.C376459Ib r30, java.util.List r31) {
        /*
            r29 = this;
            r1 = 0
            r2 = r30
            r12 = r31
            boolean r26 = X.AnonymousClass7TF.A1U(r1, r2, r12)
            java.lang.Object r4 = X.00k.A0J(r12)
            X.9IV r4 = (X.AnonymousClass9IV) r4
            if (r4 == 0) goto L_0x04f2
            r28 = r29
            java.util.Set r0 = r28.Bsw()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x04f2
            r0 = r28
            com.instagram.common.session.UserSession r5 = r0.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36316379439567137(0x81058e00061121, double:3.029962819680122E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x04f2
            r11 = 0
            r0 = r28
            X.HlI r0 = r0.A03
            r2 = r28
            int r5 = r2.A00
            X.HFE r0 = (X.HFE) r0
            com.instagram.common.session.UserSession r10 = r0.A01
            X.1E8 r3 = X.1E7.A00(r10)
            java.lang.Object r2 = r4.A01
            X.9J4 r2 = (X.AnonymousClass9J4) r2
            java.lang.Object r2 = r2.A02
            X.9JO r2 = (X.AnonymousClass9JO) r2
            java.lang.String r2 = r2.A04
            X.1Xj r3 = r3.A02(r2)
            r9 = -1
            if (r3 == 0) goto L_0x0060
            X.2rI r2 = r0.A04
            X.3W1 r3 = r2.BQr(r3)
            int r2 = r3.getPosition()
            if (r2 == r9) goto L_0x0060
            int r9 = r3.getPosition()
        L_0x0060:
            X.2vu r8 = r0.A03
            X.2vf r7 = r0.A08
            X.2mN r6 = r0.A07
            int r2 = r8.A03(r10, r6, r7, r5)
            r3 = -1
            if (r2 == r3) goto L_0x04d9
            if (r9 == r3) goto L_0x04d9
            int r2 = r8.A03(r10, r6, r7, r5)
            int r5 = X.C233552vu.A00(r6, r7, r5)
            int[] r2 = new int[]{r2, r5}
            r2 = r2[r1]
            if (r5 <= r2) goto L_0x0080
            r2 = r5
        L_0x0080:
            if (r9 < r2) goto L_0x04d9
            r2 = r28
            int r2 = r2.A00
            r27 = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.1PW r5 = new X.1PW
            r5.<init>(r2)
            boolean r2 = r0.A0D
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = X.00k.A0O(r12, r1)
            X.9IV r2 = (X.AnonymousClass9IV) r2
            if (r2 == 0) goto L_0x00f8
            X.1E8 r4 = X.1E7.A00(r10)
            java.lang.Object r9 = r2.A01
            X.9J4 r9 = (X.AnonymousClass9J4) r9
            java.lang.Object r2 = r9.A02
            X.9JO r2 = (X.AnonymousClass9JO) r2
            java.lang.String r2 = r2.A04
            X.1Xj r2 = r4.A02(r2)
            if (r2 == 0) goto L_0x00f8
            boolean r2 = X.C231122qu.A0O(r10, r2)
            if (r2 == 0) goto L_0x00f8
            java.util.List r4 = r0.A0A
            java.lang.Object r2 = r9.A04
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x00f8
            X.2vJ r2 = r0.A09
            java.lang.Object r0 = X.00k.A0O(r12, r1)
            X.9IV r0 = (X.AnonymousClass9IV) r0
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r0.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r0.A04
        L_0x00d1:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "signal_eligible_for_iaa_gap_0"
            r2.Cjj(r11, r11, r0, r1)
        L_0x00de:
            r0 = r28
            java.util.LinkedHashSet r0 = r0.A04
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)
        L_0x00e6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04f2
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r1)
            X.2vz r0 = (X.C233602vz) r0
            r0.DKi(r5)
            goto L_0x00e6
        L_0x00f6:
            r0 = r11
            goto L_0x00d1
        L_0x00f8:
            r2 = r27
            X.4EB r25 = r8.A05(r7, r2)
            if (r25 != 0) goto L_0x0126
            X.2vJ r2 = r0.A09
            java.lang.Object r0 = X.00k.A0O(r12, r1)
            X.9IV r0 = (X.AnonymousClass9IV) r0
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r0.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r0.A04
        L_0x0112:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 3630(0xe2e, float:5.087E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.Cjj(r11, r11, r0, r1)
            goto L_0x00de
        L_0x0124:
            r0 = r11
            goto L_0x0112
        L_0x0126:
            r2 = r25
            int r24 = r8.A02(r10, r2)
            r2 = r24
            if (r2 == r3) goto L_0x0426
            boolean r2 = r8.A07(r2)
            if (r2 == 0) goto L_0x0426
            r18 = 63
            X.ULX r9 = new X.ULX
            r13 = r9
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r19 = r1
            r20 = r1
            r13.<init>((java.lang.Double) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (boolean) r19, (boolean) r20)
            r2 = r25
            X.2vl r2 = r2.A03
            if (r2 == 0) goto L_0x0334
            X.1sS r4 = r2.A01
        L_0x0150:
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x026a
            if (r4 == 0) goto L_0x026a
            java.lang.Boolean r3 = r4.B1J()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r1)
            if (r3 != 0) goto L_0x026a
            java.util.List r3 = r4.CCl()
            if (r3 == 0) goto L_0x026a
            java.util.Iterator r23 = r3.iterator()
        L_0x016c:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x026a
            java.lang.Object r22 = r23.next()
            r3 = r22
            X.DT2 r3 = (X.DT2) r3
            r22 = r3
            java.lang.String r3 = r22.BTA()
            if (r3 == 0) goto L_0x016c
            java.util.List r3 = r22.B0d()
            if (r3 == 0) goto L_0x016c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x016c
            java.util.List r3 = r22.B0d()
            if (r3 == 0) goto L_0x01bb
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r16 = r3.iterator()
        L_0x019c:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x01bc
            java.lang.Object r3 = r16.next()
            X.DTu r3 = (X.C46291DTu) r3
            X.CvE r3 = r3.AKU()
            java.lang.String r15 = r3.A01
            java.lang.String r14 = r3.A02
            java.lang.Double r4 = r3.A00
            X.BI8 r3 = new X.BI8
            r3.<init>(r4, r15, r14)
            r13.add(r3)
            goto L_0x019c
        L_0x01bb:
            r13 = r11
        L_0x01bc:
            java.lang.Object r14 = r12.get(r1)
            X.9IV r14 = (X.AnonymousClass9IV) r14
            if (r13 == 0) goto L_0x016c
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r20 = r13.iterator()
        L_0x01cc:
            boolean r3 = r20.hasNext()
            if (r3 == 0) goto L_0x023f
            java.lang.Object r19 = r20.next()
            r13 = r19
            X.BI8 r13 = (X.BI8) r13
            java.lang.Object r15 = r14.A00
            X.3qu r15 = (X.C253513qu) r15
            boolean r3 = r15 instanceof X.C253533qw
            if (r3 == 0) goto L_0x020f
            java.lang.String r3 = r13.A02
            r4 = r3
            java.lang.String r3 = "dwell"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x020f
            r3 = 850(0x352, float:1.191E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            X.0qQ.A0C(r15, r3)
            X.3qw r15 = (X.C253533qw) r15
            long r3 = r15.A0A
            long r17 = X.AnonymousClass7TE.A0P(r3)
            java.lang.Double r3 = r13.A00
            if (r3 == 0) goto L_0x023d
            double r15 = r3.doubleValue()
            int r15 = (int) r15
            r3 = r15
        L_0x0208:
            long r3 = (long) r3
            int r15 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            r16 = 0
            if (r15 < 0) goto L_0x0211
        L_0x020f:
            r16 = 1
        L_0x0211:
            java.lang.Object r4 = r14.A01
            X.9J4 r4 = (X.AnonymousClass9J4) r4
            java.lang.Object r3 = r4.A04
            X.2v9 r3 = (X.C233162v9) r3
            java.lang.String r3 = r3.A00
            r15 = r3
            java.lang.String r3 = r13.A02
            boolean r3 = X.0qQ.A0K(r15, r3)
            if (r3 == 0) goto L_0x0235
            java.lang.Object r3 = r4.A01
            X.2pg r3 = (X.C230472pg) r3
            java.lang.String r4 = r3.A00
            java.lang.String r3 = r13.A01
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0235
            if (r16 == 0) goto L_0x0235
            goto L_0x01cc
        L_0x0235:
            r4 = r19
            r3 = r21
            r3.add(r4)
            goto L_0x01cc
        L_0x023d:
            r3 = 0
            goto L_0x0208
        L_0x023f:
            boolean r3 = r21.isEmpty()
            if (r3 == 0) goto L_0x02df
            java.lang.String r15 = r22.BTA()
            java.lang.Object r3 = r12.get(r1)
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r3 = r3.A01
            X.9J4 r3 = (X.AnonymousClass9J4) r3
            java.lang.Object r3 = r3.A04
            X.2v9 r3 = (X.C233162v9) r3
            java.lang.String r3 = r3.A00
            r18 = 38
            X.ULX r9 = new X.ULX
            r13 = r9
            r14 = r11
            r16 = r3
            r17 = r11
            r19 = r26
            r20 = r1
            r13.<init>((java.lang.Double) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (boolean) r19, (boolean) r20)
        L_0x026a:
            X.2kt r3 = r0.A02
            int r3 = r3.AuP()
            r4 = 0
            if (r3 != 0) goto L_0x033f
            r4 = 1
            boolean r3 = r9.A05
            if (r3 == 0) goto L_0x033f
            r2 = 3395(0xd43, float:4.757E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r5.A01(r2)
            r2 = r27
            int r16 = r8.A03(r10, r6, r7, r2)
            int r17 = X.C233552vu.A00(r6, r7, r2)
            java.lang.String r2 = r9.A02
            if (r2 == 0) goto L_0x02dd
            java.lang.Integer r15 = X.00y.A0l(r2)
        L_0x0293:
            r13 = r8
            r14 = r25
            r18 = r24
            r19 = r27
            X.GTT r3 = r13.A04(r14, r15, r16, r17, r18, r19)
            X.1Pi r13 = r6.BXm(r14)
            java.lang.String r14 = "Required value was null."
            if (r13 == 0) goto L_0x04d4
            boolean r2 = r0.A0C
            if (r2 == 0) goto L_0x02b7
            X.1Ph r6 = r0.A05
            int r4 = r3.A01
            r2 = r24
            boolean r2 = r6.A02(r13, r2, r4)
            r4 = 0
            if (r2 == 0) goto L_0x02b8
        L_0x02b7:
            r4 = 1
        L_0x02b8:
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x047e
            if (r4 == 0) goto L_0x0337
            int r1 = r3.A01
            r5.A03 = r1
            r0 = r27
            r5.A02 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A0C = r0
            r2 = r8
            r3 = r10
            r4 = r7
            r6 = r16
            r7 = r1
            r8 = r27
            r2.A06(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = r9.A03
            if (r0 == 0) goto L_0x04cf
            r5.A0F = r0
            goto L_0x00de
        L_0x02dd:
            r15 = r11
            goto L_0x0293
        L_0x02df:
            int r4 = r21.size()
            r3 = r26
            if (r4 != r3) goto L_0x016c
            r3 = r21
            java.lang.Object r13 = r3.get(r1)
            X.BI8 r13 = (X.BI8) r13
            java.lang.String r4 = r13.A02
            java.lang.String r3 = "dwell"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x016c
            java.lang.String r4 = r13.A01
            java.lang.String r3 = "organic"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x016c
            r3 = r21
            java.lang.Object r3 = r3.get(r1)
            X.BI8 r3 = (X.BI8) r3
            java.lang.Double r4 = r3.A00
            java.lang.String r15 = r22.BTA()
            java.lang.Object r3 = r12.get(r1)
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r3 = r3.A01
            X.9J4 r3 = (X.AnonymousClass9J4) r3
            java.lang.Object r3 = r3.A04
            X.2v9 r3 = (X.C233162v9) r3
            java.lang.String r3 = r3.A00
            r18 = 17
            X.ULX r9 = new X.ULX
            r13 = r9
            r14 = r4
            r16 = r11
            r17 = r3
            r19 = r1
            r20 = r26
            r13.<init>((java.lang.Double) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (boolean) r19, (boolean) r20)
            goto L_0x026a
        L_0x0334:
            r4 = r11
            goto L_0x0150
        L_0x0337:
            X.HN5 r2 = X.HN5.CONSECUTIVE_MIN_GAP
            java.lang.String r5 = r2.toString()
            goto L_0x0484
        L_0x033f:
            boolean r3 = r9.A06
            if (r3 == 0) goto L_0x03ec
            java.lang.String r5 = r9.A02
            java.lang.Object r4 = r9.A01
            java.lang.Double r4 = (java.lang.Double) r4
            java.lang.String r6 = "feed_acp"
            if (r5 == 0) goto L_0x03d3
            if (r4 == 0) goto L_0x03d3
            if (r2 == 0) goto L_0x03e6
            X.1sS r3 = r2.A01
            if (r3 == 0) goto L_0x03cc
            java.lang.String r10 = r3.BiN()
        L_0x0359:
            X.1sS r3 = r2.A01
            if (r3 == 0) goto L_0x03ca
            java.lang.Double r15 = r3.C7G()
        L_0x0361:
            X.1sS r3 = r2.A01
            if (r3 == 0) goto L_0x03e6
            X.4uQ r3 = r3.AKN()
            r3.A06 = r5
            r3.A03 = r4
            X.1sS r7 = r3.A08
            boolean r6 = r7 instanceof X.C43964CNj
            if (r6 == 0) goto L_0x03ce
            java.lang.Boolean r8 = r3.A00
            java.lang.String r6 = "enable_user_engagement_base_insertion"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r6, r8)
            java.lang.Double r8 = r3.A01
            java.lang.String r6 = "max_xout_prediction_threshold"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r6, r8)
            java.lang.String r8 = r3.A04
            java.lang.String r6 = "post_gap_to_previous_ad"
            X.0eP r18 = X.AnonymousClass7TE.A1L(r6, r8)
            java.lang.String r8 = r3.A05
            java.lang.String r6 = "post_gap_to_previous_netego"
            X.0eP r19 = X.AnonymousClass7TE.A1L(r6, r8)
            java.lang.Double r8 = r3.A02
            java.lang.String r6 = "predicted_xout_rate"
            X.0eP r20 = X.AnonymousClass7TE.A1L(r6, r8)
            java.lang.String r6 = "push_up_min_gap"
            X.0eP r21 = X.AnonymousClass7TE.A1L(r6, r5)
            java.lang.String r6 = "time_based_insertion_gap_in_seconds"
            X.0eP r22 = X.AnonymousClass7TE.A1L(r6, r4)
            java.util.List r3 = r3.A07
            r6 = 0
            if (r3 == 0) goto L_0x042d
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r3.iterator()
        L_0x03b4:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x042d
            java.lang.Object r3 = r8.next()
            X.DT2 r3 = (X.DT2) r3
            if (r3 == 0) goto L_0x03b4
            com.facebook.pando.TreeUpdaterJNI r3 = r3.FHC()
            r6.add(r3)
            goto L_0x03b4
        L_0x03ca:
            r15 = r11
            goto L_0x0361
        L_0x03cc:
            r10 = r11
            goto L_0x0359
        L_0x03ce:
            X.3lb r3 = r3.A00()
            goto L_0x043f
        L_0x03d3:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Fail to update pushup rule config for next sponsored item: pushUpMinGapToSet value is "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = " and timeGapToSet value is "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r4, r2, r3)
            goto L_0x03e8
        L_0x03e6:
            java.lang.String r2 = "Fail to update pushup rule config for next sponsored item since the original pushupValues is null"
        L_0x03e8:
            X.0wb.A03(r6, r2)
            goto L_0x0468
        L_0x03ec:
            r3 = r25
            X.1Xg r3 = r3.A01
            boolean r3 = X.AnonymousClass3VP.A03(r3)
            if (r3 == 0) goto L_0x0401
            java.lang.String r5 = "Netego"
        L_0x03f8:
            if (r4 != 0) goto L_0x0404
            r2 = 4174(0x104e, float:5.849E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            goto L_0x046a
        L_0x0401:
            java.lang.String r5 = "Ad"
            goto L_0x03f8
        L_0x0404:
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r3 = "signal_not_satisfied_for_push_up, Setting value: "
            r4.append(r3)
            if (r2 == 0) goto L_0x0424
            X.1sS r2 = r2.A01
            if (r2 == 0) goto L_0x0424
            java.lang.Boolean r2 = r2.B1J()
        L_0x0417:
            r4.append(r2)
            java.lang.String r2 = ", next sponsored item type: "
            r4.append(r2)
            java.lang.String r5 = X.AnonymousClass7TF.A0l(r5, r4)
            goto L_0x046a
        L_0x0424:
            r2 = 0
            goto L_0x0417
        L_0x0426:
            r2 = 3755(0xeab, float:5.262E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            goto L_0x046a
        L_0x042d:
            r3 = 4171(0x104b, float:5.845E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0eP r23 = X.AnonymousClass7TE.A1L(r3, r6)
            X.0eP[] r3 = new X.0eP[]{r16, r17, r18, r19, r20, r21, r22, r23}
            com.facebook.pando.TreeJNI r3 = X.C41847B3o.A0o(r7, r3)
        L_0x043f:
            X.1sS r3 = (X.C67241sS) r3
            r2.A01 = r3
            double r13 = r4.doubleValue()
            java.lang.String r7 = r9.A04
            boolean r3 = r5.equals(r10)
            r8 = 0
            if (r3 != 0) goto L_0x045a
            X.9Iz r4 = r2.A07
            if (r10 == 0) goto L_0x047c
            java.lang.Integer r3 = X.00y.A0l(r10)
        L_0x0458:
            r4.A00 = r3
        L_0x045a:
            if (r15 == 0) goto L_0x046c
            double r4 = r15.doubleValue()
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x046c
        L_0x0464:
            X.9Iz r2 = r2.A07
            r2.A02 = r7
        L_0x0468:
            java.lang.String r5 = "time_config_change_met"
        L_0x046a:
            r3 = 0
            goto L_0x0484
        L_0x046c:
            X.9Iz r6 = r2.A07
            if (r15 == 0) goto L_0x0479
            double r3 = r15.doubleValue()
            int r5 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
        L_0x0479:
            r6.A01 = r8
            goto L_0x0464
        L_0x047c:
            r3 = r11
            goto L_0x0458
        L_0x047e:
            r2 = 3182(0xc6e, float:4.459E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
        L_0x0484:
            X.HN5 r2 = X.HN5.CONSECUTIVE_MIN_GAP
            java.lang.String r2 = r2.toString()
            boolean r2 = X.0qQ.A0K(r5, r2)
            if (r2 == 0) goto L_0x04a0
            r6 = 58
            X.1Ph r2 = r0.A05
            java.util.List r4 = r2.A00
            java.lang.String r2 = ":"
            java.lang.String r2 = X.DbT.A0z(r2, r4, r11)
            java.lang.String r5 = X.002.A0T(r5, r2, r6)
        L_0x04a0:
            X.2vJ r4 = r0.A09
            java.lang.Object r0 = X.00k.A0O(r12, r1)
            X.9IV r0 = (X.AnonymousClass9IV) r0
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r0 = r0.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r0 = r0.A04
        L_0x04b2:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            if (r3 == 0) goto L_0x04cb
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x04c2:
            r0 = r25
            r4.Cjj(r1, r0, r5, r2)
            X.1PW r5 = X.1PW.A0K
            goto L_0x00de
        L_0x04cb:
            r1 = 0
            goto L_0x04c2
        L_0x04cd:
            r0 = 0
            goto L_0x04b2
        L_0x04cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x04d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x04d9:
            r0 = r28
            X.2vJ r2 = r0.A02
            java.lang.Object r0 = r4.A01
            X.9J4 r0 = (X.AnonymousClass9J4) r0
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r0 = r0.A04
        L_0x04e5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "should_not_start_gre_check"
            r2.Cjj(r11, r11, r0, r1)
        L_0x04f2:
            return
        L_0x04f3:
            r0 = r11
            goto L_0x04e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZ2.CJE(X.9Ib, java.util.List):void");
    }

    public final void Crm(int i) {
    }

    public final void Crv(int i) {
    }

    public final /* synthetic */ void Dpb() {
    }

    public final /* synthetic */ void Dpe() {
    }

    public final /* synthetic */ void Dpg(String str) {
    }

    public final /* synthetic */ void Dpk() {
    }

    public final void EBI() {
        this.A00 = 0;
    }

    public final void EDQ(C233602vz r2) {
        0qQ.A0B(r2, 0);
        this.A04.remove(r2);
    }

    public final void EIs(1PW r1) {
    }

    public final void EO6(C233452vk r1) {
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A04.add(r2);
        }
    }

    public final String B4s() {
        return "feed_rti";
    }

    public final Set Bsw() {
        Boolean bool;
        HFE hfe = (HFE) this.A03;
        if (!hfe.A00) {
            List A0x = DbX.A0x(182.A04(0Tu.A06, hfe.A01, 36879329393049865L));
            if (A0x != null) {
                ArrayList A0r = AnonymousClass7TG.A0r(A0x);
                Iterator it = A0x.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    C233162v9[] values = C233162v9.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            bool = null;
                            break;
                        }
                        C233162v9 r4 = values[i];
                        if (0qQ.A0K(r4.A01, DbV.A12(A18)) && r4.A00 != null) {
                            bool = Boolean.valueOf(hfe.A0B.add(new C376459Ib(C230472pg.SPONSORED, r4, C230432pc.FEED)));
                            break;
                        }
                        i++;
                    }
                    A0r.add(bool);
                }
            }
            hfe.A00 = true;
        }
        ImmutableSet A032 = ImmutableSet.A03(hfe.A0B);
        0qQ.A07(A032);
        return A032;
    }

    public final void CNn() {
    }

    public final void EIr() {
    }

    public IZ2(UserSession userSession, C233222vJ r3, C55659HlI hlI) {
        this.A03 = hlI;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void ATF(AnonymousClass30Y r3, C252093oY r4) {
        AnonymousClass7TG.A1N(r3, r4);
        if (r4.CEk(r3) == AnonymousClass05K.A00) {
            this.A00 = Math.max(AnonymousClass7TE.A0M(r3.A04), this.A00);
        }
    }

    public final 1PW AGd(List list) {
        return 1PW.A0K;
    }
}

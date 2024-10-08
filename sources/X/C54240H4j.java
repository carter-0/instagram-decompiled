package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.H4j  reason: case insensitive filesystem */
public final class C54240H4j extends 1P0 {
    public final /* synthetic */ C233082uv A00;

    public C54240H4j(C233082uv r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r14.A01 == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r5 = r22
            r0 = -2049268095(0xffffffff85daa681, float:-2.0561785E-35)
            int r11 = X.AnonymousClass0fD.A03(r0)
            X.Gz1 r5 = (X.C54077Gz1) r5
            r0 = 1161919410(0x45417bb2, float:3095.731)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r5, r6)
            r0 = r21
            X.2uv r4 = r0.A00
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x006a
            X.2ut r3 = r4.A02
            X.2un r8 = r3.A00
            java.lang.Integer r10 = r8.A0L
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r10 != r2) goto L_0x0077
            java.lang.Integer r1 = r5.A02()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r15 = "seedMedia"
            if (r1 != r0) goto L_0x01b8
            X.2rI r7 = r8.A07
            int r1 = r8.A03
            X.1Xj r0 = r8.A04
            if (r0 == 0) goto L_0x0169
            X.Hl2 r0 = X.I52.A01(r7, r1)
            int r0 = r0.A00
            r8.A01 = r0
            X.2rI r12 = r8.A07
            int r7 = r8.A03
            X.1Xj r1 = r8.A04
            if (r1 == 0) goto L_0x0169
            int r0 = r8.A00
            X.Hl3 r14 = X.C55044HbF.A00(r1, r12, r7, r0)
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x0066
            X.2pK r13 = r8.A0K
            X.1Xj r12 = r8.A04
            if (r12 == 0) goto L_0x0169
            int r0 = r8.A03
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r14.A00
            r0 = 0
            r13.A09(r12, r0, r7, r1)
        L_0x0066:
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x0077
        L_0x006a:
            r0 = -1297388081(0xffffffffb2ab6dcf, float:-1.9956955E-8)
        L_0x006d:
            X.AnonymousClass0fD.A0A(r0, r9)
            r0 = -1868598934(0xffffffff909f716a, float:-6.2889184E-29)
            X.AnonymousClass0fD.A0A(r0, r11)
            return
        L_0x0077:
            X.BFc r0 = r5.A03
            if (r0 == 0) goto L_0x007f
            int r0 = r0.A00
            r5.A00 = r0
        L_0x007f:
            java.util.ArrayList r7 = r4.A00(r5)
            int r13 = r5.mStatusCode
            long r18 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A00
            long r18 = r18 - r0
            r16 = r7
            if (r10 != r2) goto L_0x0109
            X.1Xj r0 = r8.A04
            java.lang.String r15 = "seedMedia"
            if (r0 == 0) goto L_0x0169
            r5.A04 = r0
            java.lang.String r0 = X.C51965G9l.A0t(r0)
            r5.A0A = r0
            int r0 = r8.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A07 = r0
            r8.A08 = r5
            X.2uu r1 = r8.A0A
            boolean r0 = r1 instanceof X.C233842wZ
            if (r0 == 0) goto L_0x00b9
            X.2wZ r1 = (X.C233842wZ) r1
            if (r1 == 0) goto L_0x00b9
            r1.A01 = r5
            int r0 = r8.A01
            r1.A00 = r0
        L_0x00b9:
            int r0 = r8.A01
            X.4EB r0 = X.C55042HbD.A00(r5, r0)
            java.util.List r16 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.common.session.UserSession r12 = r8.A0I
            X.0Tu r10 = X.0Tu.A06
            r0 = 36323281451625516(0x810bd500002c2c, double:3.0343276798980124E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x0109
            X.2ln r0 = X.C228502lm.A00(r12)
            java.lang.String r12 = r5.getId()
            X.2vo r1 = r5.A01()
            java.lang.Integer r1 = r1.A0G
            int r10 = X.DbX.A02(r1)
            X.0qQ.A0B(r12, r6)
            r1 = 976041859(0x3a2d3783, float:6.607698E-4)
            X.02m r0 = r0.A00
            com.facebook.quicklog.MarkerEditor r1 = r0.withMarker(r1)
            java.lang.String r0 = "async_item_insertion"
            com.facebook.quicklog.PointEditor r1 = r1.pointEditor(r0)
            java.lang.String r0 = "item_id"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r12)
            r0 = 4882(0x1312, float:6.841E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r10)
            r0.markerEditingCompleted()
        L_0x0109:
            X.2vI r14 = r8.A0B
            if (r14 == 0) goto L_0x0116
            X.4LN r15 = X.AnonymousClass4LN.A0D
            r20 = r6
            r17 = r13
            r14.Ch2(r15, r16, r17, r18, r20)
        L_0x0116:
            java.util.List r0 = r5.A0B
            int r1 = r0.size()
            r0 = 1
            if (r1 == r0) goto L_0x01fe
            java.util.List r0 = r5.A0B
            int r8 = r0.size()
            int r6 = r5.A00
            r1 = 33
            r0 = 4
            if (r6 != r1) goto L_0x012d
            r0 = 3
        L_0x012d:
            if (r8 >= r0) goto L_0x01fe
            java.lang.Integer r0 = r4.A06
            if (r0 != r2) goto L_0x01fe
            com.instagram.common.session.UserSession r8 = r4.A04
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312887638558138(0x810261007705ba, double:3.0277545906616766E-306)
            boolean r0 = X.182.A06(r6, r8, r0)
            if (r0 == 0) goto L_0x01fe
            X.1Xj r6 = r5.A04
            if (r6 == 0) goto L_0x0152
            java.lang.Integer r3 = r5.A07
            if (r3 == 0) goto L_0x0152
            X.2pK r2 = r4.A05
            r1 = 0
            java.lang.String r0 = "grid_less_than_4_ads_delivered"
            r2.A09(r6, r1, r3, r0)
        L_0x0152:
            r0 = 19690832(0x12c7550, float:3.1675578E-38)
            goto L_0x006d
        L_0x0157:
            java.lang.Integer r0 = r5.A02()
            if (r0 != r2) goto L_0x0185
            X.3DY r1 = r8.A06
            X.3DY r0 = X.AnonymousClass3DY.END_OF_FEED
            if (r1 != r0) goto L_0x0185
            X.3W1 r0 = r8.A05
            if (r0 != 0) goto L_0x0171
            java.lang.String r15 = "seedMediaMediaState"
        L_0x0169:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0171:
            boolean r0 = r0.A2c
            if (r0 == 0) goto L_0x0185
            X.2pK r4 = r8.A0K
            X.1Xj r3 = r8.A04
            if (r3 == 0) goto L_0x0169
            int r0 = r8.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "gap_0_eof_post_ad_engagement_ad_item_fully_viewed"
            goto L_0x01f9
        L_0x0185:
            X.3DY r1 = r8.A06
            X.3DY r0 = X.AnonymousClass3DY.AFI_AD_DWELL_SEE_MORE_CLICK
            if (r1 != r0) goto L_0x0077
            java.lang.Integer r0 = r5.A02()
            if (r0 != r2) goto L_0x0077
            java.util.List r0 = r5.A0B
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0077
            com.instagram.common.session.UserSession r12 = r8.A0I
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318965009619733(0x8107e800021b15, double:3.0315979445926383E-306)
            boolean r0 = X.182.A06(r7, r12, r0)
            if (r0 != 0) goto L_0x0077
            X.2pK r4 = r8.A0K
            X.1Xj r3 = r8.A04
            if (r3 == 0) goto L_0x0169
            int r0 = r8.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "gap_0_afi_ad_dwell_see_more_skipped"
            goto L_0x01f9
        L_0x01b8:
            java.lang.Integer r0 = r5.A02()
            if (r0 != r2) goto L_0x0157
            com.instagram.common.session.UserSession r7 = r8.A0I
            X.2rI r1 = r8.A07
            X.1Xj r0 = r8.A04
            if (r0 == 0) goto L_0x0169
            if (r1 == 0) goto L_0x0157
            java.lang.String r0 = X.C2817359g.A00(r7, r0)
            int r0 = r1.BJU(r0)
            int r0 = r0 + 1
            X.1Xg r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0157
            X.1UQ r1 = r0.A06
            X.1UQ r0 = X.1UQ.A0T
            if (r1 == r0) goto L_0x01ea
            X.1UQ r0 = X.1UQ.A06
            if (r1 == r0) goto L_0x01ea
            X.1UQ r0 = X.1UQ.A07
            if (r1 == r0) goto L_0x01ea
            X.1UQ r0 = X.1UQ.A08
            if (r1 != r0) goto L_0x0157
        L_0x01ea:
            X.2pK r4 = r8.A0K
            X.1Xj r3 = r8.A04
            if (r3 == 0) goto L_0x0169
            int r0 = r8.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "gap_0_post_ad_engagement_item_inserted"
        L_0x01f9:
            r4.A09(r3, r1, r2, r0)
            goto L_0x006a
        L_0x01fe:
            X.1P0 r0 = r4.A01
            if (r0 == 0) goto L_0x0205
            r0.onSuccess(r5)
        L_0x0205:
            r3.Dlz(r2, r7)
            r0 = 445243110(0x1a89dee6, float:5.7021984E-23)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54240H4j.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r11) {
        int i;
        int i2;
        String str;
        Integer num;
        Long l;
        Long l2;
        String str2;
        int i3;
        StringBuilder A1A;
        String A2n;
        int A03 = AnonymousClass0fD.A03(1632928186);
        0qQ.A0B(r11, 0);
        C233082uv r4 = this.A00;
        if (!r4.A03) {
            i2 = 1952489547;
        } else {
            1XQ r6 = (1XQ) r11.A00();
            if (r6 != null) {
                i = r6.mStatusCode;
            } else {
                i = 0;
            }
            C233062ut r7 = r4.A02;
            long elapsedRealtime = SystemClock.elapsedRealtime() - r4.A00;
            C233002un r3 = r7.A00;
            C233212vI r2 = r3.A0B;
            if (r2 != null) {
                r2.Cgz(i, false, elapsedRealtime);
            }
            1Xj r72 = r3.A04;
            if (r72 != null) {
                C230282pK r22 = r3.A0K;
                AnonymousClass3DY r0 = r3.A06;
                if (r0 == null || (str = r0.A00) == null) {
                    str = "";
                }
                0qQ.A0B(str, 1);
                0Aj A0e = AnonymousClass7TE.A0e(r22.A01, "instagram_ad_pivots_fetch_fail");
                if (A0e.isSampled()) {
                    boolean A1Q = AnonymousClass7TF.A1Q(r72.CcK() ? 1 : 0);
                    A0e.A9F("chaining_position", C51971G9r.A0m());
                    C51965G9l.A1R(A0e, "");
                    C51969G9p.A1B(A0e, r22.A04);
                    A0e.AAJ("contextual_ads_category", "");
                    DbS.A1O(A0e, "feed_timeline");
                    A0e.AAJ("trigger_type", str);
                    if (!r72.CcK()) {
                        num = AnonymousClass05K.A0j;
                    } else {
                        num = AnonymousClass05K.A0N;
                    }
                    A0e.A9F("multi_ads_type_number", Long.valueOf((long) AnonymousClass59V.A00(num)));
                    Long l3 = null;
                    A0e.AAJ("inventory_source", C241323Ot.A02(C51965G9l.A0t(r72)));
                    if (!A1Q) {
                        String A07 = C231122qu.A07(r22.A02, r72);
                        if (A07 != null) {
                            l = DbV.A0q(A07);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        l = null;
                    }
                    A0e.A9F("hscroll_seed_ad_id", l);
                    if (!A1Q || (A2n = r72.A2n()) == null) {
                        l2 = null;
                    } else {
                        l2 = AnonymousClass7TE.A10(A2n);
                    }
                    A0e.A9F(C273654mx.A00(729), l2);
                    if (A1Q) {
                        l3 = C51974G9v.A0T(r22.A02, r72);
                    }
                    A0e.A9F(C273654mx.A00(728), l3);
                    UserSession userSession = r22.A02;
                    A0e.A7p("is_seed_ad_multi_ads_eligible", C230282pK.A02(userSession, r72));
                    A0e.AAJ("hscroll_seed_ad_tracking_token", C230282pK.A05(userSession, r72));
                    Throwable A01 = r11.A01();
                    if (A01 != null) {
                        A1A = AnonymousClass7TE.A1A();
                        A1A.append("failure_reason_exception:");
                        A1A.append(A01);
                    } else if (r6 == null || (i3 = r6.mStatusCode) <= 0) {
                        str2 = "failure_reason_unknown";
                        A0e.AAJ(TraceFieldType.FailureReason, str2);
                        A0e.Cgf();
                    } else {
                        A1A = AnonymousClass7TE.A1A();
                        A1A.append("failure_reason_status_code:");
                        A1A.append(i3);
                    }
                    str2 = A1A.toString();
                    A0e.AAJ(TraceFieldType.FailureReason, str2);
                    A0e.Cgf();
                }
            }
            1P0 r02 = r4.A01;
            if (r02 != null) {
                r02.onFail(r11);
            }
            i2 = 616814439;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final void onFinish() {
        int i;
        int A03 = AnonymousClass0fD.A03(-1698704586);
        C233082uv r2 = this.A00;
        if (!r2.A03) {
            i = -272161395;
        } else {
            r2.A02.A00.A0C = AnonymousClass05K.A00;
            1P0 r0 = r2.A01;
            if (r0 != null) {
                r0.onFinish();
            }
            i = 2143686111;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onStart() {
        int i;
        int A03 = AnonymousClass0fD.A03(-386137082);
        C233082uv r2 = this.A00;
        if (!r2.A03) {
            i = 696646346;
        } else {
            r2.A00 = SystemClock.elapsedRealtime();
            1P0 r0 = r2.A01;
            if (r0 != null) {
                r0.onStart();
            }
            i = 466965244;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}

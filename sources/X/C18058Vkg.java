package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Vkg  reason: case insensitive filesystem */
public final class C18058Vkg {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final PromoteData A0C;
    public final C18784W1k A0D;
    public final PromoteState A0E;

    public final void A00() {
        this.A08.setVisibility(8);
        this.A01.setVisibility(8);
        this.A07.setVisibility(8);
        this.A06.setVisibility(8);
        this.A02.setVisibility(8);
    }

    public final void A01() {
        this.A0B.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A09.setVisibility(8);
        this.A04.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326051705599460L) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r26 = this;
            r6 = r26
            X.W1k r11 = r6.A0D
            X.UzE r17 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = r17.toString()
            java.lang.String r5 = "reach_estimation_fetch"
            com.instagram.business.promote.model.PromoteData r1 = r11.A03
            java.lang.String r0 = r11.A03(r0, r5)
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x018a
            com.instagram.business.promote.model.PromoteData r4 = r6.A0C
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r4)
            if (r0 == 0) goto L_0x00a3
            com.instagram.common.session.UserSession r7 = r4.A0y
            X.0qQ.A06(r7)
            boolean r0 = X.C18803W2r.A04(r7)
            if (r0 == 0) goto L_0x00a3
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326051705599460(0x810e5a000135e4, double:3.036079599666052E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x00a3
        L_0x0038:
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r4)
            if (r0 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r7 = r4.A0y
            X.0qQ.A06(r7)
            boolean r0 = X.C18803W2r.A04(r7)
            if (r0 == 0) goto L_0x007b
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326051705533923(0x810e5a000035e3, double:3.036079599624606E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x007b
            android.view.View r0 = r6.A03
            r3 = 0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A08
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r6.A01
            r0.setVisibility(r2)
            boolean r0 = r4.A2v
            if (r0 == 0) goto L_0x009b
            android.widget.TextView r0 = r6.A06
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A07
        L_0x0073:
            r0.setVisibility(r2)
            android.view.View r0 = r6.A02
            r0.setVisibility(r3)
        L_0x007b:
            java.lang.String r0 = r17.toString()
            java.lang.String r0 = r11.A03(r0, r5)
            com.instagram.api.schemas.Estimate r3 = r1.A05(r0)
            com.instagram.api.schemas.Estimate r0 = r1.A04(r0)
            if (r3 == 0) goto L_0x00cd
            if (r0 == 0) goto L_0x00cd
            com.instagram.business.promote.model.PromoteState r2 = r11.A04
            r1.A0U = r3
            r1.A0T = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            com.instagram.business.promote.model.PromoteState.A01(r2, r0)
            return
        L_0x009b:
            android.widget.TextView r0 = r6.A07
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A06
            goto L_0x0073
        L_0x00a3:
            android.view.View r0 = r6.A05
            r3 = 0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A0B
            r2 = 8
            r0.setVisibility(r2)
            boolean r0 = r4.A2v
            if (r0 == 0) goto L_0x00c5
            android.widget.TextView r0 = r6.A09
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A0A
        L_0x00bb:
            r0.setVisibility(r2)
            android.view.View r0 = r6.A04
            r0.setVisibility(r3)
            goto L_0x0038
        L_0x00c5:
            android.widget.TextView r0 = r6.A0A
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.A09
            goto L_0x00bb
        L_0x00cd:
            java.util.List r3 = r1.A1n
            r2 = 0
            X.WMm r0 = new X.WMm
            r0.<init>((java.lang.Object) r11, (int) r2)
            java.util.List r16 = X.C256393vh.A02(r0, r3)
            java.lang.String r10 = r1.A1S
            java.lang.String r0 = r17.toString()
            java.lang.String r22 = r11.A03(r0, r5)
            boolean r0 = r1.A2v
            if (r0 == 0) goto L_0x0186
            r13 = 1
        L_0x00e8:
            com.instagram.api.schemas.XIGIGBoostDestination r9 = r1.A0i
            r9.getClass()
            java.lang.String r14 = r1.A1Z
            r14.getClass()
            boolean r8 = r1.A2e
            boolean r7 = r1.A2r
            com.instagram.common.session.UserSession r0 = r11.A08
            java.lang.String r12 = r1.A1A
            java.util.ArrayList r15 = X.W3x.A0J(r9, r0, r8)
            java.lang.String r6 = r1.A09()
            com.instagram.business.promote.model.PromoteAudience r2 = r1.A06()
            boolean r2 = X.W3x.A0P(r2)
            if (r2 == 0) goto L_0x0183
            r5 = 0
        L_0x010d:
            X.WGU r4 = r11.A02
            java.lang.String r3 = r4.A03
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "ads/promote/estimate_reach_v2/"
            X.C51968G9o.A1K(r2, r0, r10)
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "destination"
            r2.A9m(r0, r1)
            java.lang.String r0 = "fb_auth_token"
            r2.A9m(r0, r12)
            java.lang.String r1 = X.C51970G9q.A0k(r15)
            java.lang.String r0 = "additional_publisher_platforms"
            r2.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "duration_in_days"
            r2.A9m(r0, r1)
            java.lang.String r0 = "audience_id"
            r2.A0G(r0, r5)
            java.lang.String r0 = "flow_id"
            r2.A0G(r0, r3)
            java.lang.String r1 = r16.toString()
            java.lang.String r0 = "total_budgets_with_offset"
            r2.AA0(r0, r1)
            java.lang.Class<X.UXd> r1 = X.C15243UXd.class
            java.lang.Class<X.Vmc> r0 = X.C18162Vmc.class
            r2.A0R(r1, r0)
            r0 = 1
            r2.A0R = r0
            boolean r0 = X.0mp.A0B(r6)
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = "messaging_destinations"
            r2.A9m(r0, r6)
        L_0x0162:
            X.1OC r1 = r2.A0M()
            java.lang.String r0 = "/api/v1/ads/promote/estimate_reach_v2/"
            java.lang.String r20 = X.W2x.A01(r0)
            X.UcW r15 = new X.UcW
            r23 = r14
            r24 = r8
            r25 = r7
            r19 = r11
            r21 = r10
            r18 = r4
            r16 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.C18784W1k.A02(r11, r15, r1)
            return
        L_0x0183:
            java.lang.String r5 = r1.A1Z
            goto L_0x010d
        L_0x0186:
            int r13 = r1.A0A
            goto L_0x00e8
        L_0x018a:
            r6.A01()
            r6.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18058Vkg.A02():void");
    }

    public C18058Vkg(View view, C18784W1k w1k, PromoteData promoteData, PromoteState promoteState) {
        this.A0C = promoteData;
        this.A0E = promoteState;
        this.A0D = w1k;
        this.A05 = AnonymousClass7TF.A0G(view, R.id.reach_estimation_row);
        this.A0B = AnonymousClass7TG.A0R(view, R.id.reach_estimation_text_view);
        this.A0A = AnonymousClass7TG.A0R(view, R.id.reach_estimation_subtitle_view);
        this.A09 = AnonymousClass7TG.A0R(view, R.id.reach_estimation_continuous_ads_subtitle_view);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.reach_estimation_progress_bar);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.outcome_estimation_row);
        this.A08 = AnonymousClass7TG.A0R(view, R.id.outcome_estimation_text_view);
        this.A07 = AnonymousClass7TG.A0R(view, R.id.outcome_estimation_subtitle_view);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.outcome_estimation_continuous_ads_subtitle_view);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.outcome_estimation_progress_bar);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.limited_response_warning_icon);
    }
}

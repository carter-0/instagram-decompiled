package com.instagram.leadads.activity;

import X.02m;
import X.0Yh;
import X.0qQ;
import X.0sr;
import X.2dZ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass1YB;
import X.AnonymousClass3GL;
import X.AnonymousClass4DS;
import X.C17587Vaf;
import X.C18709Vye;
import X.C19289WSx;
import X.C20651Wwj;
import X.C20955X6i;
import X.C227862kA;
import X.C238833Dp;
import X.C255943uy;
import X.C340057kd;
import X.C60152JgX;
import X.C73660PhZ;
import X.C73666Phf;
import X.DbT;
import X.DbU;
import X.DbY;
import X.WYW;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.lang.ref.WeakReference;

public final class LeadAdsActivity extends BaseFragmentActivity implements AnonymousClass0iw, C20955X6i {
    public WYW A00;
    public SpinnerImageView A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C73660PhZ(this, 36));
    public final AnonymousClass0eM A0B = new C227862kA(new C73660PhZ(this, 37), new C73660PhZ(this, 38), new C73666Phf(34, (Object) null, this), new 0Yh(C60152JgX.class));

    public static final void A00(UserSession userSession, LeadAdsActivity leadAdsActivity, String str, String str2, String str3, boolean z) {
        0qQ.A0B(userSession, 2);
        C18709Vye.A01(new C17587Vaf(userSession, str, str2, str3, 0sr.A1L(new WeakReference[]{new WeakReference(leadAdsActivity)}), z));
    }

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.leadads.activity.LeadAdsActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (r5 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0139, code lost:
        if (r10.A08 != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01be, code lost:
        if (r9.A0E != false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoP(X.C18027Vk5 r11, boolean r12) {
        /*
            r10 = this;
            r3 = 0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r10.A01
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "spinnerImageView"
        L_0x0007:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            X.JTO.A1X(r0)
            if (r12 != 0) goto L_0x0025
            X.WYW r4 = r10.A00
            if (r4 == 0) goto L_0x0025
            java.lang.String r2 = "lead_gen_form_fetch"
            java.lang.String r1 = "form_fetch_response_on_demand"
            java.lang.String r0 = "success"
            X.1Ln r0 = X.WYW.A00(r4, r2, r1, r0)
            r0.Cgf()
        L_0x0025:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0057
            boolean r1 = r10.A07
            X.0eM r0 = r10.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C18215Vnf.A00(r0, r1)
            if (r0 == 0) goto L_0x0057
            X.0eM r0 = r10.A0B
            java.lang.Object r0 = r0.getValue()
            X.JgX r0 = (X.C60152JgX) r0
            X.VSn r0 = r0.A00
            if (r0 == 0) goto L_0x0057
            int r1 = r0.A00
            java.util.List r0 = r0.A01
            java.lang.Object r1 = X.00k.A0O(r0, r1)
            X.WWa r1 = (X.C19359WWa) r1
            if (r1 == 0) goto L_0x0057
            X.CwD r0 = r11.A00
            X.D9d r0 = r0.A06
            if (r0 == 0) goto L_0x01c2
            r1.A00 = r0
        L_0x0057:
            android.os.Bundle r4 = X.DbU.A06(r10)
            if (r4 == 0) goto L_0x01c6
            X.WYW r5 = r10.A00
            if (r5 == 0) goto L_0x006e
            java.lang.String r2 = "lead_gen_form_fetch"
            java.lang.String r1 = "form_open_success"
            java.lang.String r0 = "impression"
            X.1Ln r0 = X.WYW.A00(r5, r2, r1, r0)
            r0.Cgf()
        L_0x006e:
            java.lang.String r0 = "submitted"
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x00b6
            r1 = 1
            java.lang.String r0 = "submission_successful"
            r4.putBoolean(r0, r1)
            boolean r1 = r10.A07
            X.0eM r2 = r10.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.C18215Vnf.A00(r0, r1)
            if (r0 == 0) goto L_0x00b0
            X.Ums r5 = new X.Ums
            r5.<init>()
        L_0x0093:
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
        L_0x0095:
            X.0hq r0 = X.C229102mq.A00(r10)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x00ac
            X.6Yo r1 = X.DbX.A0N(r10, r2)
            r1.A0B(r4, r5)
            r1.A0D = r3
            r0 = 1
            r1.A0G = r0
            r1.A04()
        L_0x00ac:
            r10.A0a()
            return
        L_0x00b0:
            X.Umr r5 = new X.Umr
            r5.<init>()
            goto L_0x0093
        L_0x00b6:
            X.0eM r2 = r10.A0A
            X.0lg r7 = X.DbT.A0X(r2)
            boolean r5 = r10.A07
            boolean r1 = r10.A08
            boolean r0 = r10.A04
            X.0qQ.A0B(r7, r3)
            r6 = 0
            if (r5 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
            if (r0 != 0) goto L_0x011b
            X.CwD r9 = r11.A00
            X.CvR r0 = r9.A03
            if (r0 == 0) goto L_0x011b
            boolean r0 = X.C18809W3g.A06(r11)
            if (r0 != 0) goto L_0x010d
            boolean r0 = X.C18809W3g.A05(r11)
            if (r0 != 0) goto L_0x010d
            java.util.List r0 = r9.A0A
            if (r0 != 0) goto L_0x010d
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x010d
            boolean r0 = X.C18809W3g.A07(r11)
            if (r0 != 0) goto L_0x010d
            X.Cuu r0 = r11.A01()
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x00f8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r5 = r8.next()
            r0 = r5
            X.Vd9 r0 = (X.C17740Vd9) r0
            X.UzC r1 = r0.A0B
            X.UzC r0 = X.C16676UzC.DATE_TIME
            if (r1 != r0) goto L_0x00f8
            if (r5 == 0) goto L_0x01bc
        L_0x010d:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36330174874141179(0x81121a000041fb, double:3.038687108054502E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 == 0) goto L_0x011b
            r6 = 1
        L_0x011b:
            java.lang.String r0 = "should_show_inline_context_card"
            r4.putBoolean(r0, r6)
            boolean r0 = r10.A06
            boolean r0 = X.C18809W3g.A08(r11, r0)
            if (r0 != 0) goto L_0x013b
            X.CwD r0 = r11.A00
            boolean r0 = r0.A0E
            if (r0 != 0) goto L_0x013b
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x013b
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x013b
            boolean r0 = r10.A08
            r5 = 1
            if (r0 == 0) goto L_0x013c
        L_0x013b:
            r5 = 0
        L_0x013c:
            X.CwD r1 = r11.A00
            X.Jvx r0 = r1.A00
            if (r0 == 0) goto L_0x01a4
            X.Uap r5 = new X.Uap
            r5.<init>()
        L_0x0147:
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0095
            boolean r1 = r10.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.C18215Vnf.A00(r0, r1)
            if (r0 == 0) goto L_0x0095
            X.0eM r6 = r10.A0B
            java.lang.Object r0 = r6.getValue()
            X.JgX r0 = (X.C60152JgX) r0
            X.VSn r0 = r0.A00
            if (r0 == 0) goto L_0x0095
            int r1 = r0.A00
            java.lang.Object r0 = r6.getValue()
            X.JgX r0 = (X.C60152JgX) r0
            X.VSn r0 = r0.A00
            if (r0 == 0) goto L_0x0095
            java.util.List r0 = r0.A01
            java.lang.Object r6 = r0.get(r1)
            X.WWa r6 = (X.C19359WWa) r6
            if (r6 == 0) goto L_0x0095
            java.lang.String r1 = r6.A07
            java.lang.String r0 = "formID"
            r4.putString(r0, r1)
            X.1Xj r0 = r6.A02
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "mediaID"
            r4.putString(r0, r1)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "adID"
            r4.putString(r0, r1)
            java.lang.String r1 = r6.A08
            java.lang.String r0 = "trackingToken"
            r4.putString(r0, r1)
            boolean r1 = r10.A03
            java.lang.String r0 = "is_form_multi_submit"
            r4.putBoolean(r0, r1)
            goto L_0x0095
        L_0x01a4:
            if (r5 != 0) goto L_0x01b6
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x01b6
            X.CvR r0 = r1.A03
            if (r0 == 0) goto L_0x01b6
            if (r6 != 0) goto L_0x01b6
            X.Ume r5 = new X.Ume
            r5.<init>()
            goto L_0x0147
        L_0x01b6:
            X.Umf r5 = new X.Umf
            r5.<init>()
            goto L_0x0147
        L_0x01bc:
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x011b
            goto L_0x010d
        L_0x01c2:
            java.lang.String r0 = "leadAdsThankYouPage"
            goto L_0x0007
        L_0x01c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.activity.LeadAdsActivity.DoP(X.Vk5, boolean):void");
    }

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final C340057kd getGnvGestureHandler() {
        AnonymousClass0eM r2 = this.A0A;
        if (!AnonymousClass3GL.A02(DbT.A0X(r2))) {
            return null;
        }
        C340057kd A002 = C340057kd.A00(DbT.A0X(r2));
        0qQ.A07(A002);
        C238833Dp A003 = C238833Dp.A00(DbT.A0X(r2));
        0qQ.A07(A003);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public final void onFailure() {
        SpinnerImageView spinnerImageView = this.A01;
        if (spinnerImageView == null) {
            0qQ.A0F("spinnerImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C255943uy.FAILED);
        WYW wyw = this.A00;
        if (wyw != null) {
            WYW.A00(wyw, "lead_gen_form_fetch", "form_fetch_response_on_demand", RealtimeConstants.SEND_FAIL).Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.leadads.activity.LeadAdsActivity, android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.1Xj r6, com.instagram.leadads.activity.LeadAdsActivity r7) {
        /*
            android.os.Bundle r2 = X.DbU.A06(r7)
            if (r2 == 0) goto L_0x00a8
            X.0eM r4 = r7.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r5 = r6.A2A(r0)
            r3 = 0
            if (r5 == 0) goto L_0x0043
            java.lang.String r1 = r5.getUsername()
            java.lang.String r0 = "igUserName"
            r2.putString(r0, r1)
            boolean r0 = r5.A2Q()
            if (r0 != 0) goto L_0x002b
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = "igUserId"
            r2.putString(r0, r1)
        L_0x002b:
            X.4Cl r0 = r5.A03
            java.lang.Integer r0 = r0.B6v()
            int r1 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r0 = "advertiserFollowerCount"
            r2.putInt(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = r5.Bh3()
            java.lang.String r0 = "profilePicURI"
            r2.putParcelable(r0, r1)
        L_0x0043:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = X.C231122qu.A07(r0, r6)
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "adID"
            r2.putString(r0, r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = X.1sx.A0G(r0, r1)
            java.lang.String r0 = "submitted"
            r2.putBoolean(r0, r1)
        L_0x005f:
            java.lang.String r1 = r6.C9L()
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "trackingToken"
            r2.putString(r0, r1)
        L_0x006a:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = X.C231122qu.A09(r0, r6)
            java.lang.String r0 = "ad_creation_source"
            r2.putString(r0, r1)
            boolean r0 = r6.A5n()
            if (r0 != 0) goto L_0x0083
            boolean r0 = r6.A5e()
            if (r0 == 0) goto L_0x0084
        L_0x0083:
            r3 = 1
        L_0x0084:
            java.lang.String r0 = "is_sensitive_vertical_ad"
            r2.putBoolean(r0, r3)
            boolean r1 = r6.A5o()
            java.lang.String r0 = "is_pharma_vertical_ad"
            r2.putBoolean(r0, r1)
            boolean r1 = r6.A6E()
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.putBoolean(r0, r1)
            boolean r1 = r6.A5l()
            java.lang.String r0 = "is_partnership_ad"
            r2.putBoolean(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.activity.LeadAdsActivity.A01(X.1Xj, com.instagram.leadads.activity.LeadAdsActivity):void");
    }

    public final int A0X() {
        return R.layout.lead_ads_activity;
    }

    public final void A0Z() {
        AnonymousClass4DS r2;
        AnonymousClass4DS A0H = DbY.A0H(this);
        2dZ AYJ = AYJ();
        if (AYJ != null) {
            if (A0H instanceof AnonymousClass4DS) {
                r2 = A0H;
            } else {
                r2 = null;
            }
            AYJ.A0X(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.leadads.activity.LeadAdsActivity, android.app.Activity] */
    public final void finish() {
        LeadAdsActivity.super.finish();
        AnonymousClass0eM r3 = this.A0A;
        C19289WSx wSx = (C19289WSx) DbY.A0R(r3).A01(C19289WSx.class, C20651Wwj.A00);
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("formId");
            throw AnonymousClass00P.createAndThrow();
        }
        wSx.A02.remove(str);
        wSx.A00.remove(str);
        wSx.A01.remove(str);
        Bundle A062 = DbU.A06(this);
        if (A062 != null && !A062.getBoolean("submitted")) {
            r3.getValue();
            02m.A0p.markerEnd(830542724, 4);
        }
        boolean z = this.A09;
        int i = R.anim.bottom_out;
        if (z) {
            i = R.anim.right_out;
        }
        overridePendingTransition(R.anim.fade_in, i);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, X.0iw, com.instagram.leadads.activity.LeadAdsActivity, java.lang.Object, android.app.Activity, androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        if (r6.A00.A00 == null) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r0 = 2038850393(0x79866359, float:8.722285E34)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r14 = r27
            r0 = r28
            super.onCreate(r0)
            r2 = 1
            X.C2594141p.A00(r14, r2)
            r0 = 2131435284(0x7f0b1f14, float:1.8492406E38)
            android.view.View r1 = r14.findViewById(r0)
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x01ca
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = (com.instagram.ui.widget.spinner.SpinnerImageView) r1
            r14.A01 = r1
            android.os.Bundle r5 = X.DbU.A06(r14)
            if (r5 == 0) goto L_0x01c1
            java.lang.String r11 = "adID"
            java.lang.String r3 = r5.getString(r11)
            java.lang.String r0 = "formID"
            java.lang.String r0 = X.JTP.A0m(r5, r0)
            r14.A02 = r0
            java.lang.String r0 = "is_sensitive_vertical_ad"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            r14.A07 = r0
            java.lang.String r0 = "is_pharma_vertical_ad"
            boolean r0 = r5.getBoolean(r0, r1)
            r14.A06 = r0
            java.lang.String r0 = "is_first_question_sticker"
            boolean r0 = r5.getBoolean(r0, r1)
            r14.A04 = r0
            java.lang.String r0 = "is_partnership_ad"
            boolean r0 = r5.getBoolean(r0, r1)
            r14.A05 = r0
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r5.getBoolean(r0, r1)
            r14.A08 = r0
            java.lang.String r7 = "trackingToken"
            java.lang.String r8 = r5.getString(r7)
            java.lang.String r10 = "entry_point"
            java.lang.String r0 = r5.getString(r10)
            X.Vtw r9 = X.C18544Vtw.A01
            java.lang.String r6 = r14.A02
            java.lang.String r12 = "formId"
            if (r6 == 0) goto L_0x01b5
            X.Vk5 r6 = r9.A00(r6)
            X.0eM r9 = r14.A0A
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r9)
            java.lang.String r16 = r5.getString(r11)
            java.lang.String r17 = r5.getString(r7)
            java.lang.String r7 = r14.A02
            if (r7 == 0) goto L_0x01b5
            java.lang.String r11 = "ad_creation_source"
            java.lang.String r19 = r5.getString(r11)
            if (r19 != 0) goto L_0x0096
            java.lang.String r19 = "UNKNOWN"
        L_0x0096:
            java.lang.String r20 = r5.getString(r10)
            if (r20 != 0) goto L_0x00a2
            X.2EG r10 = X.2EG.A46
            java.lang.String r20 = r10.toString()
        L_0x00a2:
            boolean r23 = X.C18809W3g.A06(r6)
            if (r6 == 0) goto L_0x01b1
            boolean r24 = r6.A02()
            X.CwD r6 = r6.A00
            X.Jvx r6 = r6.A00
            r25 = 1
            if (r6 != 0) goto L_0x00b6
        L_0x00b4:
            r25 = 0
        L_0x00b6:
            java.lang.String r6 = "advertiser_fbidv2"
            java.lang.String r21 = r5.getString(r6)
            java.lang.String r22 = X.C18809W3g.A02(r5)
            X.WYW r13 = new X.WYW
            r26 = r1
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.A00 = r13
            java.lang.String r7 = "lead_gen_form_fetch"
            java.lang.String r6 = "form_initialization"
            java.lang.String r5 = "impression"
            X.1Ln r5 = X.WYW.A00(r13, r7, r6, r5)
            r5.Cgf()
            android.os.Bundle r6 = X.DbU.A06(r14)
            if (r6 == 0) goto L_0x01ae
            java.lang.String r5 = "submitted"
            boolean r5 = r6.getBoolean(r5)
            if (r5 != 0) goto L_0x01ae
        L_0x00e6:
            r15 = 0
            if (r2 == 0) goto L_0x0102
            java.lang.String r7 = r14.A02
            if (r7 == 0) goto L_0x01b5
            r9.getValue()
            X.02m r6 = X.02m.A0p
            r5 = 830542724(0x31811384, float:3.756613E-9)
            r6.markerStart(r5)
            java.lang.String r2 = "ad_id"
            r6.markerAnnotate(r5, r2, r3)
            java.lang.String r2 = "form_id"
            r6.markerAnnotate(r5, r2, r7)
        L_0x0102:
            X.2EG r2 = X.2EG.A3N
            java.lang.String r5 = r2.toString()
            boolean r2 = X.0qQ.A0K(r0, r5)
            java.lang.String r7 = "spinnerImageView"
            if (r2 != 0) goto L_0x012c
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r14.A01
            if (r2 == 0) goto L_0x01b9
            X.DbS.A1T(r2)
            java.lang.String r2 = r14.A02
            if (r2 == 0) goto L_0x01b5
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r9)
            r17 = r14
            r18 = r2
            r19 = r8
            r20 = r3
            r21 = r1
            A00(r16, r17, r18, r19, r20, r21)
        L_0x012c:
            com.instagram.ui.widget.spinner.SpinnerImageView r6 = r14.A01
            if (r6 == 0) goto L_0x01b9
            r2 = 5
            X.LXW r1 = new X.LXW
            r1.<init>(r14, r8, r3, r2)
            X.AnonymousClass0fU.A00(r1, r6)
            X.2EG r1 = X.2EG.A0u
            boolean r1 = X.Dba.A1X(r1, r0)
            r14.A09 = r1
            if (r1 == 0) goto L_0x01a4
            r2 = 2130772077(0x7f01006d, float:1.7147262E38)
            r1 = 2130772039(0x7f010047, float:1.7147185E38)
            r14.overridePendingTransition(r2, r1)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r1 = 207(0xcf, float:2.9E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r2.setAction(r1)
            r14.sendBroadcast(r2)
        L_0x015d:
            boolean r2 = r14.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            boolean r1 = X.C18215Vnf.A00(r1, r2)
            if (r1 == 0) goto L_0x017b
            X.07U r13 = X.07U.A01
            X.0xx r2 = X.AnonymousClass07a.A00(r14)
            r16 = 6
            X.MGh r1 = new X.MGh
            r11 = r1
            r12 = r14
            r11.<init>(r12, r13, r14, r15, r16)
            X.AnonymousClass7TE.A1Z(r1, r2)
        L_0x017b:
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x019d
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r14.A01
            if (r0 == 0) goto L_0x01b9
            X.DbS.A1T(r0)
            X.07U r11 = X.07U.A01
            X.0xx r1 = X.AnonymousClass07a.A00(r14)
            r16 = 9
            X.JVS r0 = new X.JVS
            r9 = r0
            r10 = r14
            r12 = r14
            r13 = r8
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x019d:
            r0 = -211019604(0xfffffffff36c18ac, float:-1.8705482E31)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x01a4:
            r2 = 2130771974(0x7f010006, float:1.7147053E38)
            r1 = 2130772039(0x7f010047, float:1.7147185E38)
            r14.overridePendingTransition(r2, r1)
            goto L_0x015d
        L_0x01ae:
            r2 = 0
            goto L_0x00e6
        L_0x01b1:
            r24 = 0
            goto L_0x00b4
        L_0x01b5:
            X.0qQ.A0F(r12)
            goto L_0x01bc
        L_0x01b9:
            X.0qQ.A0F(r7)
        L_0x01bc:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01c1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -1850114598(0xffffffff91b97dda, float:-2.9265416E-28)
            goto L_0x01d2
        L_0x01ca:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 1990127963(0x769ef15b, float:1.6118714E33)
        L_0x01d2:
            X.AnonymousClass0fD.A07(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.activity.LeadAdsActivity.onCreate(android.os.Bundle):void");
    }
}

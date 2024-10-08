package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: X.35M  reason: invalid class name */
public final class AnonymousClass35M implements C252243on, 0lm {
    public Dialog A00;
    public UserSession A01;
    public User A02;
    public WeakReference A03;
    public WeakReference A04;
    public final String A05;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroyView() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroy() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            weakReference.clear();
            this.A04 = null;
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.A03 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r8 = this;
            com.instagram.user.model.User r0 = r8.A02
            r4 = 0
            if (r0 == 0) goto L_0x01eb
            X.4Cl r0 = r0.A03
            java.lang.String r6 = r0.Btq()
        L_0x000b:
            r0 = 8
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r3 = r5.length
            r2 = 0
        L_0x0013:
            if (r2 >= r3) goto L_0x0029
            r1 = r5[r2]
            if (r6 == 0) goto L_0x01e7
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x01cb;
                case 2: goto L_0x01cf;
                case 3: goto L_0x01d3;
                case 4: goto L_0x01d7;
                case 5: goto L_0x01db;
                case 6: goto L_0x01df;
                case 7: goto L_0x01e3;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r0 = "tag_product"
        L_0x0022:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01e7
            r4 = r1
        L_0x0029:
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r0 == 0) goto L_0x0038
            if (r4 == 0) goto L_0x0038
            int r7 = r4.intValue()
            java.lang.String r1 = "Required value was null."
            switch(r7) {
                case 0: goto L_0x004d;
                case 1: goto L_0x004d;
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                case 4: goto L_0x004d;
                case 5: goto L_0x004d;
                case 6: goto L_0x0043;
                case 7: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            return
        L_0x0039:
            r5 = 0
            X.W3U r3 = X.W3U.A00
            X.0xa r2 = X.W3U.A02(r0, r3)
            java.lang.String r0 = "has_shown_ads_credit_first_post_nux_dialog"
            goto L_0x006a
        L_0x0043:
            r5 = 0
            X.W3U r3 = X.W3U.A00
            X.0xa r2 = X.W3U.A02(r0, r3)
            java.lang.String r0 = "has_shown_ads_credit_earned_nux_dialog"
            goto L_0x006a
        L_0x004d:
            r5 = 0
            X.W3U r3 = X.W3U.A00
            X.0xa r2 = X.W3U.A02(r0, r3)
            java.lang.String r0 = "has_shown_shopping_approved_nux_dialog"
            boolean r0 = r2.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r0 == 0) goto L_0x020c
            X.0xa r2 = X.W3U.A02(r0, r3)
            r0 = 3214(0xc8e, float:4.504E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x006a:
            boolean r0 = r2.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0038
            java.lang.ref.WeakReference r0 = r8.A04
            if (r0 == 0) goto L_0x0038
            java.lang.Object r6 = r0.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r0 == 0) goto L_0x0038
            com.instagram.user.model.User r0 = r8.A02
            if (r0 == 0) goto L_0x0038
            X.8ab r5 = new X.8ab
            r5.<init>((android.app.Activity) r6)
            r0 = 2131237644(0x7f081b0c, float:1.8091544E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r5.A0i(r0)
            switch(r7) {
                case 3: goto L_0x01b2;
                case 4: goto L_0x01b7;
                case 5: goto L_0x01bc;
                case 6: goto L_0x01c1;
                case 7: goto L_0x01c6;
                default: goto L_0x0096;
            }
        L_0x0096:
            r0 = 2131973799(0x7f1356a7, float:1.9584644E38)
        L_0x0099:
            r5.A09(r0)
            switch(r7) {
                case 0: goto L_0x018f;
                case 1: goto L_0x0194;
                case 2: goto L_0x0199;
                case 3: goto L_0x019e;
                case 4: goto L_0x01a3;
                case 5: goto L_0x01a8;
                case 6: goto L_0x01ad;
                default: goto L_0x009f;
            }
        L_0x009f:
            r2 = 2131973788(0x7f13569c, float:1.9584622E38)
        L_0x00a2:
            X.FID r0 = new X.FID
            r0.<init>(r8, r4)
            r5.A0I(r0, r2)
            r2 = 2131964338(0x7f1331b2, float:1.9565455E38)
            X.FHr r0 = new X.FHr
            r0.<init>(r8)
            r5.A0H(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r4 != r0) goto L_0x0155
            r0 = 2131973795(0x7f1356a3, float:1.9584636E38)
        L_0x00bc:
            r5.A08(r0)
        L_0x00bf:
            android.app.Dialog r0 = r5.A02()
            r8.A00 = r0
            X.0qQ.A0A(r0)
            X.AnonymousClass0fN.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r4 != r0) goto L_0x0135
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r0 == 0) goto L_0x01fa
            X.0xa r0 = X.W3U.A02(r0, r3)
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_shown_ads_credit_earned_nux_dialog"
        L_0x00dd:
            r6 = 1
            r2.E5T(r0, r6)
            r2.apply()
            com.instagram.common.session.UserSession r3 = r8.A01
            if (r3 == 0) goto L_0x01f4
            com.instagram.user.model.User r0 = r8.A02
            X.0qQ.A0A(r0)
            X.4Cl r0 = r0.A03
            java.lang.String r5 = r0.Btq()
            r0 = 80
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r5 == 0) goto L_0x0111
            X.0xN r3 = X.C60510iO.A00(r3)
            java.lang.String r0 = "instagram_shopping_post_onboarding_nux_impression"
            X.0xI r2 = X.0xI.A01(r0, r2)
            r0 = 3759(0xeaf, float:5.267E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0C(r0, r5)
            r3.EFq(r2)
        L_0x0111:
            com.instagram.user.model.User r0 = r8.A02
            if (r0 == 0) goto L_0x0038
            java.util.List r0 = r0.A0T()
            if (r0 == 0) goto L_0x0038
            X.EWE r3 = X.EWE.POST_ONBOARDING_NUX
            boolean r0 = r0.contains(r3)
            if (r0 != r6) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0038
            com.instagram.common.session.UserSession r2 = r8.A01
            if (r2 == 0) goto L_0x01ee
            java.lang.String r1 = r8.A05
            java.lang.String r0 = r3.toString()
            X.C49143EqA.A00(r2, r1, r0)
            return
        L_0x0135:
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r4 != r2) goto L_0x0148
            if (r0 == 0) goto L_0x0200
            X.0xa r0 = X.W3U.A02(r0, r3)
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_shown_ads_credit_first_post_nux_dialog"
            goto L_0x00dd
        L_0x0148:
            if (r0 == 0) goto L_0x0206
            X.0xa r0 = X.W3U.A02(r0, r3)
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_shown_shopping_approved_nux_dialog"
            goto L_0x00dd
        L_0x0155:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r4 != r0) goto L_0x015e
            r0 = 2131973781(0x7f135695, float:1.9584607E38)
            goto L_0x00bc
        L_0x015e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r4 != r0) goto L_0x0167
            r0 = 2131973792(0x7f1356a0, float:1.958463E38)
            goto L_0x00bc
        L_0x0167:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r4 != r0) goto L_0x0186
            r2 = 2131973786(0x7f13569a, float:1.9584618E38)
            com.instagram.user.model.User r0 = r8.A02
            X.0qQ.A0A(r0)
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.AZy()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r6.getString(r2, r0)
            r5.A0q(r0)
            goto L_0x00bf
        L_0x0186:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r4 != r0) goto L_0x00bf
            r0 = 2131973789(0x7f13569d, float:1.9584624E38)
            goto L_0x00bc
        L_0x018f:
            r2 = 2131973797(0x7f1356a5, float:1.958464E38)
            goto L_0x00a2
        L_0x0194:
            r2 = 2131973784(0x7f135698, float:1.9584614E38)
            goto L_0x00a2
        L_0x0199:
            r2 = 2131973783(0x7f135697, float:1.9584612E38)
            goto L_0x00a2
        L_0x019e:
            r2 = 2131973794(0x7f1356a2, float:1.9584634E38)
            goto L_0x00a2
        L_0x01a3:
            r2 = 2131973780(0x7f135694, float:1.9584605E38)
            goto L_0x00a2
        L_0x01a8:
            r2 = 2131973791(0x7f13569f, float:1.9584628E38)
            goto L_0x00a2
        L_0x01ad:
            r2 = 2131973785(0x7f135699, float:1.9584616E38)
            goto L_0x00a2
        L_0x01b2:
            r0 = 2131973796(0x7f1356a4, float:1.9584638E38)
            goto L_0x0099
        L_0x01b7:
            r0 = 2131973782(0x7f135696, float:1.958461E38)
            goto L_0x0099
        L_0x01bc:
            r0 = 2131973793(0x7f1356a1, float:1.9584632E38)
            goto L_0x0099
        L_0x01c1:
            r0 = 2131973787(0x7f13569b, float:1.958462E38)
            goto L_0x0099
        L_0x01c6:
            r0 = 2131973790(0x7f13569e, float:1.9584626E38)
            goto L_0x0099
        L_0x01cb:
            java.lang.String r0 = "add_product_to_shop"
            goto L_0x0022
        L_0x01cf:
            java.lang.String r0 = "add_product_to_catalog"
            goto L_0x0022
        L_0x01d3:
            java.lang.String r0 = "finish_checkout_setup"
            goto L_0x0022
        L_0x01d7:
            java.lang.String r0 = "add_payout_info"
            goto L_0x0022
        L_0x01db:
            java.lang.String r0 = "ads_credit_incentive_tag_product"
            goto L_0x0022
        L_0x01df:
            java.lang.String r0 = "ads_credit_incentive_credits_earned"
            goto L_0x0022
        L_0x01e3:
            java.lang.String r0 = "ads_credit_incentive_first_post"
            goto L_0x0022
        L_0x01e7:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x01eb:
            r6 = r4
            goto L_0x000b
        L_0x01ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0200:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0206:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x020c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35M.onStart():void");
    }

    public final void onStop() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            weakReference.clear();
            this.A04 = null;
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.A03 = null;
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public AnonymousClass35M(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = AnonymousClass0t1.A01.A01(userSession);
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A05 = obj;
    }
}

package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5uI  reason: invalid class name and case insensitive filesystem */
public final class C298945uI implements AnonymousClass0iw, 0lT, AnonymousClass0lh {
    public static final long A02 = TimeUnit.HOURS.toMillis(2);
    public static final String __redex_internal_original_name = "QPSurveyController";
    public C46333Dcb A00;
    public final UserSession A01;

    public final void Ctd(Activity activity) {
        0qQ.A0B(activity, 0);
        A00(activity);
    }

    public final void Cte(Activity activity) {
        0qQ.A0B(activity, 0);
        A00(activity);
    }

    public final void Ctf(Activity activity) {
        0qQ.A0B(activity, 0);
        C46333Dcb dcb = this.A00;
        if (dcb != null && activity == dcb.A00) {
            this.A00 = null;
        }
    }

    public final void Cth(Activity activity) {
        0qQ.A0B(activity, 0);
    }

    public final void Ctm(Activity activity) {
        0qQ.A0B(activity, 0);
        A00(activity);
    }

    public final void Ctn(Activity activity) {
    }

    public final void Cto(Activity activity) {
    }

    public final void Ctp(Activity activity, boolean z) {
    }

    public final String getModuleName() {
        return "quick_promotion_survey_controller";
    }

    private final void A00(Activity activity) {
        Activity activity2 = activity;
        if (activity != null) {
            C46333Dcb dcb = this.A00;
            if (dcb != null && activity2 == dcb.A00) {
                return;
            }
            if (!(activity2 instanceof FragmentActivity)) {
                this.A00 = null;
                0wb.A03("IG-QP", "Activity is not fragment activity");
                return;
            }
            1YN A002 = AnonymousClass2bO.A00();
            UserSession userSession = this.A01;
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A1A;
            AnonymousClass2bO.A00();
            FragmentActivity fragmentActivity = (FragmentActivity) activity2;
            this.A00 = A002.A00(fragmentActivity, this, userSession, 2bV.A00((C230942qc) null, (AnonymousClass574) null, (AnonymousClass2qY) null, (AnonymousClass2bQ) null, (C230902qW) null, (AnonymousClass573) null, (C230972qf) null, (C71212bU) null, (C230922qa) null, (C71202bS) null, (C230882qT) null, (AnonymousClass575) null, (Boolean) null), quickPromotionSlot);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        if ((((X.C298955uJ) r3.A01(X.C298955uJ.class, new X.C20695WxR(r3, 38))).A00.getLong(X.002.A0R("id_request_time_millis_", r7), -1) + A02) <= java.lang.System.currentTimeMillis()) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r6, java.lang.String r7, java.util.Map r8, boolean r9) {
        /*
            r5 = this;
            if (r9 != 0) goto L_0x0030
            com.instagram.common.session.UserSession r3 = r5.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.5uJ> r2 = X.C298955uJ.class
            r1 = 38
            X.WxR r0 = new X.WxR
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.5uJ r0 = (X.C298955uJ) r0
            X.0xa r3 = r0.A00
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r2 = X.002.A0R(r0, r7)
            r0 = -1
            long r3 = r3.getLong(r2, r0)
            long r0 = A02
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003e
        L_0x0030:
            r5.A00(r6)
            X.Dcb r3 = r5.A00
            if (r3 != 0) goto L_0x0042
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "survey requested but delegate is null."
            X.0wb.A03(r1, r0)
        L_0x003e:
            X.C283565Ie.A00()
            return
        L_0x0042:
            if (r8 != 0) goto L_0x0049
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L_0x0049:
            java.lang.String r0 = "integration_point_id"
            r8.put(r0, r7)
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A27
            java.util.EnumSet r2 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r2)
            X.2br r1 = r3.A09
            java.lang.String r0 = "ad_hoc_trigger"
            r1.AW3(r0, r2)
            boolean r0 = X.2bu.A00(r3, r8, r2, r9)
            if (r0 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r3 = r5.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.5uJ> r2 = X.C298955uJ.class
            r1 = 38
            X.WxR r0 = new X.WxR
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.5uJ r0 = (X.C298955uJ) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.0xa r0 = r0.A00
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r0 = X.002.A0R(r0, r7)
            r3.E5c(r0, r1)
            r3.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298945uI.A01(android.app.Activity, java.lang.String, java.util.Map, boolean):void");
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C298945uI.class);
        0lU.A08(this);
    }

    public C298945uI(UserSession userSession) {
        this.A01 = userSession;
        0lU.A07(this);
    }
}

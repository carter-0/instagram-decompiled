package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.36J  reason: invalid class name */
public final class AnonymousClass36J implements C252243on {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass36H A02;
    public final Context A03;

    public AnonymousClass36J(Context context, AnonymousClass4DH r3, UserSession userSession, AnonymousClass36H r5) {
        0qQ.A0B(r5, 3);
        this.A03 = context;
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = userSession;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(Activity activity, Context context, UserSession userSession, AnonymousClass36H r6) {
        C358248ab r2 = new C358248ab(context);
        r2.A09(2131952949);
        r2.A08(2131952947);
        r2.A0I(new SV3(activity, userSession, r6), 2131952948);
        r2.A0G(new SV0(userSession, r6), 2131952946);
        r2.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_settings_heart_refresh));
        r2.A04();
        AnonymousClass0fN.A00(r2.A02());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        if (java.lang.System.currentTimeMillis() >= (r12.getLong(X.C273654mx.A00(363), 0) + java.util.concurrent.TimeUnit.DAYS.toMillis(X.182.A01(r7, r3, 36601045576716375L)))) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0154, code lost:
        if (X.182.A06(r2, r3, 36327542059448827L) == false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r19 = this;
            r1 = r19
            android.content.Context r0 = r1.A03
            boolean r0 = X.AnonymousClass36Z.A03(r0)
            if (r0 == 0) goto L_0x0063
            X.36H r6 = r1.A02
            X.0wX r18 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            X.0xa r1 = r0.A00
            java.lang.String r5 = "preference_has_allowed_push_system_dialog"
            r4 = 0
            boolean r0 = r1.getBoolean(r5, r4)
            r10 = 1
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "preference_has_asked_push_permission_recently_in_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "session_count_for_push_permission"
            int r0 = r1.getInt(r0, r4)
            if (r0 != r10) goto L_0x0064
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327542059514364(0x810fb5000539fc, double:3.037022105483011E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0064
            r0 = 36327542059448827(0x810fb5000439fb, double:3.037022105441565E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0064
            X.05G r1 = r6.A01
            X.3EG r0 = X.AnonymousClass3EG.A00
            r1.Epw(r0)
            X.AnonymousClass36H.A00(r6)
            X.0xm r2 = X.AnonymousClass0xl.A00(r18)
            X.0xa r1 = r2.A00
            java.lang.String r0 = "preference_push_permission_impression_count"
            int r0 = r1.getInt(r0, r4)
            int r0 = r0 + 1
            r2.A01(r0)
        L_0x0063:
            return
        L_0x0064:
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "preference_has_denied_push_system_dialog"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0179
            com.instagram.common.session.UserSession r3 = r6.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319570599878118(0x81087500001de6, double:3.031980922310557E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x0179
            boolean r0 = X.C279244yJ.A00(r3)
            if (r0 != 0) goto L_0x0130
            X.0xm r2 = X.AnonymousClass0xl.A00(r18)
            r0 = 36601045576650838(0x82087500011056, double:3.209986831030383E-306)
            long r16 = X.182.A01(r7, r3, r0)
            X.0xa r9 = r2.A00
            java.lang.String r0 = "preference_has_asked_push_permission_recently_in_nux"
            boolean r0 = r9.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0175
            java.lang.String r8 = "preference_push_permission_impression_count"
            int r0 = r9.getInt(r8, r4)
            long r0 = (long) r0
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x0175
            boolean r0 = r9.getBoolean(r5, r4)
            if (r0 != 0) goto L_0x0175
            r0 = 3766(0xeb6, float:5.277E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r9.getBoolean(r1, r4)
            if (r0 == 0) goto L_0x00eb
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            X.0xa r12 = r0.A00
            boolean r0 = r12.getBoolean(r1, r4)
            if (r0 == 0) goto L_0x0175
            long r14 = java.lang.System.currentTimeMillis()
            r0 = 363(0x16b, float:5.09E-43)
            java.lang.String r11 = X.C273654mx.A00(r0)
            r0 = 0
            long r12 = r12.getLong(r11, r0)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.DAYS
            r0 = 36601045576716375(0x82087500021057, double:3.209986831071829E-306)
            long r0 = X.182.A01(r7, r3, r0)
            long r0 = r11.toMillis(r0)
            long r12 = r12 + r0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0175
        L_0x00eb:
            X.05G r1 = r6.A01
            X.3EG r0 = X.AnonymousClass3EG.A00
            r1.Epw(r0)
            X.AnonymousClass36H.A00(r6)
            r2.A04(r4)
            X.0xm r1 = X.AnonymousClass0xl.A00(r18)
            X.0xa r0 = r1.A00
            int r0 = r0.getInt(r8, r4)
            int r0 = r0 + 1
            r1.A01(r0)
            int r0 = r9.getInt(r8, r4)
            long r0 = (long) r0
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0130
            X.0xm r2 = X.AnonymousClass0xl.A00(r18)
            r2.A01(r4)
            r2.A04(r10)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r2 = r2.A00
            X.0xY r7 = r2.AR4()
            r2 = 363(0x16b, float:5.09E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r7.E5c(r2, r0)
            r7.apply()
        L_0x0130:
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            X.0xa r7 = r0.A00
            java.lang.String r0 = "preference_has_asked_push_permission_recently_in_nux"
            boolean r0 = r7.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x015e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327542059514364(0x810fb5000539fc, double:3.037022105483011E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0156
            r0 = 36327542059448827(0x810fb5000439fb, double:3.037022105441565E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x015e
        L_0x0156:
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            r0.A03(r4)
            return
        L_0x015e:
            boolean r0 = r7.getBoolean(r5, r4)
            if (r0 != 0) goto L_0x0156
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319673679093303(0x81088d00001e37, double:3.032046110021307E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0156
            X.AnonymousClass36H.A01(r6)
            goto L_0x0156
        L_0x0175:
            r2.A03(r4)
            goto L_0x0130
        L_0x0179:
            com.instagram.common.session.UserSession r3 = r6.A00
            boolean r0 = X.C279244yJ.A00(r3)
            if (r0 != 0) goto L_0x0130
            X.0xm r0 = X.AnonymousClass0xl.A00(r18)
            X.0xa r1 = r0.A00
            r0 = 361(0x169, float:5.06E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0130
            java.lang.String r2 = "preference_push_permission_impression_count"
            int r0 = r1.getInt(r2, r4)
            if (r0 != 0) goto L_0x0130
            X.05G r1 = r6.A01
            X.3EG r0 = X.AnonymousClass3EG.A00
            r1.Epw(r0)
            X.AnonymousClass36H.A00(r6)
            X.0xm r1 = X.AnonymousClass0xl.A00(r18)
            X.0xa r0 = r1.A00
            int r0 = r0.getInt(r2, r4)
            int r0 = r0 + 1
            r1.A01(r0)
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36J.onCreate():void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass4DH r0 = this.A00;
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        AnonymousClass9KE r3 = new AnonymousClass9KE(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 4);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
    }
}

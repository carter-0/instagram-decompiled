package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.ERn  reason: case insensitive filesystem */
public final class C48024ERn extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AccessibilityOptionsFragment";
    public EyE A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r6) {
        Context A06 = DbT.A06(this, r6, 0);
        int i = 2131952024;
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A01, 0), 36322920674437800L)) {
            i = 2131952026;
        }
        DbW.A1C(r6, A06.getString(i));
    }

    public final String getModuleName() {
        return "settings_accessibility_options";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-926963221);
        super.onCreate(bundle);
        this.A00 = new EyE(this, AnonymousClass7TE.A0l(this.A01));
        AnonymousClass0fD.A09(-1306899449, A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36328272203693236L) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r8 = this;
            r0 = 1785632669(0x6a6e979d, float:7.211008E25)
            int r5 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.EyE r7 = r8.A00
            if (r7 != 0) goto L_0x001c
            java.lang.String r0 = "accessibilityOptionsController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            androidx.fragment.app.FragmentActivity r4 = r7.A00
            r1 = 2131973416(0x7f135528, float:1.9583867E38)
            r0 = 52
            X.C47518E6c.A01(r4, r7, r6, r0, r1)
            com.instagram.common.session.UserSession r3 = r7.A01
            boolean r0 = X.AnonymousClass3WS.A04(r3)
            if (r0 != 0) goto L_0x0034
            boolean r0 = X.AnonymousClass3WS.A02(r3)
            if (r0 == 0) goto L_0x0044
        L_0x0034:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328272203693236(0x81105f00013cb4, double:3.037483851601784E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 2131973373(0x7f1354fd, float:1.958378E38)
            if (r0 == 0) goto L_0x0047
        L_0x0044:
            r1 = 2131973372(0x7f1354fc, float:1.9583778E38)
        L_0x0047:
            r0 = 50
            X.C47518E6c.A01(r4, r7, r6, r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317809663284789(0x8106db00001635, double:3.0308672989182135E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0061
            r1 = 2131973374(0x7f1354fe, float:1.9583782E38)
            r0 = 51
            X.C47518E6c.A01(r4, r7, r6, r0, r1)
        L_0x0061:
            r2 = 2131957387(0x7f13168b, float:1.9551357E38)
            r1 = 49
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            X.C50989Fmc.A02(r4, r0, r6, r2)
            r8.setItems(r6)
            r0 = 420182062(0x190b782e, float:7.210402E-24)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48024ERn.onResume():void");
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FGH {
    public static String A0H;
    public C49535ExH A00;
    public C49575Eyk A01;
    public C49964FGx A02;
    public C49880FBe A03;
    public 02m A04;
    public C49373Eub A05;
    public boolean A06;
    public C14577Tyh A07;
    public final Context A08;
    public final Bundle A09;
    public final Handler A0A = AnonymousClass7TF.A0D();
    public final FragmentActivity A0B;
    public final AnonymousClass1O8 A0C = new AnonymousClass1O8();
    public final AnonymousClass0aP A0D;
    public final Runnable A0E = new C51242Fqx(this);
    public final AtomicBoolean A0F = new AtomicBoolean(false);
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A00(0eO.A02, G2B.A00);

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.FGH r20) {
        /*
            r4 = r20
            X.0aP r6 = r4.A0D
            X.0wX r0 = r6.A00
            android.content.Context r0 = r0.A06()
            boolean r0 = X.0oI.A09(r0)
            if (r0 == 0) goto L_0x0182
            androidx.fragment.app.FragmentActivity r10 = r4.A0B
            r0 = 3
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r10, r0)
            r0 = r10
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r9 = 0
            X.2nI r12 = X.C229382nI.A01(r9, r10, r0, r6)
            java.lang.String r3 = "cannot_load_cacheable_login_home_screen"
            java.lang.String r19 = "qpl"
            java.lang.String r7 = "com.bloks.www.caa.login.home_template"
            r2 = 1
            X.FFt r1 = X.C49940FFt.A00()
            r0 = 4
            X.DfZ r0 = X.C49940FFt.A01(r1, r4, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = X.DbS.A0N(r6)
            r8.A0R = r7
            r8.A0C = r0
            r8.A0n = r2
            r5 = 896612552(0x357138c8, float:8.9862124E-7)
            X.0hq r0 = r10.getSupportFragmentManager()     // Catch:{ IllegalStateException -> 0x0153 }
            boolean r0 = r0.A0G     // Catch:{ IllegalStateException -> 0x0153 }
            if (r0 == 0) goto L_0x0052
            X.02m r1 = r4.A04     // Catch:{ IllegalStateException -> 0x0153 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r0 = "fragment_manager_is_destroyed"
            r1.markerAnnotate(r5, r3, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            goto L_0x0171
        L_0x0052:
            X.02m r1 = r4.A04     // Catch:{ IllegalStateException -> 0x0153 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r0 = "launching_login_home_cacheable_screen"
            r1.markerPoint(r5, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            X.Eub r2 = r4.A05     // Catch:{ IllegalStateException -> 0x0153 }
            android.content.Context r1 = r4.A08     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r13 = X.0qv.A00(r1)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0qQ.A07(r13)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0qv r0 = X.0qv.A02     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r11 = r0.A04(r1)     // Catch:{ IllegalStateException -> 0x0153 }
            r18 = 0
            java.lang.String r1 = X.AnonymousClass1Q2.A00()     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = 58
            java.lang.String r17 = X.002.A0T(r7, r1, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0jg r1 = X.0jh.A04     // Catch:{ IllegalStateException -> 0x0153 }
            X.0aP r0 = r2.A00     // Catch:{ IllegalStateException -> 0x0153 }
            X.0jh r1 = r1.A01(r0)     // Catch:{ IllegalStateException -> 0x0153 }
            X.19f r0 = X.19f.A1Q     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r6 = r1.A02(r0)     // Catch:{ IllegalStateException -> 0x0153 }
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = ""
        L_0x008a:
            r0 = 13784(0x35d8, float:1.9315E-41)
            X.4tU r10 = new X.4tU     // Catch:{ IllegalStateException -> 0x0153 }
            r10.<init>(r0)     // Catch:{ IllegalStateException -> 0x0153 }
            r1 = 45
            java.lang.String r0 = "CAA_LOGIN_HOME_PAGE"
            r10.A0P(r1, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0Tu r2 = X.0Tu.A06     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = 18588287744611019(0x4209f3000012cb, double:2.0068902512820536E-307)
            long r1 = X.1AW.A01(r2, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r14
            androidx.fragment.app.FragmentActivity r0 = r12.A03     // Catch:{ IllegalStateException -> 0x0153 }
            r20 = r0
            r10.A0O()     // Catch:{ IllegalStateException -> 0x0153 }
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()     // Catch:{ IllegalStateException -> 0x0153 }
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()     // Catch:{ IllegalStateException -> 0x0153 }
            java.util.HashMap r12 = X.DbX.A0v()     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r0 = "device_id_server"
            r15.put(r0, r13)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r0 = "family_device_id_server"
            r15.put(r0, r6)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r0 = "qe_device_id_server"
            r15.put(r0, r11)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0xi r16 = X.0tS.A4E     // Catch:{ IllegalStateException -> 0x0153 }
            X.0tS r13 = r16.A00()     // Catch:{ IllegalStateException -> 0x0153 }
            X.0s0 r11 = r13.A09     // Catch:{ IllegalStateException -> 0x0153 }
            X.0YZ[] r6 = X.0tS.A4G     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.String r6 = X.DbV.A13(r13, r11, r6, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r0 = "logged_out_user"
            r14.put(r0, r6)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r18)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r0 = "show_internal_settings"
            r14.put(r0, r6)     // Catch:{ IllegalStateException -> 0x0153 }
            X.0tS r0 = r16.A00()     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.String r6 = r0.A08()     // Catch:{ IllegalStateException -> 0x0153 }
            boolean r0 = X.0mp.A0B(r6)     // Catch:{ IllegalStateException -> 0x0153 }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r6 = X.AnonymousClass7TF.A0c()     // Catch:{ IllegalStateException -> 0x0153 }
            X.0tS r0 = r16.A00()     // Catch:{ IllegalStateException -> 0x0153 }
            r0.A0G(r6)     // Catch:{ IllegalStateException -> 0x0153 }
        L_0x00ff:
            java.lang.String r0 = "waterfall_id"
            r14.put(r0, r6)     // Catch:{ IllegalStateException -> 0x0153 }
            java.util.HashMap r0 = X.C359608dC.A01(r15)     // Catch:{ IllegalStateException -> 0x0153 }
            X.DiU r11 = new X.DiU     // Catch:{ IllegalStateException -> 0x0153 }
            r11.<init>(r0, r14, r7)     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r11.A00 = r0     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = r17
            r11.A05 = r0     // Catch:{ IllegalStateException -> 0x0153 }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0148
            r11.A01 = r1     // Catch:{ IllegalStateException -> 0x0153 }
            r11.A06 = r9     // Catch:{ IllegalStateException -> 0x0153 }
            r11.A03 = r10     // Catch:{ IllegalStateException -> 0x0153 }
            r11.A02 = r9     // Catch:{ IllegalStateException -> 0x0153 }
            r11.A04 = r9     // Catch:{ IllegalStateException -> 0x0153 }
            r11.A0H(r12)     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = r20
            r11.A0F(r0, r8)     // Catch:{ IllegalStateException -> 0x0153 }
            X.Eyk r2 = r4.A01     // Catch:{ IllegalStateException -> 0x0153 }
            android.os.Handler r1 = r2.A02     // Catch:{ IllegalStateException -> 0x0153 }
            X.FpU r0 = new X.FpU     // Catch:{ IllegalStateException -> 0x0153 }
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x0153 }
            r1.post(r0)     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = r18
            A03(r4, r0)     // Catch:{ IllegalStateException -> 0x0153 }
            goto L_0x0171
        L_0x0140:
            X.0qQ.A0F(r19)     // Catch:{ IllegalStateException -> 0x0153 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0152
        L_0x0148:
            r0 = 2133(0x855, float:2.989E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IllegalStateException -> 0x0153 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalStateException -> 0x0153 }
        L_0x0152:
            throw r0     // Catch:{ IllegalStateException -> 0x0153 }
        L_0x0153:
            r2 = move-exception
            java.lang.String r1 = "IgFragmentActivity"
            java.lang.String r0 = "Failed to open cacheable login home screen"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x0179 }
            X.02m r1 = r4.A04     // Catch:{ all -> 0x0179 }
            if (r1 != 0) goto L_0x0167
            X.0qQ.A0F(r19)     // Catch:{ all -> 0x0179 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0179 }
            throw r0     // Catch:{ all -> 0x0179 }
        L_0x0167:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0179 }
            r1.markerAnnotate(r5, r3, r0)     // Catch:{ all -> 0x0179 }
            A01(r4)     // Catch:{ all -> 0x0179 }
        L_0x0171:
            android.os.Handler r1 = r4.A0A
            java.lang.Runnable r0 = r4.A0E
            r1.removeCallbacks(r0)
            return
        L_0x0179:
            r2 = move-exception
            android.os.Handler r1 = r4.A0A
            java.lang.Runnable r0 = r4.A0E
            r1.removeCallbacks(r0)
            throw r2
        L_0x0182:
            boolean r1 = r4.A06
            androidx.fragment.app.FragmentActivity r5 = r4.A0B
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r3 = r5.findViewById(r0)
            X.0qQ.A07(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r1 == 0) goto L_0x01a2
            X.ExH r2 = r4.A00
            if (r2 != 0) goto L_0x01a9
            java.lang.String r0 = "nativeBackgroundView"
        L_0x019a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a2:
            X.Eyk r2 = r4.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            goto L_0x01b9
        L_0x01a9:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.os.Handler r1 = r2.A02
            X.FsK r0 = new X.FsK
            r0.<init>(r3, r2)
            r1.post(r0)
            X.Eyk r2 = r4.A01
        L_0x01b9:
            android.os.Handler r1 = r2.A02
            X.Wlj r0 = new X.Wlj
            r0.<init>(r3, r2)
            r1.post(r0)
            X.02m r3 = r4.A04
            r2 = 0
            if (r3 != 0) goto L_0x01cb
            java.lang.String r0 = "qpl"
            goto L_0x019a
        L_0x01cb:
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "startClientDataFetch"
            r3.markerPoint(r1, r0)
            X.FGx r1 = r4.A02
            X.E7f r0 = new X.E7f
            r0.<init>(r4)
            r1.A07(r5, r0, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGH.A00(X.FGH):void");
    }

    public static final void A01(FGH fgh) {
        02m r3 = fgh.A04;
        String str = "qpl";
        if (r3 != null) {
            r3.markerAnnotate(896612552, "landing_page", "cds_error");
            r3.markerEnd(896612552, 3);
            C49575Eyk eyk = fgh.A01;
            eyk.A02.post(new C51158FpU(eyk));
            A03(fgh, false);
            View findViewById = fgh.A0B.findViewById(R.id.layout_container_main);
            0qQ.A07(findViewById);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            if (fgh.A06) {
                C49535ExH exH = fgh.A00;
                if (exH == null) {
                    str = "nativeBackgroundView";
                } else {
                    0qQ.A0B(frameLayout, 0);
                    exH.A02.post(new C51326FsK(frameLayout, exH));
                }
            }
            C14577Tyh tyh = fgh.A07;
            0qQ.A0B(frameLayout, 0);
            tyh.A02.post(new C20268WoJ(frameLayout, tyh, false));
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(FGH fgh, String str) {
        02m r2 = fgh.A04;
        if (r2 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.markerAnnotate(896612552, AnonymousClass000.A00(3101), str);
        r2.markerPoint(896612552, "launching_login_aymh_entrypoints_screen");
        AnonymousClass0aP r22 = fgh.A0D;
        AnonymousClass0iw r1 = fgh.A0B;
        0qQ.A0C(r1, Pxd.A00(3));
        fgh.A0A.post(new C51386FtI(DbT.A0N(r1, r1, r22), fgh));
    }

    public static final void A03(FGH fgh, boolean z) {
        C49535ExH exH = fgh.A00;
        if (exH == null) {
            return;
        }
        if (z) {
            exH.A02.postDelayed(new C51157FpT(exH), 1000);
        } else {
            exH.A02.post(new C51156FpS(exH));
        }
    }

    public final void A04() {
        if (1AW.A06(0Tu.A05, 2324147266476382565L)) {
            C49130Ept.A00().A00(this.A08, this.A0D, (B2F) null);
        }
        if (1AW.A06(0Tu.A06, 18311786340103764L)) {
            2BT.A08.A00(this.A08, AnonymousClass2BX.A00, this.A0D);
        }
        AnonymousClass0aP r3 = this.A0D;
        C62880wX r6 = r3.A00;
        Context A062 = r6.A06();
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        A002.ATE(new EI6(A062, this));
        A002.ATE(new EI7(A062, this));
        Bundle bundle = this.A09;
        String string = bundle.getString("destination_id", "");
        if (0qQ.A0K(string, "emaillogin") || 0qQ.A0K(string, "smslogin") || 0qQ.A0K(bundle.getString("destination_id", ""), "stop_deletions_email_login") || bundle.getBoolean("bypass", false)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String str = "";
            A1E.put("uid", bundle.getString("uid", ""));
            A1E.put("token", bundle.getString("token", ""));
            A1E.put("source", bundle.getString("source", ""));
            Context context = this.A08;
            A1E.put(Dbj.A01(), 0qv.A00(context));
            A1E.put("guid", DbT.A0s(context));
            String A022 = DbT.A0P(r3).A02(19f.A20);
            if (A022 != null) {
                str = A022;
            }
            A1E.put("family_device_id", str);
            A1E.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
            A1E.put("auto_send", bundle.getString("auto_send", "false"));
            A1E.put("is_bypass_login", Boolean.valueOf(bundle.getBoolean("bypass", false)));
            A1E.put("is_account_deletion_reactivation_login", Boolean.valueOf(0qQ.A0K(bundle.getString("destination_id", ""), "stop_deletions_email_login")));
            C46471DfZ A012 = C49940FFt.A01(C49940FFt.A00(), this, 4);
            IgBloksScreenConfig A0N = DbS.A0N(r3);
            A0N.A0R = "com.bloks.www.caa.login.one_click_login_loading";
            A0N.A0C = A012;
            A0N.A0n = false;
            C46649DiU A042 = C46649DiU.A04("com.bloks.www.caa.login.one_click_login_loading", C359608dC.A01(A1E));
            A042.A00 = 719983200;
            A042.A0F(this.A0B, A0N);
            return;
        }
        02m r5 = this.A04;
        if (r5 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        r5.A0U(896612552, 0, A0H);
        FragmentActivity fragmentActivity = this.A0B;
        Class<?> cls = fragmentActivity.getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        r5.markerAnnotate(896612552, "client_entrypoint", 0q1.A01(cls));
        C10932S1k A003 = C9272RVx.A00(r6.A06());
        if (!A003.A01 || !A003.A02) {
            A00(this);
            return;
        }
        HashMap A004 = Fl7.A00(this.A08, r3, A0H);
        C46471DfZ A013 = C49940FFt.A01(C49940FFt.A00(), this, 4);
        IgBloksScreenConfig A0N2 = DbS.A0N(r3);
        A0N2.A0R = "com.bloks.www.caa.login.oxygen_preloads_terms_of_service";
        A0N2.A0C = A013;
        A0N2.A0n = false;
        C276534tU r32 = new C276534tU(13784);
        r32.A0P(45, "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN");
        C46649DiU A043 = C46649DiU.A04("com.bloks.www.caa.login.oxygen_preloads_terms_of_service", C359608dC.A01(A004));
        A043.A00 = 719983200;
        A043.A06 = "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN";
        r32.A0O();
        A043.A03 = r32;
        A043.A0F(fragmentActivity, A0N2);
    }

    public final void A05() {
        02m r4 = this.A04;
        if (r4 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r4.isMarkerOn(896612552)) {
            r4.markerAnnotate(896612552, "activity_destroyed_but_marker_still_active", true);
        }
        this.A0A.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.FBe] */
    public FGH(Context context, Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0aP r13) {
        this.A0B = fragmentActivity;
        Context context2 = context;
        this.A08 = context;
        this.A0D = r13;
        this.A09 = bundle;
        boolean z = false;
        A0H = AnonymousClass7TF.A0c();
        this.A03 = new Object();
        this.A05 = new C49373Eub(r13);
        this.A02 = new C49964FGx((AnonymousClass7TF.A1Z(this.A0G) || 1AW.A06(0Tu.A06, 18309969568870442L)) ? true : z);
        String A002 = AnonymousClass000.A00(676);
        if (bundle.containsKey(A002)) {
            this.A06 = bundle.getBoolean(A002);
        }
        this.A04 = 02m.A0p;
        C51110Fog fog = new C51110Fog(this);
        FRF frf = new FRF(this);
        if (this.A06) {
            this.A00 = new C49535ExH(context);
        }
        this.A01 = new C49575Eyk(context, fog);
        this.A07 = new C14577Tyh(context2, frf, 1Kq.A00.C5w(), fog, new C51121Fot(context));
        0nY.A00().ATE(new C47799EHk(r13.A00.A06()));
        0nY.A00().ATE(new RAO(context, 19f.A2f, r13));
    }
}

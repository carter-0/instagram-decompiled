package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.FAt  reason: case insensitive filesystem */
public final class C49872FAt {
    public static final C49872FAt A00 = new Object();

    public final void A00(Context context, C314826iu r7, UserSession userSession) {
        String str;
        String str2;
        boolean A1Z = AnonymousClass7TG.A1Z(context, userSession);
        if (new AnonymousClass1SF(context, context.getPackageManager()).A00.A00() != null) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36318015823156997L) || 182.A06(r2, userSession, 36322473998100682L)) {
                if (!(r7 == null || (str2 = r7.A00) == null || !r7.A04)) {
                    0Aj A0e = AnonymousClass7TE.A0e(r7.A02, C273654mx.A00(551));
                    A0e.A8M(r7.A01, "qp_position");
                    A0e.A8M(EZU.UPDATE_INSTAGRAM, C273654mx.A00(243));
                    A0e.AAJ(Dbg.A00(), str2);
                    A0e.AAJ("app_update_source", "preload");
                    A0e.Cgf();
                }
                Intent A09 = DbS.A09();
                A09.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.ui.landing.StubInstallActivity");
                A09.putExtra("package_name", "com.instagram.android");
                A09.putExtra("update_flow", A1Z);
                A09.addFlags(268435456);
                A09.addFlags(Constants.LOAD_RESULT_PGO);
                0b6.A00().A0B(C49269EsC.A00).A0G(context, A09);
                return;
            }
        }
        if (!(r7 == null || (str = r7.A00) == null || !r7.A04)) {
            0Aj A0e2 = AnonymousClass7TE.A0e(r7.A02, C273654mx.A00(551));
            A0e2.A8M(r7.A01, "qp_position");
            A0e2.A8M(EZU.UPDATE_INSTAGRAM, C273654mx.A00(243));
            A0e2.AAJ(Dbg.A00(), str);
            A0e2.AAJ("app_update_source", "google_play_store");
            A0e2.Cgf();
        }
        0oI.A07(context, "com.instagram.android", (String) null);
    }
}

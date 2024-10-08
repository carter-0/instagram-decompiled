package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;

/* renamed from: X.F2e  reason: case insensitive filesystem */
public final class C49694F2e {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C73903Ple(this, 38));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C73903Ple(this, 39));
    public final C49340Etv A05;

    public C49694F2e(AnonymousClass0iw r3, UserSession userSession, C49340Etv etv) {
        0qQ.A0B(r3, 2);
        this.A02 = userSession;
        this.A01 = r3;
        this.A05 = etv;
    }

    public final void A00(Activity activity, String str) {
        UserSession userSession = this.A02;
        HashMap A0e = Dbb.A0e(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str, AnonymousClass7TE.A1L("merchant_igid", userSession.A06));
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, userSession), C273654mx.A00(3336));
        if (A0e2.isSampled()) {
            DbV.A1G(A0e2, "shops_product_picker_entrypoint_tap");
        }
        this.A04.getValue();
        AnonymousClass3M3 A022 = C46649DiU.A02(userSession, "com.bloks.www.minishops.ig.productpicker.content", A0e);
        AnonymousClass0eM r3 = this.A03;
        ((C331127Pr) r3.getValue()).A0T = new C65738Lys(A022, 3);
        this.A05.A00.A16();
        DbU.A0y(activity, A022, (C331127Pr) r3.getValue());
    }
}

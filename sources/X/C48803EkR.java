package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.EkR  reason: case insensitive filesystem */
public abstract class C48803EkR {
    public static final void A00(AnonymousClass0iw r2, UserSession userSession, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "direct_thread_armadillo_biz_tools_upsell_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9F("ig_userid", DbV.A0q(DbT.A0j(userSession).getId()));
            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0e.Cgf();
        }
    }
}

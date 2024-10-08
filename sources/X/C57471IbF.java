package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;

/* renamed from: X.IbF  reason: case insensitive filesystem */
public final class C57471IbF implements C230332pS {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final Context A02;

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r9, Object obj, Object obj2, String str) {
        Long l;
        C61081JwJ jwJ = (C61081JwJ) obj;
        DbY.A1S(jwJ, r9);
        1Xj r5 = (1Xj) jwJ.A00;
        String str2 = jwJ.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, this.A00), "instagram_organic_vpvd_imp");
        if (A0e.isSampled()) {
            A0e.A8D("max_duration_ms", Double.valueOf((double) r9.A04));
            C51970G9q.A16(A0e, (double) r9.A05);
            A0e.A8D("legacy_duration_ms", Double.valueOf((double) r9.A02));
            G9t.A1I(A0e, r5, "tracking_token", r5.C9L());
            A0e.AAJ("m_t", String.valueOf(Integer.valueOf(r5.BR7().A00)));
            C51965G9l.A1K(A0e, str);
            C51965G9l.A1E(A0e, C51972G9s.A0j(r5.A30()));
            A0e.AAJ("media_type", r5.BR7().name());
            User A11 = C51966G9m.A11(r5);
            if (A11 != null) {
                l = C51972G9s.A0h(A11);
            } else {
                l = null;
            }
            C51965G9l.A1H(A0e, l);
            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0e.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A0e.AAJ("canonical_nav_chain_previous", AnonymousClass3LH.A00);
            A0e.A9F("canonical_nav_chain_delta_ms_since_last_update", Long.valueOf(AnonymousClass3LI.A01.now() - AnonymousClass3LI.A00));
            A0e.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A0e.AAJ("device_fold_orientation", C254483sY.A00);
            A0e.AAJ("device_fold_state", C254493sZ.A00);
            A0e.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A0e.Cgf();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }

    public C57471IbF(Context context, UserSession userSession, AnonymousClass4DU r3) {
        this.A02 = context;
        this.A01 = r3;
        this.A00 = userSession;
    }
}

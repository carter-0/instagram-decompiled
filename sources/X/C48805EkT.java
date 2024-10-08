package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.EkT  reason: case insensitive filesystem */
public abstract class C48805EkT {
    public static final void A00(AnonymousClass0iw r6, UserSession userSession, String str, String str2) {
        long j;
        long j2;
        int i;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "direct_thread_ctd_upsell_events");
        0xa r4 = AnonymousClass4k9.A00(userSession).A00;
        int A00 = DbT.A00(r4, C273654mx.A00(2225));
        if (A00 == 1) {
            j = 0;
            j2 = r4.getLong("ctd_upsell_one_banner_negative_outcome_count", 0);
            i = 2226;
        } else if (A00 != 2) {
            j = 0;
            j2 = r4.getLong("ctd_upsell_banner_negative_outcome_count_v2", 0);
            i = 2224;
        } else {
            j = 0;
            j2 = r4.getLong("ctd_upsell_two_banner_negative_outcome_count", 0);
            i = 2227;
        }
        long j3 = r4.getLong(C273654mx.A00(i), j);
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0e.A9F("negative_outcome_count", Long.valueOf(j2));
            A0e.A9F("total_impression_count", Long.valueOf(j3));
            A0e.Cgf();
        }
    }
}

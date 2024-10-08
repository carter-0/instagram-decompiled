package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public abstract class AIh {
    public static void A00(0Aj r3, 0bb r4, long j) {
        r4.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
        r4.A03(C273654mx.A00(774), false);
        r3.AAK(r4, AnonymousClass000.A00(1663));
        r3.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) null);
    }

    public static final void A01(C391629tO r4, C391549tG r5, UserSession userSession, String str, int i) {
        long j;
        Long A10;
        AnonymousClass7TF.A1C(userSession, 0, r4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new 0xG("direct_reachability_composer_block"), userSession), "mwb_actor_experience_event");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, "action", i);
            A0e.A8M(r4, "restriction_type");
            A0e.AAJ("surface", C273654mx.A00(300));
            0bb r2 = new 0bb();
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = -1;
            } else {
                j = A10.longValue();
            }
            A00(A0e, r2, j);
            A0e.A8M(r5, C273654mx.A00(2895));
            A0e.Cgf();
        }
    }

    public static final void A02(AnonymousClass0iw r2, UserSession userSession, String str) {
        long j;
        Long A10;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "mwb_actor_experience_event");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, "action", 13);
            A0e.A8M(C391629tO.A0D, "restriction_type");
            A0e.AAJ("surface", "forwarding_sheet");
            0bb r22 = new 0bb();
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = -1;
            } else {
                j = A10.longValue();
            }
            A00(A0e, r22, j);
            A0e.Cgf();
        }
    }

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, String str, boolean z) {
        String str2;
        long j;
        Long A10;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "mwb_actor_experience_event");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, "action", 13);
            A0e.A8M(C391629tO.A0U, "restriction_type");
            if (z) {
                str2 = "forwarding_sheet";
            } else {
                str2 = "reshare_sheet";
            }
            A0e.AAJ("surface", str2);
            0bb r22 = new 0bb();
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = -1;
            } else {
                j = A10.longValue();
            }
            A00(A0e, r22, j);
            A0e.Cgf();
        }
    }

    public static final void A04(AnonymousClass0iw r2, UserSession userSession, String str, boolean z) {
        String str2;
        long j;
        Long A10;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "mwb_actor_experience_event");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, "action", 13);
            A0e.A8M(C391629tO.A0J, "restriction_type");
            if (z) {
                str2 = "forwarding_sheet";
            } else {
                str2 = "reshare_sheet";
            }
            A0e.AAJ("surface", str2);
            0bb r22 = new 0bb();
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = -1;
            } else {
                j = A10.longValue();
            }
            A00(A0e, r22, j);
            A0e.Cgf();
        }
    }
}

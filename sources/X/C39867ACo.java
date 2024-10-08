package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.ACo  reason: case insensitive filesystem */
public final class C39867ACo {
    public final 0wc A00;

    public static void A00(C39867ACo aCo, AnonymousClass2Ep r4, String str) {
        XSV xsv;
        long j;
        0Aj A0e = AnonymousClass7TE.A0e(aCo.A00, "mci_sender_unsend_nux");
        if (A0e.isSampled()) {
            String A09 = AnonymousClass48N.A09(r4);
            A0e.AAJ("action", str);
            String C6C = r4.C6C();
            C6C.getClass();
            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
            if (r4.CUG()) {
                xsv = XSV.A05;
            } else {
                xsv = XSV.A06;
            }
            A0e.A8M(xsv, "thread_type");
            if (A09 != null) {
                j = Long.parseLong(A09);
            } else {
                j = -1;
            }
            A0e.A9F("responsible_user_id", Long.valueOf(j));
            boolean CVr = r4.CVr();
            if (!CVr) {
                AnonymousClass7TE.A1W(A0e, "responsible_user_type", CVr ? 1 : 0);
            } else {
                A0e.AAJ("responsible_user_type", (String) null);
            }
            A0e.Cgf();
        }
    }

    public C39867ACo(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}

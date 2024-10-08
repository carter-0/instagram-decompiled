package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.8xK  reason: invalid class name and case insensitive filesystem */
public final class C370948xK {
    public final 0wc A00;

    public static void A00(C370948xK r3, AnonymousClass2Ep r4, String str) {
        XSV xsv;
        long j;
        0wc r2 = r3.A00;
        0Aj A002 = r2.A00(r2.A00, "mci_recipient_unsend_nux");
        if (A002.isSampled()) {
            String A09 = AnonymousClass48N.A09(r4);
            A002.AAJ("action", str);
            String C6C = r4.C6C();
            C6C.getClass();
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
            if (r4.CUG()) {
                xsv = XSV.A05;
            } else {
                xsv = XSV.A06;
            }
            A002.A8M(xsv, "thread_type");
            if (A09 != null) {
                j = Long.parseLong(A09);
            } else {
                j = -1;
            }
            A002.A9F("responsible_user_id", Long.valueOf(j));
            boolean CVr = r4.CVr();
            if (!CVr) {
                A002.A8k("responsible_user_type", Integer.valueOf(CVr ? 1 : 0));
            } else {
                A002.AAJ("responsible_user_type", (String) null);
            }
            A002.Cgf();
        }
    }

    public C370948xK(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}

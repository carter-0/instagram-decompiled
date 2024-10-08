package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Acs  reason: case insensitive filesystem */
public final class C40483Acs implements AnonymousClass7YN {
    public final A5J A00;
    public final C62320sa A01;

    public final void FLx(String str) {
        DirectThreadKey A04;
        String str2;
        C333517Zg r6 = (C333517Zg) this.A01.invoke();
        if (r6 != null) {
            AnonymousClass7ZY BSN = r6.BSN();
            if (str.equals(BSN.BOv())) {
                AnonymousClass7S9 AvL = r6.AvL();
                if (AvL instanceof PCQ) {
                    0qQ.A0C(AvL, "null cannot be cast to non-null type com.instagram.direct.msys.impl.thread.loader.MsysThreadViewDataLoaderIntf");
                    ((PCQ) AvL).A04((String) null);
                    return;
                }
                BSN.Drm((String) null);
                return;
            }
            A5J a5j = this.A00;
            0Aj A0e = AnonymousClass7TE.A0e(a5j.A00, "tap_thread_view_to_timestamp");
            if (!(!A0e.isSampled() || (A04 = C66647MaG.A04((C254743sy) a5j.A01.get())) == null || (str2 = A04.A00) == null)) {
                A0e.AAJ("action", "tap");
                A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                A0e.Cgf();
            }
            AnonymousClass7S9 AvL2 = r6.AvL();
            if (AvL2 instanceof PCQ) {
                0qQ.A0C(AvL2, "null cannot be cast to non-null type com.instagram.direct.msys.impl.thread.loader.MsysThreadViewDataLoaderIntf");
                ((PCQ) AvL2).A04(str);
                return;
            }
            BSN.Drm(str);
        }
    }

    public C40483Acs(A5J a5j, C62320sa r2) {
        this.A01 = r2;
        this.A00 = a5j;
    }
}

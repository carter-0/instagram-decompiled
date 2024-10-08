package X;

import com.instagram.common.session.UserSession;

public final class NS8 extends 0ng {
    public final /* synthetic */ AnonymousClass4A0 A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS8(AnonymousClass4A0 r4, String str) {
        super(454693070, 3, false, false);
        this.A00 = r4;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass4A0 r6 = this.A00;
        String str = this.A01;
        synchronized (r6) {
            UserSession userSession = r6.A07;
            OTU otu = C70111NxR.A00(userSession).A00;
            if (otu != null) {
                C73838Pkb pkb = C73838Pkb.A00;
                0qQ.A0B(pkb, 1);
                OTU.A00(otu, new J7R(pkb, otu, str, 4));
                ((AnonymousClass9V9) userSession.A01(AnonymousClass9V9.class, new AnonymousClass9V8(userSession))).A00.add(str);
            }
        }
    }
}

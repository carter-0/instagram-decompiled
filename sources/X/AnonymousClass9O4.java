package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9O4  reason: invalid class name */
public final class AnonymousClass9O4 extends 0ng {
    public final /* synthetic */ C74336PtC A00;
    public final /* synthetic */ C376359Hr A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9O4(C74336PtC ptC, C376359Hr r5) {
        super(1238804958, 3, false, false);
        this.A01 = r5;
        this.A00 = ptC;
    }

    public final void run() {
        C376359Hr r6 = this.A01;
        Object obj = r6.A02;
        C74336PtC ptC = this.A00;
        synchronized (obj) {
            1xN r1 = r6.A00;
            if (r1 != null) {
                C295625ob.A00(r1, r6.A01);
            }
            UserSession userSession = r6.A01;
            C66822MdE mdE = new C66822MdE(ptC);
            if (!userSession.A07()) {
                C295615oa.A01.A02(new C74178PqK(mdE, 19), userSession);
            }
            r6.A00 = mdE;
        }
    }
}

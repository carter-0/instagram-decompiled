package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HAx  reason: case insensitive filesystem */
public final class C54382HAx extends C271794jb {
    public final C52058GDe A00;
    public final UserSession A01;
    public final AnonymousClass3OA A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54382HAx(X.C52058GDe r2, com.instagram.common.session.UserSession r3, X.AnonymousClass3OA r4) {
        /*
            r1 = this;
            X.3W1 r0 = r2.A0E
            if (r0 == 0) goto L_0x0012
            X.GlN r0 = r0.A06()
            r1.<init>(r3, r4, r0)
            r1.A01 = r3
            r1.A02 = r4
            r1.A00 = r2
            return
        L_0x0012:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54382HAx.<init>(X.GDe, com.instagram.common.session.UserSession, X.3OA):void");
    }

    public final void A8S(C254523sc r3, AnonymousClass4DU r4, String str) {
        DbY.A1S(str, r3);
        super.A8S(r3, r4, str);
        AnonymousClass3OA r1 = this.A02;
        if (r1.A0x && GCI.A00(this.A01)) {
            r3.A5W = r1.A0f;
            r3.A8A = true;
            r3.A3Q = DbS.A0j(this.A00.A09());
        }
    }
}

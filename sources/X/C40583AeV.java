package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.AeV  reason: case insensitive filesystem */
public final class C40583AeV implements AnonymousClass2sT {
    public final /* synthetic */ AnonymousClass8KO A00;
    public final /* synthetic */ C381539bv A01;

    public final void DaJ(AnonymousClass3Q2 r12) {
        AnonymousClass3Q2 r4 = r12;
        0qQ.A0B(r12, 0);
        if (r12.A0q()) {
            r12.A0Z(this);
            C381539bv r0 = this.A01;
            long j = r0.A00;
            String str = r0.A05;
            String str2 = r0.A03;
            String str3 = r0.A04;
            SimpleImageUrl simpleImageUrl = r0.A01;
            String str4 = r0.A02;
            UserSession userSession = this.A00.A02;
            C333537Zi A002 = C333527Zh.A00(userSession);
            if (str2 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (str3 != null) {
                if (simpleImageUrl == null) {
                    simpleImageUrl = new SimpleImageUrl("");
                }
                A002.A0F(simpleImageUrl, r4, str, str2, str3, str4, j);
                C3018660j.A01(userSession).A0B(C69506Nmo.A0V);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public C40583AeV(AnonymousClass8KO r1, C381539bv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

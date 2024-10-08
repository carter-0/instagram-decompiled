package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9u  reason: case insensitive filesystem */
public final class C63865L9u {
    public final AnonymousClass2gB A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final C63733L4r A03;
    public final String A04;
    public final String A05;

    public C63865L9u(MusicProduct musicProduct, UserSession userSession, C63733L4r l4r, String str, String str2) {
        C51974G9v.A1P(userSession, musicProduct, str, str2);
        this.A02 = userSession;
        this.A01 = musicProduct;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = l4r;
        AnonymousClass2gB r4 = new AnonymousClass2gB();
        this.A00 = r4;
        r4.A0E(l4r.A00, new C64318LZs(30, JTO.A1C(r4, 67)));
    }
}

package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9v  reason: case insensitive filesystem */
public final class C63866L9v {
    public final AnonymousClass2Fj A00 = JTO.A0K();
    public final MusicProduct A01;
    public final UserSession A02;
    public final C324356z9 A03;
    public final L22 A04;
    public final String A05;

    public C63866L9v(Context context, AnonymousClass07i r3, MusicProduct musicProduct, UserSession userSession, L22 l22, String str) {
        C51974G9v.A0d(1, userSession, musicProduct, str, l22);
        this.A02 = userSession;
        this.A01 = musicProduct;
        this.A05 = str;
        this.A04 = l22;
        this.A03 = new C324356z9(context, r3, userSession);
    }
}

package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCw  reason: case insensitive filesystem */
public final class C61569KCw extends C228042kh {
    public final MusicProduct A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60246Ji3(this.A00, this.A01);
    }

    public C61569KCw(MusicProduct musicProduct, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, musicProduct);
        this.A01 = userSession;
        this.A00 = musicProduct;
    }
}

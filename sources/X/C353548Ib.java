package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;

/* renamed from: X.8Ib  reason: invalid class name and case insensitive filesystem */
public final class C353548Ib extends 2YL {
    public final 2Fk A00;
    public final 05G A01;

    public final void A00(MusicProduct musicProduct, AnonymousClass4DH r15, UserSession userSession, MusicBrowseCategory musicBrowseCategory, String str, Map map) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
        C65514Luc luc = new C65514Luc(musicProduct, userSession2, this, musicBrowseCategory2, str, map);
        AnonymousClass4DH r8 = r15;
        if (r15.isAdded()) {
            new JZH(r8, userSession2, musicBrowseCategory2, luc, false).A00(true);
        }
    }

    public C353548Ib() {
        02z A012 = 106.A01((Object) null);
        this.A01 = A012;
        this.A00 = C226292g8.A00(19B.A00, A012);
    }
}

package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8gW  reason: invalid class name and case insensitive filesystem */
public final class C361618gW implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "MetaGalleryRecentsCache$Companion";

    public static final void A00(UserSession userSession, List list) {
        0qQ.A0B(userSession, 0);
        String A0B = new Gson().A0B(list);
        0qQ.A07(A0B);
        1Av A00 = 1Au.A00(userSession);
        A00.A6V.Epx(A00, A0B, 1Av.A8a[475]);
    }

    public final String getModuleName() {
        return "meta_gallery_recents_cache";
    }
}

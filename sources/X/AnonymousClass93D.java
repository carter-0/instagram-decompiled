package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;

/* renamed from: X.93D  reason: invalid class name */
public final class AnonymousClass93D {
    public static final /* synthetic */ AnonymousClass93D A00 = new Object();

    public static final AnonymousClass93F A00(UserSession userSession, AnonymousClass93C r4) {
        Class cls;
        int i;
        0qQ.A0B(userSession, 0);
        if (r4 == AnonymousClass93C.A04) {
            cls = FlashMediaRepository.class;
            i = 46;
        } else {
            cls = FlashMediaCacheImpl.class;
            i = 47;
        }
        return (AnonymousClass93F) userSession.A01(cls, new C377239Lb(userSession, i));
    }
}

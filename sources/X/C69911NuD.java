package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;

/* renamed from: X.NuD  reason: case insensitive filesystem */
public abstract class C69911NuD {
    public static final DirectCardGalleryRepository A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (DirectCardGalleryRepository) userSession.A01(DirectCardGalleryRepository.class, new C73656PhV(userSession, 19));
    }
}

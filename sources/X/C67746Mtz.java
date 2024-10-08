package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.Mtz  reason: case insensitive filesystem */
public final class C67746Mtz extends 2YL {
    public final 2Fk A00;
    public final UserSession A01;
    public final DirectCardGalleryRepository A02;
    public final DirectThreadKey A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C73656PhV(this, 15));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C73656PhV(this, 16));
    public final 05G A08;

    public static final void A00(AnonymousClass2Ep r1, 0sP r2) {
        if (r1 != null) {
            r2.invoke(r1);
        } else {
            0wj.A00("DirectTextCardViewModel-thread is null", 20134884, false);
        }
    }

    public C67746Mtz(UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, DirectThreadKey directThreadKey, String str, String str2) {
        C51974G9v.A1P(userSession, directCardGalleryRepository, directThreadKey, str);
        this.A01 = userSession;
        this.A02 = directCardGalleryRepository;
        this.A03 = directThreadKey;
        this.A04 = str;
        this.A05 = str2;
        0pt A002 = AnonymousClass10H.A00(new C73577PgB(this, 0), directCardGalleryRepository.A0I, directCardGalleryRepository.A0G, directCardGalleryRepository.A0M);
        this.A00 = C66582MXn.A0G(new N2Z((N3F) null, (User) null, ""), C318116oQ.A00(this), A002, AnonymousClass10A.A01);
        this.A08 = 106.A01((Object) null);
    }
}

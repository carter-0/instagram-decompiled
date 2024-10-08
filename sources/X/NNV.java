package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class NNV extends C228042kh {
    public final Resources A00;
    public final UserSession A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final AnonymousClass72Q A04;
    public final DirectThreadKey A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public NNV(Resources resources, UserSession userSession, AnonymousClass9HC r4, AnonymousClass7L2 r5, AnonymousClass72Q r6, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4) {
        0qQ.A0B(userSession, 2);
        this.A00 = resources;
        this.A01 = userSession;
        this.A05 = directThreadKey;
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Resources resources = this.A00;
        UserSession userSession = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        String str = this.A08;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A09;
        DirectCardGalleryRepository A002 = C69911NuD.A00(userSession);
        AnonymousClass72Q r7 = this.A04;
        AnonymousClass9HC r5 = this.A02;
        AnonymousClass7L2 r6 = this.A03;
        AnonymousClass7TG.A1U(resources, userSession, directThreadKey);
        0qQ.A0B(str2, 5);
        C51974G9v.A1Q(str4, A002, r7, r5);
        0qQ.A0B(r6, 11);
        return new C67759MuF(resources, userSession, C69909NuB.A00(userSession), A002, r5, r6, r7, directThreadKey, str, str2, str3, str4, (List) null, (List) null);
    }
}

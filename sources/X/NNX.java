package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final class NNX extends C228042kh {
    public final Resources A00;
    public final UserSession A01;
    public final DirectCardGalleryRepository A02;
    public final AnonymousClass9HC A03;
    public final AnonymousClass7L2 A04;
    public final AnonymousClass72Q A05;
    public final DirectThreadKey A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public NNX(Resources resources, UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass9HC r5, AnonymousClass7L2 r6, AnonymousClass72Q r7, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, boolean z) {
        AnonymousClass7TF.A1F(userSession, 2, directCardGalleryRepository);
        this.A00 = resources;
        this.A01 = userSession;
        this.A06 = directThreadKey;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A02 = directCardGalleryRepository;
        this.A0B = list;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A0C = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Resources resources = this.A00;
        UserSession userSession = this.A01;
        DirectThreadKey directThreadKey = this.A06;
        String str = this.A09;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A0A;
        DirectCardGalleryRepository directCardGalleryRepository = this.A02;
        List list = this.A0B;
        return new NVG(resources, userSession, directCardGalleryRepository, this.A03, this.A04, this.A05, directThreadKey, str, str2, str3, str4, list, this.A0C);
    }
}

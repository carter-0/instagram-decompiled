package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

public final class KEY extends C228042kh {
    public final Fragment A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final L22 A03;
    public final L23 A04;
    public final String A05;
    public final String A06;

    public KEY(Fragment fragment, MusicProduct musicProduct, UserSession userSession, L22 l22, L23 l23, String str, String str2) {
        0qQ.A0B(userSession, 1);
        C51973G9u.A0r(3, musicProduct, str, str2);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = musicProduct;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = l22;
        this.A04 = l23;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        MusicProduct musicProduct = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        UserSession userSession2 = userSession;
        String str3 = str;
        C63865L9u l9u = new C63865L9u(musicProduct, userSession2, new C63733L4r(), str3, str2);
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        0gy A002 = AnonymousClass07i.A00(fragment);
        L22 l22 = this.A03;
        LDF ldf = new LDF(new C63734L4s(), new C63866L9v(requireContext, A002, musicProduct, userSession2, l22, str3));
        L9G l9g = new L9G(musicProduct, new C63787L6t(), new C63894LAx(fragment.requireContext(), AnonymousClass07i.A00(fragment), userSession, str2, str));
        C62037KWw A003 = C55122HcV.A00(userSession);
        0Tu r4 = 0Tu.A05;
        return new MusicSearchQueryViewModel(userSession, l22, this.A04, new LFC((MU4) null, AnonymousClass7TF.A0Y(r4, userSession, 36611104389994702L), AnonymousClass7TF.A0Y(r4, userSession, 36611104390060239L), 182.A06(r4, userSession, 36329629413556451L)), l9u, ldf, l9g, A003, AnonymousClass30D.A00(musicProduct, userSession));
    }
}

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;

public final class OLZ {
    public C69286Nim A00 = C69286Nim.A02;
    public String A01 = "-no query";
    public final C70434O6l A02;
    public final C70605ODc A03;
    public final C70606ODd A04;
    public final OO0 A05;

    public OLZ(GiphyRequestSurface giphyRequestSurface, AnonymousClass0iw r10, UserSession userSession, AnonymousClass4D6 r12, C70434O6l o6l, DirectThreadKey directThreadKey, boolean z) {
        C74452Pv7 p3c;
        this.A02 = o6l;
        boolean z2 = true;
        UserSession userSession2 = userSession;
        z2 = (directThreadKey == null || !AnonymousClass796.A03(userSession, directThreadKey, AnonymousClass05K.A06).A00()) ? false : z2;
        P3B p3b = new P3B(this);
        AnonymousClass0iw r4 = r10;
        if (z || z2) {
            p3c = new P3C(r10, userSession, C62564Khu.GIPHY_GIFS);
        } else {
            p3c = new C65267LqM(giphyRequestSurface, r4, userSession2, AnonymousClass7TE.A1I(C62564Khu.GIPHY_GIFS), false);
        }
        this.A05 = new C68745NVf(r12, p3b, p3c, false);
        this.A03 = new C70605ODc(userSession, r12, new C73934PmE(this, 3));
        this.A04 = new C70606ODd(userSession, r12, new C73934PmE(this, 4));
    }

    public final void A00(C69286Nim nim, String str) {
        AnonymousClass4D6 r4;
        1OC r1;
        CH8 ch8;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C69286Nim nim2 = nim;
        0qQ.A0B(nim2, 1);
        if (this.A00 != nim2 || !0qQ.A0K(this.A01, str2)) {
            OO0 oo0 = this.A05;
            oo0.A00 = "";
            0mM r0 = oo0.A01;
            r0.A00();
            r0.A01 = "";
            r0.A00();
            this.A00 = nim2;
            this.A01 = str2;
            C71020OYv oYv = this.A02.A00;
            RecyclerView recyclerView = oYv.A01;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            IgTextView igTextView = oYv.A02;
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            View view = oYv.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            int ordinal = nim2.ordinal();
            if (ordinal != 2) {
                if (ordinal == 0) {
                    C70605ODc oDc = this.A03;
                    2IS A042 = C41845B3m.A04();
                    2IS A043 = C41845B3m.A04();
                    A042.A03("offset", 0);
                    A042.A03("take", 32);
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGRecentlyUsedMediaQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42737BhY.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_recently_used_gifs_for_eimu", AnonymousClass7TE.A1C());
                    r4 = oDc.A00;
                    r1 = AnonymousClass9D0.A00(oDc.A01.A03(pandoGraphQLRequest));
                    ch8 = new CH8(oDc, 0);
                } else if (ordinal == 1) {
                    C70606ODd oDd = this.A04;
                    2IS A044 = C41845B3m.A04();
                    2IS A045 = C41845B3m.A04();
                    A044.A03("offset", 0);
                    A044.A03("take", 32);
                    PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(C41845B3m.A05(), "IGSavedGifsMediaQuery", A044.getParamsCopy(), A045.getParamsCopy(), C42743Bhe.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_saved_gifs_for_eimu", AnonymousClass7TE.A1C());
                    r4 = oDd.A00;
                    r1 = AnonymousClass9D0.A00(oDd.A01.A03(pandoGraphQLRequest2));
                    ch8 = new CH8(oDd, 1);
                } else if (ordinal != 3) {
                    throw AnonymousClass7TE.A1K();
                } else {
                    return;
                }
                r1.A00 = ch8;
                r4.schedule(r1);
                return;
            }
            oo0.A03(str2);
        }
    }
}

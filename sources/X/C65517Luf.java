package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* renamed from: X.Luf  reason: case insensitive filesystem */
public final class C65517Luf implements MU4 {
    public final /* synthetic */ MusicSearchQueryViewModel A00;

    public final void DUA(LFH lfh) {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00;
        L22 l22 = musicSearchQueryViewModel.A0D;
        String str = lfh.A01;
        0qQ.A0B(str, 0);
        JTS.A0K(l22.A00.A0A).A0B(str);
        if (C63354Kvb.A00(lfh)) {
            C63865L9u l9u = musicSearchQueryViewModel.A0G;
            C61499KAe kAe = new C61499KAe(12, lfh, l9u);
            Integer num = AnonymousClass05K.A0C;
            UserSession userSession = l9u.A02;
            int i = lfh.A00;
            MusicProduct musicProduct = l9u.A01;
            String str2 = l9u.A04;
            1OC A01 = LSH.A01(musicProduct, userSession, num, str, str2, i);
            A01.A00 = kAe;
            1ET A012 = 1ES.A01();
            0qQ.A0B(A012, 0);
            A012.schedule(A01);
            1OC A013 = LSH.A01(musicProduct, userSession, AnonymousClass05K.A0Y, str, str2, i);
            A013.A00 = kAe;
            1ET A014 = 1ES.A01();
            0qQ.A0B(A014, 0);
            A014.schedule(A013);
        }
        musicSearchQueryViewModel.A0H.A00(lfh, JTS.A0K(musicSearchQueryViewModel.A0E.A00.A0A).A07);
    }

    public C65517Luf(MusicSearchQueryViewModel musicSearchQueryViewModel) {
        this.A00 = musicSearchQueryViewModel;
    }

    public final void DBw() {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00;
        musicSearchQueryViewModel.A09.A0B(new C63736L4u(0, (Object) null));
        musicSearchQueryViewModel.A07.A0B(C361268fw.A00);
        if (musicSearchQueryViewModel.A0K) {
            L9G l9g = musicSearchQueryViewModel.A0I;
            C63787L6t l6t = l9g.A03;
            MusicProduct musicProduct = l9g.A02;
            Object A02 = l6t.A02.A02(musicProduct);
            if (A02 != null) {
                l6t.A01.A0A(new AnonymousClass8Y4(A02));
            }
            C63894LAx lAx = l9g.A04;
            Context context = lAx.A00;
            AnonymousClass07i r6 = lAx.A05;
            UserSession userSession = lAx.A06;
            String str = lAx.A07;
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("music/recent_searches/");
            String A002 = C14245TsS.A00(musicProduct);
            if (A002 == null) {
                A002 = "";
            }
            JTQ.A1D(A0b, A002, str);
            A0b.A9m("search_session_id", "");
            A0b.A0O((15p) null, CGJ.class, C45698D1x.class, false);
            String A0m = AnonymousClass7TG.A0m(musicProduct, "music/recent_searches/", AnonymousClass7TE.A1A());
            A0b.A07 = AnonymousClass05K.A0Y;
            A0b.A0A = A0m;
            A0b.A01 = 86400000;
            A0b.A00 = 4000;
            1OC A0M = A0b.A0M();
            C61500KAf.A00(A0M, lAx, 29);
            1ES.A00(context, r6, A0M);
        }
    }
}

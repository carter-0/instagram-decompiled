package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* renamed from: X.LuZ  reason: case insensitive filesystem */
public final class C65511LuZ implements MU1 {
    public final /* synthetic */ C61991KUo A00;

    public C65511LuZ(C61991KUo kUo) {
        this.A00 = kUo;
    }

    public final void Dhl(String str) {
        C61991KUo kUo = this.A00;
        if (kUo.isResumed()) {
            kUo.A03(str, true);
        }
    }

    public final void Dw2() {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00.A04;
        if (musicSearchQueryViewModel == null) {
            0qQ.A0F("musicSearchQueryViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        JTS.A12(musicSearchQueryViewModel.A0A);
        L9G l9g = musicSearchQueryViewModel.A0I;
        C63894LAx lAx = l9g.A04;
        MusicProduct musicProduct = l9g.A02;
        Context context = lAx.A00;
        AnonymousClass07i r3 = lAx.A05;
        UserSession userSession = lAx.A06;
        String str = lAx.A07;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("music/clear_recent_searches/");
        String A002 = C14245TsS.A00(musicProduct);
        if (A002 == null) {
            A002 = "";
        }
        JTQ.A1D(A0a, A002, str);
        A0a.A9m("should_clear_all", "true");
        1OC A0S = DbU.A0S(A0a, C61267K0c.class, LGu.class);
        C61500KAf.A00(A0S, lAx, 28);
        1ES.A00(context, r3, A0S);
    }
}

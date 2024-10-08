package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.WNd  reason: case insensitive filesystem */
public final class C19147WNd implements C21047XBo {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C19491Wad A01;
    public final /* synthetic */ String A02;

    public final void CuG() {
    }

    public final void Drz(boolean z) {
    }

    public final void DuN() {
    }

    public C19147WNd(Reel reel, C19491Wad wad, String str) {
        this.A01 = wad;
        this.A00 = reel;
        this.A02 = str;
    }

    public final void Cvt() {
        C19491Wad wad = this.A01;
        String str = this.A02;
        AnonymousClass738.A09(new WNS(str, wad, 1), wad.A02, str);
    }

    public final void DJJ() {
        C19491Wad wad = this.A01;
        Reel reel = this.A00;
        C19491Wad.A00(reel, wad, 0, false);
        AnonymousClass1Nd.A00(wad.A02).A00(new WQD(JTP.A0r(reel)));
    }

    public final void Djz() {
        C19491Wad wad = this.A01;
        C19491Wad.A01(wad, "add_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession userSession = wad.A02;
        ImmutableList of = ImmutableList.of(this.A02);
        0qQ.A07(of);
        vun.A00(of, userSession, new WZU(0, this.A00, wad));
    }

    public final void DuM() {
        C19491Wad wad = this.A01;
        C19491Wad.A01(wad, "remove_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession userSession = wad.A02;
        String str = this.A02;
        ImmutableList of = ImmutableList.of(str);
        0qQ.A07(of);
        vun.A01(of, userSession, new C73673Phm(this.A00, wad, str, 24));
    }
}

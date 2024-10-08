package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

/* renamed from: X.UhV  reason: case insensitive filesystem */
public final class C15724UhV extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C54660HMr A02;
    public final C56058Hs7 A03;
    public final I10 A04;
    public final String A05;

    public C15724UhV(AnonymousClass0iw r2, UserSession userSession, C54660HMr hMr, C56058Hs7 hs7, I10 i10, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = hMr;
        this.A03 = hs7;
        this.A04 = i10;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        String str = this.A05;
        C54660HMr hMr = this.A02;
        C56058Hs7 hs7 = this.A03;
        return new C60260JiH(new RemixSettingsRepository(this.A00, userSession, hMr, new C56154Hth(hMr, hs7, C54658HMp.REMIX_SETTINGS, str), hs7, this.A04, str), C16548Uwv.EVERYONE);
    }
}

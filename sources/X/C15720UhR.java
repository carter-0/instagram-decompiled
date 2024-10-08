package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.UhR  reason: case insensitive filesystem */
public final class C15720UhR extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C21251XQw A02;
    public final String A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new SettingsScreenViewModel(this.A00, userSession, this.A02, this.A03, this.A04);
    }

    public C15720UhR(AnonymousClass0iw r1, UserSession userSession, C21251XQw xQw, String str, boolean z) {
        AnonymousClass7TG.A1P(userSession, xQw);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = xQw;
        this.A04 = z;
        this.A03 = str;
    }
}

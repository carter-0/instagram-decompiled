package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.JhA  reason: case insensitive filesystem */
public final class C60191JhA extends 2YL {
    public C61081JwJ A00;
    public final AvatarPrivacySettingsRepository A01;
    public final UserSession A02;
    public final JVC A03;
    public final 05G A04 = 106.A01(KXQ.A00);
    public final 05G A05 = 106.A01(KXU.A00);
    public final 05G A06 = 106.A01(KXV.A00);

    public C60191JhA(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass7T8.A00(userSession);
        this.A03 = new JVC(userSession, 26G.A00(userSession));
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository;

/* renamed from: X.H5g  reason: case insensitive filesystem */
public final class C54263H5g extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C53011Gh2(new AvatarPowerupsRepository(this.A00));
    }

    public C54263H5g(UserSession userSession) {
        this.A00 = userSession;
    }
}

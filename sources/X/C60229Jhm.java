package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarConfigRepository;

/* renamed from: X.Jhm  reason: case insensitive filesystem */
public final class C60229Jhm extends 2YL {
    public String A00 = "";
    public final UserSession A01;
    public final Integer A02;
    public final 05G A03 = 106.A01(C61338K2z.A00);

    public final void A00() {
        if (this.A02.intValue() == 0) {
            String str = this.A00;
            if (str == null || str.length() == 0) {
                MGE.A01(this, ImmersiveAvatarConfigRepository.IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT, C318116oQ.A00(this), 11);
            } else {
                this.A03.Epw(new C61336K2x(str));
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public /* synthetic */ C60229Jhm(UserSession userSession, Integer num) {
        AnonymousClass7TG.A1O(userSession, num);
        this.A01 = userSession;
        this.A02 = num;
    }
}

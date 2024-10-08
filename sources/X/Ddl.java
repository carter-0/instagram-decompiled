package X;

import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.common.session.UserSession;

public final class Ddl extends C228042kh {
    public final UserSession A00;

    public Ddl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C317846nw r1;
        String str;
        AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository;
        UserSession userSession = this.A00;
        C317856nx r3 = C317846nw.A01;
        C317866ny r2 = C317866ny.PROFILE;
        if (DcE.A00(userSession)) {
            r1 = C317846nw.COIN_FLIP_CUSTOMIZATION_POSES_440_400;
        } else {
            r1 = C317846nw.COIN_FLIP_CUSTOMIZATION_ALL_POSES;
        }
        String A002 = r3.A00(r1, r2, userSession, false);
        0qQ.A0B(userSession, 0);
        AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository2 = C48208Eao.A00;
        if (avatarCustomizationOptionsRepository2 != null) {
            str = avatarCustomizationOptionsRepository2.A02;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, A002) || (avatarCustomizationOptionsRepository = C48208Eao.A00) == null) {
            avatarCustomizationOptionsRepository = new AvatarCustomizationOptionsRepository(userSession, A002);
            C48208Eao.A00 = avatarCustomizationOptionsRepository;
        }
        return new C46368Ddk(avatarCustomizationOptionsRepository, userSession);
    }
}

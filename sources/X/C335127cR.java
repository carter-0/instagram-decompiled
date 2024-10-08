package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.7cR  reason: invalid class name and case insensitive filesystem */
public final class C335127cR extends 2YL {
    public final C335167cV A00;
    public final C335147cT A01;
    public final UserSession A02;
    public final 05G A03 = 106.A01(C335207cZ.A00);
    public final 05G A04 = 106.A01(C335197cY.A00);
    public final 05G A05 = 106.A01(C335177cW.A00);

    public final void A00(C317966o8 r12, boolean z) {
        Integer num;
        String str;
        String str2;
        MediaType mediaType;
        0qQ.A0B(r12, 0);
        this.A01.A02.A01.A01();
        05G r1 = this.A05;
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        AvatarInfo avatarInfo = r12.A0G;
        String str3 = null;
        if (avatarInfo != null) {
            str3 = avatarInfo.A00;
            str = avatarInfo.A01;
            str2 = avatarInfo.A02;
        } else {
            str = null;
            str2 = null;
        }
        String str4 = r12.A0S;
        String str5 = r12.A0a;
        if (r12.A04() == AnonymousClass05K.A0N) {
            mediaType = MediaType.ANIMATION;
        } else {
            mediaType = MediaType.IMAGE;
        }
        r1.Epw(new C385169iV(new AnonymousClass571(mediaType, num, str3, str, str2, str4, str5, r12.A0H.getUrl())));
    }

    public /* synthetic */ C335127cR(UserSession userSession) {
        C335147cT r2 = new C335147cT(userSession);
        C335167cV r1 = new C335167cV(userSession);
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = r1;
    }
}

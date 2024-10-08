package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* renamed from: X.KEc  reason: case insensitive filesystem */
public final class C61601KEc extends C228042kh {
    public final C61082JwK A00;
    public final C317846nw A01;
    public final C317866ny A02;
    public final C63831L8m A03;
    public final UserSession A04;
    public final C62944Kow A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A04;
        AvatarStickerInteractor avatarStickerInteractor = new AvatarStickerInteractor((Context) null, userSession, 30);
        C310396ay A002 = C310386ax.A00(userSession);
        C317866ny r3 = this.A02;
        C317846nw r2 = this.A01;
        String str = this.A08;
        0qQ.A0B(userSession, 0);
        Class<C3261475o> cls = C3261475o.class;
        C62944Kow kow = this.A05;
        C61082JwK jwK = this.A00;
        String str2 = this.A07;
        boolean z = this.A09;
        return new C60294Jir(jwK, r2, r3, this.A03, userSession, A002, (C3261475o) userSession.A01(cls, new MMO(userSession, 17)), avatarStickerInteractor, kow, this.A06, str, str2, z);
    }

    public C61601KEc(C61082JwK jwK, C317846nw r3, C317866ny r4, C63831L8m l8m, UserSession userSession, C62944Kow kow, Integer num, String str, String str2, boolean z) {
        AnonymousClass7TG.A1U(userSession, r4, r3);
        0qQ.A0B(l8m, 8);
        this.A04 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = jwK;
        this.A05 = kow;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = l8m;
        this.A09 = z;
        this.A06 = num;
    }
}

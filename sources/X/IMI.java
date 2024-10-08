package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMI implements C270754hF {
    public final String A00;
    public final /* synthetic */ C55888Hp9 A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A00;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36328229254151265L);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/template/");
        G9w.A1I(A0a, AnonymousClass000.A00(1879), str, (String) null);
        A0a.A0H("should_show_friends_media_at_top", A06);
        return DbU.A0S(A0a, C43878CGs.class, D3A.class);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/template/");
        G9w.A1I(A0a, AnonymousClass000.A00(1879), str2, str);
        A0a.A9m("should_show_friends_media_at_top", "false");
        return DbU.A0S(A0a, C43878CGs.class, D3A.class);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMI(C55888Hp9 hp9, String str) {
        this.A01 = hp9;
        this.A00 = str;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}

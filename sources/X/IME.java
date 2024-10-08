package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

public final class IME implements C270754hF {
    public final String A00;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A00;
        if (!0qQ.A0K(str, "ALL_MEDIA_AUTO_COLLECTION")) {
            return SaveApiUtil.A01(userSession, str, (String) null);
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("feed/saved/clips/");
        A0b.A9m("max_id", (String) null);
        return DbU.A0S(A0b, C298815u5.class, AnonymousClass93W.class);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A00;
        if (!0qQ.A0K(str2, "ALL_MEDIA_AUTO_COLLECTION")) {
            return SaveApiUtil.A01(userSession, str2, str);
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("feed/saved/clips/");
        A0b.A9m("max_id", str);
        return DbU.A0S(A0b, C298815u5.class, AnonymousClass93W.class);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IME(String str) {
        this.A00 = str;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}

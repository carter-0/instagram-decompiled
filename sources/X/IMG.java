package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMG implements C270754hF {
    public final String A00;
    public final String A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/reshared_media/");
        A0a.A0G("query", str);
        return C51973G9u.A0c(A0a, "max_id", str2);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/reshared_media/");
        A0a.A0G("query", str2);
        return C51973G9u.A0c(A0a, "max_id", str);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMG(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}

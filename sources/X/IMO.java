package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMO implements C270754hF {
    public String A00;
    public final String A01;
    public final String A02;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/keyword/");
        0qQ.A0B("max_id", 0);
        A0a.A9m("keyword", str);
        A0a.A0G("rank_token", str2);
        return C51973G9u.A0c(A0a, "reels_page_index", str3);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A01;
        String str3 = this.A02;
        String str4 = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/keyword/");
        A0a.A0G("max_id", str);
        A0a.A9m("keyword", str2);
        A0a.A0G("rank_token", str3);
        return C51973G9u.A0c(A0a, "reels_page_index", str4);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMO(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }

    public final void EiB(String str) {
        this.A00 = str;
    }
}

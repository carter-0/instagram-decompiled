package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMF implements C270754hF {
    public final String A00;
    public final boolean A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A00;
        boolean z2 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/creative_tool/");
        A0a.A9m("creative_tool_id", str);
        A0a.A0O((15p) null, C54083Gz7.class, C56220Hun.class, false);
        0qQ.A0B("max_id", 0);
        A0a.A0H("should_show_friends_media_at_top", z2);
        if (!z) {
            A0a.A0A = 002.A0R("creative_tools_page_cache_", str);
            A0a.A01 = 900000;
            A0a.A07(AnonymousClass05K.A0N);
        }
        return A0a.A0M();
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/creative_tool/");
        A0a.A9m("creative_tool_id", str2);
        C51968G9o.A1J(A0a, C54083Gz7.class, C56220Hun.class, str);
        return DbT.A0T(A0a, "should_show_friends_media_at_top", "false");
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMF(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}

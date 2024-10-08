package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMS implements C270754hF {
    public final C270654h5 A00;
    public final GF2 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final 1OC BCc(UserSession userSession, boolean z) {
        String str;
        0qQ.A0B(userSession, 0);
        String str2 = this.A02;
        boolean z2 = this.A04;
        GF2 gf2 = this.A01;
        if (gf2 != null) {
            str = gf2.A01();
        } else {
            str = null;
        }
        String A002 = this.A00.A00();
        String str3 = this.A03;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/chaining/");
        A0a.A9m("chaining_media_id", str2);
        A0a.A0H("should_refetch_chaining_media", z2);
        C51965G9l.A1S(A0a, str3);
        A0a.A0G("session_info", str);
        C51968G9o.A1M(A0a, "seen_reels", A002, (String) null);
        C51972G9s.A18(A0a, userSession, AnonymousClass93W.class);
        return A0a.A0M();
    }

    public final 1OC C42(UserSession userSession, String str) {
        String str2;
        0qQ.A0B(userSession, 0);
        String str3 = this.A02;
        GF2 gf2 = this.A01;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        String A002 = this.A00.A00();
        String str4 = this.A03;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/chaining/");
        A0a.A9m("chaining_media_id", str3);
        A0a.A9m("should_refetch_chaining_media", "false");
        C51965G9l.A1S(A0a, str4);
        A0a.A0G("session_info", str2);
        C51968G9o.A1M(A0a, "seen_reels", A002, str);
        C51972G9s.A18(A0a, userSession, AnonymousClass93W.class);
        return A0a.A0M();
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMS(C270654h5 r1, GF2 gf2, String str, String str2, boolean z) {
        this.A02 = str;
        this.A04 = z;
        this.A01 = gf2;
        this.A00 = r1;
        this.A03 = str2;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}

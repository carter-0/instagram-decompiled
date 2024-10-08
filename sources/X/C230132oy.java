package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.2oy  reason: invalid class name and case insensitive filesystem */
public final class C230132oy {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public static 1OC A00(UserSession userSession, Hashtag hashtag) {
        String encode;
        String name = hashtag.getName();
        if (name == null) {
            encode = "";
        } else {
            encode = Uri.encode(name.trim());
        }
        String A06 = 0mp.A06("tags/follow/%s/", new Object[]{encode});
        1NY r2 = new 1NY(userSession);
        r2.A04();
        r2.A0A(A06);
        r2.A0R(1XP.class, 1XY.class);
        r2.A0R = true;
        return r2.A0M();
    }

    public static 1OC A01(UserSession userSession, Hashtag hashtag) {
        String encode;
        String name = hashtag.getName();
        if (name == null) {
            encode = "";
        } else {
            encode = Uri.encode(name.trim());
        }
        String A06 = 0mp.A06("tags/unfollow/%s/", new Object[]{encode});
        1NY r2 = new 1NY(userSession);
        r2.A04();
        r2.A0A(A06);
        r2.A0R(1XP.class, 1XY.class);
        r2.A0R = true;
        return r2.A0M();
    }

    public final void A02(0xF r7, UserSession userSession, C230152p2 r9, Hashtag hashtag, String str) {
        1OC A002 = A00(userSession, hashtag);
        A002.A00 = new C15591UfJ(r9, this, hashtag);
        1ES.A00(this.A00, this.A01, A002);
        Integer num = AnonymousClass05K.A00;
        0xF r1 = r7;
        C18683Vwh.A00(this.A02, r1, this.A03, hashtag, num, str);
    }

    public final void A03(0xF r7, UserSession userSession, C230152p2 r9, Hashtag hashtag, String str) {
        1OC A012 = A01(userSession, hashtag);
        A012.A00 = new C15592UfK(r9, this, hashtag);
        1ES.A00(this.A00, this.A01, A012);
        Integer num = AnonymousClass05K.A01;
        0xF r1 = r7;
        C18683Vwh.A00(this.A02, r1, this.A03, hashtag, num, str);
    }

    public final void A05(UserSession userSession, C230152p2 r8, Hashtag hashtag, String str) {
        A02((0xF) null, userSession, r8, hashtag, str);
    }

    public final void A06(UserSession userSession, C230152p2 r8, Hashtag hashtag, String str) {
        A03((0xF) null, userSession, r8, hashtag, str);
    }

    public final void A04(1P0 r4, UserSession userSession, String str) {
        String encode;
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        if (str == null) {
            encode = "";
        } else {
            encode = Uri.encode(str.trim());
        }
        r2.A0A(0mp.A06("tags/%s/info/", new Object[]{encode}));
        r2.A0R(CGD.class, D1Y.class);
        1OC A0M = r2.A0M();
        A0M.A00 = r4;
        1ES.A00(this.A00, this.A01, A0M);
    }

    public C230132oy(Context context, AnonymousClass07i r2, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = userSession;
    }
}

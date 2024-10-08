package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.EnumSet;

/* renamed from: X.Hzq  reason: case insensitive filesystem */
public final class C56519Hzq {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C228232l0 A03;

    public static final void A00(C56519Hzq hzq, 1Xj r9, AnonymousClass3WA r10, AnonymousClass3W1 r11, String str) {
        0qQ.A0B(r10, 0);
        r11.A0m = r10;
        C228232l0 r4 = hzq.A03;
        EnumSet enumSet = C56482HzE.A00;
        if (r10 == AnonymousClass3WA.MAIN_FEED_AD_HIDE) {
            r4.DUE(new C301165yf((C376459Ib) null, (C53251Gkz) null, str, ""), C233162v9.XOUT, r9, r11);
        }
        UserSession userSession = hzq.A01;
        int i = r11.A03;
        AnonymousClass4DU r42 = hzq.A02;
        C60510iO.A00(userSession);
        String id = r9.getId();
        User A2A = r9.A2A(userSession);
        A2A.getClass();
        C254523sc A0n = C51965G9l.A0n(r42, 002.A0R("instagram_ad_", "hide_response"));
        A0n.A7J = r9.C9L();
        A0n.A6z = "hide_button";
        A0n.A5u = id;
        A0n.A4N = C231122qu.A07(userSession, r9);
        A0n.A4W = A2A.getId();
        A0n.A5I = 1aC.A06(A2A.B6o());
        A0n.A0N(r9.BR7());
        if (str == null) {
            str = AnonymousClass000.A00(3341);
        }
        A0n.A6o = str;
        String A0H = C231122qu.A0H(userSession, r9.getId());
        if (A0H != null) {
            A0n.A5X = A0H;
        }
        C51972G9s.A1A(A0n);
        C233822wX.A0X(A0n, DbV.A0U(userSession, id), i);
        C233822wX.A0H(userSession, A0n, r42);
    }

    public C56519Hzq(Activity activity, UserSession userSession, AnonymousClass4DU r3, C228232l0 r4) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = r4;
    }
}

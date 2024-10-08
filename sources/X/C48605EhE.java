package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EhE  reason: case insensitive filesystem */
public abstract class C48605EhE {
    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController] */
    public static Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Object A01 = r11.A01();
        C277014uI A0N = DbW.A0N(r11);
        C307896Rx r7 = r10;
        UserSession A0Y = DbT.A0Y(r10);
        FragmentActivity A04 = C308206Td.A04(r7);
        C324356z9 r4 = new C324356z9(A04, AnonymousClass07i.A00(A04), A0Y);
        ? obj = new Object();
        obj.A00 = A04;
        String A02 = C239023El.A00(',').A02(DbV.A14(A01));
        1NY A0O = DbU.A0O(A0Y);
        A0O.A0A("media/infos/");
        A0O.A9m("media_ids", A02);
        A0O.A9m("ranked_content", "true");
        A0O.A9m("include_inactive_reel", "true");
        r4.A03(DbT.A0S(A0O, 1XO.class, 1XW.class), new ELH(1, new F08(A04, r7, (C276544tV) r11.A00(), A0N, A0Y, obj), AnonymousClass3BQ.BLOKS, obj));
        return null;
    }
}

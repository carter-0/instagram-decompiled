package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.HashMap;
import java.util.List;

public final class WW1 implements JO7 {
    public final /* synthetic */ C15357Ub9 A00;

    public WW1(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void DqJ(C16672Uz8 uz8) {
        String str;
        C15357Ub9 ub9 = this.A00;
        if (C13991Tnr.A1Z(uz8, ub9.A08)) {
            ub9.A0E.A01(uz8, true, false);
            C14227TsA.A00(ub9.A06);
        }
        0xF r5 = new 0xF();
        0xF.A00(r5, ub9.A08.A00.toString(), "tab");
        List A002 = VBO.A00(ub9.A0K);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ub9.A0K.size(); i++) {
            hashMap.put(Long.valueOf((long) i), A002.get(i).toString());
        }
        W05 w05 = ub9.A0D;
        String str2 = ub9.A0J;
        Venue venue = ub9.A0H;
        if (venue != null) {
            str = venue.A04();
        } else {
            str = null;
        }
        w05.A02(r5, (0xF) null, "location_page", C273654mx.A00(988), "location_tab", str2, str, (String) null, hashMap);
        UserSession userSession = ub9.A02;
        HAI hai = ub9.A08;
        int A003 = hai.A01.A00(hai.A00);
        Venue venue2 = ub9.A0H;
        AnonymousClass7TG.A1O(userSession, uz8);
        0xI A01 = 0xI.A01("location_feed_button_tapped", "feed_location");
        A01.A0C(C273654mx.A00(3397), uz8.toString());
        A01.A0B("tab_index", Long.valueOf((long) A003));
        A01.A04(C18217Vnh.A01(venue2).A00());
        DbU.A1R(A01, userSession);
    }
}

package X;

import com.instagram.user.model.User;
import java.util.List;

public final class OKK {
    public final /* synthetic */ OI2 A00;
    public final /* synthetic */ C68480NJx A01;

    public OKK(OI2 oi2, C68480NJx nJx) {
        this.A01 = nJx;
        this.A00 = oi2;
    }

    public final void A00(String str) {
        User user;
        String A002 = C273654mx.A00(3122);
        OI2 oi2 = this.A00;
        List list = oi2.A08;
        if (list != null && (user = (User) 00k.A0O(list, 0)) != null) {
            OJd oJd = oi2.A05;
            String obj = oi2.A07.toString();
            String id = user.getId();
            0qQ.A0B(obj, 0);
            0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(oJd.A00, "direct_persistent_menu"), "direct_thread_persistent_menu_click");
            if (A0e.isSampled()) {
                C66580MXl.A1J(A0e, obj);
                A0e.AAJ("business_id", id);
                A0e.AAJ("click_surface", A002);
                A0e.AAJ(C273654mx.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), str);
                A0e.Cgf();
            }
        }
    }
}

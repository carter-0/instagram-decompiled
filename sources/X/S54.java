package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class S54 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public final FragmentActivity A08;
    public final UserSession A09;
    public final String A0A;

    public final void A00() {
        long seconds = TimeUnit.MINUTES.toSeconds(10);
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        FragmentActivity fragmentActivity = this.A08;
        C10787Ry8 ry8 = new C10787Ry8(fragmentActivity);
        String str = this.A0A;
        Map map = ry8.A05;
        map.put(C273654mx.A00(77), str);
        ry8.A02.set(0);
        map.put("ad_id", this.A00);
        map.put(C273654mx.A00(44), this.A01);
        map.put("media_id", this.A02);
        List list = this.A07;
        if (list != null && !list.isEmpty()) {
            map.put(AnonymousClass000.A00(346), list);
        }
        map.put("prior_module", this.A03);
        map.put("shopping_session_id", this.A04);
        map.put("tracking_token", this.A06);
        map.put("layout_format", "MOBILE");
        1Eo.A05(r2.CO6(1759633843, 3), new C20589WvI(ry8, this, (AnonymousClass4D7) null, 3, seconds), AnonymousClass07a.A00(fragmentActivity));
    }

    public final void A01(String str) {
        if (str != null) {
            this.A07 = 00l.A0Q(str, new char[]{','}, 0);
        }
    }

    public S54(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A08 = fragmentActivity;
        this.A09 = userSession;
        this.A0A = str;
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public final class NMN extends C67620Mqs {
    public final /* synthetic */ C67614Mqm A00;

    public NMN(C67614Mqm mqm) {
        this.A00 = mqm;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C67614Mqm mqm = this.A00;
        mqm.A08.A02();
        FragmentActivity fragmentActivity = mqm.A03;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type android.content.Context");
        String str = mqm.A0A;
        Map map = mqm.A0C;
        0qQ.A0C(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        C359638dF.A00(fragmentActivity, new C359618dD(mqm.A06), str, (String) null, map, 0).A9V(new C71876OsJ(mqm, 2));
    }
}

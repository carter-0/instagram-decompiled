package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class PRC implements G6U {
    public final /* synthetic */ NKQ A00;

    public PRC(NKQ nkq) {
        this.A00 = nkq;
    }

    public final void EvR(View view, String str) {
        NKQ nkq = this.A00;
        ODR odr = nkq.A02;
        if (odr == null) {
            0qQ.A0F("threadDetailsTooltip");
            throw AnonymousClass00P.createAndThrow();
        }
        N4P n4p = nkq.A0A;
        if (n4p != null) {
            UserSession userSession = odr.A01;
            if (AnonymousClass7TE.A0q(userSession).getBoolean("should_show_tool_tip_new_moderators_in_broadcast_channel", true) && C329997La.A01(userSession, n4p)) {
                NdO ndO = new NdO(odr, 0);
                Map map = odr.A02;
                if (!map.containsKey(str)) {
                    AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(odr.A00, str);
                    A0f.A03(view);
                    A0f.A01();
                    A0f.A0A = true;
                    A0f.A04 = ndO;
                    AnonymousClass5Gv A002 = A0f.A00();
                    AnonymousClass7TF.A0D().postDelayed(new PV3(A002), 500);
                    map.put(str, A002);
                }
            }
        }
    }
}

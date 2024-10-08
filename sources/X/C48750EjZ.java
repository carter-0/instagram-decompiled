package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.EjZ  reason: case insensitive filesystem */
public abstract class C48750EjZ {
    public static final void A00(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str) {
        String str2 = str;
        if (str != null) {
            XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
            if (xIGIGBoostDestination != null) {
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                BitSet A0w = DbS.A0w(3);
                UserSession userSession2 = userSession;
                String str3 = WGU.A00(userSession2).A03;
                0qQ.A07(str3);
                A1H.put("flow_id", str3);
                A0w.set(0);
                A1H.put("is_ctwa", Boolean.valueOf(AnonymousClass7TF.A1W(xIGIGBoostDestination2, XIGIGBoostDestination.WHATSAPP_MESSAGE)));
                A0w.set(1);
                A1H.put("media_igid", str2);
                A0w.set(2);
                if (A0w.nextClearBit(0) >= 3) {
                    C11844ShW shW = new C11844ShW("com.bloks.www.ig.boost.ctx.conversation_starters.configuration", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 30, true);
                    C307506Qj A00 = C48721Ej6.A00(userSession2, false);
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    WF5 wf5 = new WF5(new C17668Vbz((ULk) null, (C276544tV) null, (Integer) null, (Integer) null, fragmentActivity2.getString(2131953979), (String) null, (List) null, false, true), (C277014uI) null, (Boolean) null, (Integer) null);
                    0qQ.A0B(A00, 1);
                    shW.E0s(fragmentActivity2, wf5, A00);
                    return;
                }
                throw DbT.A0n();
            }
        }
    }
}

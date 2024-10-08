package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.VmL  reason: case insensitive filesystem */
public abstract class C18145VmL {
    public static final void A01(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(0);
        linkedHashMap.put("media_id", (Object) null);
        if (bitSet.nextClearBit(0) >= 0) {
            0sm A0E = 0Yt.A0E();
            C11844ShW shW = new C11844ShW(AnonymousClass000.A00(2825), (String) null, (String) null, 0Yt.A0B(linkedHashMap), A0E, 719983200, 0, true);
            C307506Qj A00 = C48721Ej6.A00(userSession, false);
            WF5 wf5 = new WF5((C17668Vbz) null, (C277014uI) null, (Boolean) null, (Integer) null);
            0qQ.A0B(A00, 1);
            shW.E0s(context, wf5, A00);
            return;
        }
        throw new IllegalStateException("Missing required params");
    }

    public static final void A00(Context context, Fragment fragment, FragmentActivity fragmentActivity, C18662VwK vwK, C16680UzG uzG, AnonymousClass0iw r13, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        boolean A1Y = C51970G9q.A1Y(userSession);
        String str3 = str;
        if (str == null) {
            return;
        }
        if (00p.A0k(str, Pxd.A00(778), A1Y)) {
            String queryParameter = DbT.A09(str).getQueryParameter("media_id");
            if (queryParameter != null) {
                C18138VmE.A00().A06(fragment, VA4.A00().A00(context, userSession, queryParameter, "ads_manager_highlights_hub"), r13);
                return;
            }
            return;
        }
        vwK.A0A("ads_manager_highlights_hub", W3M.A01(uzG), (String) null, (String) null);
        SUL sul = new SUL(fragmentActivity, userSession2, 2EG.A34, str3, A1Y);
        sul.A0S = str2;
        sul.A0A();
    }
}

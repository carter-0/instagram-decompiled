package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

public abstract class FCQ {
    public static final void A00(AnonymousClass4DH r4, AnonymousClass0aP r5, RegFlowExtras regFlowExtras, String str) {
        0qQ.A0B(r4, 1);
        FragmentActivity activity = r4.getActivity();
        if (activity != null) {
            C358248ab A0X = DbS.A0X(activity);
            A0X.A0q(str);
            A0X.A0H(new C50026FJl(33, (Object) r4, (Object) regFlowExtras, (Object) r5), 2131968772);
            DbT.A1V(A0X);
        }
    }

    public static final void A01(RegFlowExtras regFlowExtras, RegFlowExtras regFlowExtras2) {
        AnonymousClass7TG.A1N(regFlowExtras, regFlowExtras2);
        regFlowExtras2.A0t = regFlowExtras.A0t;
        regFlowExtras2.A0y = regFlowExtras.A0y;
        regFlowExtras2.A0G = regFlowExtras.A0G;
        regFlowExtras2.A0H = regFlowExtras.A0H;
    }

    public static final boolean A02(0lg r4) {
        0qQ.A0A(r4);
        if (DbV.A04(r4) == 0) {
            return false;
        }
        AnonymousClass9BG A01 = AnonymousClass9BG.A01(r4);
        Iterator it = A01.A01.BNz().iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Map map = A01.A02;
            if (map.get(A18) != null) {
                if (!A01.A05(A18)) {
                    return true;
                }
                if (A01.A07(A18) && ((AccountFamily) map.get(A18)).A03.size() < 4) {
                    return true;
                }
            }
        }
        return false;
    }
}

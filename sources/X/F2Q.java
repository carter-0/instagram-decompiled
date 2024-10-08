package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class F2Q {
    public final UserSession A00;
    public final F32 A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final 1Av A03;

    public final boolean A00(AnonymousClass4DH r8, Runnable runnable, String str, List list, boolean z) {
        UserSession userSession;
        0Tu r3;
        long j;
        if (str != null) {
            F32 f32 = this.A01;
            boolean A1b = AnonymousClass7TE.A1b(f32.A00(list));
            if (z) {
                if (A1b && f32.A01(list)) {
                    userSession = this.A00;
                    r3 = 0Tu.A05;
                    j = 36314133171276253L;
                }
            } else if (A1b && f32.A01(list)) {
                userSession = this.A00;
                r3 = 0Tu.A05;
                j = 36318294994589770L;
            }
            if (182.A06(r3, userSession, j)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                List A002 = f32.A00(list);
                ArrayList A0r = AnonymousClass7TG.A0r(A002);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    DbY.A1W(A0r, it);
                }
                A1E.put("user_ids_to_show", new JSONArray(A0r));
                A1E.put("is_igd_group_thread", Boolean.valueOf(z));
                HashMap A0m = DbY.A0m("params", DbT.A10(new JSONObject(AnonymousClass7TF.A0w("server_params", A1E))));
                this.A02.put(str, runnable);
                C360678ey A05 = C359988do.A05(userSession, "com.bloks.www.rp_wellbeing.precall_interstitial.router", A0m);
                E85.A00(A05, r8, runnable, this, 3);
                r8.schedule(A05);
                return true;
            }
        }
        return false;
    }

    public F2Q(1Av r2, UserSession userSession) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A03 = r2;
        this.A00 = userSession;
        this.A01 = new F32(r2);
    }
}

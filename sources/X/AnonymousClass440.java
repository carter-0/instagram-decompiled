package X;

import android.content.res.Resources;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.440  reason: invalid class name */
public final class AnonymousClass440 {
    public final 1Ng A00;
    public final UserSession A01;
    public final 2Dm A02;
    public final AnonymousClass441 A03 = AnonymousClass441.A02;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.57z] */
    public static void A00(AnonymousClass440 r14, String str, Map map) {
        if ("inactive".equals(str)) {
            Resources resources = C60960kU.A00.getResources();
            String string = resources.getString(2131959591);
            String string2 = resources.getString(2131959590);
            ? obj = new Object();
            obj.A03 = string;
            obj.A01 = string2;
            obj.A04 = false;
            for (Map.Entry entry : map.entrySet()) {
                Set set = (Set) entry.getValue();
                DirectThreadKey directThreadKey = (DirectThreadKey) entry.getKey();
                if (!set.isEmpty()) {
                    2Dr r5 = r14.A02;
                    ArrayList arrayList = new ArrayList(set);
                    2FW r4 = 2FW.A1M;
                    2Dr r3 = r5;
                    synchronized (r3) {
                        0qQ.A0B(directThreadKey, 0);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C254703su) it.next()).A17(r4, obj);
                        }
                        r3.A06.A00(new 2Kb(directThreadKey, AnonymousClass05K.A0N, (List) null, (List) null, arrayList, false));
                        2Dr.A0F(r3, r3.A0P(directThreadKey));
                    }
                    r5.EKE(directThreadKey);
                } else {
                    r14.A00.A00(new 2Kb(directThreadKey, AnonymousClass05K.A0j, (List) null, (List) null, (List) null, false));
                }
            }
        } else if (AppStateModule.APP_STATE_ACTIVE.equals(str)) {
            for (Map.Entry entry2 : map.entrySet()) {
                DirectThreadKey directThreadKey2 = (DirectThreadKey) entry2.getKey();
                String str2 = directThreadKey2.A00;
                if (str2 != null) {
                    Set set2 = (Set) entry2.getValue();
                    if (!set2.isEmpty()) {
                        C331247Qd.A01(r14.A01, str2, set2);
                    }
                    r14.A00.A00(new 2Kb(directThreadKey2, AnonymousClass05K.A0j, (List) null, (List) null, (List) null, false));
                }
            }
        }
    }

    public AnonymousClass440(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = 1bJ.A00(userSession);
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }
}

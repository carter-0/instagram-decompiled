package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class OX3 {
    public static final void A00(C58840Ae r2, String str, String str2, String str3, List list, Map map, boolean z) {
        0Aj A0d;
        int i;
        0qQ.A0B(list, 2);
        if (z) {
            A0d = C51969G9p.A0d(r2, "rp_client_reliability_critical_event");
            i = 373;
        } else {
            A0d = C51969G9p.A0d(r2, "rp_client_reliability_normal_event");
            i = 374;
        }
        1Ln r22 = new 1Ln(A0d, i);
        if (DbT.A1Y(r22)) {
            r22.A0l(str);
            r22.A0S("tags", list);
            if (map != null) {
                r22.A00.A9H("event_data", map);
            }
            if (str2 != null) {
                r22.A0R("local_call_id", str2);
            }
            if (str3 != null) {
                r22.A0R("shared_call_id", str3);
            }
            r22.Cgf();
        }
    }

    public static final void A02(FoaUserSession foaUserSession, String str, String str2, String str3, List list, Map map, boolean z) {
        List A0a;
        UserSession A00;
        String str4 = str;
        List list2 = list;
        AnonymousClass7TG.A1N(str, list);
        C71004OWb oWb = C71004OWb.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Reliability event:\n");
        A1A.append(str);
        A1A.append("\nlocalCallId=");
        String str5 = str2;
        A1A.append(str2);
        A1A.append("\nsharedCallId=");
        String str6 = str3;
        A1A.append(str3);
        Map map2 = map;
        oWb.A00("RpAnalyticsLog", AnonymousClass7TG.A0m(map, "\neventData=", A1A));
        OAY oay = OAY.A01;
        if (oay == null) {
            oay = new OAY();
            OAY.A01 = oay;
        }
        List list3 = oay.A00;
        synchronized (list3) {
            A0a = 00k.A0a(list3);
        }
        Iterator it = A0a.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onReliabilityEvent");
        } else if (foaUserSession != null && (A00 = C56316HwT.A00(foaUserSession)) != null) {
            A00(AnonymousClass0kN.A02(A00), str4, str5, str6, list2, map2, z);
        }
    }

    public static final void A01(C69425NlA nlA, FoaUserSession foaUserSession, String str, String str2, Map map) {
        A02(foaUserSession, nlA.A00, str, str2, nlA.A01, map, true);
    }
}

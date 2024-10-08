package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Vye  reason: case insensitive filesystem */
public abstract class C18709Vye {
    public static final ConcurrentMap A00;

    static {
        17j r1 = new 17j();
        r1.A03(8);
        A00 = r1.A00();
    }

    public static final String A00(String str, String str2, String str3) {
        Object[] objArr;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (str2 == null) {
            objArr = new Object[]{"0", str5};
            str4 = "{\"%s\":\"%s\"}";
        } else if (str3 != null) {
            objArr = new Object[]{"0", str5, RealtimeSubscription.GRAPHQL_MQTT_VERSION, str6, "2", str3};
            str4 = "{\"%s\":\"%s\", \"%s\":\"%s\", \"%s\":\"%s\"}";
        } else {
            objArr = new Object[]{"0", str5, RealtimeSubscription.GRAPHQL_MQTT_VERSION, str2};
            str4 = "{\"%s\":\"%s\", \"%s\":\"%s\"}";
        }
        return 0mp.A06(str4, objArr);
    }

    public static final void A01(C17587Vaf vaf) {
        String str = vaf.A02;
        C18544Vtw vtw = C18544Vtw.A01;
        C18027Vk5 A002 = vtw.A00(str);
        if (vaf.A05 || A002 == null) {
            vtw.A00.remove(str);
            ConcurrentMap concurrentMap = A00;
            if (concurrentMap.containsKey(str)) {
                C17587Vaf vaf2 = (C17587Vaf) concurrentMap.get(str);
                if (vaf2 != null) {
                    vaf2.A04.addAll(vaf.A04);
                    return;
                }
                return;
            }
            concurrentMap.put(str, vaf);
            C239133Fc r2 = new C239133Fc(D1J.class, "LeadGenDeepLinkQuery", A00(str, vaf.A03, vaf.A01), true);
            C239123Fb A01 = C46479Dfi.A01(vaf.A00);
            A01.A09(r2);
            A01.A08 = "lead_gen_policy";
            1OC A07 = A01.A07(AnonymousClass05K.A00);
            A07.A00 = new C15612Ufe(str, vaf, 5);
            1ES.A06(A07, 236, true);
            return;
        }
        Iterator it = vaf.A04.iterator();
        while (it.hasNext()) {
            C20955X6i x6i = (C20955X6i) JTR.A10(it);
            if (x6i != null) {
                x6i.DoP(A002, true);
            }
        }
    }
}

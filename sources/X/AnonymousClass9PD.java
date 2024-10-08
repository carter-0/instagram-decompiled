package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9PD  reason: invalid class name */
public final class AnonymousClass9PD implements C337287g2 {
    public final Map A00 = new ConcurrentHashMap(AnonymousClass7TE.A1E());

    public final void A9x(C15050ULg uLg, String str, List list) {
        A9v(uLg, new AnonymousClass9P5(AnonymousClass05K.A0C, (Integer) null, (Object) null, (String) null, (String) null, (String) null, list, (List) null, false, false, true));
    }

    public final void A9y(AnonymousClass9P5 r2, String str) {
        0qQ.A0B(str, 0);
        A00(r2, str, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    }

    public final void A9z(String str, String str2, List list) {
        boolean A1U = AnonymousClass7TF.A1U(0, str, list);
        A9y(new AnonymousClass9P5(AnonymousClass05K.A0C, (Integer) null, (Object) null, (String) null, (String) null, (String) null, list, (List) null, false, false, A1U), str);
    }

    public final AnonymousClass9P5 BiX(String str) {
        String str2;
        String str3;
        Object obj;
        String str4;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        List list2;
        String str5 = str;
        0qQ.A0B(str5, 0);
        Map map = (Map) this.A00.get(str5);
        if (map != null) {
            if (map.get(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) != null) {
                AnonymousClass9P5 r3 = (AnonymousClass9P5) map.get(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                if (r3 != null) {
                    return r3;
                }
            } else {
                AnonymousClass9P5 r2 = (AnonymousClass9P5) map.get(00k.A09(map.keySet()));
                Integer num = AnonymousClass05K.A0C;
                Collection<AnonymousClass9P5> values = map.values();
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (AnonymousClass9P5 r0 : values) {
                    if (r0 == null || (list2 = r0.A06) == null) {
                        list2 = 0sn.A00;
                    }
                    018.A16(list2, A1C);
                }
                Integer num2 = null;
                if (r2 != null) {
                    str2 = r2.A03;
                    str3 = r2.A04;
                    obj = r2.A02;
                    str4 = r2.A05;
                    list = r2.A07;
                    num2 = r2.A00;
                    z = r2.A08;
                    z2 = r2.A09;
                    z3 = r2.A0A;
                } else {
                    str2 = null;
                    str3 = null;
                    obj = null;
                    str4 = null;
                    list = null;
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                return new AnonymousClass9P5(num, num2, obj, str2, str3, str4, A1C, list, z, z2, z3);
            }
        }
        return AnonymousClass9PC.A00();
    }

    public final void A00(AnonymousClass9P5 r17, String str, String str2) {
        List list;
        AnonymousClass9P5 r4 = r17;
        String str3 = str;
        0qQ.A0B(str3, 0);
        Map map = this.A00;
        synchronized (map) {
            Object obj = map.get(str3);
            if (obj == null) {
                obj = AnonymousClass7TE.A1H();
                map.put(str3, obj);
            }
            String str4 = str2;
            AnonymousClass9P5 r0 = (AnonymousClass9P5) ((Map) obj).get(str4);
            if (!(r0 == null || (list = r0.A06) == null)) {
                ArrayList A1D = AnonymousClass7TE.A1D(list);
                List list2 = r4.A06;
                if (list2 != null) {
                    A1D.addAll(list2);
                }
                Integer num = AnonymousClass05K.A0C;
                String str5 = r4.A03;
                String str6 = r4.A04;
                r4 = new AnonymousClass9P5(num, r4.A00, r4.A02, str5, str6, r4.A05, A1D, r4.A07, r4.A08, r4.A09, r4.A0A);
            }
            Map map2 = (Map) map.get(str3);
            if (map2 != null) {
                map2.put(str4, r4);
            }
        }
    }

    public final void A9v(C15050ULg uLg, AnonymousClass9P5 r4) {
        String str = uLg.A01;
        String str2 = uLg.A00;
        if (str2 == null) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        A00(r4, str, str2);
    }

    public final AnonymousClass9P5 BiW(C15050ULg uLg) {
        AnonymousClass9P5 r0;
        Map map = (Map) this.A00.get(uLg.A01);
        if (map != null) {
            String str = uLg.A00;
            if (!(map.get(str) == null || (r0 = (AnonymousClass9P5) map.get(str)) == null)) {
                return r0;
            }
        }
        return AnonymousClass9PC.A00();
    }

    public final void clear() {
        this.A00.clear();
    }
}

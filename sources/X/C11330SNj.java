package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SNj  reason: case insensitive filesystem */
public final class C11330SNj {
    public Integer A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public C11330SNj(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, long j) {
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = map;
        this.A02 = str5;
        this.A07 = str6;
        this.A01 = (j + TimeUnit.SECONDS.toMillis((long) i)) - 10000;
        this.A00 = num;
    }

    public static C11330SNj A00(C11024S6b s6b, Integer num, String str, String str2, long j) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = s6b.A06.iterator();
        while (true) {
            long j2 = j;
            if (it.hasNext()) {
                S5f s5f = (S5f) it.next();
                A1E.put(s5f.A01, new C10259RpJ(s5f.A00, j2));
            } else {
                String str3 = s6b.A05;
                str3.getClass();
                String str4 = s6b.A02;
                String str5 = s6b.A03;
                String str6 = s6b.A04;
                str6.getClass();
                return new C11330SNj(num, str3, str4, str5, str6, str, str2, A1E, s6b.A00, j2);
            }
        }
    }

    public static C11330SNj A01(Integer num, String str, String str2, String str3, String str4, List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        for (Object put : list) {
            A1E.put(put, new C10259RpJ(Integer.MAX_VALUE, System.currentTimeMillis()));
        }
        return new C11330SNj(num, "", str, "LOCAL", str2, str4, str3, A1E, Integer.MAX_VALUE, System.currentTimeMillis());
    }
}

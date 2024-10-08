package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5vD  reason: invalid class name and case insensitive filesystem */
public final class C299455vD {
    public final C299435v9 A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final Map A04 = new LinkedHashMap();

    public C299455vD(C299435v9 r2, Integer num, String str, List list) {
        0qQ.A0B(num, 3);
        this.A00 = r2;
        this.A03 = list;
        this.A01 = num;
        this.A02 = str;
    }

    public final void A00(String str, String str2, String str3) {
        Integer num;
        C299435v9 r11;
        List list;
        long j;
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.A04;
        String str4 = str;
        int i = -1;
        int i2 = 0;
        Integer num2 = null;
        String str5 = str2;
        String str6 = str3;
        if (!map.containsKey(str4)) {
            r11 = this.A00;
            list = this.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(((1Xj) it.next()).getId(), str4)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                num2 = Integer.valueOf(i);
                num = Integer.valueOf(list.size());
                r11.EGg(num2, num, str4, str5, str6, C292845jc.A00(this.A01), this.A02, z);
                map.put(str4, Long.valueOf(currentTimeMillis));
            }
            num = null;
            r11.EGg(num2, num, str4, str5, str6, C292845jc.A00(this.A01), this.A02, z);
            map.put(str4, Long.valueOf(currentTimeMillis));
        }
        Number number = (Number) map.get(str4);
        if (number != null) {
            j = number.longValue();
        } else {
            j = 0;
        }
        if (currentTimeMillis - j > TimeUnit.SECONDS.toMillis(60)) {
            r11 = this.A00;
            z = true;
            list = this.A03;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (0qQ.A0K(((1Xj) it2.next()).getId(), str4)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                num2 = Integer.valueOf(i);
                num = Integer.valueOf(list.size());
                r11.EGg(num2, num, str4, str5, str6, C292845jc.A00(this.A01), this.A02, z);
                map.put(str4, Long.valueOf(currentTimeMillis));
            }
            num = null;
            r11.EGg(num2, num, str4, str5, str6, C292845jc.A00(this.A01), this.A02, z);
            map.put(str4, Long.valueOf(currentTimeMillis));
        }
        return;
        i = i2;
        num2 = Integer.valueOf(i);
        num = Integer.valueOf(list.size());
        r11.EGg(num2, num, str4, str5, str6, C292845jc.A00(this.A01), this.A02, z);
        map.put(str4, Long.valueOf(currentTimeMillis));
    }
}

package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Bm  reason: invalid class name and case insensitive filesystem */
public final class C374959Bm {
    public final Map A00;

    public C374959Bm(AnonymousClass9BS r7) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        if (r7 != null) {
            String str = r7.A01;
            if (!str.equals("-1")) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    try {
                        arrayList.add(Integer.valueOf(Integer.parseInt(split[i])));
                        i++;
                    } catch (NumberFormatException unused) {
                        arrayList.clear();
                    }
                }
                if (arrayList.contains(31784979)) {
                    hashMap.put(31784979, new Object());
                }
                if (arrayList.contains(31784974)) {
                    hashMap.put(31784974, new Object());
                }
                if (arrayList.contains(31784962)) {
                    hashMap.put(31784962, new Object());
                }
                if (arrayList.contains(17301505)) {
                    hashMap.put(17301505, new Object());
                }
                if (r7.A04) {
                    hashMap.put(31784971, new Object());
                }
                if (r7.A09) {
                    hashMap.put(31784972, new Object());
                }
            }
        }
    }
}

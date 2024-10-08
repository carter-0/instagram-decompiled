package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.64J  reason: invalid class name */
public final class AnonymousClass64J {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public static final void A00(Status status, AnonymousClass64J r5, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = r5.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = r5.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).A08(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C365498nD) entry2.getKey()).A02(new RKT(status));
            }
        }
    }
}

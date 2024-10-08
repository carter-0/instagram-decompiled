package X;

import java.util.HashMap;

/* renamed from: X.69E  reason: invalid class name */
public abstract class AnonymousClass69E {
    public static final HashMap A00 = new HashMap();

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.0Js] */
    public static final AnonymousClass69F A00(String str) {
        AnonymousClass69F r0;
        if (str != null) {
            HashMap hashMap = A00;
            if (!hashMap.containsKey(str)) {
                try {
                    if (!09i.A0A.A0A(new Object(), (0Jv) null, new C66625MZm(str), str)) {
                        0wj.A01.EFR(216072193, "NotificationJourneyTrackerProvider: Failed to run user session operation to get intended user session");
                    }
                } catch (Exception e) {
                    0wj.A01.EFR(216072193, 002.A0R("NotificationJourneyTrackerProvider: Exception while attempting to get intended user session: ", e.getMessage()));
                }
            }
            Boolean bool = (Boolean) hashMap.get(str);
            if (bool == null) {
                0wj.A01.EFR(216072193, "NotificationJourneyTrackerProvider: Failed to get sampling value for user. Defaulting to true");
            } else if (!bool.booleanValue()) {
                r0 = PIP.A00;
                return r0;
            }
        }
        r0 = C66596MYi.A01;
        return r0;
    }
}

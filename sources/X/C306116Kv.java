package X;

/* renamed from: X.6Kv  reason: invalid class name and case insensitive filesystem */
public final class C306116Kv {
    public final C306106Ku A00(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("handsfree") || str.equals("hands-free")) {
            return C306106Ku.HANDS_FREE;
        }
        for (C306106Ku r1 : C306106Ku.values()) {
            if (0qQ.A0K(r1.A00, str)) {
                return r1;
            }
        }
        0wb.A03("ReelCaptureType", 002.A0R("unknown server value, please add to the enum: ", str));
        return C306106Ku.UNKNOWN;
    }
}

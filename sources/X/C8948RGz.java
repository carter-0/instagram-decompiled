package X;

/* renamed from: X.RGz  reason: case insensitive filesystem */
public enum C8948RGz {
    NO_ERROR(0),
    UNKNOWN(1),
    API_DISABLED(2),
    ILLEGAL_ARGUMENT(3),
    ILLEGAL_STATE(4),
    INTERNAL_ERROR(5),
    NETWORK_FAILURE(6),
    UNKNOWN_APP_VERSION(7),
    UNKNOWN_MODULES(8);
    
    public final int A00;

    /* access modifiers changed from: public */
    C8948RGz(int i) {
        this.A00 = i;
    }

    public static void A00(int i) {
        C8948RGz[] values = values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            if (values[i2].A00 != i) {
                i2++;
            } else {
                return;
            }
        }
        0KC.A09(C8948RGz.class, "Invalid Reason: %d", AnonymousClass7TF.A1b(i));
    }
}

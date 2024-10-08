package X;

/* renamed from: X.98s  reason: invalid class name and case insensitive filesystem */
public enum C3742498s implements AnonymousClass97P {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    public final int A00;

    public static C3742498s A00(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    /* access modifiers changed from: public */
    C3742498s(int i) {
        this.A00 = i;
    }
}

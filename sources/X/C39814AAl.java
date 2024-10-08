package X;

/* renamed from: X.AAl  reason: case insensitive filesystem */
public abstract class C39814AAl {
    public static final float A00(C306396Lz r2, float f) {
        int ordinal = r2.ordinal();
        float f2 = 0.8f;
        if (ordinal != 0) {
            f2 = 0.3f;
            if (!(ordinal == 1 || ordinal == 2)) {
                if (ordinal == 3) {
                    f2 = 0.15f;
                } else if (ordinal == 4) {
                    return 0.0f;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
        return f * f2;
    }

    public static final float A01(C306396Lz r2, float f) {
        int ordinal = r2.ordinal();
        float f2 = 1.2f;
        if (ordinal != 0) {
            f2 = 0.5f;
            if (!(ordinal == 1 || ordinal == 2)) {
                if (ordinal == 3) {
                    f2 = 0.25f;
                } else if (ordinal == 4) {
                    return 0.0f;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
        return f * f2;
    }
}

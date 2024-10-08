package X;

/* renamed from: X.5i4  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C291905i4 {
    public static long A01(C268034ce r3, float f) {
        float B77;
        AnonymousClass5QJ A00;
        AnonymousClass5QH r2 = AnonymousClass5QH.A00;
        if (r3.B77() < 1.03f || (A00 = r2.A00(r3.B77())) == null) {
            B77 = f / r3.B77();
        } else {
            B77 = A00.AJw(f);
        }
        return AnonymousClass5Z7.A00(B77, 4294967296L);
    }

    public static float A00(C268034ce r5, long j) {
        float f;
        if (AnonymousClass5Z5.A01(j) == 4294967296L) {
            AnonymousClass5QH r2 = AnonymousClass5QH.A00;
            if (r5.B77() >= 1.03f) {
                AnonymousClass5QJ A00 = r2.A00(r5.B77());
                f = AnonymousClass5Z5.A00(j);
                if (A00 != null) {
                    return A00.AK0(f);
                }
            } else {
                f = AnonymousClass5Z5.A00(j);
            }
            return f * r5.B77();
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}

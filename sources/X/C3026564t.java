package X;

/* renamed from: X.64t  reason: invalid class name and case insensitive filesystem */
public abstract class C3026564t {
    public static final Object A00(AnonymousClass4D7 r3, 0sP r4) {
        AnonymousClass5PR r2 = (AnonymousClass5PR) r3.getContext().get(AnonymousClass5PR.A00);
        if (r2 != null) {
            return r2.FNV(r3, new J6M(r4, 20));
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object A01(AnonymousClass4D7 r2, 0sP r3) {
        AnonymousClass5PR r0 = (AnonymousClass5PR) r2.getContext().get(AnonymousClass5PR.A00);
        if (r0 != null) {
            return r0.FNV(r2, r3);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}

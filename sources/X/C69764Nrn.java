package X;

/* renamed from: X.Nrn  reason: case insensitive filesystem */
public abstract class C69764Nrn {
    public static final C69427NlX A00(int i) {
        long j = (long) i;
        for (C69427NlX nlX : C69427NlX.values()) {
            Long valueOf = Long.valueOf(nlX.A00);
            if (valueOf != null && valueOf.longValue() == j) {
                return nlX;
            }
        }
        return null;
    }
}

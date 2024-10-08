package X;

/* renamed from: X.5bQ  reason: invalid class name and case insensitive filesystem */
public final class C288135bQ implements C288095bM {
    public final long AIn(long j, long j2) {
        float min;
        if (C288025bF.A02(j) > C288025bF.A02(j2) || C288025bF.A00(j) > C288025bF.A00(j2)) {
            min = Math.min(C288025bF.A02(j2) / C288025bF.A02(j), C288025bF.A00(j2) / C288025bF.A00(j));
        } else {
            min = 1.0f;
        }
        return C289115d2.A00(min, min);
    }
}

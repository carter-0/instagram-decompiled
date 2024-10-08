package X;

/* renamed from: X.Htr  reason: case insensitive filesystem */
public abstract class C56163Htr {
    public static final float A00(GZF gzf) {
        AnonymousClass6Gj r3 = C51970G9q.A0Q(gzf.A0C).A09;
        AnonymousClass6Gj r2 = AnonymousClass6Gj.Horizontal;
        long j = ((C289295dM) gzf.A0X.getValue()).A00;
        if (r3 == r2) {
            return C289295dM.A01(j);
        }
        return C289295dM.A02(j);
    }

    public static final boolean A01(GZF gzf) {
        boolean z = C51970G9q.A0Q(gzf.A0C).A0H;
        if (A00(gzf) > 0.0f && z) {
            return true;
        }
        if (A00(gzf) > 0.0f || z) {
            return false;
        }
        return true;
    }
}

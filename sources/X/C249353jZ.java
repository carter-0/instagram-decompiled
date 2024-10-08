package X;

/* renamed from: X.3jZ  reason: invalid class name and case insensitive filesystem */
public final class C249353jZ implements AnonymousClass3TK {
    public final /* synthetic */ 2V5 A00;
    public final /* synthetic */ 2V5 A01;
    public final /* synthetic */ 2V5 A02;
    public final /* synthetic */ C249243jM A03;

    public C249353jZ(2V5 r1, 2V5 r2, 2V5 r3, C249243jM r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public final void CvC() {
        0sP r1 = this.A03.A03;
        if (r1 != null) {
            r1.invoke(true);
        }
    }

    public final void CvR(boolean z, float f) {
        2V5 r0 = this.A01;
        Float valueOf = Float.valueOf(f);
        r0.A00(valueOf);
        this.A02.A00(valueOf);
        2V5 r1 = this.A00;
        if (!z) {
            f = 1.0f;
        }
        r1.A00(Float.valueOf(f));
    }
}

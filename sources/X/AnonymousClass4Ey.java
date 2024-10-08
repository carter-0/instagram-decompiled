package X;

/* renamed from: X.4Ey  reason: invalid class name */
public final class AnonymousClass4Ey extends C262564Ez {
    public final void A01(float f) {
        A04(new AnonymousClass4F2(f));
    }

    public final void A02(float f) {
        A05(new AnonymousClass4F2(f));
    }

    public final void A04(AnonymousClass4F3 r3) {
        AnonymousClass4F1 r0 = this.A01;
        if (r0 == null || r0.A00 != AnonymousClass05K.A01) {
            throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
        }
        this.A03 = r3;
    }

    public final void A05(AnonymousClass4F3 r3) {
        AnonymousClass4F1 r0 = this.A01;
        if (r0 == null || r0.A00 != AnonymousClass05K.A01) {
            throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
        }
        this.A04 = r3;
    }

    public final void A03(C246053du r3) {
        A00();
        this.A01 = new AnonymousClass4F1(AnonymousClass05K.A01, r3);
    }

    public final void A06(C246053du... r3) {
        A00();
        this.A01 = new AnonymousClass4F1(AnonymousClass05K.A00, r3);
    }
}

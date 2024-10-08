package X;

/* renamed from: X.4FI  reason: invalid class name */
public final class AnonymousClass4FI implements AnonymousClass4FJ {
    public final /* synthetic */ 2Vn A00;

    public AnonymousClass4FI(2Vn r1) {
        this.A00 = r1;
    }

    public final C2812256k Abf(AnonymousClass56X r3) {
        return ((AnonymousClass56W) ((AnonymousClass4FK) this.A00.A02.A02.get(r3.A00)).A07.get(r3.A01)).A01;
    }

    public final float AuS(AnonymousClass56X r4) {
        2VS r0;
        C246053du r2 = r4.A01;
        AnonymousClass4FK r1 = (AnonymousClass4FK) this.A00.A02.A02.get(r4.A00);
        AnonymousClass56W r02 = (AnonymousClass56W) r1.A07.get(r2);
        if (r02 != null) {
            return r02.A01.A00;
        }
        if (r1.A00 == 0) {
            r0 = r1.A03;
        } else {
            r0 = r1.A01;
        }
        if (r0 != null) {
            return r2.AWv((AnonymousClass2VT) r0.A02());
        }
        throw new RuntimeException("Both LayoutOutputs were null!");
    }
}

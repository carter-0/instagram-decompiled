package X;

/* renamed from: X.4VQ  reason: invalid class name */
public final class AnonymousClass4VQ extends AnonymousClass0T0 implements AnonymousClass4VR {
    public final long A00;
    public final AnonymousClass4UC A01;
    public final AnonymousClass4VT A02;
    public final AnonymousClass4VS A03;

    public AnonymousClass4VQ(AnonymousClass4UC r3) {
        AnonymousClass4VT r0;
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A03 = new AnonymousClass4VS(r3.A08);
        AnonymousClass4VK r1 = r3.A07;
        if (r1 != null) {
            r0 = new AnonymousClass4VT(r1);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A00 = (long) r3.A01;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4VQ) && 0qQ.A0K(this.A01, ((AnonymousClass4VQ) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}

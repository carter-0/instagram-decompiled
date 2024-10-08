package X;

/* renamed from: X.56a  reason: invalid class name */
public abstract class AnonymousClass56a extends C2811456b {
    public final C2811956h A00;

    public AnonymousClass56a() {
        C2811556c r1 = C2811556c.A08;
        if (r1 == null) {
            AnonymousClass56d r0 = new AnonymousClass56d();
            r1 = new C2811556c(r0);
            C2811556c.A08 = r1;
            r0.A01 = r1;
        }
        C2811956h r2 = new C2811956h(r1);
        this.A00 = r2;
        C2812156j r12 = new C2812156j(this);
        if (r2.A00 != null) {
            throw new RuntimeException("Overriding existing listener!");
        }
        r2.A00 = r12;
    }
}

package X;

/* renamed from: X.Den  reason: case insensitive filesystem */
public final class C46426Den implements AnonymousClass4D6 {
    public final Integer A00;
    public final AnonymousClass4D6 A01;

    public final void schedule(AnonymousClass11X r4) {
        C46428Dep dep;
        AnonymousClass4D6 r2 = this.A01;
        if (r4 != null) {
            dep = new C46428Dep(r4, this.A00);
        } else {
            dep = null;
        }
        r2.schedule(dep);
    }

    public C46426Den(AnonymousClass4D6 r1, Integer num) {
        this.A01 = r1;
        this.A00 = num;
    }

    public final void schedule(AnonymousClass11X r8, int i, int i2, boolean z, boolean z2) {
        C46428Dep dep;
        AnonymousClass4D6 r1 = this.A01;
        if (r8 != null) {
            dep = new C46428Dep(r8, this.A00);
        } else {
            dep = null;
        }
        r1.schedule(dep, i, i2, z, z2);
    }
}

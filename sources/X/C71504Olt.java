package X;

/* renamed from: X.Olt  reason: case insensitive filesystem */
public final class C71504Olt implements 2YM {
    public final OVH A00;
    public final C262094Cc A01;
    public final C62320sa A02;
    public final C62320sa A03;

    public C71504Olt(OVH ovh, C262094Cc r3, C62320sa r4, C62320sa r5) {
        0qQ.A0B(ovh, 1);
        this.A00 = ovh;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C53033GhO.class)) {
            return new C53033GhO(this.A00, this.A01, this.A02, this.A03);
        }
        throw C51973G9u.A0g(cls, Pxd.A00(72), AnonymousClass7TE.A1A());
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }
}

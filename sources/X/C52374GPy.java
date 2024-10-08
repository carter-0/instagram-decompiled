package X;

/* renamed from: X.GPy  reason: case insensitive filesystem */
public final class C52374GPy implements C288935cj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C52374GPy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public final void dispose() {
        if (this.A00 != 0) {
            AnonymousClass6I1 r1 = (AnonymousClass6I1) this.A03;
            ((AnonymousClass6JC) this.A02).A00(r1.A02);
            r1.A01.remove(this.A01);
            return;
        }
        Object obj = this.A03;
        ((AnonymousClass6HD) this.A01).remove(obj);
        ((IES) this.A02).A02.A07(obj);
    }
}

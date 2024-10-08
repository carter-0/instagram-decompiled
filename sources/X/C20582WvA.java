package X;

/* renamed from: X.WvA  reason: case insensitive filesystem */
public final class C20582WvA<E> extends 0Yz<E> implements AnonymousClass62P<E> {
    public int A00;
    public final int A01;
    public final AnonymousClass62P A02;

    public C20582WvA(AnonymousClass62P r2, int i, int i2) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A01 = i;
        AnonymousClass6BV.A02(i, i2, r2.size());
        this.A00 = i2 - i;
    }

    public final int A08() {
        return this.A00;
    }

    /* renamed from: Eyg */
    public final C20582WvA subList(int i, int i2) {
        AnonymousClass6BV.A02(i, i2, this.A00);
        AnonymousClass62P r2 = this.A02;
        int i3 = this.A01;
        return new C20582WvA(r2, i + i3, i3 + i2);
    }

    public final Object get(int i) {
        AnonymousClass6BV.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }
}

package X;

import java.util.List;

public final class Wv9<E> extends 0Yz<E> implements AnonymousClass6HH<E> {
    public int A00;
    public final int A01;
    public final AnonymousClass6HH A02;

    public final int A08() {
        return this.A00;
    }

    public final Object get(int i) {
        C18664VwM.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        C18664VwM.A02(i, i2, this.A00);
        AnonymousClass6HH r2 = this.A02;
        int i3 = this.A01;
        return new Wv9(r2, i + i3, i3 + i2);
    }

    public Wv9(AnonymousClass6HH r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        C18664VwM.A02(i, i2, r2.size());
        this.A00 = i2 - i;
    }
}

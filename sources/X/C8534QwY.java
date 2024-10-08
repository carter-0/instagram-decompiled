package X;

/* renamed from: X.QwY  reason: case insensitive filesystem */
public final class C8534QwY extends C8535QwZ {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C8535QwZ A02;

    public final int size() {
        return this.A01;
    }

    public C8534QwY(C8535QwZ qwZ, int i, int i2) {
        this.A02 = qwZ;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C11306SKs.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}

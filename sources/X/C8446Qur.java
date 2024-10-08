package X;

/* renamed from: X.Qur  reason: case insensitive filesystem */
public final class C8446Qur extends C8448Qut {
    public final transient C8448Qut A00;

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final Object get(int i) {
        C8448Qut qut = this.A00;
        SKo.A01(i, qut.size());
        return qut.get(Pxe.A0A(qut) - i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C8446Qur(C8448Qut qut) {
        this.A00 = qut;
    }
}

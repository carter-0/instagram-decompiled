package X;

/* renamed from: X.Qv3  reason: case insensitive filesystem */
public final class C8458Qv3 extends TM0 {
    public static final Object A01 = Pxe.A0p();
    public Object A00;

    public final boolean hasNext() {
        return C51969G9p.A1a(this.A00, A01);
    }

    public final Object next() {
        Object obj = this.A00;
        Object obj2 = A01;
        if (obj != obj2) {
            this.A00 = obj2;
            return obj;
        }
        throw Pxe.A1C();
    }
}

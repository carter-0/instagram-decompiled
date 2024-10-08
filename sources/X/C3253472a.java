package X;

/* renamed from: X.72a  reason: invalid class name and case insensitive filesystem */
public final class C3253472a implements AnonymousClass2gO {
    public int A00 = -1;
    public final 2Fk A01;
    public final AnonymousClass2gO A02;

    public final void onChanged(Object obj) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.onChanged(obj);
        }
    }

    public C3253472a(2Fk r2, AnonymousClass2gO r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}

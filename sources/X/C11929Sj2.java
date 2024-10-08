package X;

/* renamed from: X.Sj2  reason: case insensitive filesystem */
public final class C11929Sj2 implements C13698TfG {
    public final C10172Rnn A00;

    public final C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        return new C10528Rth(new C11853Shf(obj), new C11887SiM(this.A00, obj.toString()));
    }

    public C11929Sj2(C10172Rnn rnn) {
        this.A00 = rnn;
    }

    public final boolean CJT(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}

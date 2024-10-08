package X;

/* renamed from: X.RKd  reason: case insensitive filesystem */
public abstract class C8987RKd extends Exception {
    public final CharSequence A00;
    public final String A01;

    public final String A00() {
        if (this instanceof QB0) {
            return ((QB0) this).A00;
        }
        if (this instanceof C7396QAz) {
            return ((C7396QAz) this).A00;
        }
        return this.A01;
    }

    public C8987RKd(String str, CharSequence charSequence) {
        super(DbX.A0t(charSequence));
        this.A01 = str;
        this.A00 = charSequence;
    }
}

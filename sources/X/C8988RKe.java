package X;

/* renamed from: X.RKe  reason: case insensitive filesystem */
public abstract class C8988RKe extends Exception {
    public final CharSequence A00;
    public final String A01;

    public final String A01() {
        if (this instanceof QB7) {
            return ((QB7) this).A00;
        }
        if (this instanceof QB6) {
            return ((QB6) this).A00;
        }
        return this.A01;
    }

    public C8988RKe(String str, CharSequence charSequence) {
        super(DbX.A0t(charSequence));
        this.A01 = str;
        this.A00 = charSequence;
    }
}

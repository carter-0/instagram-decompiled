package X;

public abstract class RKQ extends Exception {
    public final CharSequence A00;

    public RKQ(CharSequence charSequence) {
        super(DbX.A0t(charSequence));
        this.A00 = charSequence;
    }
}

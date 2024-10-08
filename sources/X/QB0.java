package X;

public abstract class QB0 extends C8987RKd {
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QB0(String str, CharSequence charSequence) {
        super(str, charSequence);
        0qQ.A0B(str, 1);
        this.A00 = str;
        if (str.length() <= 0) {
            throw AnonymousClass7TE.A0w("type must not be empty");
        }
    }
}

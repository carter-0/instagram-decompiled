package X;

/* renamed from: X.RtM  reason: case insensitive filesystem */
public final class C10507RtM {
    public final CharSequence A00;
    public final CharSequence A01;
    public final String A02;

    public C10507RtM(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A01 = charSequence;
        this.A00 = charSequence2;
        this.A02 = str;
        if (charSequence.length() <= 0) {
            throw AnonymousClass7TE.A0w("userId should not be empty");
        }
    }
}

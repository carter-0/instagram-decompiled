package X;

/* renamed from: X.NqI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C69696NqI {
    public static /* synthetic */ String A00(CharSequence charSequence, CharSequence[] charSequenceArr) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int length = charSequenceArr.length;
        if (length > 0) {
            A1A.append(charSequenceArr[0]);
            for (int i = 1; i < length; i++) {
                A1A.append(charSequence);
                A1A.append(charSequenceArr[i]);
            }
        }
        return A1A.toString();
    }
}

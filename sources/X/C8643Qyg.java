package X;

import java.util.Arrays;

/* renamed from: X.Qyg  reason: case insensitive filesystem */
public final class C8643Qyg extends C12614Szy {
    public final char[] A00;

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return A09(((Character) obj).charValue());
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("CharMatcher.anyOf(\"");
        for (char A02 : this.A00) {
            A16.append(C12614Szy.A02(A02));
        }
        return AnonymousClass7TF.A0l("\")", A16);
    }

    public C8643Qyg(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.A00 = charArray;
        Arrays.sort(charArray);
    }
}

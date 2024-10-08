package X;

import android.text.Spanned;

public abstract class A1O {
    public static final boolean A00(Spanned spanned, String str) {
        0qQ.A0B(spanned, 1);
        String obj = spanned.toString();
        if (!str.equals(obj)) {
            if (str.equalsIgnoreCase(obj)) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    if (str.charAt(i) == spanned.charAt(i) || ((AnonymousClass91T[]) spanned.getSpans(i, i + 1, AnonymousClass91T.class)).length != 0) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }
}

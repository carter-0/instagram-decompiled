package X;

import android.content.Context;

public abstract class LIL {
    public static String A00(Context context, C268654dm r3) {
        Object A00;
        if (!(r3 == null || (A00 = r3.A00()) == null)) {
            AnonymousClass1XT r1 = (AnonymousClass1XT) A00;
            if (r1.getErrorMessage() != null) {
                return r1.getErrorMessage();
            }
        }
        return context.getString(2131972232);
    }

    public static String A01(String str) {
        String trim = str.trim();
        if (trim.length() <= 0 || trim.matches(AnonymousClass000.A00(491))) {
            return trim;
        }
        return 002.A0R(AnonymousClass000.A00(3246), trim);
    }
}

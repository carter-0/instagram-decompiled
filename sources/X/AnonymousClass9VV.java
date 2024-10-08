package X;

import java.util.Locale;

/* renamed from: X.9VV  reason: invalid class name */
public abstract class AnonymousClass9VV {
    public static final String A00(char c) {
        String valueOf = String.valueOf(c);
        0qQ.A0C(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        0qQ.A07(upperCase);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        0qQ.A07(substring);
        String lowerCase = substring.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return 002.A0D(lowerCase, charAt);
    }
}

package X;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.Rmw  reason: case insensitive filesystem */
public abstract class C10120Rmw {
    public static final Pattern A00 = Pattern.compile("\\\\an(\\d+)");
    public static final Pattern A01 = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern A02;
    public static final Pattern A03;

    static {
        Locale locale = Locale.US;
        A03 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        A02 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
    }
}

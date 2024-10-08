package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.A2c  reason: case insensitive filesystem */
public abstract class C39612A2c {
    public static final Map A00 = AnonymousClass7TE.A1E();
    public static final Map A01 = AnonymousClass7TE.A1E();

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        for (C21260XRf xRf : C21260XRf.values()) {
            String replace = xRf.toString().replace("_", "");
            Locale locale = Locale.US;
            A1E.put(replace.toUpperCase(locale), xRf);
            A01.put(xRf.toString().toUpperCase(locale), xRf);
        }
        for (AnonymousClass8LN r2 : AnonymousClass8LN.values()) {
            Object obj = A1E.get(r2.toString().toUpperCase(Locale.US));
            if (obj != null) {
                A00.put(obj, r2);
            }
        }
    }
}

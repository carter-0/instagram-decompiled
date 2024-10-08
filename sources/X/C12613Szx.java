package X;

import java.util.Locale;

/* renamed from: X.Szx  reason: case insensitive filesystem */
public final class C12613Szx implements 1UV {
    public static final C12613Szx A00 = new C12613Szx();

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.US;
        0qQ.A08(locale);
        return 00l.A0d(DbT.A12(locale, str), ".mtk.", false);
    }
}

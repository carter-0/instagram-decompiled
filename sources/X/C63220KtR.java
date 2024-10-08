package X;

import java.util.LinkedHashMap;

/* renamed from: X.KtR  reason: case insensitive filesystem */
public abstract class C63220KtR {
    public static final LinkedHashMap A00(String str, String str2) {
        LinkedHashMap A07 = 0Yt.A07(DbW.A1b("source_type", str));
        if (str2 != null) {
            A07.put("reason", str2);
        }
        return A07;
    }
}

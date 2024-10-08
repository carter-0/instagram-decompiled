package X;

import java.util.ArrayList;

/* renamed from: X.Hav  reason: case insensitive filesystem */
public abstract class C55024Hav {
    public static final ArrayList A00(String str) {
        0tX A01 = 0xn.A01(1An.A1U.toString());
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        do {
            String string = A01.getString(002.A0W("switcher_overflow_recent_search_", str, '_', i), (String) null);
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                A1C.add(string);
            }
            i++;
        } while (i < 3);
        return A1C;
    }
}

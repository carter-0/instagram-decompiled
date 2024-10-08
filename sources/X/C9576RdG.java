package X;

import android.content.res.Resources;
import java.util.Locale;

/* renamed from: X.RdG  reason: case insensitive filesystem */
public abstract class C9576RdG {
    public static final boolean A00(Resources resources) {
        Locale locale = resources.getConfiguration().locale;
        return 03t.A0O(locale.getLanguage(), new String[]{new Locale("hi").getLanguage(), new Locale("th").getLanguage(), new Locale("uk").getLanguage()});
    }
}

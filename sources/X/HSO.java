package X;

import android.os.Build;
import android.text.style.SuggestionRangeSpan;

public abstract class HSO {
    public static boolean A00(Object obj) {
        if (Build.VERSION.SDK_INT >= 33) {
            return obj instanceof SuggestionRangeSpan;
        }
        if (obj == null || !obj.getClass().getName().equals("android.text.style.SuggestionRangeSpan")) {
            return false;
        }
        return true;
    }
}

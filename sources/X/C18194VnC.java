package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VnC  reason: case insensitive filesystem */
public abstract class C18194VnC {
    public static final String A00(List list) {
        0qQ.A0B(list, 0);
        if (list.size() != 1) {
            return "global";
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
        0qQ.A0B(directThreadKey, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            return Pxg.A0v("media-thread-%s", Locale.US, new Object[]{str}, 1);
        }
        return "global";
    }

    public static final String A01(List list) {
        0qQ.A0B(list, 0);
        if (list.size() != 1) {
            return "global";
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
        0qQ.A0B(directThreadKey, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            return Pxg.A0v("thread-%s", Locale.US, new Object[]{str}, 1);
        }
        return "global";
    }
}

package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.96X  reason: invalid class name */
public final class AnonymousClass96X {
    public int A00 = 0;
    public final AnonymousClass96R A01;
    public final Map A02 = new 01r(0);

    public static final String A00(AnonymousClass96X r3) {
        String string;
        AnonymousClass96R r32 = r3.A01;
        synchronized (r32) {
            string = r32.A01.getString("topic_operation_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    public AnonymousClass96X(AnonymousClass96R r3) {
        this.A01 = r3;
    }
}

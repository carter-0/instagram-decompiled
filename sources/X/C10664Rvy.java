package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.Rvy  reason: case insensitive filesystem */
public final class C10664Rvy {
    public Context A00;
    public QLA A01;
    public boolean A02;
    public boolean A03;

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            return -1;
        } catch (NumberFormatException unused) {
        }
    }
}

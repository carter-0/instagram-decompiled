package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.42j  reason: invalid class name and case insensitive filesystem */
public final class C2596142j extends Pair {
    public static final C2596142j A00 = new Pair("", "");

    /* JADX WARNING: type inference failed for: r0v3, types: [android.util.Pair, X.42j] */
    public static C2596142j A00(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return A00;
        }
        return new Pair(str, str2);
    }
}

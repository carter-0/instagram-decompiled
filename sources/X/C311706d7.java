package X;

import android.os.Bundle;

/* renamed from: X.6d7  reason: invalid class name and case insensitive filesystem */
public abstract class C311706d7 {
    public static final Boolean A00(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        return null;
    }
}

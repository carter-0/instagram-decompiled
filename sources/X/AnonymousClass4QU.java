package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.4QU  reason: invalid class name */
public abstract class AnonymousClass4QU {
    public static boolean A00(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        return TextUtils.isEmpty(uri.getScheme()) || "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
    }
}

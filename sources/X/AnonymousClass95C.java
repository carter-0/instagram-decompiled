package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;

/* renamed from: X.95C  reason: invalid class name */
public final class AnonymousClass95C {
    public static final String[] A00 = {"braille", "accessibility", "talkback", "quran", "islam"};

    public static final String A00(Context context, InputMethodInfo inputMethodInfo, InputMethodSubtype inputMethodSubtype) {
        String str;
        ServiceInfo serviceInfo;
        ApplicationInfo applicationInfo = null;
        if (inputMethodInfo != null) {
            try {
                str = inputMethodInfo.getPackageName();
            } catch (NullPointerException unused) {
                return "display_name_null";
            }
        } else {
            str = null;
        }
        if (!(inputMethodInfo == null || (serviceInfo = inputMethodInfo.getServiceInfo()) == null)) {
            applicationInfo = serviceInfo.applicationInfo;
        }
        CharSequence displayName = inputMethodSubtype.getDisplayName(context, str, applicationInfo);
        0qQ.A07(displayName);
        String obj = displayName.toString();
        if (obj == null) {
            return "";
        }
        return obj;
    }
}

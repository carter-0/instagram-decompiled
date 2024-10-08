package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4Vn  reason: invalid class name */
public abstract class AnonymousClass4Vn {
    public static final AnonymousClass5J2 A01() {
        String group;
        String str;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion) && apiVersion != null && !00l.A0W(apiVersion)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            if (matcher.group(4) != null) {
                                str = matcher.group(4);
                            } else {
                                str = "";
                            }
                            0qQ.A09(str);
                            return new AnonymousClass5J2(parseInt, parseInt2, str, parseInt3);
                        }
                    }
                }
            }
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        return null;
    }

    public static final IBinder A00(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static final SidecarInterface A02(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
}

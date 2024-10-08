package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import java.util.Iterator;
import java.util.List;

public abstract class SCN {
    public static final List A00 = 0sr.A1P(new String[]{"com.android.chrome", "com.chrome.beta", "com.google.android.googlequicksearchbox", "com.sec.android.app.sbrowser", "org.mozilla.firefox", "com.opera.mini.native", "com.microsoft.emmx", "com.opera.browser"});

    public static final boolean A00(Context context, Uri uri, AnonymousClass0wW r7) {
        0qQ.A0B(context, 1);
        try {
            Intent addCategory = Pxe.A0F(uri).addCategory("android.intent.category.BROWSABLE");
            0qQ.A07(addCategory);
            if (r7 instanceof UserSession) {
                ExternalBrowserLauncher externalBrowserLauncher = new ExternalBrowserLauncher(context, (UserSession) r7);
                addCategory.addFlags(268468224);
                C10710Rwo A01 = externalBrowserLauncher.A01(uri);
                if (A01 != null) {
                    addCategory.setPackage(A01.A01);
                    if (0kR.A0D(context, addCategory)) {
                        return true;
                    }
                }
            }
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                it.next();
                if (0kR.A0D(context, addCategory)) {
                    return true;
                }
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.DeadObjectException;
import android.webkit.WebView;
import com.facebook.browser.lite.BrowserLiteInMainProcessIntentService;

public abstract class S8C {
    public static boolean A01(Context context) {
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                context.getPackageManager().getPackageInfo(currentWebViewPackage.packageName, 0);
                return true;
            }
        } catch (Exception e) {
            0KC.A0H("BrowserLiteIntentServiceHelper", "Checking for WebView package failed", e);
        }
        return false;
    }

    public static void A00(Context context, String str) {
        Class<BrowserLiteInMainProcessIntentService> cls = BrowserLiteInMainProcessIntentService.class;
        Intent A0A = C66580MXl.A0A(context, cls);
        A0A.putExtra("EXTRA_ACTION", str);
        try {
            02C.enqueueWork(context, cls, 560821342, A0A);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                return;
            }
            if (!(e instanceof IllegalArgumentException) || !String.valueOf(e.getMessage()).contains("No such service")) {
                throw e;
            }
            0KC.A0F("BrowserLiteInMainProcessIntentService", "Could not enqueue work", e);
        } catch (SecurityException unused) {
        }
    }
}

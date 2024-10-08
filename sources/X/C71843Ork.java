package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.instagram.bugreporter.rageshake.common.image.ImageCacheBugReportLogsProvider$lifecycleCallbacks$1;
import java.lang.ref.WeakReference;

/* renamed from: X.Ork  reason: case insensitive filesystem */
public final class C71843Ork implements AnonymousClass28l {
    public static C71843Ork A02;
    public static final C70854OOj A03 = new Object();
    public WeakReference A00;
    public final Application.ActivityLifecycleCallbacks A01;

    public final String getFilenamePrefix() {
        return "image_cache_state_log";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final String getTag() {
        return "ImageCacheBugReportLogsProvider";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public C71843Ork(Context context) {
        ImageCacheBugReportLogsProvider$lifecycleCallbacks$1 imageCacheBugReportLogsProvider$lifecycleCallbacks$1 = new ImageCacheBugReportLogsProvider$lifecycleCallbacks$1(this);
        this.A01 = imageCacheBugReportLogsProvider$lifecycleCallbacks$1;
        Context applicationContext = context.getApplicationContext();
        0qQ.A0C(applicationContext, AnonymousClass000.A00(29));
        ((Application) applicationContext).registerActivityLifecycleCallbacks(imageCacheBugReportLogsProvider$lifecycleCallbacks$1);
    }

    public final String getContentInBackground(Context context) {
        Activity activity;
        View findViewById;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Disk Cache Journal:\n");
        A1A.append("=========================\n\n");
        A1A.append("Memory Cache Content:\n");
        A1A.append("=========================\n\n");
        A1A.append("Image Views On Screen:\n");
        A1A.append("=========================\n\n");
        WeakReference weakReference = this.A00;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || (findViewById = activity.findViewById(16908290)) == null) {
            A1A.append("Couldn't get views hierarchy");
        } else {
            C70854OOj.A00(findViewById, A03, A1A);
        }
        return A1A.toString();
    }
}

package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class SF1 {
    public final ComponentName A00;
    public final Context A01;
    public final ICustomTabsService A02;
    public final /* synthetic */ SVM A03;

    public SF1(ComponentName componentName, Context context, ICustomTabsService iCustomTabsService, SVM svm) {
        this.A03 = svm;
        this.A02 = iCustomTabsService;
        this.A00 = componentName;
        this.A01 = context;
    }

    public static String A00(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Intent A0G = Pxe.A0G("android.support.customtabs.action.CustomTabsService");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            A0G.setPackage(A18);
            if (packageManager.resolveService(A0G, 0) != null) {
                return A18;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }
}

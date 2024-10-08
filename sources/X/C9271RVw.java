package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.TosAcceptedFlag;

/* renamed from: X.RVw  reason: case insensitive filesystem */
public abstract class C9271RVw {
    public static void A00(Context context, boolean z) {
        Class<TosAcceptedFlag> cls = TosAcceptedFlag.class;
        try {
            context.getPackageManager().getPackageInfo("com.facebook.appmanager", 0);
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            ContentResolver contentResolver = context.getContentResolver();
            ComponentName componentName = new ComponentName(context, cls);
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                AnonymousClass1SF r0 = new AnonymousClass1SF(context, context.getPackageManager());
                if (z && r0.A01(2)) {
                    ContentValues contentValues = new ContentValues();
                    Pxe.A1K(contentValues, "terms_of_service_accepted", 1);
                    try {
                        int update = contentResolver.update(Pxh.A0I(packageName), contentValues, (String) null, (String[]) null);
                        if (update != 1) {
                            throw new Exception(002.A0O("Expected 1 row changed, actually ", update));
                        }
                    } catch (IllegalArgumentException e) {
                        throw new Exception("Could not resolve content uri for firstparty settings", e);
                    } catch (Throwable th) {
                        throw new Exception("Unexpected failure.", th);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}

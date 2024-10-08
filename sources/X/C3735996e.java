package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: X.96e  reason: invalid class name and case insensitive filesystem */
public final class C3735996e {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final C3735295v A03;

    public C3735996e(Context context, C3735295v r6, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.A01 = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(002.A0R("com.google.firebase.common.prefs:", str), 0);
        this.A02 = sharedPreferences;
        this.A03 = r6;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = this.A01;
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A00 = z;
    }
}

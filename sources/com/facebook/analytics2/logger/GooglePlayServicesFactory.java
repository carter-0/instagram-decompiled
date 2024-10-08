package com.facebook.analytics2.logger;

import X.0KC;
import X.1v1;
import X.C41845B3m;
import X.Pxe;
import X.QJ0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class GooglePlayServicesFactory {
    public static final String TAG = "GooglePlayServicesFactory";

    public static boolean canLoadUploaderService() {
        try {
            Class.forName("com.facebook.analytics2.logger.GooglePlayUploadService");
            return true;
        } catch (ClassNotFoundException e) {
            0KC.A0N(TAG, "Can't class load GooglePlayUploadService %s, className: %s", e, new Object[]{"com.facebook.analytics2.logger.GooglePlayUploadService"});
            return false;
        }
    }

    public static boolean canUseGooglePlayServices(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return false;
            }
            return bundle.containsKey("com.google.android.gms.version");
        } catch (PackageManager.NameNotFoundException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public static 1v1 createUploadSchedulerImpl(Context context) {
        if (canLoadUploaderService() && canUseGooglePlayServices(context)) {
            if (Pxe.A05(context, GoogleApiAvailability.A00) != 0) {
                boolean z = GooglePlayServicesUtil.A00;
            } else {
                Class<GooglePlayUploadService> cls = GooglePlayUploadService.class;
                synchronized (cls) {
                    if (!GooglePlayUploadService.A01) {
                        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 1, 1);
                        GooglePlayUploadService.A01 = true;
                    }
                }
                return new QJ0(context);
            }
        }
        return null;
    }
}

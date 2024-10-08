package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

public final class SQn {
    public static final SQn A06 = new Object();
    public int A00;
    public RDH A01;
    public SFR A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public static int A00(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            return (serviceInfoArr == null || serviceInfoArr.length == 0) ? -1 : 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static final synchronized void A01(Context context, SQn sQn) {
        RuntimeException runtimeException;
        synchronized (sQn) {
            if (!sQn.A05) {
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle.containsKey("com.google.ar.core")) {
                        sQn.A04 = DbU.A0l(bundle, "com.google.ar.core").equals("required");
                        if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                            sQn.A00 = bundle.getInt("com.google.ar.core.min_apk_version");
                            sQn.A05 = true;
                        } else {
                            runtimeException = new RuntimeException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                        }
                    } else {
                        runtimeException = new RuntimeException("Application manifest must contain meta-data com.google.ar.core");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    runtimeException = new RuntimeException("Could not load application package metadata", e);
                }
                throw runtimeException;
            }
        }
    }
}

package com.facebook.appcomponentmanager;

import X.02C;
import X.0KC;
import X.0ah;
import X.11u;
import X.AnonymousClass000;
import X.AnonymousClass0LC;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.OHC;
import X.SPl;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AppComponentManagerService extends 02C {
    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.facebook.appcomponentmanager.AppComponentManagerService] */
    public final void onHandleWork(Intent intent) {
        0ah r0;
        intent.getAction();
        if ("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS".equals(intent.getAction())) {
            try {
                11u.A03(this);
                Intent intent2 = new Intent("com.facebook.appcomponentmanager.ENABLING_CMPS_DONE");
                intent2.setPackage(getPackageName());
                sendBroadcast(intent2);
            } catch (RuntimeException e) {
                e = e;
                0KC.A0F("AppComponentManagerService", "Exception while enabling components. Aborting.", e);
                synchronized (AnonymousClass0LC.class) {
                    r0 = AnonymousClass0LC.A00;
                    if (r0 == null) {
                        return;
                    }
                    r0.A00(e);
                }
            }
        } else if ("com.facebook.appcomponentmanager.ACTION_EFNORCE_MANIFEST_CONSISTENCY".equals(intent.getAction())) {
            PackageManager packageManager = getPackageManager();
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.add("activity");
            A1F.add(AnonymousClass000.A00(2576));
            A1F.add("receiver");
            A1F.add("service");
            A1F.add("provider");
            Set unmodifiableSet = Collections.unmodifiableSet(A1F);
            File A0t = AnonymousClass7TE.A0t(getApplicationInfo().sourceDir);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
                OHC A00 = SPl.A00(A0t, unmodifiableSet);
                int i = packageInfo.versionCode;
                String num = Integer.toString(i);
                String str = A00.A01;
                if (!num.equals(str) || !packageInfo.versionName.equals(A00.A02) || !packageInfo.packageName.equals(A00.A00)) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("PackageInfo{package=");
                    A1A.append(packageInfo.packageName);
                    A1A.append(",");
                    A1A.append("versionCode=");
                    A1A.append(i);
                    A1A.append(",");
                    A1A.append("versionName=");
                    A1A.append(packageInfo.versionName);
                    A1A.append("} ,");
                    A1A.append("Manifest{package=");
                    A1A.append(A00.A00);
                    A1A.append(", ");
                    A1A.append("versionCode=");
                    A1A.append(str);
                    A1A.append(", ");
                    A1A.append("versionName=");
                    A1A.append(A00.A02);
                    A1A.append(", ");
                    A1A.append("activities=");
                    A1A.append(A00.A03.size());
                    A1A.append(", ");
                    A1A.append("receivers=");
                    A1A.append(A00.A05.size());
                    A1A.append(", ");
                    A1A.append("services=");
                    A1A.append(A00.A06.size());
                    A1A.append(", ");
                    A1A.append("providers=");
                    A1A.append(A00.A04.size());
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l("}", A1A));
                }
            } catch (Throwable th) {
                e = th;
                synchronized (AnonymousClass0LC.class) {
                    r0 = AnonymousClass0LC.A00;
                    if (r0 == null) {
                        0KC.A0F("AppComponentManagerService", "enforceManifestConsistency failed", e);
                        return;
                    }
                    r0.A00(e);
                }
            }
        }
    }
}

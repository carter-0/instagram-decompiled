package com.google.android.gms.auth.api.signin.internal;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C241663Qd;
import X.C241713Ql;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.IInterface;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.p002authapi.zbb;

public final class zbt extends zbb implements IInterface {
    public final Context A00;

    public zbt(Context context) {
        this();
        int A03 = AnonymousClass0fD.A03(-1740762173);
        this.A00 = context;
        AnonymousClass0fD.A0A(1516754252, A03);
    }

    public static final void A00(zbt zbt) {
        int A03 = AnonymousClass0fD.A03(-618800924);
        Context context = zbt.A00;
        int callingUid = Binder.getCallingUid();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C241663Qd.A00(context).A00.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(callingUid, "com.google.android.gms");
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    C241713Ql A002 = C241713Ql.A00(context);
                    if (packageInfo != null) {
                        if (!C241713Ql.A01(packageInfo, false)) {
                            if (C241713Ql.A01(packageInfo, true)) {
                                Context context2 = A002.A00;
                                if (!GooglePlayServicesUtil.A00) {
                                    try {
                                        PackageInfo packageInfo2 = C241663Qd.A00(context2).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                        C241713Ql.A00(context2);
                                        if (packageInfo2 == null || C241713Ql.A01(packageInfo2, false) || !C241713Ql.A01(packageInfo2, true)) {
                                            GooglePlayServicesUtil.A01 = false;
                                        } else {
                                            GooglePlayServicesUtil.A01 = true;
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                    } catch (Throwable th) {
                                        GooglePlayServicesUtil.A00 = true;
                                        throw th;
                                    }
                                    GooglePlayServicesUtil.A00 = true;
                                }
                                if (!GooglePlayServicesUtil.A01 && PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE)) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                }
                            }
                        }
                        AnonymousClass0fD.A0A(1404781098, A03);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.isLoggable("UidVerifier", 3);
                }
                SecurityException securityException = new SecurityException(002.A0c("Calling UID ", " is not Google Play services.", Binder.getCallingUid()));
                AnonymousClass0fD.A0A(-1834771666, A03);
                throw securityException;
            }
            throw AnonymousClass7TE.A11("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused2) {
        }
    }

    public zbt() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        AnonymousClass0fD.A0A(-808983721, AnonymousClass0fD.A03(144710946));
    }
}

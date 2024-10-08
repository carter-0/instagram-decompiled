package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzd;
import com.google.android.gms.internal.auth.zze;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public abstract class STr {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final S22 A01 = new S22("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A01(AnonymousClass9GD r5, String str) {
        try {
            return C3736896n.A00(r5);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RKT) {
                throw cause;
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            A01.A00(format, new Object[0]);
            throw Pxe.A0c(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            A01.A00(format2, new Object[0]);
            throw Pxe.A0c(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            A01.A00(format3, new Object[0]);
            throw Pxe.A0c(format3, e3);
        }
    }

    public static TokenData A00(Context context, Bundle bundle) {
        C8909RFc rFc;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        C8909RFc[] values = C8909RFc.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                rFc = C8909RFc.A0J;
                break;
            }
            rFc = values[i];
            if (rFc.A00.equals(string)) {
                break;
            }
            i++;
        }
        S22 s22 = A01;
        s22.A00(String.format("[GoogleAuthUtil] error status:%s with method:%s", new Object[]{rFc, "getTokenWithDetails"}), new Object[0]);
        if (C8909RFc.A0H.equals(rFc) || C8909RFc.A0K.equals(rFc) || C8909RFc.A0L.equals(rFc) || C8909RFc.A0M.equals(rFc) || C8909RFc.A0I.equals(rFc) || C8909RFc.A0N.equals(rFc) || C8909RFc.A0B.equals(rFc) || C8909RFc.A03.equals(rFc) || C8909RFc.A04.equals(rFc) || C8909RFc.A05.equals(rFc) || C8909RFc.A06.equals(rFc) || C8909RFc.A07.equals(rFc) || C8909RFc.A08.equals(rFc) || C8909RFc.A0A.equals(rFc) || C8909RFc.A02.equals(rFc) || C8909RFc.A09.equals(rFc)) {
            SRH.A00(context);
            if (pendingIntent == null || intent == null) {
                boolean z = GooglePlayServicesUtil.A00;
                try {
                    int i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                    if (i2 >= 233800000 && pendingIntent == null) {
                        Pxh.A1L(s22.A01, String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Pxf.A1Y(Integer.valueOf(i2), "getTokenWithDetails", 233800000)), "Auth");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                }
                if (intent == null) {
                    Pxh.A1L(s22.A01, String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", new Object[]{string, "getTokenWithDetails"}), "Auth");
                }
                throw new UserRecoverableAuthException((PendingIntent) null, intent, RDP.LEGACY, string);
            }
            throw new UserRecoverableAuthException(pendingIntent, intent, RDP.AUTH_INSTANTIATION, string);
        } else if (C8909RFc.A0E.equals(rFc) || C8909RFc.A0F.equals(rFc) || C8909RFc.A0G.equals(rFc) || C8909RFc.A0C.equals(rFc) || C8909RFc.A0D.equals(rFc)) {
            throw JTO.A0u(string);
        } else {
            throw new Exception(string);
        }
    }

    public static void A03(Account account) {
        if (account == null) {
            throw AnonymousClass7TE.A0w("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int i = 0;
            while (!strArr[i].equals(account.type)) {
                i++;
                if (i >= 3) {
                    throw AnonymousClass7TE.A0w("Account type not supported");
                }
            }
        } else {
            throw AnonymousClass7TE.A0w("Account name cannot be empty!");
        }
    }

    public static void A06(Context context, String str) {
        Throwable th;
        Parcelable parcelable;
        AnonymousClass3Qk.A05("Calling this from your main thread can lead to deadlock");
        A04(context);
        Bundle A0a = AnonymousClass7TE.A0a();
        A05(context, A0a);
        SRH.A00(context);
        C12571Sxw.A01.A00.FP1();
        if (AnonymousClass7TE.A1a(SDI.A09.A02()) && A07(context)) {
            QpR qpR = new QpR(context);
            zzbw zzbw = new zzbw();
            zzbw.A00 = str;
            SHO A002 = SFC.A00();
            A002.A03 = new Feature[]{C10138RnF.A0C};
            A002.A01 = new SxS(qpR, zzbw);
            try {
                A01(SHO.A00(qpR, A002, 1513, 1), "clear token");
                return;
            } catch (RKT e) {
                A01.A00("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e));
            }
        }
        ComponentName componentName = A00;
        SVV svv = new SVV();
        AnonymousClass63a A003 = AnonymousClass63a.A00(context);
        try {
            if (A003.A03(svv, new AnonymousClass64V(componentName), "GoogleAuthUtil")) {
                try {
                    AnonymousClass3Qk.A05("BlockingServiceConnection.getService() called on main thread");
                    if (!svv.A00) {
                        svv.A00 = true;
                        zzd zzd = (zzd) zze.A00((IBinder) svv.A01.take());
                        int A03 = AnonymousClass0fD.A03(-563278640);
                        Parcel A004 = zzd.A00();
                        A004.writeString(str);
                        SMV.A00(A004, A0a);
                        Parcel A012 = zzd.A01(A004, 2);
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (A012.readInt() == 0) {
                            parcelable = null;
                        } else {
                            parcelable = (Parcelable) creator.createFromParcel(A012);
                        }
                        Bundle bundle = (Bundle) parcelable;
                        A012.recycle();
                        AnonymousClass0fD.A0A(-1304510792, A03);
                        if (bundle != null) {
                            String string = bundle.getString("Error");
                            if (bundle.getBoolean("booleanResult")) {
                                A003.A01(componentName, svv);
                                return;
                            }
                            th = new Exception(string);
                        } else {
                            A01.A00("Service call returned null.", Pxe.A1b());
                            th = JTO.A0u("Service unavailable.");
                        }
                    } else {
                        th = AnonymousClass7TE.A0z("Cannot call get on this connection more than once");
                    }
                    throw th;
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    throw Pxe.A0c("Error on service connection.", e2);
                } catch (Throwable th2) {
                    A003.A01(componentName, svv);
                    throw th2;
                }
            } else {
                throw JTO.A0u("Could not bind to service.");
            }
        } catch (SecurityException e3) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", Pxf.A1Z(e3)));
            throw Pxe.A0c("SecurityException while binding to Auth service.", e3);
        }
    }

    public static boolean A07(Context context) {
        if (GoogleApiAvailability.A00.A03(context, 17895000) == 0) {
            C12571Sxw.A01.A00.FP1();
            C13981TnX tnX = ((C8423QuE) SDI.A04.A02()).zzd;
            String str = context.getApplicationInfo().packageName;
            Iterator it = tnX.iterator();
            while (it.hasNext()) {
                if (AnonymousClass7TE.A18(it).equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String A02(Account account, Context context, String str) {
        TokenData tokenData;
        Throwable th;
        Parcelable parcelable;
        Bundle A0a = AnonymousClass7TE.A0a();
        A03(account);
        AnonymousClass3Qk.A05("Calling this from your main thread can lead to deadlock");
        AnonymousClass3Qk.A06(str, "Scope cannot be empty or null.");
        A03(account);
        A04(context);
        Bundle A0J = Pxe.A0J(A0a);
        A05(context, A0J);
        SRH.A00(context);
        C12571Sxw.A01.A00.FP1();
        if (AnonymousClass7TE.A1a(SDI.A09.A02()) && A07(context)) {
            QpR qpR = new QpR(context);
            AnonymousClass3Qk.A03(account, "Account name cannot be null!");
            AnonymousClass3Qk.A06(str, "Scope cannot be null!");
            SHO A002 = SFC.A00();
            A002.A03 = new Feature[]{C10138RnF.A0C};
            A002.A01 = new SxV(account, A0J, qpR, str);
            try {
                Bundle bundle = (Bundle) A01(SHO.A00(qpR, A002, 1512, 1), "token retrieval");
                if (bundle != null) {
                    tokenData = A00(context, bundle);
                    return tokenData.A01;
                }
                A01.A00("Service call returned null.", new Object[0]);
                throw JTO.A0u("Service unavailable.");
            } catch (RKT e) {
                A01.A00("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e));
            }
        }
        ComponentName componentName = A00;
        SVV svv = new SVV();
        AnonymousClass63a A003 = AnonymousClass63a.A00(context);
        try {
            if (A003.A03(svv, new AnonymousClass64V(componentName), "GoogleAuthUtil")) {
                try {
                    AnonymousClass3Qk.A05("BlockingServiceConnection.getService() called on main thread");
                    if (!svv.A00) {
                        svv.A00 = true;
                        zzd zzd = (zzd) zze.A00((IBinder) svv.A01.take());
                        int A03 = AnonymousClass0fD.A03(1500115526);
                        Parcel A004 = zzd.A00();
                        SMV.A00(A004, account);
                        A004.writeString(str);
                        SMV.A00(A004, A0J);
                        Parcel A012 = zzd.A01(A004, 5);
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (A012.readInt() == 0) {
                            parcelable = null;
                        } else {
                            parcelable = (Parcelable) creator.createFromParcel(A012);
                        }
                        Bundle bundle2 = (Bundle) parcelable;
                        A012.recycle();
                        AnonymousClass0fD.A0A(-1545798608, A03);
                        if (bundle2 != null) {
                            tokenData = A00(context, bundle2);
                            A003.A01(componentName, svv);
                            return tokenData.A01;
                        }
                        th = JTO.A0u("Service call returned null");
                    } else {
                        th = AnonymousClass7TE.A0z("Cannot call get on this connection more than once");
                    }
                    throw th;
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    throw Pxe.A0c("Error on service connection.", e2);
                } catch (Throwable th2) {
                    A003.A01(componentName, svv);
                    throw th2;
                }
            } else {
                throw JTO.A0u("Could not bind to service.");
            }
        } catch (SecurityException e3) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", Pxf.A1Z(e3)));
            throw Pxe.A0c("SecurityException while binding to Auth service.", e3);
        }
    }

    public static void A04(Context context) {
        Throwable th;
        try {
            Context applicationContext = context.getApplicationContext();
            boolean z = GooglePlayServicesUtil.A00;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.A00;
            int A03 = googleApiAvailabilityLight.A03(applicationContext, 8400000);
            if (A03 != 0) {
                Intent A04 = googleApiAvailabilityLight.A04(applicationContext, "e", A03);
                Log.e("GooglePlayServicesUtil", 002.A0O("GooglePlayServices not available due to error ", A03));
                if (A04 == null) {
                    th = new Exception();
                } else {
                    th = new C8343Qoz(A04, A03);
                }
                throw th;
            }
        } catch (C8343Qoz e) {
            throw new UserRecoverableAuthException((PendingIntent) null, new Intent(e.A00), RDP.LEGACY, e.getMessage());
        } catch (RKI | GooglePlayServicesIncorrectManifestValueException e2) {
            throw new Exception(e2.getMessage(), e2);
        }
    }

    public static void A05(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }
}

package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.Locale;
import org.webrtc.EglBase14Impl;

public abstract class SS0 {
    public static Locale A00;
    public static final 01r A01 = new 01r(0);

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6) {
        /*
            X.01r r3 = A01
            monitor-enter(r3)
            android.content.res.Configuration r0 = X.Pxf.A0G(r5)     // Catch:{ all -> 0x0068 }
            X.2Yd r0 = X.C9167RRs.A00(r0)     // Catch:{ all -> 0x0068 }
            r1 = 0
            X.2Yf r0 = r0.A00     // Catch:{ all -> 0x0068 }
            X.2Ye r0 = (X.2Ye) r0     // Catch:{ all -> 0x0068 }
            android.os.LocaleList r0 = r0.A00     // Catch:{ all -> 0x0068 }
            java.util.Locale r1 = r0.get(r1)     // Catch:{ all -> 0x0068 }
            java.util.Locale r0 = A00     // Catch:{ all -> 0x0068 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0023
            r3.clear()     // Catch:{ all -> 0x0068 }
            A00 = r1     // Catch:{ all -> 0x0068 }
        L_0x0023:
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x004e
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00     // Catch:{ all -> 0x0068 }
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0038 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r2 = r1.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            r4 = 0
            if (r2 == 0) goto L_0x004e
            java.lang.String r1 = "string"
            java.lang.String r0 = "com.google.android.gms"
            int r0 = r2.getIdentifier(r6, r1, r0)     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Missing resource: "
            X.Pxh.A1K(r0, r6, r1)     // Catch:{ all -> 0x0068 }
        L_0x004e:
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0062
        L_0x0050:
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x0068 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Got empty resource: "
            X.Pxh.A1K(r0, r6, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x004e
        L_0x0062:
            return r4
        L_0x0063:
            r3.put(r6, r1)     // Catch:{ all -> 0x0068 }
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            return r1
        L_0x0068:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0068 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS0.A03(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C241663Qd.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            i2 = 2131956449;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i == 9) {
                    i2 = 2131956454;
                } else if (i != 20) {
                    switch (i) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                            i2 = 2131956458;
                            break;
                        default:
                            i2 = 2131956453;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String A03 = A03(context, str);
                if (A03 == null) {
                    A03 = resources2.getString(2131956453);
                }
                return String.format(resources2.getConfiguration().locale, A03, new Object[]{A002});
            }
            i2 = 2131956446;
        } else if (DeviceProperties.A00(context)) {
            return resources.getString(2131956459);
        } else {
            i2 = 2131956456;
        }
        return AnonymousClass7TF.A0e(resources, A002, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r3.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        return A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        android.util.Log.e("GoogleApiAvailability", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r3 = r4.getResources()
            r2 = 0
            java.lang.String r1 = "GoogleApiAvailability"
            switch(r5) {
                case 1: goto L_0x0023;
                case 2: goto L_0x0027;
                case 3: goto L_0x002b;
                case 4: goto L_0x0013;
                case 5: goto L_0x0033;
                case 6: goto L_0x0013;
                case 7: goto L_0x003b;
                case 8: goto L_0x0014;
                case 9: goto L_0x0017;
                case 10: goto L_0x001a;
                case 11: goto L_0x001d;
                case 12: goto L_0x000a;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0020;
                case 17: goto L_0x0043;
                case 18: goto L_0x0013;
                case 19: goto L_0x000a;
                case 20: goto L_0x004b;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r0 = "Unexpected error code "
            java.lang.String r0 = X.002.A0O(r0, r5)
        L_0x0010:
            android.util.Log.e(r1, r0)
        L_0x0013:
            return r2
        L_0x0014:
            java.lang.String r0 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0010
        L_0x0017:
            java.lang.String r0 = "Google Play services is invalid. Cannot recover."
            goto L_0x0010
        L_0x001a:
            java.lang.String r0 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0010
        L_0x001d:
            java.lang.String r0 = "The application is not licensed to the user."
            goto L_0x0010
        L_0x0020:
            java.lang.String r0 = "One of the API components you attempted to connect to is not available."
            goto L_0x0010
        L_0x0023:
            r0 = 2131956450(0x7f1312e2, float:1.9549456E38)
            goto L_0x002e
        L_0x0027:
            r0 = 2131956457(0x7f1312e9, float:1.954947E38)
            goto L_0x002e
        L_0x002b:
            r0 = 2131956447(0x7f1312df, float:1.954945E38)
        L_0x002e:
            java.lang.String r2 = r3.getString(r0)
            return r2
        L_0x0033:
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "common_google_play_services_invalid_account_title"
            goto L_0x0052
        L_0x003b:
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "common_google_play_services_network_error_title"
            goto L_0x0052
        L_0x0043:
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "common_google_play_services_sign_in_failed_title"
            goto L_0x0052
        L_0x004b:
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "common_google_play_services_restricted_profile_title"
        L_0x0052:
            java.lang.String r2 = A03(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS0.A02(android.content.Context, int):java.lang.String");
    }
}

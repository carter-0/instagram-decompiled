package X;

import android.content.Context;
import com.facebook.common.util.JSONUtil;
import java.util.HashMap;

public final class S2J {
    public final Context A00;
    public final C10197RoD A01;
    public final C10198RoE A02;
    public final HashMap A03;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0478, code lost:
        if (r2 == null) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d5, code lost:
        if ("google_sdk".equals(android.os.Build.PRODUCT) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015f, code lost:
        if (r12.equals("") == false) goto L_0x0161;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ea A[SYNTHETIC, Splitter:B:103:0x02ea] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032b A[SYNTHETIC, Splitter:B:113:0x032b] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x024a A[EDGE_INSN: B:202:0x024a->B:80:0x024a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0230 A[Catch:{ SocketException -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S2J(android.content.Context r19) {
        /*
            r18 = this;
            r5 = 1
            r8 = r19
            X.0qQ.A0B(r8, r5)
            r9 = r18
            r9.<init>()
            X.RoD r0 = new X.RoD
            r0.<init>(r8)
            r9.A01 = r0
            r9.A00 = r8
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            android.content.Context r7 = r0.A00
            java.lang.String r0 = "MobileCompVersion"
            java.lang.String r1 = "1.0.0"
            r4.put(r0, r1)
            java.lang.String r0 = "MobileConfVersion"
            r4.put(r0, r1)
            java.util.concurrent.atomic.AtomicReference r11 = X.C9929Rji.A00
            java.lang.Object r2 = r11.get()
            if (r2 != 0) goto L_0x0048
            r1 = 0
            java.lang.String r0 = "did"
            android.content.SharedPreferences r10 = r7.getSharedPreferences(r0, r1)
            r6 = 0
            java.lang.String r3 = "id"
            java.lang.String r2 = r10.getString(r3, r6)
            if (r2 == 0) goto L_0x01fb
            boolean r0 = X.1FH.A00(r6, r2, r11)
            if (r0 != 0) goto L_0x0048
            java.lang.Object r2 = r11.get()
        L_0x0048:
            java.lang.String r0 = "MobileAppGuid"
            r4.put(r0, r2)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r6 = "android.hardware.telephony"
            boolean r0 = r0.hasSystemFeature(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "MobileDeviceCanSendText"
            r4.put(r3, r0)
            java.util.TimeZone r11 = java.util.TimeZone.getDefault()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            boolean r0 = r11.inDaylightTime(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileDayLightSavingsTimeEnabled"
            r4.put(r0, r2)
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r2 = "android_id"
            java.lang.String r10 = android.provider.Settings.Secure.getString(r0, r2)
            java.lang.String r0 = "MobileDeviceId"
            r4.put(r0, r10)
            java.lang.String r10 = android.os.Build.FINGERPRINT
            java.lang.String r12 = "generic"
            boolean r0 = r10.startsWith(r12)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "unknown"
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r10 = "google_sdk"
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r13 = android.os.Build.MODEL
            java.lang.String r0 = "Emulator"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "Android SDK built for x86"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r13 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Genymotion"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.startsWith(r12)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r0 = r0.startsWith(r12)
            if (r0 != 0) goto L_0x00d7
        L_0x00ce:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r10 = r10.equals(r0)
            r0 = 0
            if (r10 == 0) goto L_0x00d8
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileDeviceIsEmulator"
            r4.put(r0, r10)
            java.lang.String r0 = "/system/app/Superuser.apk"
            boolean r0 = X.JTQ.A1Z(r0)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r10 = android.os.Build.TAGS
            if (r10 == 0) goto L_0x01ad
            java.lang.String r0 = "test-keys"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01ad
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileDeviceJailBroken"
            r4.put(r0, r10)
            boolean r10 = r11.inDaylightTime(r1)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r10 = r11.getDisplayName(r10, r5, r0)
            java.lang.String r0 = "MobileDeviceLocalTimezone"
            r4.put(r0, r10)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            r10 = 0
            java.util.Locale r0 = r0.get(r10)
            java.lang.String r12 = r0.getCountry()
            java.lang.String r0 = "MobileDeviceLocaleCountry"
            r4.put(r0, r12)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            java.util.Locale r0 = r0.get(r10)
            java.lang.String r12 = r0.getLanguage()
            java.lang.String r0 = "MobileDeviceLocaleLanguage"
            r4.put(r0, r12)
            java.lang.String r12 = android.os.Build.DEVICE
            java.lang.String r0 = "MobileDeviceName"
            r4.put(r0, r12)
            java.lang.String r12 = "MobileOSType"
            java.lang.String r0 = "Android"
            r4.put(r12, r0)
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r12 = java.lang.System.getProperty(r0)
            if (r12 == 0) goto L_0x0161
            java.lang.String r0 = ""
            boolean r12 = r12.equals(r0)
            r0 = 0
            if (r12 != 0) goto L_0x0162
        L_0x0161:
            r0 = 1
        L_0x0162:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileDeviceProxySet"
            r4.put(r0, r12)
            long r12 = X.AnonymousClass7TG.A0I()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "MobileRequestTimestamp"
            r4.put(r0, r12)
            X.0JN r0 = X.0JN.A01()
            X.0JN.A03(r0)
            X.0JN.A04(r0)
            android.os.StatFs r0 = r0.A02
            if (r0 == 0) goto L_0x01aa
            long r14 = r0.getBlockSizeLong()
            long r12 = r0.getBlockCountLong()
            long r14 = r14 * r12
        L_0x018f:
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            java.lang.String r0 = "MobileDeviceTotalDiskSpace"
            r4.put(r0, r12)
            long r0 = r1.getTime()
            int r0 = r11.getOffset(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "MobileTimezoneOffsetMs"
            r4.put(r0, r1)
            goto L_0x0226
        L_0x01aa:
            r14 = -1
            goto L_0x018f
        L_0x01ad:
            java.lang.String r0 = "PATH"
            java.lang.String r10 = java.lang.System.getenv(r0)
            if (r10 == 0) goto L_0x01f8
            java.lang.String r0 = ":"
            java.lang.String[] r10 = r10.split(r0)
            int r0 = r10.length
            r17 = r0
            r12 = 0
        L_0x01bf:
            r0 = r17
            if (r12 >= r0) goto L_0x01f8
            r0 = r10[r12]
            java.io.File r13 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r13.isDirectory()
            if (r0 == 0) goto L_0x01f5
            java.io.File[] r13 = r13.listFiles()
            if (r13 == 0) goto L_0x01f5
            int r0 = r13.length
            r16 = r0
            r14 = 0
        L_0x01df:
            r0 = r16
            if (r14 >= r0) goto L_0x01f5
            r0 = r13[r14]
            java.lang.String r15 = r0.getName()
            java.lang.String r0 = "su"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00f6
            int r14 = r14 + 1
            goto L_0x01df
        L_0x01f5:
            int r12 = r12 + 1
            goto L_0x01bf
        L_0x01f8:
            r0 = 0
            goto L_0x00f7
        L_0x01fb:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0488 }
            android.os.StrictMode.setThreadPolicy(r1)
            java.lang.String r1 = r0.toString()
            r2 = r1
            boolean r0 = X.1FH.A00(r6, r1, r11)
            if (r0 != 0) goto L_0x0217
            java.lang.Object r2 = r11.get()
            java.lang.String r2 = (java.lang.String) r2
        L_0x0217:
            boolean r0 = android.text.TextUtils.equals(r2, r1)
            if (r0 == 0) goto L_0x0048
            android.content.SharedPreferences$Editor r0 = r10.edit()
            X.Pxf.A13(r0, r3, r2)
            goto L_0x0048
        L_0x0226:
            java.util.Enumeration r11 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x024a }
        L_0x022a:
            boolean r0 = r11.hasMoreElements()     // Catch:{ SocketException -> 0x024a }
            if (r0 == 0) goto L_0x024a
            java.lang.Object r1 = r11.nextElement()     // Catch:{ SocketException -> 0x024a }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ SocketException -> 0x024a }
            boolean r0 = r1.isUp()     // Catch:{ SocketException -> 0x024a }
            if (r0 == 0) goto L_0x022a
            java.lang.String r1 = r1.getName()     // Catch:{ SocketException -> 0x024a }
            java.lang.String r0 = "tun"
            boolean r0 = r1.startsWith(r0)     // Catch:{ SocketException -> 0x024a }
            if (r0 == 0) goto L_0x022a
            goto L_0x024c
        L_0x024a:
            r0 = 0
            goto L_0x024d
        L_0x024c:
            r0 = 1
        L_0x024d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileDeviceVPN"
            r4.put(r0, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "MobileDeviceUptime"
            r4.put(r0, r1)
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "MobileAppName"
            r4.put(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "MobileDeviceModel"
            r4.put(r0, r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "MobileOSVersion"
            r4.put(r0, r1)
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r1 = android.provider.Settings.Secure.getString(r0, r2)
            java.lang.String r0 = "MobileAndroidID"
            r4.put(r0, r1)
            r12 = 0
            X.1DF r0 = X.AnonymousClass1DA.A00(r7, r12)
            if (r0 != 0) goto L_0x02aa
            r0 = 0
        L_0x0293:
            java.lang.String r1 = "MobileSimOperatorName"
            r4.put(r1, r0)
            X.1DF r0 = X.AnonymousClass1DA.A00(r7, r12)
            if (r0 != 0) goto L_0x02a3
            r0 = 0
        L_0x029f:
            r4.put(r1, r0)
            goto L_0x02b1
        L_0x02a3:
            android.telephony.TelephonyManager r0 = r0.A00
            java.lang.String r0 = r0.getSimOperatorName()
            goto L_0x029f
        L_0x02aa:
            android.telephony.TelephonyManager r0 = r0.A00
            java.lang.String r0 = r0.getNetworkOperatorName()
            goto L_0x0293
        L_0x02b1:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02c4 }
            java.lang.String r0 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x02c4 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r10)     // Catch:{ NameNotFoundException -> 0x02c4 }
            long r0 = r0.firstInstallTime     // Catch:{ NameNotFoundException -> 0x02c4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x02c4 }
            goto L_0x02c5
        L_0x02c4:
            r1 = 0
        L_0x02c5:
            java.lang.String r0 = "MobileAppFirstInstallTime"
            r4.put(r0, r1)
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02dd }
            java.lang.String r0 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x02dd }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r10)     // Catch:{ NameNotFoundException -> 0x02dd }
            long r0 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x02dd }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x02dd }
            goto L_0x02de
        L_0x02dd:
            r1 = 0
        L_0x02de:
            java.lang.String r0 = "MobileAppLastUpdateTime"
            r4.put(r0, r1)
            X.1DF r0 = X.AnonymousClass1DA.A00(r7, r12)
            r1 = -1
            if (r0 == 0) goto L_0x02f0
            android.telephony.TelephonyManager r0 = r0.A00     // Catch:{ NotFoundException -> 0x02f0 }
            int r1 = r0.getPhoneType()     // Catch:{ NotFoundException -> 0x02f0 }
        L_0x02f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "MobileDeviceRadioType"
            r4.put(r0, r1)
            java.util.ArrayList r11 = X.S8Q.A01(r10)
            r0 = 0
            if (r11 == 0) goto L_0x030a
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x030a
            java.lang.Object r0 = r11.get(r10)
        L_0x030a:
            java.lang.String r1 = "SourceIP"
            r4.put(r1, r0)
            java.util.ArrayList r1 = X.S8Q.A01(r5)
            java.lang.String r0 = "MobileIpAddresses"
            r4.put(r0, r1)
            java.lang.String r1 = "MobilePayloadType"
            java.lang.String r0 = "full"
            r4.put(r1, r0)
            r0 = 130(0x82, float:1.82E-43)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            int r0 = X.02K.A00(r7, r10)
            if (r0 != 0) goto L_0x0338
            java.lang.String r1 = android.os.Build.getSerial()     // Catch:{ SecurityException -> 0x0330 }
            goto L_0x033a
        L_0x0330:
            r11 = move-exception
            java.lang.String r1 = "BuildSerialUtil"
            java.lang.String r0 = "Can't get build serial. Are you on Android 9 or above? Can you use Settings.Secure.ANDROID_ID instead?"
            X.0KC.A0I(r1, r0, r11)
        L_0x0338:
            java.lang.String r1 = "PERMISSION_DENIED"
        L_0x033a:
            java.lang.String r0 = "MobileSerialNumber"
            r4.put(r0, r1)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            if (r0 == 0) goto L_0x0483
            boolean r0 = r0.hasSystemFeature(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.put(r3, r0)
            r9.A03 = r4
            X.RoE r6 = new X.RoE
            r6.<init>(r9)
            r9.A02 = r6
            java.lang.String r1 = X.C61120lW.A04(r8)
            java.lang.String r0 = "MobileAppVersion"
            r4.put(r0, r1)
            java.lang.String r9 = "connectivity"
            java.lang.Object r1 = r8.getSystemService(r9)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            X.S2J r3 = r6.A00
            android.content.Context r0 = r3.A00
            boolean r0 = X.1DL.A07(r0, r7)
            if (r0 == 0) goto L_0x03c4
            android.net.NetworkInfo r0 = r1.getActiveNetworkInfo()
        L_0x037a:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0389
            int r0 = r0.getType()
            if (r0 == 0) goto L_0x03c1
            if (r0 != r5) goto L_0x0389
            java.lang.String r1 = "wifi"
        L_0x0389:
            java.lang.String r0 = "MobileConnType"
            r4.put(r0, r1)
            java.lang.Object r1 = r8.getSystemService(r9)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.content.Context r0 = r3.A00
            boolean r0 = X.1DL.A07(r0, r7)
            if (r0 == 0) goto L_0x03bf
            android.net.NetworkInfo r0 = r1.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x03bf
            boolean r0 = r0.isRoaming()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x03aa:
            java.lang.String r0 = "MobileRoaming"
            r4.put(r0, r1)
            android.content.Context r0 = r3.A00
            boolean r1 = X.1DL.A07(r0, r10)
            r0 = 0
            if (r1 == 0) goto L_0x03cc
            X.1DF r1 = X.AnonymousClass1DA.A00(r8, r12)
            if (r1 == 0) goto L_0x03cc
            goto L_0x03c6
        L_0x03bf:
            r1 = 0
            goto L_0x03aa
        L_0x03c1:
            java.lang.String r1 = "cellular"
            goto L_0x0389
        L_0x03c4:
            r0 = 0
            goto L_0x037a
        L_0x03c6:
            android.telephony.TelephonyManager r1 = r1.A00     // Catch:{ SecurityException -> 0x03cc }
            java.lang.String r0 = r1.getSimSerialNumber()     // Catch:{ SecurityException -> 0x03cc }
        L_0x03cc:
            java.lang.String r1 = "MobileSimSerialNumber"
            r4.put(r1, r0)
            android.content.Context r0 = r3.A00
            boolean r1 = X.1DL.A07(r0, r10)
            r0 = 0
            if (r1 == 0) goto L_0x03e6
            X.1DF r1 = X.AnonymousClass1DA.A00(r8, r12)
            if (r1 == 0) goto L_0x03e6
            android.telephony.TelephonyManager r1 = r1.A00     // Catch:{ SecurityException -> 0x03e6 }
            java.lang.String r0 = r1.getSubscriberId()     // Catch:{ SecurityException -> 0x03e6 }
        L_0x03e6:
            java.lang.String r1 = "MobileSubscriberId"
            r4.put(r1, r0)
            android.telephony.cdma.CdmaCellLocation r0 = X.S8Q.A00(r8, r6)
            if (r0 == 0) goto L_0x0421
            int r0 = r0.getNetworkId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x03f9:
            java.lang.String r0 = "MobileCdmaNetworkId"
            r4.put(r0, r1)
            android.telephony.cdma.CdmaCellLocation r0 = X.S8Q.A00(r8, r6)
            if (r0 == 0) goto L_0x041f
            int r0 = r0.getSystemId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x040c:
            java.lang.String r0 = "MobileCdmaSystemId"
            r4.put(r0, r1)
            boolean r1 = X.RU0.A00(r8)
            r0 = 0
            if (r1 == 0) goto L_0x0429
            X.1DF r1 = X.AnonymousClass1DA.A00(r8, r12)
            if (r1 == 0) goto L_0x0429
            goto L_0x0423
        L_0x041f:
            r1 = 0
            goto L_0x040c
        L_0x0421:
            r1 = 0
            goto L_0x03f9
        L_0x0423:
            android.telephony.TelephonyManager r1 = r1.A00     // Catch:{ SecurityException -> 0x0429 }
            java.lang.String r0 = r1.getLine1Number()     // Catch:{ SecurityException -> 0x0429 }
        L_0x0429:
            java.lang.String r1 = "MobileLine1Number"
            r4.put(r1, r0)
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r3.A00
            boolean r0 = X.1DL.A07(r0, r1)
            if (r0 == 0) goto L_0x047d
            java.lang.String[] r15 = new java.lang.String[]{r2}
            android.content.ContentResolver r10 = r8.getContentResolver()     // Catch:{ Exception -> 0x047d, all -> 0x0476 }
            java.lang.String r0 = "content://com.google.android.gsf.gservices"
            android.net.Uri r11 = X.0cp.A03(r0)     // Catch:{ Exception -> 0x047d, all -> 0x0476 }
            r16 = -660004245(0xffffffffd8a9226b, float:-1.48772231E15)
            r13 = r12
            r14 = r12
            android.database.Cursor r2 = X.0fM.A01(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x047d, all -> 0x0476 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            if (r0 == 0) goto L_0x047a
            int r1 = r2.getColumnCount()     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            r0 = 2
            if (r1 < r0) goto L_0x047a
            java.lang.String r0 = r2.getString(r5)     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            java.lang.String r1 = java.lang.Long.toHexString(r0)     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            java.lang.String r12 = r1.toUpperCase(r0)     // Catch:{ Exception -> 0x0478, all -> 0x046f }
            goto L_0x047a
        L_0x046f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0475
            r2.close()
        L_0x0475:
            throw r0
        L_0x0476:
            r0 = move-exception
            throw r0
        L_0x0478:
            if (r2 == 0) goto L_0x047d
        L_0x047a:
            r2.close()
        L_0x047d:
            java.lang.String r0 = "MobileGsfId"
            r4.put(r0, r12)
            return
        L_0x0483:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0488:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2J.<init>(android.content.Context):void");
    }

    public final String A00() {
        return DbT.A10(JSONUtil.A00(this.A03));
    }
}

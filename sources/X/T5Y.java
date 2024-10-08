package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class T5Y implements AnonymousClass1D3 {
    public final Context A00;
    public final TelephonyManager A01;
    public final 0lg A02;
    public final PackageInfo A03;
    public final PackageManager A04;
    public final 0wc A05;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Chz(X.AnonymousClass3J4 r14) {
        /*
            r13 = this;
            java.lang.String r3 = "IGProviderConnectionDeviceInfoLogger"
            r5 = 0
            X.0qQ.A0B(r14, r5)
            com.facebook.tigon.iface.TigonRequest r2 = r14.A03
            X.1Rw r1 = r2.requestCategory()
            X.1Rw r0 = X.1Rw.A07
            if (r1 == r0) goto L_0x0029
            X.1Rw r1 = r2.requestCategory()
            X.1Rw r0 = X.1Rw.A05
            if (r1 == r0) goto L_0x0029
            X.1Rw r1 = r2.requestCategory()
            X.1Rw r0 = X.1Rw.A04
            if (r1 == r0) goto L_0x0029
            X.1Rw r1 = r2.requestCategory()
            X.1Rw r0 = X.1Rw.A08
            if (r1 == r0) goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            X.3Iu r1 = r14.A02
            X.3Iz r0 = X.C239953Iy.A04
            java.lang.Object r0 = r1.BLk(r0)
            X.3Iq r0 = (X.C239883Iq) r0
            if (r0 == 0) goto L_0x0028
            java.util.Map r10 = r0.A01
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0028
            r0 = 4587(0x11eb, float:6.428E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r10.get(r9)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0028
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = X.DbT.A11(r9, r10)
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r0)
            X.0qQ.A07(r1)
            byte[] r6 = r1.getAddress()
            X.0qQ.A07(r6)
            boolean r0 = r1 instanceof java.net.Inet4Address
            if (r0 == 0) goto L_0x00e6
            X.0lg r4 = r13.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604185197745180(0x820b500001141c, double:3.211972340052684E-306)
            int r0 = X.DbS.A04(r2, r4, r0)
            byte[] r1 = X.0Yw.A0W(r6, r5, r0)
            int r0 = 4 - r0
        L_0x007a:
            byte[] r0 = new byte[r0]
            byte[] r0 = X.0Yw.A0X(r1, r0)
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)
            java.lang.String r2 = r0.getHostAddress()
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = A00()
            r1.append(r0)
            r7 = 124(0x7c, float:1.74E-43)
            r1.append(r7)
            r1.append(r2)
            r1.append(r7)
            java.util.Locale r0 = X.AnonymousClass1Q2.A03()
            r1.append(r0)
            r1.append(r7)
            android.telephony.TelephonyManager r11 = r13.A01
            java.lang.String r0 = r11.getNetworkOperatorName()
            X.0qQ.A07(r0)
            java.lang.String r6 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            java.nio.charset.Charset r4 = X.AnonymousClass15Q.A05
            byte[] r0 = X.Pxf.A1V(r6, r4)
            byte[] r0 = r1.digest(r0)
            r8 = 1
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r8, r0)
            r0 = 16
            java.lang.String r1 = r1.toString(r0)
            X.0qQ.A07(r1)
            r0 = 32
            java.lang.String r2 = X.00l.A0H(r1, r0)
            X.1L7 r1 = X.1L7.A01()
            r0 = 1646079900(0x621d2f9c, float:7.2489236E20)
            X.1LU r1 = r1.A04(r0)
            goto L_0x0102
        L_0x00e6:
            boolean r0 = r1 instanceof java.net.Inet6Address
            if (r0 == 0) goto L_0x00ff
            X.0lg r4 = r13.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604185197810717(0x820b500002141d, double:3.21197234009413E-306)
            int r0 = X.DbS.A04(r2, r4, r0)
            byte[] r1 = X.0Yw.A0W(r6, r5, r0)
            int r0 = 16 - r0
            goto L_0x007a
        L_0x00ff:
            java.lang.String r2 = ""
            goto L_0x0088
        L_0x0102:
            byte[] r0 = r1.readResourceToMemory(r2)     // Catch:{ IOException -> 0x0281 }
            if (r0 != 0) goto L_0x0028
            java.lang.String r5 = ""
            byte[] r0 = X.Pxf.A1V(r5, r4)
            r1.write(r2, r0)     // Catch:{ IOException -> 0x027a }
            X.0wc r1 = r13.A05
            java.lang.String r0 = "provider_connection_device_info"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0028
            android.content.pm.PackageInfo r12 = r13.A03
            java.lang.String r1 = r12.versionName
            if (r1 == 0) goto L_0x0275
            r0 = 250(0xfa, float:3.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            int r0 = r12.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "app_build_number"
            r4.AAJ(r0, r1)
            android.content.Context r12 = r13.A00
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "package_name"
            r4.AAJ(r0, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "device_model"
            r4.AAJ(r0, r1)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "device_brand"
            r4.AAJ(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "device_manufacturer"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "device_model_os"
            r4.AAJ(r0, r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "device_model_os_version"
            r4.AAJ(r0, r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A03()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "device_locale"
            r4.AAJ(r0, r1)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r12)
            float r0 = r0.density
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "screen_density"
            r4.A8D(r0, r1)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r12)
            int r0 = r0.widthPixels
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "screen_width_px"
            r4.A9F(r0, r1)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r12)
            int r0 = r0.heightPixels
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "screen_height_px"
            r4.A9F(r0, r1)
            java.lang.String r1 = A00()
            r0 = 4641(0x1221, float:6.503E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getNetworkOperatorName()
            X.0qQ.A07(r1)
            java.lang.String r0 = "sim_carrier_name"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getSimOperatorName()
            X.0qQ.A07(r1)
            r0 = 4012(0xfac, float:5.622E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getSimCountryIso()
            X.0qQ.A07(r1)
            r0 = 4011(0xfab, float:5.62E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getSimOperator()
            X.0qQ.A07(r1)
            java.lang.String r0 = "sim_home_network_identity"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getNetworkOperator()
            X.0qQ.A07(r1)
            java.lang.String r0 = "network_home_network_identity"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r11.getNetworkCountryIso()
            X.0qQ.A07(r1)
            r0 = 3621(0xe25, float:5.074E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            java.lang.String r1 = X.DbT.A11(r9, r10)
            java.lang.String r0 = "client_ip"
            r4.AAJ(r0, r1)
            java.lang.String r1 = X.002.A0T(r6, r2, r7)
            java.lang.String r0 = "device_cache_hashid"
            r4.AAJ(r0, r1)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Enumeration r6 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
        L_0x0225:
            boolean r0 = r6.hasMoreElements()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            if (r0 == 0) goto L_0x0265
            java.lang.Object r0 = r6.nextElement()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            java.util.Enumeration r2 = r0.getInetAddresses()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
        L_0x0235:
            boolean r0 = r2.hasMoreElements()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            if (r0 == 0) goto L_0x0225
            java.lang.Object r1 = r2.nextElement()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            boolean r0 = r1.isLoopbackAddress()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            if (r0 != 0) goto L_0x0235
            java.lang.String r1 = r1.getHostAddress()     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            X.0qQ.A0A(r1)     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            java.lang.String r0 = "fe80"
            boolean r0 = X.00p.A0k(r1, r0, r8)     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            if (r0 != 0) goto L_0x0235
            r7.add(r1)     // Catch:{ SocketException -> 0x025e, NullPointerException -> 0x025a }
            goto L_0x0235
        L_0x025a:
            r1 = move-exception
            java.lang.String r0 = "Virtual interface without a parent interface present"
            goto L_0x0261
        L_0x025e:
            r1 = move-exception
            java.lang.String r0 = "SocketException trying to get local IP addresses"
        L_0x0261:
            X.0KC.A0G(r3, r0, r1)
            goto L_0x026c
        L_0x0265:
            java.lang.String r0 = r7.toString()
            if (r0 == 0) goto L_0x026c
            r5 = r0
        L_0x026c:
            java.lang.String r0 = "local_client_ip"
            r4.AAJ(r0, r5)
            r4.Cgf()
            return
        L_0x0275:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x027a:
            r1 = move-exception
            java.lang.String r0 = "Error writing hash to cache"
            X.0KC.A0F(r3, r0, r1)
            return
        L_0x0281:
            r1 = move-exception
            java.lang.String r0 = "Error reading hash from cache"
            X.0KC.A0F(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5Y.Chz(X.3J4):void");
    }

    public T5Y(Context context, 0lg r5) {
        this.A02 = r5;
        this.A00 = context;
        this.A05 = AnonymousClass0kN.A01(AnonymousClass1D4.A00, r5);
        PackageManager packageManager = context.getPackageManager();
        this.A04 = packageManager;
        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        0qQ.A07(packageInfo);
        this.A03 = packageInfo;
        Object systemService = context.getSystemService("phone");
        0qQ.A0C(systemService, AnonymousClass000.A00(715));
        this.A01 = (TelephonyManager) systemService;
    }

    public static final String A00() {
        int intValue = C61970qY.A04().A01.intValue();
        if (intValue == 0) {
            return "unknown";
        }
        if (intValue == 2) {
            return NetInfoModule.CONNECTION_TYPE_CELLULAR;
        }
        if (intValue == 1) {
            return NetInfoModule.CONNECTION_TYPE_WIFI;
        }
        if (intValue == 3) {
            return "unknown";
        }
        throw AnonymousClass7TE.A1K();
    }
}

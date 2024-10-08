package com.facebook.react.modules.location;

import X.02K;
import X.0fW;
import X.AnonymousClass000;
import X.C11448SVk;
import X.C13948Tm8;
import X.C273654mx;
import X.JTQ;
import X.Pxe;
import X.QZK;
import X.S9C;
import android.app.ActivityManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.facebook.fbreact.specs.NativeLocationObserverSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "LocationObserver")
public class LocationModule extends NativeLocationObserverSpec {
    public static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    public final LocationListener mLocationListener = new C11448SVk(this);
    public String mWatchedProvider;

    public void addListener(String str) {
    }

    public void removeListeners(double d) {
    }

    public void requestAuthorization() {
    }

    public void setConfiguration(ReadableMap readableMap) {
    }

    public static boolean isAppInBackground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return JTQ.A1O(runningAppProcessInfo.importance, 100);
    }

    public static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r8.getBoolean("enableHighAccuracy") == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startObserving(com.facebook.react.bridge.ReadableMap r8) {
        /*
            r7 = this;
            java.lang.String r1 = r7.mWatchedProvider
            java.lang.String r0 = "gps"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008f
            java.lang.String r1 = "timeout"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x0016
            r8.getDouble(r1)
        L_0x0016:
            java.lang.String r1 = "maximumAge"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x0022
            r8.getDouble(r1)
        L_0x0022:
            java.lang.String r1 = "enableHighAccuracy"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x0031
            boolean r0 = r8.getBoolean(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            java.lang.String r1 = "distanceFilter"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x0040
            double r0 = r8.getDouble(r1)
            float r3 = (float) r0
            goto L_0x0042
        L_0x0040:
            r3 = 1120403456(0x42c80000, float:100.0)
        L_0x0042:
            X.QZK r0 = X.Pxe.A0T(r7)     // Catch:{ SecurityException -> 0x0086 }
            java.lang.String r1 = "location"
            android.content.Context r0 = r0.getBaseContext()     // Catch:{ SecurityException -> 0x0086 }
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ SecurityException -> 0x0086 }
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch:{ SecurityException -> 0x0086 }
            java.lang.String r2 = r7.getValidProvider(r1, r2)     // Catch:{ SecurityException -> 0x0086 }
            if (r2 != 0) goto L_0x005f
            r1 = 2
            java.lang.String r0 = "No location provider available."
            r7.emitError(r1, r0)     // Catch:{ SecurityException -> 0x0086 }
            return
        L_0x005f:
            java.lang.String r0 = r7.mWatchedProvider     // Catch:{ SecurityException -> 0x0086 }
            boolean r0 = r2.equals(r0)     // Catch:{ SecurityException -> 0x0086 }
            if (r0 != 0) goto L_0x0083
            android.location.LocationListener r0 = r7.mLocationListener     // Catch:{ SecurityException -> 0x0086 }
            X.0fW.A01(r0, r1)     // Catch:{ SecurityException -> 0x0086 }
            boolean r0 = isAppInBackground()     // Catch:{ SecurityException -> 0x0086 }
            if (r0 == 0) goto L_0x0079
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            r7.emitError(r1, r0)     // Catch:{ SecurityException -> 0x0086 }
            return
        L_0x0079:
            r5 = 1000(0x3e8, double:4.94E-321)
            android.location.LocationListener r0 = r7.mLocationListener     // Catch:{ SecurityException -> 0x0086 }
            r4 = 1234182653(0x499021fd, float:1180735.6)
            X.0fW.A02(r0, r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x0086 }
        L_0x0083:
            r7.mWatchedProvider = r2     // Catch:{ SecurityException -> 0x0086 }
            return
        L_0x0086:
            r0 = move-exception
            throwLocationPermissionMissing(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.location.LocationModule.startObserving(com.facebook.react.bridge.ReadableMap):void");
    }

    public LocationModule(QZK qzk) {
        super(qzk);
    }

    /* access modifiers changed from: private */
    public void emitError(int i, String str) {
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("geolocationError", S9C.A00(str, i));
        }
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = "network";
        String str2 = str;
        if (z) {
            str2 = "gps";
        }
        if (!locationManager.isProviderEnabled(str2)) {
            if (!str2.equals("gps")) {
                str = "gps";
            }
            if (locationManager.isProviderEnabled(str)) {
                str2 = str;
            }
            return null;
        }
        int A00 = 02K.A00(Pxe.A0T(this), AnonymousClass000.A00(27));
        if (!str2.equals("gps") || A00 == 0) {
            return str2;
        }
        return null;
    }

    public static C13948Tm8 locationToMap(Location location) {
        WritableNativeMap A0U = Pxe.A0U();
        WritableNativeMap A0U2 = Pxe.A0U();
        A0U2.putDouble(com.facebook.location.platform.api.Location.LATITUDE, location.getLatitude());
        A0U2.putDouble("longitude", location.getLongitude());
        A0U2.putDouble(com.facebook.location.platform.api.Location.ALTITUDE, location.getAltitude());
        A0U2.putDouble(com.facebook.location.platform.api.Location.ACCURACY, (double) location.getAccuracy());
        A0U2.putDouble(C273654mx.A00(724), (double) location.getBearing());
        A0U2.putDouble(com.facebook.location.platform.api.Location.SPEED, (double) location.getSpeed());
        A0U.putMap("coords", A0U2);
        A0U.putDouble("timestamp", (double) location.getTime());
        A0U.putBoolean("mocked", location.isFromMockProvider());
        return A0U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r15.getBoolean("enableHighAccuracy") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getCurrentPosition(com.facebook.react.bridge.ReadableMap r15, com.facebook.react.bridge.Callback r16, com.facebook.react.bridge.Callback r17) {
        /*
            r14 = this;
            java.lang.String r1 = "timeout"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x003a
            double r0 = r15.getDouble(r1)
            long r11 = (long) r0
        L_0x000e:
            java.lang.String r1 = "maximumAge"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x0037
            double r5 = r15.getDouble(r1)
        L_0x001b:
            java.lang.String r1 = "enableHighAccuracy"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x002a
            boolean r0 = r15.getBoolean(r1)
            r2 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            java.lang.String r1 = "distanceFilter"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x0040
            r15.getDouble(r1)
            goto L_0x0040
        L_0x0037:
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x001b
        L_0x003a:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x000e
        L_0x0040:
            X.QZK r0 = X.Pxe.A0T(r14)     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.String r1 = "location"
            android.content.Context r0 = r0.getBaseContext()     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Object r7 = r0.getSystemService(r1)     // Catch:{ SecurityException -> 0x00d4 }
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.String r10 = r14.getValidProvider(r7, r2)     // Catch:{ SecurityException -> 0x00d4 }
            r9 = r17
            if (r10 != 0) goto L_0x0067
            r1 = 2
            java.lang.String r0 = "No location provider available."
            com.facebook.react.bridge.WritableNativeMap r0 = X.S9C.A00(r0, r1)     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ SecurityException -> 0x00d4 }
        L_0x0063:
            r9.invoke(r0)     // Catch:{ SecurityException -> 0x00d4 }
            goto L_0x0079
        L_0x0067:
            boolean r0 = isAppInBackground()     // Catch:{ SecurityException -> 0x00d4 }
            if (r0 == 0) goto L_0x007a
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            com.facebook.react.bridge.WritableNativeMap r0 = X.S9C.A00(r0, r1)     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ SecurityException -> 0x00d4 }
            goto L_0x0063
        L_0x0079:
            return
        L_0x007a:
            android.location.Location r4 = X.0fW.A00(r7, r10)     // Catch:{ SecurityException -> 0x00d4 }
            r8 = r16
            if (r4 == 0) goto L_0x009c
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SecurityException -> 0x00d4 }
            long r2 = r4.getTime()     // Catch:{ SecurityException -> 0x00d4 }
            long r0 = r0 - r2
            double r2 = (double) r0     // Catch:{ SecurityException -> 0x00d4 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            X.Tm8 r0 = locationToMap(r4)     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ SecurityException -> 0x00d4 }
            r8.invoke(r0)     // Catch:{ SecurityException -> 0x00d4 }
            return
        L_0x009c:
            X.Ryj r6 = new X.Ryj     // Catch:{ SecurityException -> 0x00d4 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x00d4 }
            boolean r0 = isAppInBackground()     // Catch:{ SecurityException -> 0x00d4 }
            if (r0 == 0) goto L_0x00b8
            com.facebook.react.bridge.Callback r2 = r6.A06     // Catch:{ SecurityException -> 0x00d4 }
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            com.facebook.react.bridge.WritableNativeMap r0 = X.S9C.A00(r0, r1)     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ SecurityException -> 0x00d4 }
            r2.invoke(r0)     // Catch:{ SecurityException -> 0x00d4 }
            return
        L_0x00b8:
            r6.A00 = r4     // Catch:{ SecurityException -> 0x00d4 }
            android.location.LocationManager r8 = r6.A04     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.String r9 = r6.A09     // Catch:{ SecurityException -> 0x00d4 }
            r12 = 100
            r10 = 1065353216(0x3f800000, float:1.0)
            android.location.LocationListener r7 = r6.A03     // Catch:{ SecurityException -> 0x00d4 }
            r11 = 1714405069(0x662fbecd, float:2.0748345E23)
            X.0fW.A02(r7, r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x00d4 }
            android.os.Handler r3 = r6.A05     // Catch:{ SecurityException -> 0x00d4 }
            java.lang.Runnable r2 = r6.A08     // Catch:{ SecurityException -> 0x00d4 }
            long r0 = r6.A02     // Catch:{ SecurityException -> 0x00d4 }
            r3.postDelayed(r2, r0)     // Catch:{ SecurityException -> 0x00d4 }
            return
        L_0x00d4:
            r0 = move-exception
            throwLocationPermissionMissing(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.location.LocationModule.getCurrentPosition(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Callback, com.facebook.react.bridge.Callback):void");
    }

    public void stopObserving() {
        0fW.A01(this.mLocationListener, (LocationManager) Pxe.A0T(this).getBaseContext().getSystemService("location"));
        this.mWatchedProvider = null;
    }
}

package com.facebook.location.platform.api;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66580MXl;
import X.DbS;
import X.DbT;
import X.Pxf;
import X.Pxg;
import X.RLZ;
import X.SWY;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class Location extends AutoSafeParcelable {
    public static final String ACCURACY = "accuracy";
    public static final String ALTITUDE = "altitude";
    public static final String ALTITUDE_ACCURACY = "altitudeAccuracy";
    public static final String BEARING = "bearing";
    public static final String BEARING_ACCURACY = "bearingAccuracy";
    public static final Parcelable.Creator CREATOR = SWY.A00(Location.class);
    public static final String EXTRAS = "extras";
    public static final Set EXTRAS_SERIALIZATION_KEYS = Pxf.A0s(new String[]{"UNDERLYING_PROVIDER", "EXTRA_SUBSCRIPTION_UUID", "LOCATION_UUID", "IS_CACHED"});
    public static final String IS_MOCK_LOCATION = "isMockLocation";
    public static final String LATITUDE = "latitude";
    public static final String LOCATION_ELAPSEDTIME = "locationElapsedTime";
    public static final String LOCATION_TIMESTAMP = "locationTimestamp";
    public static final String LONGITUDE = "longtiude";
    public static final String PROVIDER = "provider";
    public static final String SPEED = "speed";
    public static final String SPEED_ACCURACY = "speedAccuracy";
    public static final String TAG = "Location";
    public static final Map sProviderMap;
    @SafeParcelable.Field(7)
    public final Float mAccuracy;
    @SafeParcelable.Field(4)
    public final Double mAltitude;
    @SafeParcelable.Field(8)
    public final Float mAltitudeAccuracy;
    @SafeParcelable.Field(9)
    public final Float mBearing;
    @SafeParcelable.Field(10)
    public final Float mBearingAccuracy;
    @SafeParcelable.Field(6)
    public final Long mElapsedRealtimeNanos;
    @SafeParcelable.Field(13)
    public final Bundle mExtras;
    @SafeParcelable.Field(14)
    public final boolean mIsMockLocation;
    @SafeParcelable.Field(2)
    public final double mLatitude;
    @SafeParcelable.Field(3)
    public final double mLongitude;
    @SafeParcelable.Field(1)
    public final String mProvider;
    @SafeParcelable.Field(11)
    public final Float mSpeed;
    @SafeParcelable.Field(12)
    public final Float mSpeedAccuracy;
    @SafeParcelable.Field(5)
    public final Long mTimestamp;

    public Location(Bundle bundle, Double d, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Long l, Long l2, String str, double d2, double d3, boolean z) {
        this.mProvider = str;
        this.mLatitude = d2;
        this.mLongitude = d3;
        this.mAltitude = d;
        this.mTimestamp = l2;
        this.mElapsedRealtimeNanos = l;
        this.mAccuracy = f;
        this.mAltitudeAccuracy = f2;
        this.mBearing = f3;
        this.mBearingAccuracy = f4;
        this.mSpeed = f5;
        this.mSpeedAccuracy = f6;
        this.mExtras = bundle;
        this.mIsMockLocation = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.location.platform.api.Location fromJSON(org.json.JSONObject r23) {
        /*
            r8 = 0
            java.lang.String r1 = "latitude"
            r0 = r23
            double r19 = r0.optDouble(r1)
            java.lang.String r1 = "longtiude"
            double r21 = r0.optDouble(r1)
            java.lang.String r1 = "isMockLocation"
            boolean r23 = r0.optBoolean(r1)
            java.lang.String r2 = "provider"
            boolean r1 = r0.isNull(r2)
            r16 = 0
            if (r1 != 0) goto L_0x00db
            java.lang.String r3 = r0.optString(r2)
        L_0x0024:
            java.lang.String r2 = "altitude"
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x00d8
            double r1 = r0.optDouble(r2)
            java.lang.Double r9 = java.lang.Double.valueOf(r1)
        L_0x0034:
            java.lang.String r1 = "accuracy"
            java.lang.Float r10 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "altitudeAccuracy"
            java.lang.Float r11 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "bearing"
            java.lang.Float r12 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "bearingAccuracy"
            java.lang.Float r13 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "speed"
            java.lang.Float r14 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "speedAccuracy"
            java.lang.Float r15 = X.Pxj.A0g(r1, r0)
            java.lang.String r1 = "locationTimestamp"
            boolean r2 = r0.isNull(r1)
            if (r2 != 0) goto L_0x00d5
            long r1 = r0.optLong(r1)
            java.lang.Long r17 = java.lang.Long.valueOf(r1)
        L_0x006a:
            java.lang.String r1 = "locationElapsedTime"
            boolean r2 = r0.isNull(r1)
            if (r2 != 0) goto L_0x007a
            long r1 = r0.optLong(r1)
            java.lang.Long r16 = java.lang.Long.valueOf(r1)
        L_0x007a:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L_0x00e5
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.util.Set r0 = EXTRAS_SERIALIZATION_KEYS
            java.util.Iterator r6 = r0.iterator()
        L_0x008c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = X.AnonymousClass7TE.A18(r6)
            boolean r2 = r1.has(r0)
            if (r2 == 0) goto L_0x008c
            int r2 = r0.hashCode()
            switch(r2) {
                case 5109518: goto L_0x00af;
                case 217933271: goto L_0x00b2;
                case 1349230085: goto L_0x00c2;
                case 1913023635: goto L_0x00c5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.String r5 = TAG
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Encountered unrecognized key in Location extras bundle when deserializing: %s"
            X.0KC.A0P(r5, r0, r2)
            goto L_0x008c
        L_0x00af:
            java.lang.String r2 = "EXTRA_SUBSCRIPTION_UUID"
            goto L_0x00c7
        L_0x00b2:
            java.lang.String r2 = "IS_CACHED"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00a3
            boolean r2 = r1.optBoolean(r0)
            r4.putBoolean(r0, r2)
            goto L_0x008c
        L_0x00c2:
            java.lang.String r2 = "LOCATION_UUID"
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r2 = "UNDERLYING_PROVIDER"
        L_0x00c7:
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = r1.optString(r0)
            r4.putString(r0, r2)
            goto L_0x008c
        L_0x00d5:
            r17 = r8
            goto L_0x006a
        L_0x00d8:
            r9 = r8
            goto L_0x0034
        L_0x00db:
            r3 = r8
            goto L_0x0024
        L_0x00de:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00e5
            r8 = r4
        L_0x00e5:
            r4 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0145
            java.lang.String r1 = "Builder"
            java.lang.String r0 = "Latitude set to higher than 90"
        L_0x00f2:
            android.util.Log.w(r1, r0)
            r19 = r4
        L_0x00f7:
            r6 = -4582834833314545664(0xc066800000000000, double:-180.0)
            r4 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0116
        L_0x0109:
            r1 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r21 = r21 % r1
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            double r21 = r21 - r1
        L_0x0116:
            if (r16 != 0) goto L_0x0120
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
        L_0x0120:
            if (r3 == 0) goto L_0x0136
            java.lang.String r1 = "fused"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0136
            if (r8 != 0) goto L_0x0130
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
        L_0x0130:
            java.lang.String r0 = "UNDERLYING_PROVIDER"
            r8.putString(r0, r3)
            r3 = r1
        L_0x0136:
            com.facebook.location.platform.api.Location r7 = new com.facebook.location.platform.api.Location
            r18 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23)
            return r7
        L_0x013e:
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0116
            double r21 = r21 + r1
            goto L_0x0116
        L_0x0145:
            r4 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f7
            java.lang.String r1 = "Builder"
            java.lang.String r0 = "Latitude set to lower than -90"
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromJSON(org.json.JSONObject):com.facebook.location.platform.api.Location");
    }

    public float getDistanceMeters(Location location) {
        float[] fArr = new float[1];
        android.location.Location.distanceBetween(this.mLatitude, this.mLongitude, location.mLatitude, location.mLongitude, fArr);
        return fArr[0];
    }

    private boolean hasAccuracy() {
        return AnonymousClass7TF.A1V(this.mAccuracy);
    }

    private String makeString(String str, Number number) {
        if (number == null) {
            return "";
        }
        return 002.A0u(", ", str, "=", number.toString());
    }

    public Float getAccuracy() {
        return this.mAccuracy;
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public Float getAltitudeAccuracy() {
        return this.mAltitudeAccuracy;
    }

    public Float getBearing() {
        return this.mBearing;
    }

    public Float getBearingAccuracy() {
        return this.mBearingAccuracy;
    }

    public Long getElapsedRealtimeNanos() {
        return this.mElapsedRealtimeNanos;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public Float getSpeed() {
        return this.mSpeed;
    }

    public Float getSpeedAccuracy() {
        return this.mSpeedAccuracy;
    }

    public Long getTimestamp() {
        return this.mTimestamp;
    }

    public String getUnderlyingProvider() {
        String string;
        Bundle bundle = this.mExtras;
        if (bundle == null || (string = bundle.getString("UNDERLYING_PROVIDER")) == null) {
            return this.mProvider;
        }
        return string;
    }

    public boolean isComplete() {
        Long l;
        Long l2;
        if (this.mProvider == null || !AnonymousClass7TF.A1V(this.mAccuracy) || (l = this.mTimestamp) == null || l.longValue() == 0 || (l2 = this.mElapsedRealtimeNanos) == null || l2.longValue() == 0) {
            return false;
        }
        return true;
    }

    public boolean isMockLocation() {
        return this.mIsMockLocation;
    }

    public Float optAccuracy(float f) {
        Float f2 = this.mAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Double optAltitude(double d) {
        Double d2 = this.mAltitude;
        if (d2 != null) {
            d = d2.doubleValue();
        }
        return Double.valueOf(d);
    }

    public Float optAltitudeAccuracy(float f) {
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearing(float f) {
        Float f2 = this.mBearing;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearingAccuracy(float f) {
        Float f2 = this.mBearingAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optElapsedRealtimeNano(long j) {
        Long l = this.mElapsedRealtimeNanos;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            return AnonymousClass7TE.A0a();
        }
        return bundle;
    }

    public Float optSpeed(float f) {
        Float f2 = this.mSpeed;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optSpeedAccuracy(float f) {
        Float f2 = this.mSpeedAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optTimestamp(long j) {
        Long l = this.mTimestamp;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public android.location.Location toAndroidLocation(String str) {
        long longValue;
        android.location.Location location = new android.location.Location(str);
        location.setLatitude(this.mLatitude);
        location.setLongitude(this.mLongitude);
        Double d = this.mAltitude;
        if (d != null) {
            location.setAltitude(d.doubleValue());
        }
        Long l = this.mTimestamp;
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        location.setTime(longValue);
        Float f = this.mAccuracy;
        if (f != null) {
            location.setAccuracy(f.floatValue());
        }
        Float f2 = this.mBearing;
        if (f2 != null) {
            location.setBearing(f2.floatValue());
        }
        Float f3 = this.mSpeed;
        if (f3 != null) {
            location.setSpeed(f3.floatValue());
        }
        Long l2 = this.mElapsedRealtimeNanos;
        if (l2 != null) {
            j = l2.longValue();
        }
        location.setElapsedRealtimeNanos(j);
        Float f4 = this.mSpeedAccuracy;
        if (f4 != null) {
            location.setSpeedAccuracyMetersPerSecond(f4.floatValue());
        }
        Float f5 = this.mBearingAccuracy;
        if (f5 != null) {
            location.setBearingAccuracyDegrees(f5.floatValue());
        }
        Float f6 = this.mAltitudeAccuracy;
        if (f6 != null) {
            location.setVerticalAccuracyMeters(f6.floatValue());
        }
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            location.setExtras(bundle);
        }
        return location;
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        sProviderMap = A1E;
        A1E.put("stub", "network");
        A1E.put("wps", "network");
        A1E.put("wps_zero_power", "network");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.location.platform.api.Location fromLocation(android.content.Context r23, android.location.Location r24, java.lang.String r25) {
        /*
            android.os.Bundle r0 = r24.getExtras()
            if (r0 != 0) goto L_0x0122
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
        L_0x000a:
            r0 = -1
            java.lang.String r1 = "satellites"
            int r0 = r8.getInt(r1, r0)
            if (r0 != 0) goto L_0x0023
            r8.remove(r1)
            java.lang.String r0 = "meanCn0"
            r8.remove(r0)
            java.lang.String r0 = "maxCn0"
            r8.remove(r0)
        L_0x0023:
            java.lang.String r0 = "fused"
            r2 = r25
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = "UNDERLYING_PROVIDER"
            r8.putString(r1, r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0c()
            java.lang.String r1 = "LOCATION_UUID"
            r8.putString(r1, r2)
        L_0x003b:
            double r19 = r24.getLatitude()
            double r21 = r24.getLongitude()
            boolean r1 = r24.hasAltitude()
            r15 = 0
            if (r1 == 0) goto L_0x011f
            double r1 = r24.getAltitude()
            java.lang.Double r9 = java.lang.Double.valueOf(r1)
        L_0x0052:
            boolean r1 = r24.hasAccuracy()
            if (r1 == 0) goto L_0x011c
            float r1 = r24.getAccuracy()
            java.lang.Float r10 = java.lang.Float.valueOf(r1)
        L_0x0060:
            boolean r1 = r24.hasBearing()
            if (r1 == 0) goto L_0x0119
            float r1 = r24.getBearing()
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
        L_0x006e:
            boolean r1 = r24.hasSpeed()
            if (r1 == 0) goto L_0x0116
            float r1 = r24.getSpeed()
            java.lang.Float r14 = java.lang.Float.valueOf(r1)
        L_0x007c:
            long r1 = r24.getTime()
            java.lang.Long r17 = java.lang.Long.valueOf(r1)
            long r1 = r24.getElapsedRealtimeNanos()
            java.lang.Long r16 = java.lang.Long.valueOf(r1)
            boolean r23 = r24.isFromMockProvider()
            boolean r1 = r24.hasVerticalAccuracy()
            if (r1 == 0) goto L_0x0114
            float r1 = r24.getVerticalAccuracyMeters()
            java.lang.Float r11 = java.lang.Float.valueOf(r1)
        L_0x009e:
            boolean r1 = r24.hasBearingAccuracy()
            if (r1 == 0) goto L_0x0112
            float r1 = r24.getBearingAccuracyDegrees()
            java.lang.Float r13 = java.lang.Float.valueOf(r1)
        L_0x00ac:
            boolean r1 = r24.hasSpeedAccuracy()
            if (r1 == 0) goto L_0x00ba
            float r1 = r24.getSpeedAccuracyMetersPerSecond()
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
        L_0x00ba:
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r1 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0104
            java.lang.String r2 = "Builder"
            java.lang.String r1 = "Latitude set to higher than 90"
        L_0x00c7:
            android.util.Log.w(r2, r1)
            r19 = r3
        L_0x00cc:
            r6 = -4582834833314545664(0xc066800000000000, double:-180.0)
            r4 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r1 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x00de
            int r1 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00eb
        L_0x00de:
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r21 = r21 % r2
            int r1 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00fd
            double r21 = r21 - r2
        L_0x00eb:
            if (r16 != 0) goto L_0x00f5
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Long r16 = java.lang.Long.valueOf(r1)
        L_0x00f5:
            com.facebook.location.platform.api.Location r7 = new com.facebook.location.platform.api.Location
            r18 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23)
            return r7
        L_0x00fd:
            int r1 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00eb
            double r21 = r21 + r2
            goto L_0x00eb
        L_0x0104:
            r3 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r1 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00cc
            java.lang.String r2 = "Builder"
            java.lang.String r1 = "Latitude set to lower than -90"
            goto L_0x00c7
        L_0x0112:
            r13 = r15
            goto L_0x00ac
        L_0x0114:
            r11 = r15
            goto L_0x009e
        L_0x0116:
            r14 = r15
            goto L_0x007c
        L_0x0119:
            r12 = r15
            goto L_0x006e
        L_0x011c:
            r10 = r15
            goto L_0x0060
        L_0x011f:
            r9 = r15
            goto L_0x0052
        L_0x0122:
            android.os.Bundle r0 = r24.getExtras()
            android.os.Bundle r8 = X.Pxe.A0J(r0)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromLocation(android.content.Context, android.location.Location, java.lang.String):com.facebook.location.platform.api.Location");
    }

    public JSONObject toJSON() {
        JSONObject A11 = DbS.A11();
        A11.put("provider", this.mProvider);
        double d = this.mLatitude;
        double d2 = 0.0d;
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        A11.put(LATITUDE, d);
        double d3 = this.mLongitude;
        if (!Double.isNaN(d3)) {
            d2 = d3;
        }
        A11.put(LONGITUDE, d2);
        Double d4 = this.mAltitude;
        if (d4 != null && !d4.isNaN()) {
            A11.put(ALTITUDE, this.mAltitude);
        }
        Float f = this.mAccuracy;
        if (f != null && !f.isNaN()) {
            A11.put(ACCURACY, this.mAccuracy);
        }
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null && !f2.isNaN()) {
            A11.put(ALTITUDE_ACCURACY, this.mAltitudeAccuracy);
        }
        Float f3 = this.mBearing;
        if (f3 != null && !f3.isNaN()) {
            A11.put(BEARING, this.mBearing);
        }
        Float f4 = this.mBearingAccuracy;
        if (f4 != null && !f4.isNaN()) {
            A11.put(BEARING_ACCURACY, this.mBearingAccuracy);
        }
        Float f5 = this.mSpeed;
        if (f5 != null && !f5.isNaN()) {
            A11.put(SPEED, this.mSpeed);
        }
        Float f6 = this.mSpeedAccuracy;
        if (f6 != null && !f6.isNaN()) {
            A11.put(SPEED_ACCURACY, this.mSpeedAccuracy);
        }
        A11.put(LOCATION_TIMESTAMP, this.mTimestamp);
        A11.put(LOCATION_ELAPSEDTIME, this.mElapsedRealtimeNanos);
        A11.put(IS_MOCK_LOCATION, this.mIsMockLocation);
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            JSONObject A112 = DbS.A11();
            Iterator it = EXTRAS_SERIALIZATION_KEYS.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (bundle.containsKey(A18)) {
                    A112.put(A18, bundle.get(A18));
                }
            }
            A11.put(EXTRAS, A112);
        }
        return A11;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Location{mProvider=");
        A1A.append(this.mProvider);
        A1A.append(", mTimestamp=");
        A1A.append(this.mTimestamp);
        A1A.append(", mElapsedRealtimeNanos=");
        A1A.append(this.mElapsedRealtimeNanos);
        A1A.append(", mAccuracy=");
        A1A.append(this.mAccuracy);
        A1A.append(makeString("mAltitudeAccuracy", this.mAltitudeAccuracy));
        A1A.append(makeString("mBearing", this.mBearing));
        A1A.append(makeString("mBearingAccuracy", this.mBearingAccuracy));
        A1A.append(makeString("mSpeed", this.mSpeed));
        A1A.append(makeString("mSpeedAccuracy", this.mSpeedAccuracy));
        A1A.append(", mExtras=");
        A1A.append(this.mExtras);
        A1A.append(", mIsMockLocation=");
        A1A.append(this.mIsMockLocation);
        A1A.append(", underlyingProvider=");
        A1A.append(getUnderlyingProvider());
        return Pxg.A0x(A1A);
    }

    public Location(RLZ rlz) {
        throw AnonymousClass7TE.A11("mProvider");
    }

    public static Location fromJSON(String str) {
        try {
            return fromJSON(C66580MXl.A17(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public Float optAccuracy() {
        return optAccuracy(0.0f);
    }

    public Double optAltitude() {
        return optAltitude(0.0d);
    }

    public Float optAltitudeAccuracy() {
        return optAltitudeAccuracy(0.0f);
    }

    public Float optBearing() {
        return optBearing(0.0f);
    }

    public Float optBearingAccuracy() {
        return optBearingAccuracy(0.0f);
    }

    public Long optElapsedRealtimeNano() {
        return optElapsedRealtimeNano(0);
    }

    public Float optSpeed() {
        return optSpeed(0.0f);
    }

    public Float optSpeedAccuracy() {
        return optSpeedAccuracy(0.0f);
    }

    public Long optTimestamp() {
        return optTimestamp(0);
    }

    public android.location.Location toAndroidLocation() {
        String A11;
        Map map = sProviderMap;
        if (map.get(getUnderlyingProvider()) == null) {
            A11 = getUnderlyingProvider();
        } else {
            A11 = DbT.A11(getUnderlyingProvider(), map);
        }
        if (A11 == null) {
            A11 = "fused";
        }
        return toAndroidLocation(A11);
    }

    public Location() {
        this.mProvider = null;
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mAltitude = null;
        this.mTimestamp = null;
        this.mElapsedRealtimeNanos = null;
        this.mAccuracy = null;
        this.mAltitudeAccuracy = null;
        this.mBearing = null;
        this.mBearingAccuracy = null;
        this.mSpeed = null;
        this.mSpeedAccuracy = null;
        this.mExtras = null;
        this.mIsMockLocation = false;
    }
}

package com.facebook.location.platform.api;

import X.AnonymousClass7TE;
import X.C51972G9s;
import X.C9008RLc;
import X.DbS;
import X.JTR;
import X.Pxf;
import X.Pxg;
import X.SWY;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationRequest extends AutoSafeParcelable {
    public static final String BATCH_DURATION_SECONDS = "batchDurationSeconds";
    public static final Parcelable.Creator CREATOR = SWY.A00(LocationRequest.class);
    public static final String DESIRED_ACCURACY = "desiredAccuracy";
    public static final String DESIRED_INTERVAL = "desiredInterval";
    public static final String EXTRA_PARAMS = "extraParams";
    public static final String IS_OPPORTUNISTIC = "isOpportunistic";
    public static final String MAX_DURATION = "maximumDuration";
    public static final String MAX_INTERVAL = "maxInterval";
    public static final String MAX_POWER_USE = "maxPowerUse";
    public static final String MIN_DISPLACEMENT = "desiredSmallestDistance";
    public static final String NUM_LOCATIONS = "numberOfLocations";
    public static final int NUM_LOCATIONS_UNLIMITED = Integer.MAX_VALUE;
    public static final String PROVIDER = "provider";
    @SafeParcelable.Field(9)
    public final int mBatchDurationSec;
    @SafeParcelable.Field(1)
    public final int mDesiredAccuracy;
    @SafeParcelable.Field(5)
    public final int mDesiredIntervalSec;
    @SafeParcelable.Field(6)
    public final int mDesiredSmallestDistanceMeters;
    @SafeParcelable.Field(11)
    public final Bundle mExtraParams;
    @SafeParcelable.Field(4)
    public boolean mIsOpportunistic;
    @SafeParcelable.Field(7)
    public final long mMaxDurationSec;
    @SafeParcelable.Field(10)
    public final int mMaxIntervalSec;
    @SafeParcelable.Field(2)
    public final int mMaxPowerUse;
    @SafeParcelable.Field(8)
    public final int mNumLocations;
    @SafeParcelable.Field(3)
    public final String mProvider;

    public LocationRequest(Bundle bundle, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        this.mDesiredAccuracy = i2;
        this.mMaxPowerUse = i6;
        this.mProvider = str;
        this.mIsOpportunistic = z;
        this.mDesiredIntervalSec = i3;
        this.mDesiredSmallestDistanceMeters = i4;
        this.mMaxDurationSec = j;
        this.mNumLocations = i7;
        this.mBatchDurationSec = i;
        this.mMaxIntervalSec = i5;
        this.mExtraParams = bundle;
    }

    public void setStartTime() {
    }

    public static LocationRequest fromJSON(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(DESIRED_ACCURACY, 2);
        int optInt2 = jSONObject.optInt(MAX_POWER_USE, 2);
        String optString = jSONObject.optString("provider", "");
        boolean optBoolean = jSONObject.optBoolean(IS_OPPORTUNISTIC, false);
        int optInt3 = jSONObject.optInt(DESIRED_INTERVAL, 0);
        int optInt4 = jSONObject.optInt(MIN_DISPLACEMENT, 0);
        int optInt5 = jSONObject.optInt(MAX_DURATION, 0);
        int optInt6 = jSONObject.optInt(NUM_LOCATIONS, 0);
        int optInt7 = jSONObject.optInt(BATCH_DURATION_SECONDS, 0);
        int optInt8 = jSONObject.optInt(MAX_INTERVAL, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject(EXTRA_PARAMS);
        Bundle bundle = null;
        long j = (long) optInt5;
        if (optJSONObject != null) {
            bundle = AnonymousClass7TE.A0a();
            bundle.putString("PROVIDER", optJSONObject.optString("PROVIDER"));
        }
        if (optInt8 < optInt3 && optInt8 != -1) {
            Log.w("Builder", "Max Interval was set to value less than Desired Interval. Setting to default -1.");
            optInt8 = -1;
        }
        if (optString != null && !optString.equals("fused")) {
            if (bundle == null) {
                bundle = AnonymousClass7TE.A0a();
            }
            bundle.putString("PROVIDER", optString);
            optString = "fused";
        }
        if (optInt7 < optInt3) {
            optInt7 = optInt3;
        }
        return new LocationRequest(bundle, optString, optInt7, optInt, optInt3, optInt4, optInt8, optInt2, optInt6, j, optBoolean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r0 != null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 != r7) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r5 = 0
            if (r7 == 0) goto L_0x0053
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L_0x0053
            com.facebook.location.platform.api.LocationRequest r7 = (com.facebook.location.platform.api.LocationRequest) r7
            boolean r1 = r6.mIsOpportunistic
            boolean r0 = r7.mIsOpportunistic
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mDesiredIntervalSec
            int r0 = r7.mDesiredIntervalSec
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mDesiredSmallestDistanceMeters
            int r0 = r7.mDesiredSmallestDistanceMeters
            if (r1 != r0) goto L_0x0053
            long r3 = r6.mMaxDurationSec
            long r1 = r7.mMaxDurationSec
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0053
            int r1 = r6.mNumLocations
            int r0 = r7.mNumLocations
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mDesiredAccuracy
            int r0 = r7.mDesiredAccuracy
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mMaxPowerUse
            int r0 = r7.mMaxPowerUse
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mMaxIntervalSec
            int r0 = r7.mMaxIntervalSec
            if (r1 != r0) goto L_0x0053
            int r1 = r6.mBatchDurationSec
            int r0 = r7.mBatchDurationSec
            if (r1 != r0) goto L_0x0053
            android.os.Bundle r1 = r6.mExtraParams
            android.os.Bundle r0 = r7.mExtraParams
            if (r1 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x007c
        L_0x0053:
            return r5
        L_0x0054:
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r3 = X.Pxf.A0t(r1)
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            android.os.Bundle r0 = r6.mExtraParams
            java.lang.Object r1 = r0.get(r2)
            android.os.Bundle r0 = r7.mExtraParams
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x005a
            return r5
        L_0x0075:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            return r5
        L_0x007c:
            java.lang.String r1 = r6.mProvider
            java.lang.String r0 = r7.mProvider
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.LocationRequest.equals(java.lang.Object):boolean");
    }

    public int getBatchDurationSec() {
        return this.mBatchDurationSec;
    }

    public int getDesiredAccuracy() {
        return this.mDesiredAccuracy;
    }

    public int getDesiredIntervalSec() {
        return this.mDesiredIntervalSec;
    }

    public int getDesiredSmallestDistanceMeters() {
        return this.mDesiredSmallestDistanceMeters;
    }

    public Bundle getExtraParams() {
        return this.mExtraParams;
    }

    public long getMaxDurationSec() {
        return this.mMaxDurationSec;
    }

    public int getMaxIntervalSec() {
        return this.mMaxIntervalSec;
    }

    public int getMaxPowerUse() {
        return this.mMaxPowerUse;
    }

    public int getNumLocations() {
        return this.mNumLocations;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (((C51972G9s.A07(this.mMaxDurationSec, ((((((((((this.mDesiredAccuracy * 331) + this.mMaxPowerUse) * 31) + JTR.A0G(this.mProvider)) * 31) + (this.mIsOpportunistic ? 1 : 0)) * 31) + this.mDesiredIntervalSec) * 31) + this.mDesiredSmallestDistanceMeters) * 31) + this.mNumLocations) * 31) + this.mMaxIntervalSec) * 31;
        Bundle bundle = this.mExtraParams;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return A07 + i;
    }

    public boolean isOpportunistic() {
        return this.mIsOpportunistic;
    }

    public JSONObject toJSON() {
        JSONObject A11 = DbS.A11();
        A11.put(DESIRED_ACCURACY, this.mDesiredAccuracy);
        A11.put(MAX_POWER_USE, this.mMaxPowerUse);
        A11.put("provider", this.mProvider);
        A11.put(IS_OPPORTUNISTIC, this.mIsOpportunistic);
        A11.put(DESIRED_INTERVAL, this.mDesiredIntervalSec);
        A11.put(MIN_DISPLACEMENT, this.mDesiredSmallestDistanceMeters);
        A11.put(MAX_DURATION, this.mMaxDurationSec);
        A11.put(NUM_LOCATIONS, this.mNumLocations);
        A11.put(BATCH_DURATION_SECONDS, this.mBatchDurationSec);
        A11.put(MAX_INTERVAL, this.mMaxIntervalSec);
        A11.put(EXTRA_PARAMS, this.mExtraParams);
        return A11;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LocationRequest{mDesiredAccuracy=");
        A1A.append(this.mDesiredAccuracy);
        A1A.append(", mMaxPowerUse=");
        A1A.append(this.mMaxPowerUse);
        A1A.append(", mProvider='");
        Pxf.A1P(A1A, this.mProvider);
        A1A.append(", mIsOpportunistic=");
        A1A.append(this.mIsOpportunistic);
        A1A.append(", mDesiredIntervalSec=");
        A1A.append(this.mDesiredIntervalSec);
        A1A.append(", mDesiredSmallestDistanceMeters=");
        A1A.append(this.mDesiredSmallestDistanceMeters);
        A1A.append(", mMaxDurationSec=");
        A1A.append(this.mMaxDurationSec);
        A1A.append(", mNumLocations=");
        A1A.append(this.mNumLocations);
        A1A.append(", mBatchDurationSec=");
        A1A.append(this.mBatchDurationSec);
        A1A.append(", mMaxIntervalSec=");
        A1A.append(this.mMaxIntervalSec);
        A1A.append(", mExtraParams=");
        return Pxg.A0p(this.mExtraParams, A1A);
    }

    public LocationRequest(C9008RLc rLc) {
        this.mDesiredAccuracy = 1;
        this.mMaxPowerUse = 1;
        this.mProvider = "fused";
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 1;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0;
        this.mNumLocations = 1;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }

    public LocationRequest() {
        this.mDesiredAccuracy = 2;
        this.mMaxPowerUse = 1;
        this.mProvider = null;
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 0;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0;
        this.mNumLocations = 0;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }
}

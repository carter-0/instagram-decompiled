package com.facebook.location.platform.api;

import X.AnonymousClass7TF;
import X.DbS;
import X.SWY;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcelable;
import android.util.Log;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationSettingsStatus extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(LocationSettingsStatus.class);
    public static final String TAG = "LocationSettingsStatus";
    @SafeParcelable.Field(2)
    public PendingIntent mResolutionIntent;
    @SafeParcelable.Field(1)
    public int mStatusCode;

    public PendingIntent getResolutionIntent() {
        return this.mResolutionIntent;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isResolvableError() {
        return AnonymousClass7TF.A1V(this.mResolutionIntent);
    }

    public void startResolutionIntent(Activity activity, int i) {
        PendingIntent pendingIntent = this.mResolutionIntent;
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, DbS.A09(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                Log.e(TAG, "Exception", e);
            }
        }
    }

    public LocationSettingsStatus(int i, PendingIntent pendingIntent) {
        this.mStatusCode = i;
        this.mResolutionIntent = pendingIntent;
    }

    public LocationSettingsStatus(int i) {
        this(i, (PendingIntent) null);
    }

    public LocationSettingsStatus() {
    }
}

package com.facebook.wearable.applinks;

import X.SWY;
import android.os.Parcelable;
import com.oculus.applinks.LinkAppDeviceIdentityResponse;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceIdentityResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(AppLinkDeviceIdentityResponse.class);
    @SafeParcelable.Field(2)
    public byte[] devicePublicKey;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityResponse(LinkAppDeviceIdentityResponse linkAppDeviceIdentityResponse) {
        this.serviceUUID = linkAppDeviceIdentityResponse.serviceUUID_.A05();
        this.devicePublicKey = linkAppDeviceIdentityResponse.devicePublicKey_.A05();
    }

    public AppLinkDeviceIdentityResponse() {
    }
}

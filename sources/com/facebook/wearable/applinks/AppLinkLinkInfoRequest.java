package com.facebook.wearable.applinks;

import X.SWY;
import android.os.Parcelable;
import com.oculus.applinks.LinkAppLinkInfoRequest;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(AppLinkLinkInfoRequest.class);
    @SafeParcelable.Field(2)
    public int linkType;
    @SafeParcelable.Field(3)
    public int requestType;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkLinkInfoRequest(LinkAppLinkInfoRequest linkAppLinkInfoRequest) {
        this.serviceUUID = linkAppLinkInfoRequest.serviceUUID_.A05();
        this.linkType = linkAppLinkInfoRequest.linkType_;
        this.requestType = linkAppLinkInfoRequest.requestType_;
    }

    public AppLinkLinkInfoRequest() {
    }
}

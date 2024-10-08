package com.facebook.wearable.applinks;

import X.AnonymousClass7TE;
import X.C13982TnY;
import X.SWY;
import android.os.Parcelable;
import com.oculus.applinks.LinkAddress;
import com.oculus.applinks.LinkAppLinkInfoResponse;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(AppLinkLinkInfoResponse.class);
    @SafeParcelable.Field(subClass = AppLinkLinkAddress.class, value = 1)
    public List addressList;
    @SafeParcelable.Field(7)
    public byte[] buildFlavor;
    @SafeParcelable.Field(5)
    public byte[] deviceImageAssetURI;
    @SafeParcelable.Field(6)
    public byte[] deviceModelName;
    @SafeParcelable.Field(8)
    public byte[] deviceName;
    @SafeParcelable.Field(4)
    public byte[] deviceSerial;
    @SafeParcelable.Field(3)
    public byte[] firmwareVersion;
    @SafeParcelable.Field(9)
    public byte[] hardwareType;
    @SafeParcelable.Field(10)
    public byte[] macAddress;

    public AppLinkLinkInfoResponse(LinkAppLinkInfoResponse linkAppLinkInfoResponse) {
        C13982TnY<LinkAddress> tnY = linkAppLinkInfoResponse.addresses_;
        this.addressList = AnonymousClass7TE.A1C();
        for (LinkAddress appLinkLinkAddress : tnY) {
            this.addressList.add(new AppLinkLinkAddress(appLinkLinkAddress));
        }
        this.firmwareVersion = linkAppLinkInfoResponse.firmwareVersion_.A05();
        this.deviceSerial = linkAppLinkInfoResponse.deviceSerial_.A05();
        this.deviceImageAssetURI = linkAppLinkInfoResponse.deviceImageAssetURI_.A05();
        this.deviceModelName = linkAppLinkInfoResponse.deviceModelName_.A05();
        this.buildFlavor = linkAppLinkInfoResponse.buildFlavor_.A05();
        this.deviceName = linkAppLinkInfoResponse.deviceName_.A05();
        this.hardwareType = linkAppLinkInfoResponse.hardwareType_.A05();
        this.macAddress = linkAppLinkInfoResponse.macAddress_.A05();
    }

    public AppLinkLinkInfoResponse() {
    }
}

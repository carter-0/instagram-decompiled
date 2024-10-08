package com.facebook.wearable.applinks;

import X.RJG;
import X.SWY;
import android.os.Parcelable;
import com.oculus.applinks.LinkAddress;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkAddress extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWY.A00(AppLinkLinkAddress.class);
    @SafeParcelable.Field(2)
    public String address;
    @SafeParcelable.Field(1)
    public int addressType;

    public AppLinkLinkAddress(LinkAddress linkAddress) {
        RJG rjg;
        this.address = linkAddress.data_.A04();
        int i = linkAddress.addressType_;
        if (i == 0) {
            rjg = RJG.EMPTY;
        } else if (i == 1) {
            rjg = RJG.IPV4;
        } else if (i == 2) {
            rjg = RJG.IPV6;
        } else if (i != 3) {
            rjg = RJG.UNRECOGNIZED;
        } else {
            rjg = RJG.BTC;
        }
        this.addressType = rjg.BXO();
    }

    public AppLinkLinkAddress() {
    }
}

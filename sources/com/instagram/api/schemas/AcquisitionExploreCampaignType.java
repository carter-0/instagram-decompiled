package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AcquisitionExploreCampaignType implements Parcelable {
    UNRECOGNIZED("AcquisitionExploreCampaignType_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AcquisitionExploreCampaignType[] acquisitionExploreCampaignTypeArr;
        A02 = 0oU.A00(acquisitionExploreCampaignTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AcquisitionExploreCampaignType acquisitionExploreCampaignType : values()) {
            A0x.put(acquisitionExploreCampaignType.A00, acquisitionExploreCampaignType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AcquisitionExploreCampaignType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}

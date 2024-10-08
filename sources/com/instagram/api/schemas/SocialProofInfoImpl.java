package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class SocialProofInfoImpl extends AnonymousClass0T0 implements Parcelable, SocialProofInfo {
    public static final Parcelable.Creator CREATOR = new C376419Hx(26);
    public final Integer A00;

    public final SocialProofInfoImpl F9D() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SocialProofInfoImpl) && 0qQ.A0K(this.A00, ((SocialProofInfoImpl) obj).A00));
    }

    public final int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        0qQ.A0B(parcel, 0);
        Integer num = this.A00;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public final Integer BX2() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.A00;
        if (num != null) {
            linkedHashMap.put("numOfConversationsStartedWithBusiness", num);
        }
        return new TreeUpdaterJNI("XDTCTMessagingSocialProofInfo", 0Yt.A0B(linkedHashMap));
    }

    public SocialProofInfoImpl(Integer num) {
        this.A00 = num;
    }
}

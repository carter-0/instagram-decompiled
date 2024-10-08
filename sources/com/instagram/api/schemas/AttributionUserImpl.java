package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.C41872B4q;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AttributionUserImpl extends AnonymousClass0T0 implements Parcelable, AttributionUser {
    public static final Parcelable.Creator CREATOR = new C376409Hw(52);
    public final ProfilePicture A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;

    public final AttributionUserImpl F0a() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AttributionUserImpl) {
                AttributionUserImpl attributionUserImpl = (AttributionUserImpl) obj;
                if (!0qQ.A0K(this.A02, attributionUserImpl.A02) || !0qQ.A0K(this.A01, attributionUserImpl.A01) || !0qQ.A0K(this.A00, attributionUserImpl.A00) || !0qQ.A0K(this.A03, attributionUserImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ProfilePicture profilePicture = this.A00;
        int hashCode3 = (hashCode2 + (profilePicture == null ? 0 : profilePicture.hashCode())) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A01;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public final ProfilePicture Bh6() {
        return this.A00;
    }

    public final Boolean CeL() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAttributionUser", C41872B4q.A00(this));
    }

    public final String getInstagramUserId() {
        return this.A02;
    }

    public final String getUsername() {
        return this.A03;
    }

    public AttributionUserImpl(ProfilePicture profilePicture, Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A01 = bool;
        this.A00 = profilePicture;
        this.A03 = str2;
    }
}

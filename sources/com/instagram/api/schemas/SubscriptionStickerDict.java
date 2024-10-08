package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C44478Cfa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class SubscriptionStickerDict extends AnonymousClass0T0 implements SubscriptionStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(43);
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final SubscriptionStickerDict FC2(1E9 r1) {
        return this;
    }

    public final SubscriptionStickerDict FC3(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionStickerDict) {
                SubscriptionStickerDict subscriptionStickerDict = (SubscriptionStickerDict) obj;
                if (!0qQ.A0K(this.A00, subscriptionStickerDict.A00) || !0qQ.A0K(this.A01, subscriptionStickerDict.A01) || !0qQ.A0K(this.A02, subscriptionStickerDict.A02) || !0qQ.A0K(this.A03, subscriptionStickerDict.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A00;
        int i = 0;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final User AsS() {
        return this.A00;
    }

    public final String AsX() {
        return this.A01;
    }

    public final String Asb() {
        return this.A02;
    }

    public final String Asi() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSubscriptionStickerDict", C44478Cfa.A00(this));
    }

    public SubscriptionStickerDict(User user, String str, String str2, String str3) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final SubscriptionStickerDictIntf E9E(1E9 r1) {
        return this;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CVC;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

public final class BusinessProfileDictImpl extends AnonymousClass0T0 implements Parcelable, BusinessProfileDict {
    public static final Parcelable.Creator CREATOR = new SWT(73);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final BusinessProfileDictImpl F12() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BusinessProfileDictImpl) {
                BusinessProfileDictImpl businessProfileDictImpl = (BusinessProfileDictImpl) obj;
                if (!0qQ.A0K(this.A01, businessProfileDictImpl.A01) || !0qQ.A0K(this.A00, businessProfileDictImpl.A00) || !0qQ.A0K(this.A02, businessProfileDictImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public final ImageUrl Bh3() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBusinessProfileDict", CVC.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public BusinessProfileDictImpl(ImageUrl imageUrl, String str, String str2) {
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
    }
}

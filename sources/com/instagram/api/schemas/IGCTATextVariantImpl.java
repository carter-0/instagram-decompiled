package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C48333Ecq;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGCTATextVariantImpl extends AnonymousClass0T0 implements Parcelable, IGCTATextVariant {
    public static final Parcelable.Creator CREATOR = FK5.A00(12);
    public final IGCTATextVariantSource A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;

    public final IGCTATextVariantImpl F46() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCTATextVariantImpl) {
                IGCTATextVariantImpl iGCTATextVariantImpl = (IGCTATextVariantImpl) obj;
                if (!0qQ.A0K(this.A02, iGCTATextVariantImpl.A02) || !0qQ.A0K(this.A01, iGCTATextVariantImpl.A01) || !0qQ.A0K(this.A03, iGCTATextVariantImpl.A03) || this.A00 != iGCTATextVariantImpl.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
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
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final String AtR() {
        return this.A02;
    }

    public final Boolean BAz() {
        return this.A01;
    }

    public final String BKV() {
        return this.A03;
    }

    public final IGCTATextVariantSource C5d() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGCTATextVariant", C48333Ecq.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public IGCTATextVariantImpl(IGCTATextVariantSource iGCTATextVariantSource, Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A00 = iGCTATextVariantSource;
    }
}

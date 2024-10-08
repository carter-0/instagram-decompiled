package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CV2;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class BoostUpsellBannerPayloadSchemaImpl extends AnonymousClass0T0 implements Parcelable, BoostUpsellBannerPayloadSchema {
    public static final Parcelable.Creator CREATOR = new SWT(64);
    public final String A00;
    public final String A01;
    public final String A02;

    public final BoostUpsellBannerPayloadSchemaImpl F0u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BoostUpsellBannerPayloadSchemaImpl) {
                BoostUpsellBannerPayloadSchemaImpl boostUpsellBannerPayloadSchemaImpl = (BoostUpsellBannerPayloadSchemaImpl) obj;
                if (!0qQ.A0K(this.A00, boostUpsellBannerPayloadSchemaImpl.A00) || !0qQ.A0K(this.A01, boostUpsellBannerPayloadSchemaImpl.A01) || !0qQ.A0K(this.A02, boostUpsellBannerPayloadSchemaImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final String Ago() {
        return this.A01;
    }

    public final String AnY() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBoostUpsellBannerPayloadSchema", CV2.A00(this));
    }

    public final String getActionUrl() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public BoostUpsellBannerPayloadSchemaImpl(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}

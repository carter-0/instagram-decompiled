package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CWZ;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorDigestSignalInfoImpl extends AnonymousClass0T0 implements Parcelable, CreatorDigestSignalInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(29);
    public final InspirationSignalType A00;
    public final String A01;
    public final String A02;

    public final CreatorDigestSignalInfoImpl F2H() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorDigestSignalInfoImpl) {
                CreatorDigestSignalInfoImpl creatorDigestSignalInfoImpl = (CreatorDigestSignalInfoImpl) obj;
                if (this.A00 != creatorDigestSignalInfoImpl.A00 || !0qQ.A0K(this.A01, creatorDigestSignalInfoImpl.A01) || !0qQ.A0K(this.A02, creatorDigestSignalInfoImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final InspirationSignalType BwM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorDigestSignalInfo", CWZ.A00(this));
    }

    public final String getSubtitle() {
        return this.A01;
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public CreatorDigestSignalInfoImpl(InspirationSignalType inspirationSignalType, String str, String str2) {
        this.A00 = inspirationSignalType;
        this.A01 = str;
        this.A02 = str2;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44588ChM;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class XpostOriginalSoundFBCreatorInfoImpl extends AnonymousClass0T0 implements Parcelable, XpostOriginalSoundFBCreatorInfo {
    public static final Parcelable.Creator CREATOR = new FK6(75);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final XpostOriginalSoundFBCreatorInfoImpl FDX() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XpostOriginalSoundFBCreatorInfoImpl) {
                XpostOriginalSoundFBCreatorInfoImpl xpostOriginalSoundFBCreatorInfoImpl = (XpostOriginalSoundFBCreatorInfoImpl) obj;
                if (!0qQ.A0K(this.A00, xpostOriginalSoundFBCreatorInfoImpl.A00) || !0qQ.A0K(this.A01, xpostOriginalSoundFBCreatorInfoImpl.A01) || !0qQ.A0K(this.A02, xpostOriginalSoundFBCreatorInfoImpl.A02) || !0qQ.A0K(this.A03, xpostOriginalSoundFBCreatorInfoImpl.A03)) {
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
        parcel.writeString(this.A03);
    }

    public final String Asa() {
        return this.A00;
    }

    public final String Asc() {
        return this.A01;
    }

    public final String B4J() {
        return this.A02;
    }

    public final String B4K() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTXpostOriginalSoundFBCreatorInfo", C44588ChM.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public XpostOriginalSoundFBCreatorInfoImpl(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}

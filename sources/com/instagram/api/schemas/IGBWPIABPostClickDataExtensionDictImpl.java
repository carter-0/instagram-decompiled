package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C48331Eco;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGBWPIABPostClickDataExtensionDictImpl extends AnonymousClass0T0 implements Parcelable, IGBWPIABPostClickDataExtensionDict {
    public static final Parcelable.Creator CREATOR = FK5.A00(10);
    public final IGBWPExperienceTypes A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final IGBWPIABPostClickDataExtensionDictImpl F41() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGBWPIABPostClickDataExtensionDictImpl) {
                IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl = (IGBWPIABPostClickDataExtensionDictImpl) obj;
                if (!0qQ.A0K(this.A03, iGBWPIABPostClickDataExtensionDictImpl.A03) || !0qQ.A0K(this.A01, iGBWPIABPostClickDataExtensionDictImpl.A01) || !0qQ.A0K(this.A02, iGBWPIABPostClickDataExtensionDictImpl.A02) || !0qQ.A0K(this.A04, iGBWPIABPostClickDataExtensionDictImpl.A04) || !0qQ.A0K(this.A05, iGBWPIABPostClickDataExtensionDictImpl.A05) || this.A00 != iGBWPIABPostClickDataExtensionDictImpl.A00 || !0qQ.A0K(this.A06, iGBWPIABPostClickDataExtensionDictImpl.A06) || !0qQ.A0K(this.A07, iGBWPIABPostClickDataExtensionDictImpl.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public final Integer AXk() {
        return this.A01;
    }

    public final Integer AXl() {
        return this.A02;
    }

    public final String Ac0() {
        return this.A04;
    }

    public final String AfY() {
        return this.A05;
    }

    public final IGBWPExperienceTypes Aj4() {
        return this.A00;
    }

    public final String Anc() {
        return this.A06;
    }

    public final String BaI() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGBWPIABPostClickDataExtensionDict", C48331Eco.A00(this));
    }

    public final String getAccessToken() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public IGBWPIABPostClickDataExtensionDictImpl(IGBWPExperienceTypes iGBWPExperienceTypes, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = iGBWPExperienceTypes;
        this.A06 = str4;
        this.A07 = str5;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CZF;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGProjectPortalInfoDictImpl extends AnonymousClass0T0 implements Parcelable, IGProjectPortalInfoDict {
    public static final Parcelable.Creator CREATOR = new FK5(28);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final IGProjectPortalInfoDictImpl F4w() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGProjectPortalInfoDictImpl) {
                IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl = (IGProjectPortalInfoDictImpl) obj;
                if (!0qQ.A0K(this.A00, iGProjectPortalInfoDictImpl.A00) || !0qQ.A0K(this.A01, iGProjectPortalInfoDictImpl.A01) || !0qQ.A0K(this.A02, iGProjectPortalInfoDictImpl.A02) || !0qQ.A0K(this.A03, iGProjectPortalInfoDictImpl.A03) || !0qQ.A0K(this.A04, iGProjectPortalInfoDictImpl.A04) || !0qQ.A0K(this.A05, iGProjectPortalInfoDictImpl.A05)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final String AhG() {
        return this.A00;
    }

    public final String AlO() {
        return this.A01;
    }

    public final String AlP() {
        return this.A02;
    }

    public final String AlT() {
        return this.A03;
    }

    public final String C4Z() {
        return this.A04;
    }

    public final String C8N() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGProjectPortalInfoDict", CZF.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public IGProjectPortalInfoDictImpl(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }
}

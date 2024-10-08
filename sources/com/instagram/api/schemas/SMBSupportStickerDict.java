package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44327Cd9;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class SMBSupportStickerDict extends AnonymousClass0T0 implements SMBSupportStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = DE6.A00(69);
    public final BusinessProfileDict A00;
    public final SMBPartnerType A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final SMBSupportStickerDict F8n() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SMBSupportStickerDict) {
                SMBSupportStickerDict sMBSupportStickerDict = (SMBSupportStickerDict) obj;
                if (!0qQ.A0K(this.A00, sMBSupportStickerDict.A00) || !0qQ.A0K(this.A03, sMBSupportStickerDict.A03) || !0qQ.A0K(this.A04, sMBSupportStickerDict.A04) || !0qQ.A0K(this.A05, sMBSupportStickerDict.A05) || !0qQ.A0K(this.A06, sMBSupportStickerDict.A06) || !0qQ.A0K(this.A07, sMBSupportStickerDict.A07) || !0qQ.A0K(this.A08, sMBSupportStickerDict.A08) || !0qQ.A0K(this.A02, sMBSupportStickerDict.A02) || !0qQ.A0K(this.A09, sMBSupportStickerDict.A09) || !0qQ.A0K(this.A0A, sMBSupportStickerDict.A0A) || this.A01 != sMBSupportStickerDict.A01 || !0qQ.A0K(this.A0B, sMBSupportStickerDict.A0B) || !0qQ.A0K(this.A0C, sMBSupportStickerDict.A0C) || !0qQ.A0K(this.A0D, sMBSupportStickerDict.A0D) || !0qQ.A0K(this.A0E, sMBSupportStickerDict.A0E)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
    }

    public final BusinessProfileDict Aib() {
        return this.A00;
    }

    public final String Air() {
        return this.A03;
    }

    public final String Ais() {
        return this.A04;
    }

    public final String AtV() {
        return this.A06;
    }

    public final String Axm() {
        return this.A07;
    }

    public final Float BZE() {
        return this.A02;
    }

    public final String Bao() {
        return this.A09;
    }

    public final SMBPartnerType Bso() {
        return this.A01;
    }

    public final String C2c() {
        return this.A0C;
    }

    public final String C7r() {
        return this.A0E;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSMBSupportStickerDict", C44327Cd9.A00(this));
    }

    public final String getCtaTitle() {
        return this.A05;
    }

    public final String getEndBackgroundColor() {
        return this.A08;
    }

    public final String getPk() {
        return this.A0A;
    }

    public final String getStartBackgroundColor() {
        return this.A0B;
    }

    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + C41845B3m.A00(this.A0E);
    }

    public SMBSupportStickerDict(BusinessProfileDict businessProfileDict, SMBPartnerType sMBPartnerType, Float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A00 = businessProfileDict;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A02 = f;
        this.A09 = str7;
        this.A0A = str8;
        this.A01 = sMBPartnerType;
        this.A0B = str9;
        this.A0C = str10;
        this.A0D = str11;
        this.A0E = str12;
    }
}

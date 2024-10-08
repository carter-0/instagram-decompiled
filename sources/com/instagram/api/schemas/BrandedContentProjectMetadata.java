package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C63012Kq2;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class BrandedContentProjectMetadata extends AnonymousClass0T0 implements BrandedContentProjectMetadataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(71);
    public final BCPDealOutputTypeEnum A00;
    public final BrandedContentProjectAction A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public BrandedContentProjectMetadata(BCPDealOutputTypeEnum bCPDealOutputTypeEnum, BrandedContentProjectAction brandedContentProjectAction, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(brandedContentProjectAction, 1);
        0qQ.A0B(str5, 8);
        this.A01 = brandedContentProjectAction;
        this.A02 = bool;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = bCPDealOutputTypeEnum;
        this.A07 = str5;
        this.A08 = str6;
    }

    public final BrandedContentProjectMetadata F0y() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentProjectMetadata) {
                BrandedContentProjectMetadata brandedContentProjectMetadata = (BrandedContentProjectMetadata) obj;
                if (this.A01 != brandedContentProjectMetadata.A01 || !0qQ.A0K(this.A02, brandedContentProjectMetadata.A02) || !0qQ.A0K(this.A03, brandedContentProjectMetadata.A03) || !0qQ.A0K(this.A04, brandedContentProjectMetadata.A04) || !0qQ.A0K(this.A05, brandedContentProjectMetadata.A05) || !0qQ.A0K(this.A06, brandedContentProjectMetadata.A06) || this.A00 != brandedContentProjectMetadata.A00 || !0qQ.A0K(this.A07, brandedContentProjectMetadata.A07) || !0qQ.A0K(this.A08, brandedContentProjectMetadata.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Boolean bool = this.A02;
        int i = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum = this.A00;
        int hashCode7 = (((hashCode6 + (bCPDealOutputTypeEnum == null ? 0 : bCPDealOutputTypeEnum.hashCode())) * 31) + this.A07.hashCode()) * 31;
        String str5 = this.A08;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A02;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
    }

    public final BrandedContentProjectAction AYA() {
        return this.A01;
    }

    public final Boolean Aa1() {
        return this.A02;
    }

    public final String Ahf() {
        return this.A03;
    }

    public final String Ahm() {
        return this.A04;
    }

    public final String Aju() {
        return this.A05;
    }

    public final String Ajv() {
        return this.A06;
    }

    public final BCPDealOutputTypeEnum AvT() {
        return this.A00;
    }

    public final String Bhc() {
        return this.A07;
    }

    public final String Bhd() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBrandedContentProjectMetadata", C63012Kq2.A00(this));
    }
}

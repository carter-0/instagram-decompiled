package com.instagram.feed.media;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.B4X;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.List;

public final class CreativeConfig extends AnonymousClass0T0 implements CreativeConfigIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(9);
    public final AttributionUser A00;
    public final EffectPreview A01;
    public final ProductItemWithAR A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;

    public final CreativeConfig FDy(1E9 r1) {
        return this;
    }

    public final CreativeConfig FDz(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreativeConfig) {
                CreativeConfig creativeConfig = (CreativeConfig) obj;
                if (!0qQ.A0K(this.A00, creativeConfig.A00) || !0qQ.A0K(this.A0B, creativeConfig.A0B) || !0qQ.A0K(this.A03, creativeConfig.A03) || !0qQ.A0K(this.A0C, creativeConfig.A0C) || !0qQ.A0K(this.A04, creativeConfig.A04) || !0qQ.A0K(this.A05, creativeConfig.A05) || !0qQ.A0K(this.A0D, creativeConfig.A0D) || !0qQ.A0K(this.A01, creativeConfig.A01) || !0qQ.A0K(this.A02, creativeConfig.A02) || !0qQ.A0K(this.A06, creativeConfig.A06) || !0qQ.A0K(this.A07, creativeConfig.A07) || !0qQ.A0K(this.A08, creativeConfig.A08) || !0qQ.A0K(this.A09, creativeConfig.A09) || !0qQ.A0K(this.A0E, creativeConfig.A0E) || !0qQ.A0K(this.A0A, creativeConfig.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AttributionUser attributionUser = this.A00;
        int i = 0;
        int hashCode = (attributionUser == null ? 0 : attributionUser.hashCode()) * 31;
        List list = this.A0B;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.A0D;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        EffectPreview effectPreview = this.A01;
        int hashCode8 = (hashCode7 + (effectPreview == null ? 0 : effectPreview.hashCode())) * 31;
        ProductItemWithAR productItemWithAR = this.A02;
        int hashCode9 = (hashCode8 + (productItemWithAR == null ? 0 : productItemWithAR.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A08;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A09;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list4 = this.A0E;
        int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.A0A;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode14 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A03);
        List<CameraToolInfo> list = this.A0C;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (CameraToolInfo writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        List<EffectPreview> list2 = this.A0D;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (EffectPreview writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        EffectPreview effectPreview = this.A01;
        if (effectPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectPreview.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        List<Parcelable> list3 = this.A0E;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Parcelable writeParcelable : list3) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeString(this.A0A);
    }

    public final AttributionUser AdD() {
        return this.A00;
    }

    public final List Ajq() {
        return this.A0B;
    }

    public final List AsN() {
        return this.A0C;
    }

    public final String Ayr() {
        return this.A04;
    }

    public final String Ays() {
        return this.A05;
    }

    public final List B02() {
        return this.A0D;
    }

    public final /* bridge */ /* synthetic */ EffectPreviewIntf B0A() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ ProductItemWithARIntf B0B() {
        return this.A02;
    }

    public final String B30() {
        return this.A06;
    }

    public final String B3W() {
        return this.A07;
    }

    public final String B7Y() {
        return this.A09;
    }

    public final List B92() {
        return this.A0E;
    }

    public final String Bbn() {
        return this.A0A;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeConfigDict", B4X.A00(this));
    }

    public final String getCaptureType() {
        return this.A03;
    }

    public final String getFailureReason() {
        return this.A08;
    }

    public CreativeConfig(AttributionUser attributionUser, EffectPreview effectPreview, ProductItemWithAR productItemWithAR, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4) {
        this.A00 = attributionUser;
        this.A0B = list;
        this.A03 = str;
        this.A0C = list2;
        this.A04 = str2;
        this.A05 = str3;
        this.A0D = list3;
        this.A01 = effectPreview;
        this.A02 = productItemWithAR;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A0E = list4;
        this.A0A = str8;
    }

    public final CreativeConfigIntf E9f(1E9 r1) {
        return this;
    }
}

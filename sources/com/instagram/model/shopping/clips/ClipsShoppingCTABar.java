package com.instagram.model.shopping.clips;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.C44914Cn5;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ClipsShoppingCTABar extends AnonymousClass0T0 implements ClipsShoppingCTABarIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(94);
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final ClipsShoppingCTABar FFN() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsShoppingCTABar) {
                ClipsShoppingCTABar clipsShoppingCTABar = (ClipsShoppingCTABar) obj;
                if (!0qQ.A0K(this.A00, clipsShoppingCTABar.A00) || !0qQ.A0K(this.A02, clipsShoppingCTABar.A02) || !0qQ.A0K(this.A03, clipsShoppingCTABar.A03) || !0qQ.A0K(this.A04, clipsShoppingCTABar.A04) || !0qQ.A0K(this.A01, clipsShoppingCTABar.A01) || !0qQ.A0K(this.A09, clipsShoppingCTABar.A09) || !0qQ.A0K(this.A05, clipsShoppingCTABar.A05) || !0qQ.A0K(this.A06, clipsShoppingCTABar.A06) || !0qQ.A0K(this.A07, clipsShoppingCTABar.A07) || !0qQ.A0K(this.A08, clipsShoppingCTABar.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TH.A0P(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
    }

    public final Float Abn() {
        return this.A00;
    }

    public final Integer AzW() {
        return this.A01;
    }

    public final List BgO() {
        return this.A09;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsShoppingCTABar", C44914Cn5.A00(this));
    }

    public final String getCtaBarType() {
        return this.A02;
    }

    public final String getDestination() {
        return this.A03;
    }

    public final String getDominantColor() {
        return this.A04;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public final String getToggledDestination() {
        return this.A07;
    }

    public final String getToggledTitle() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A08);
    }

    public ClipsShoppingCTABar(Float f, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A00 = f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A09 = list;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.C41848B3p;
import X.C44165CYe;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGAdCreativeStory9x16CaptionDataImpl extends AnonymousClass0T0 implements IGAdCreativeStory9x16CaptionData, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK5(1);
    public final CaptionTextFontStyle A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final IGAdCreativeStory9x16CaptionDataImpl F3o() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdCreativeStory9x16CaptionDataImpl) {
                IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl = (IGAdCreativeStory9x16CaptionDataImpl) obj;
                if (!0qQ.A0K(this.A08, iGAdCreativeStory9x16CaptionDataImpl.A08) || !0qQ.A0K(this.A09, iGAdCreativeStory9x16CaptionDataImpl.A09) || !0qQ.A0K(this.A05, iGAdCreativeStory9x16CaptionDataImpl.A05) || !0qQ.A0K(this.A03, iGAdCreativeStory9x16CaptionDataImpl.A03) || !0qQ.A0K(this.A04, iGAdCreativeStory9x16CaptionDataImpl.A04) || !0qQ.A0K(this.A0A, iGAdCreativeStory9x16CaptionDataImpl.A0A) || !0qQ.A0K(this.A06, iGAdCreativeStory9x16CaptionDataImpl.A06) || this.A00 != iGAdCreativeStory9x16CaptionDataImpl.A00 || !0qQ.A0K(this.A07, iGAdCreativeStory9x16CaptionDataImpl.A07) || !0qQ.A0K(this.A01, iGAdCreativeStory9x16CaptionDataImpl.A01) || !0qQ.A0K(this.A02, iGAdCreativeStory9x16CaptionDataImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        AnonymousClass7TH.A0P(parcel, this.A03);
        AnonymousClass7TH.A0P(parcel, this.A04);
        parcel.writeString(this.A0A);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        C41848B3p.A1I(parcel, this.A01);
        C41848B3p.A1I(parcel, this.A02);
    }

    public final String AlO() {
        return this.A08;
    }

    public final String AlP() {
        return this.A09;
    }

    public final Integer AlQ() {
        return this.A05;
    }

    public final Float AlR() {
        return this.A03;
    }

    public final Float AlS() {
        return this.A04;
    }

    public final String AlT() {
        return this.A0A;
    }

    public final Integer AlU() {
        return this.A06;
    }

    public final CaptionTextFontStyle AlV() {
        return this.A00;
    }

    public final Integer AlY() {
        return this.A07;
    }

    public final Boolean AlZ() {
        return this.A01;
    }

    public final Boolean Ala() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGAdCreativeStory9x16CaptionData", C44165CYe.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0E(this.A08) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public IGAdCreativeStory9x16CaptionDataImpl(CaptionTextFontStyle captionTextFontStyle, Boolean bool, Boolean bool2, Float f, Float f2, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        this.A08 = str;
        this.A09 = str2;
        this.A05 = num;
        this.A03 = f;
        this.A04 = f2;
        this.A0A = str3;
        this.A06 = num2;
        this.A00 = captionTextFontStyle;
        this.A07 = num3;
        this.A01 = bool;
        this.A02 = bool2;
    }
}

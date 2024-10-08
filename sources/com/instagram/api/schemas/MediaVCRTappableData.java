package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.CaL;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class MediaVCRTappableData extends AnonymousClass0T0 implements Parcelable, MediaVCRTappableDataIntf {
    public static final Parcelable.Creator CREATOR = new FK5(71);
    public final User A00;
    public final Float A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public final MediaVCRTappableData F64(1E9 r1) {
        return this;
    }

    public final MediaVCRTappableData F65(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaVCRTappableData) {
                MediaVCRTappableData mediaVCRTappableData = (MediaVCRTappableData) obj;
                if (this.A0A != mediaVCRTappableData.A0A || !0qQ.A0K(this.A03, mediaVCRTappableData.A03) || !0qQ.A0K(this.A01, mediaVCRTappableData.A01) || !0qQ.A0K(this.A00, mediaVCRTappableData.A00) || !0qQ.A0K(this.A04, mediaVCRTappableData.A04) || !0qQ.A0K(this.A05, mediaVCRTappableData.A05) || !0qQ.A0K(this.A06, mediaVCRTappableData.A06) || !0qQ.A0K(this.A07, mediaVCRTappableData.A07) || !0qQ.A0K(this.A08, mediaVCRTappableData.A08) || !0qQ.A0K(this.A02, mediaVCRTappableData.A02) || !0qQ.A0K(this.A09, mediaVCRTappableData.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A03);
        AnonymousClass7TH.A0P(parcel, this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        AnonymousClass7TH.A0P(parcel, this.A02);
        parcel.writeString(this.A09);
    }

    public final Float B1i() {
        return this.A01;
    }

    public final User BZ1() {
        return this.A00;
    }

    public final String BZ7() {
        return this.A06;
    }

    public final Float Byt() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaVCRTappableData", CaL.A00(this));
    }

    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return this.A0A;
    }

    public final String getEndBackgroundColor() {
        return this.A03;
    }

    public final String getOriginalCommentId() {
        return this.A04;
    }

    public final String getOriginalCommentText() {
        return this.A05;
    }

    public final String getOriginalMediaId() {
        return this.A07;
    }

    public final String getStartBackgroundColor() {
        return this.A08;
    }

    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A00, ((((i * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31));
        return ((((AnonymousClass7TF.A08(this.A07, (AnonymousClass7TF.A08(this.A05, A082) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A09);
    }

    public MediaVCRTappableData(User user, Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass7TG.A1R(user, str2);
        AnonymousClass7TF.A1F(str3, 6, str5);
        this.A0A = z;
        this.A03 = str;
        this.A01 = f;
        this.A00 = user;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A02 = f2;
        this.A09 = str7;
    }

    public final MediaVCRTappableDataIntf E7a(1E9 r1) {
        return this;
    }
}

package com.instagram.shopping.fragment.pdp.mediagrid;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51974G9v;
import X.DbW;
import X.JTS;
import X.Pxi;
import X.Pxj;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class MediaGridArguments extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(34);
    public final RankingInfo A00;
    public final Product A01;
    public final String A02;
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
    public final HashMap A0E;
    public final Set A0F;

    public MediaGridArguments(RankingInfo rankingInfo, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, HashMap hashMap, Set set) {
        0qQ.A0B(product, 1);
        C51974G9v.A1S(str, str2, str3, str4, str5);
        DbW.A1P(str8, 11, str9);
        this.A01 = product;
        this.A09 = str;
        this.A0C = str2;
        this.A03 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A0E = hashMap;
        this.A06 = str6;
        this.A02 = str7;
        this.A00 = rankingInfo;
        this.A08 = str8;
        this.A05 = str9;
        this.A07 = str10;
        this.A0D = str11;
        this.A0F = set;
        this.A04 = str12;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaGridArguments) {
                MediaGridArguments mediaGridArguments = (MediaGridArguments) obj;
                if (!0qQ.A0K(this.A01, mediaGridArguments.A01) || !0qQ.A0K(this.A09, mediaGridArguments.A09) || !0qQ.A0K(this.A0C, mediaGridArguments.A0C) || !0qQ.A0K(this.A03, mediaGridArguments.A03) || !0qQ.A0K(this.A0A, mediaGridArguments.A0A) || !0qQ.A0K(this.A0B, mediaGridArguments.A0B) || !0qQ.A0K(this.A0E, mediaGridArguments.A0E) || !0qQ.A0K(this.A06, mediaGridArguments.A06) || !0qQ.A0K(this.A02, mediaGridArguments.A02) || !0qQ.A0K(this.A00, mediaGridArguments.A00) || !0qQ.A0K(this.A08, mediaGridArguments.A08) || !0qQ.A0K(this.A05, mediaGridArguments.A05) || !0qQ.A0K(this.A07, mediaGridArguments.A07) || !0qQ.A0K(this.A0D, mediaGridArguments.A0D) || !0qQ.A0K(this.A0F, mediaGridArguments.A0F) || !0qQ.A0K(this.A04, mediaGridArguments.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        HashMap hashMap = this.A0E;
        parcel.writeInt(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            parcel.writeString((String) JTS.A0f(parcel, A0s));
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        Iterator A0w = Pxj.A0w(parcel, this.A0F);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A0C, AnonymousClass7TF.A08(this.A09, AnonymousClass7TE.A0K(this.A01))))));
        int A083 = AnonymousClass7TF.A08(this.A08, (((((AnonymousClass7TF.A07(this.A0E, A082) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31);
        return AnonymousClass7TF.A07(this.A0F, (((AnonymousClass7TF.A08(this.A05, A083) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + C41845B3m.A00(this.A04);
    }
}

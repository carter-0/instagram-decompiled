package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.FK6;
import X.XWJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StorySmbSupportStickerObjectImpl extends AnonymousClass0T0 implements StorySmbSupportStickerObject, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(2);
    public final SMBSupportStickerDict A00;
    public final StickerTraySurface A01;
    public final SubscriptionStickerDict A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;

    public final StorySmbSupportStickerObjectImpl FBM(1E9 r1) {
        return this;
    }

    public final StorySmbSupportStickerObjectImpl FBN(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorySmbSupportStickerObjectImpl) {
                StorySmbSupportStickerObjectImpl storySmbSupportStickerObjectImpl = (StorySmbSupportStickerObjectImpl) obj;
                if (!0qQ.A0K(this.A0G, storySmbSupportStickerObjectImpl.A0G) || !0qQ.A0K(this.A0H, storySmbSupportStickerObjectImpl.A0H) || !0qQ.A0K(this.A0I, storySmbSupportStickerObjectImpl.A0I) || !0qQ.A0K(this.A0J, storySmbSupportStickerObjectImpl.A0J) || !0qQ.A0K(this.A03, storySmbSupportStickerObjectImpl.A03) || !0qQ.A0K(this.A04, storySmbSupportStickerObjectImpl.A04) || !0qQ.A0K(this.A0K, storySmbSupportStickerObjectImpl.A0K) || !0qQ.A0K(this.A0B, storySmbSupportStickerObjectImpl.A0B) || !0qQ.A0K(this.A0C, storySmbSupportStickerObjectImpl.A0C) || !0qQ.A0K(this.A0D, storySmbSupportStickerObjectImpl.A0D) || !0qQ.A0K(this.A0E, storySmbSupportStickerObjectImpl.A0E) || !0qQ.A0K(this.A0L, storySmbSupportStickerObjectImpl.A0L) || !0qQ.A0K(this.A05, storySmbSupportStickerObjectImpl.A05) || !0qQ.A0K(this.A00, storySmbSupportStickerObjectImpl.A00) || !0qQ.A0K(this.A06, storySmbSupportStickerObjectImpl.A06) || !0qQ.A0K(this.A0F, storySmbSupportStickerObjectImpl.A0F) || !0qQ.A0K(this.A02, storySmbSupportStickerObjectImpl.A02) || this.A01 != storySmbSupportStickerObjectImpl.A01 || !0qQ.A0K(this.A07, storySmbSupportStickerObjectImpl.A07) || !0qQ.A0K(this.A08, storySmbSupportStickerObjectImpl.A08) || !0qQ.A0K(this.A09, storySmbSupportStickerObjectImpl.A09) || !0qQ.A0K(this.A0A, storySmbSupportStickerObjectImpl.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        AnonymousClass7TH.A0P(parcel, this.A03);
        AnonymousClass7TH.A0P(parcel, this.A04);
        parcel.writeString(this.A0K);
        AnonymousClass7TG.A16(parcel, this.A0B, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A0C, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A0D, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A0E, 0, 1);
        parcel.writeString(this.A0L);
        AnonymousClass7TH.A0P(parcel, this.A05);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TH.A0P(parcel, this.A06);
        AnonymousClass7TG.A16(parcel, this.A0F, 0, 1);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        AnonymousClass7TH.A0P(parcel, this.A07);
        AnonymousClass7TH.A0P(parcel, this.A08);
        AnonymousClass7TH.A0P(parcel, this.A09);
        AnonymousClass7TH.A0P(parcel, this.A0A);
    }

    public final String Ad0() {
        return this.A0G;
    }

    public final String AdC() {
        return this.A0H;
    }

    public final String Auy() {
        return this.A0I;
    }

    public final String AyE() {
        return this.A0J;
    }

    public final Float B1i() {
        return this.A03;
    }

    public final Float BCt() {
        return this.A04;
    }

    public final Float Bof() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ SMBSupportStickerDictIntf Bx3() {
        return this.A00;
    }

    public final Float Byt() {
        return this.A06;
    }

    public final Integer Bzj() {
        return this.A0F;
    }

    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C2V() {
        return this.A02;
    }

    public final StickerTraySurface C3E() {
        return this.A01;
    }

    public final Float CGX() {
        return this.A07;
    }

    public final Float CGt() {
        return this.A08;
    }

    public final Float CHS() {
        return this.A09;
    }

    public final Float CHZ() {
        return this.A0A;
    }

    public final Integer CTN() {
        return this.A0B;
    }

    public final Integer CUa() {
        return this.A0C;
    }

    public final Integer CZ9() {
        return this.A0D;
    }

    public final Integer CcV() {
        return this.A0E;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySmbSupportStickerObject", XWJ.A00(this));
    }

    public final String getId() {
        return this.A0K;
    }

    public final String getMediaType() {
        return this.A0L;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((AnonymousClass7TG.A0E(this.A0G) * 31) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31) + AnonymousClass7TG.A0E(this.A0J)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A0A);
    }

    public StorySmbSupportStickerObjectImpl(SMBSupportStickerDict sMBSupportStickerDict, StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0G = str;
        this.A0H = str2;
        this.A0I = str3;
        this.A0J = str4;
        this.A03 = f;
        this.A04 = f2;
        this.A0K = str5;
        this.A0B = num;
        this.A0C = num2;
        this.A0D = num3;
        this.A0E = num4;
        this.A0L = str6;
        this.A05 = f3;
        this.A00 = sMBSupportStickerDict;
        this.A06 = f4;
        this.A0F = num5;
        this.A02 = subscriptionStickerDict;
        this.A01 = stickerTraySurface;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }

    public final StorySmbSupportStickerObject E96(1E9 r1) {
        return this;
    }
}

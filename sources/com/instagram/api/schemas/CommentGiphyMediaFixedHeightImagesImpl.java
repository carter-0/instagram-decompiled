package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CW4;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CommentGiphyMediaFixedHeightImagesImpl extends AnonymousClass0T0 implements CommentGiphyMediaFixedHeightImages, Parcelable {
    public static final Parcelable.Creator CREATOR = DE7.A00(16);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final CommentGiphyMediaFixedHeightImagesImpl F1v() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentGiphyMediaFixedHeightImagesImpl) {
                CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl = (CommentGiphyMediaFixedHeightImagesImpl) obj;
                if (!0qQ.A0K(this.A00, commentGiphyMediaFixedHeightImagesImpl.A00) || !0qQ.A0K(this.A05, commentGiphyMediaFixedHeightImagesImpl.A05) || !0qQ.A0K(this.A01, commentGiphyMediaFixedHeightImagesImpl.A01) || !0qQ.A0K(this.A02, commentGiphyMediaFixedHeightImagesImpl.A02) || !0qQ.A0K(this.A06, commentGiphyMediaFixedHeightImagesImpl.A06) || !0qQ.A0K(this.A07, commentGiphyMediaFixedHeightImagesImpl.A07) || !0qQ.A0K(this.A03, commentGiphyMediaFixedHeightImagesImpl.A03) || !0qQ.A0K(this.A04, commentGiphyMediaFixedHeightImagesImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
    }

    public final Integer BCu() {
        return this.A00;
    }

    public final String BUJ() {
        return this.A05;
    }

    public final Integer BUK() {
        return this.A01;
    }

    public final Integer Bwe() {
        return this.A02;
    }

    public final String CGK() {
        return this.A07;
    }

    public final Integer CGL() {
        return this.A03;
    }

    public final Integer CGY() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCommentGiphyMediaFixedHeightImages", CW4.A00(this));
    }

    public final String getUrl() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public CommentGiphyMediaFixedHeightImagesImpl(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3) {
        this.A00 = num;
        this.A05 = str;
        this.A01 = num2;
        this.A02 = num3;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = num4;
        this.A04 = num5;
    }
}

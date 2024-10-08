package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.CW6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CommentGiphyMediaInfo extends AnonymousClass0T0 implements CommentGiphyMediaInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(82);
    public final CommentGiphyMediaImages A00;
    public final CommentGiphyMediaImages A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final CommentGiphyMediaInfo F1x() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentGiphyMediaInfo) {
                CommentGiphyMediaInfo commentGiphyMediaInfo = (CommentGiphyMediaInfo) obj;
                if (!0qQ.A0K(this.A00, commentGiphyMediaInfo.A00) || !0qQ.A0K(this.A03, commentGiphyMediaInfo.A03) || !0qQ.A0K(this.A01, commentGiphyMediaInfo.A01) || !0qQ.A0K(this.A02, commentGiphyMediaInfo.A02) || !0qQ.A0K(this.A04, commentGiphyMediaInfo.A04) || !0qQ.A0K(this.A05, commentGiphyMediaInfo.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CommentGiphyMediaImages commentGiphyMediaImages = this.A00;
        int i = 0;
        int hashCode = (commentGiphyMediaImages == null ? 0 : commentGiphyMediaImages.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommentGiphyMediaImages commentGiphyMediaImages2 = this.A01;
        int hashCode3 = (hashCode2 + (commentGiphyMediaImages2 == null ? 0 : commentGiphyMediaImages2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A02;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final /* bridge */ /* synthetic */ CommentGiphyMediaImagesIntf B66() {
        return this.A00;
    }

    public final String B9F() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ CommentGiphyMediaImagesIntf BGR() {
        return this.A01;
    }

    public final Boolean CcU() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommentGiphyMediaInfo", CW6.A00(this));
    }

    public final String getTitle() {
        return this.A04;
    }

    public final String getUsername() {
        return this.A05;
    }

    public CommentGiphyMediaInfo(CommentGiphyMediaImages commentGiphyMediaImages, CommentGiphyMediaImages commentGiphyMediaImages2, Boolean bool, String str, String str2, String str3) {
        this.A00 = commentGiphyMediaImages;
        this.A03 = str;
        this.A01 = commentGiphyMediaImages2;
        this.A02 = bool;
        this.A04 = str2;
        this.A05 = str3;
    }
}

package com.instagram.shopping.intf.taggingfeed;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16581Uxb;
import X.C18267Voh;
import X.C51973G9u;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.List;

public final class ShoppingTaggingFeedArguments implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(42);
    public boolean A00;
    public boolean A01;
    public final ClipInfo A02;
    public final C16581Uxb A03;
    public final ShoppingTaggingFeedClientState A04;
    public final ShoppingTaggingFeedHeader A05;
    public final TaggingFeedMultiSelectState A06;
    public final Integer A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final boolean A0I;

    public ShoppingTaggingFeedArguments(ClipInfo clipInfo, C16581Uxb uxb, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        C51973G9u.A0r(3, uxb, str2, str3);
        0qQ.A0B(shoppingTaggingFeedClientState, 12);
        this.A0B = str;
        this.A07 = num;
        this.A03 = uxb;
        this.A0G = str2;
        this.A0F = str3;
        this.A0E = str4;
        this.A0H = list;
        this.A0D = str5;
        this.A0C = str6;
        this.A0I = z;
        this.A05 = shoppingTaggingFeedHeader;
        this.A04 = shoppingTaggingFeedClientState;
        this.A02 = clipInfo;
        this.A08 = l;
        this.A09 = str7;
        this.A0A = str8;
        this.A06 = taggingFeedMultiSelectState;
        this.A01 = z2;
        this.A00 = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(C18267Voh.A01(this.A07));
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A02, i);
        AnonymousClass7TG.A15(parcel, this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}

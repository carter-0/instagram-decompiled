package com.instagram.shopping.model.taggingfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DbS;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingTaggingFeedHeader extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(60);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public ShoppingTaggingFeedHeader(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = str3;
        this.A05 = z3;
        this.A06 = z4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingTaggingFeedHeader) {
                ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = (ShoppingTaggingFeedHeader) obj;
                if (!(0qQ.A0K(this.A01, shoppingTaggingFeedHeader.A01) && 0qQ.A0K(this.A02, shoppingTaggingFeedHeader.A02) && this.A03 == shoppingTaggingFeedHeader.A03 && this.A04 == shoppingTaggingFeedHeader.A04 && 0qQ.A0K(this.A00, shoppingTaggingFeedHeader.A00) && this.A05 == shoppingTaggingFeedHeader.A05 && this.A06 == shoppingTaggingFeedHeader.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31);
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A09(this.A04, A09) + C41845B3m.A00(this.A00)) * 31));
    }

    public ShoppingTaggingFeedHeader() {
        this("", (String) null, (String) null, false, false, false, false);
    }
}

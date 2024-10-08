package com.instagram.shopping.model.taggingfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.C41848B3p;
import X.C51974G9v;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ShoppingTaggingFeedClientState extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(59);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingTaggingFeedClientState) {
                ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = (ShoppingTaggingFeedClientState) obj;
                if (!0qQ.A0K(this.A05, shoppingTaggingFeedClientState.A05) || !0qQ.A0K(this.A03, shoppingTaggingFeedClientState.A03) || !0qQ.A0K(this.A04, shoppingTaggingFeedClientState.A04) || !0qQ.A0K(this.A00, shoppingTaggingFeedClientState.A00) || !0qQ.A0K(this.A06, shoppingTaggingFeedClientState.A06) || !0qQ.A0K(this.A02, shoppingTaggingFeedClientState.A02) || !0qQ.A0K(this.A01, shoppingTaggingFeedClientState.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeStringList(this.A03);
        parcel.writeStringList(this.A04);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A06);
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A02);
        while (A1F2.hasNext()) {
            C41847B3o.A1I(parcel, A1F2, i);
        }
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A05)))))));
    }

    public ShoppingTaggingFeedClientState(List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        C51974G9v.A1M(list2, list3, list4);
        AnonymousClass7TF.A1E(list5, 5, list7);
        this.A05 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A00 = list4;
        this.A06 = list5;
        this.A02 = list6;
        this.A01 = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShoppingTaggingFeedClientState() {
        /*
            r8 = this;
            X.0sn r1 = X.0sn.A00
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState.<init>():void");
    }
}

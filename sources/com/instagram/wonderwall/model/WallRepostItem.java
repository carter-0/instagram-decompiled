package com.instagram.wonderwall.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class WallRepostItem extends AnonymousClass0T0 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new SWU(12);
    public final WallPostInfo A00;
    public final WallPostItem A01;

    public final boolean BAY() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallRepostItem) {
                WallRepostItem wallRepostItem = (WallRepostItem) obj;
                if (!0qQ.A0K(this.A00, wallRepostItem.A00) || !0qQ.A0K(this.A01, wallRepostItem.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final String BK1() {
        return 002.A0R(this.A00.A06, "_repost");
    }

    public final WallPostInfo BeB() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public WallRepostItem(WallPostInfo wallPostInfo, WallPostItem wallPostItem) {
        AnonymousClass7TG.A1O(wallPostInfo, wallPostItem);
        this.A00 = wallPostInfo;
        this.A01 = wallPostItem;
    }
}

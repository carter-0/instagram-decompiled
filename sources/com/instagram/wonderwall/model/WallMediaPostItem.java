package com.instagram.wonderwall.model;

import X.002;
import X.0qQ;
import X.1Xj;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;

public final class WallMediaPostItem extends AnonymousClass0T0 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new SWU(8);
    public Medium A00;
    public final 1Xj A01;
    public final WallPostInfo A02;

    public final boolean BAY() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallMediaPostItem) {
                WallMediaPostItem wallMediaPostItem = (WallMediaPostItem) obj;
                if (!0qQ.A0K(this.A02, wallMediaPostItem.A02) || !0qQ.A0K(this.A01, wallMediaPostItem.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeValue(this.A01);
    }

    public final String BK1() {
        return 002.A0R(this.A02.A06, "_media");
    }

    public final WallPostInfo BeB() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A02));
    }

    public WallMediaPostItem(1Xj r1, WallPostInfo wallPostInfo) {
        AnonymousClass7TG.A1O(wallPostInfo, r1);
        this.A02 = wallPostInfo;
        this.A01 = r1;
    }
}

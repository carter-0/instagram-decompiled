package com.instagram.wonderwall.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.GifUrlImpl;

public final class WallGifPostItem extends AnonymousClass0T0 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new SWU(3);
    public final GifUrlImpl A00;
    public final WallPostInfo A01;
    public final String A02;

    public final boolean BAY() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallGifPostItem) {
                WallGifPostItem wallGifPostItem = (WallGifPostItem) obj;
                if (!0qQ.A0K(this.A01, wallGifPostItem.A01) || !0qQ.A0K(this.A02, wallGifPostItem.A02) || !0qQ.A0K(this.A00, wallGifPostItem.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeValue(this.A00);
    }

    public final String BK1() {
        return 002.A0R(this.A01.A06, "_gif");
    }

    public final WallPostInfo BeB() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public WallGifPostItem(GifUrlImpl gifUrlImpl, WallPostInfo wallPostInfo, String str) {
        AnonymousClass7TG.A1U(wallPostInfo, str, gifUrlImpl);
        this.A01 = wallPostInfo;
        this.A02 = str;
        this.A00 = gifUrlImpl;
    }
}

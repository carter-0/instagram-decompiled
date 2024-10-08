package com.instagram.wonderwall.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Iterator;
import java.util.List;

public final class WallMusicPostItem extends AnonymousClass0T0 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new SWU(10);
    public final AudioOverlayTrack A00;
    public final WallPostInfo A01;
    public final List A02;

    public final boolean BAY() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallMusicPostItem) {
                WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) obj;
                if (!0qQ.A0K(this.A01, wallMusicPostItem.A01) || !0qQ.A0K(this.A00, wallMusicPostItem.A00) || !0qQ.A0K(this.A02, wallMusicPostItem.A02)) {
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
        parcel.writeParcelable(this.A00, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            parcel.writeInt(AnonymousClass7TG.A0F(A1F));
        }
    }

    public final String BK1() {
        return 002.A0R(this.A01.A06, "_music");
    }

    public final WallPostInfo BeB() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public WallMusicPostItem(AudioOverlayTrack audioOverlayTrack, WallPostInfo wallPostInfo, List list) {
        AnonymousClass7TG.A1U(wallPostInfo, audioOverlayTrack, list);
        this.A01 = wallPostInfo;
        this.A00 = audioOverlayTrack;
        this.A02 = list;
    }
}

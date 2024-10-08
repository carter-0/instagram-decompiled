package com.instagram.reels.profilecard.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.MusicOverlayStickerModel;

public final class ProfileCardStickerModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(0);
    public final MusicOverlayStickerModel A00;
    public final String A01;
    public final String A02;

    public ProfileCardStickerModel(MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = musicOverlayStickerModel;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileCardStickerModel) {
                ProfileCardStickerModel profileCardStickerModel = (ProfileCardStickerModel) obj;
                if (!0qQ.A0K(this.A01, profileCardStickerModel.A01) || !0qQ.A0K(this.A02, profileCardStickerModel.A02) || !0qQ.A0K(this.A00, profileCardStickerModel.A00)) {
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
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}

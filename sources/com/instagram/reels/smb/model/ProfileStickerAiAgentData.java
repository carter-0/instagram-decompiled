package com.instagram.reels.smb.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;

public final class ProfileStickerAiAgentData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(6);
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileStickerAiAgentData) {
                ProfileStickerAiAgentData profileStickerAiAgentData = (ProfileStickerAiAgentData) obj;
                if (!0qQ.A0K(this.A01, profileStickerAiAgentData.A01) || this.A00 != profileStickerAiAgentData.A00 || !0qQ.A0K(this.A03, profileStickerAiAgentData.A03) || !0qQ.A0K(this.A02, profileStickerAiAgentData.A02) || !0qQ.A0K(this.A04, profileStickerAiAgentData.A04) || !0qQ.A0K(this.A05, profileStickerAiAgentData.A05)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        int i = 0;
        int A08 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31));
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return A08 + i;
    }

    public ProfileStickerAiAgentData(IGAIAgentType iGAIAgentType, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1R(str3, str4);
        this.A01 = str;
        this.A00 = iGAIAgentType;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}

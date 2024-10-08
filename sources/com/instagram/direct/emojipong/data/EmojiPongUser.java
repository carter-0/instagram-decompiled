package com.instagram.direct.emojipong.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class EmojiPongUser extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(66);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmojiPongUser) {
                EmojiPongUser emojiPongUser = (EmojiPongUser) obj;
                if (!0qQ.A0K(this.A03, emojiPongUser.A03) || !0qQ.A0K(this.A04, emojiPongUser.A04) || !0qQ.A0K(this.A01, emojiPongUser.A01) || !0qQ.A0K(this.A02, emojiPongUser.A02) || this.A00 != emojiPongUser.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03)) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31) + this.A00;
    }

    public EmojiPongUser(String str, String str2, String str3, String str4, int i) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A00 = i;
    }
}

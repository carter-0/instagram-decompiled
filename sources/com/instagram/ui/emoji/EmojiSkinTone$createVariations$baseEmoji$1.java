package com.instagram.ui.emoji;

import X.0qQ;
import android.os.Parcel;
import com.facebook.ui.emoji.model.Emoji;

public final class EmojiSkinTone$createVariations$baseEmoji$1 extends Emoji {
    public final /* synthetic */ String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public EmojiSkinTone$createVariations$baseEmoji$1(String str) {
        this.A00 = str;
    }
}

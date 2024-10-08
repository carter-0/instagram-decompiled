package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C393409wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class NoteEmojiReactionInfo extends AnonymousClass0T0 implements Parcelable, NoteEmojiReactionInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376389Hu(81);
    public final User A00;
    public final Boolean A01;
    public final String A02;

    public final NoteEmojiReactionInfo F6r(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteEmojiReactionInfo) {
                NoteEmojiReactionInfo noteEmojiReactionInfo = (NoteEmojiReactionInfo) obj;
                if (!0qQ.A0K(this.A02, noteEmojiReactionInfo.A02) || !0qQ.A0K(this.A01, noteEmojiReactionInfo.A01) || !0qQ.A0K(this.A00, noteEmojiReactionInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        User user = this.A00;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A01;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final User CCd() {
        return this.A00;
    }

    public final Boolean Cdw() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNoteEmojiReactionInfo", C393409wO.A00(this));
    }

    public final String getEmoji() {
        return this.A02;
    }

    public NoteEmojiReactionInfo(User user, Boolean bool, String str) {
        this.A02 = str;
        this.A01 = bool;
        this.A00 = user;
    }

    public final NoteEmojiReactionInfoIntf E7n(1E9 r1) {
        return this;
    }
}

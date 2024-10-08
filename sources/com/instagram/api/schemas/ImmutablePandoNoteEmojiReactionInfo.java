package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.1E9;
import X.1aC;
import X.C3035269k;
import X.C376379Ht;
import X.C393409wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class ImmutablePandoNoteEmojiReactionInfo extends 17P implements NoteEmojiReactionInfoIntf {
    public static final C3035269k CREATOR = new C376379Ht(3);
    public User A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final User CCd() {
        return this.A00;
    }

    public final NoteEmojiReactionInfoIntf E7n(1E9 r3) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = 1aC.A01(r3, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.NoteEmojiReactionInfoIntf, com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393409wO.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo] */
    public final Boolean Cdw() {
        return getOptionalBooleanValueByHashCode(-376203959);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo] */
    public final NoteEmojiReactionInfo F6r(1E9 r5) {
        User user;
        String A0i = A0i(96632902);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-376203959);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = 1aC.A01(r5, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) r5.A00(A01);
                return new NoteEmojiReactionInfo(user, optionalBooleanValueByHashCode, A0i);
            }
        }
        user = null;
        return new NoteEmojiReactionInfo(user, optionalBooleanValueByHashCode, A0i);
    }

    public final String getEmoji() {
        return A0i(96632902);
    }
}

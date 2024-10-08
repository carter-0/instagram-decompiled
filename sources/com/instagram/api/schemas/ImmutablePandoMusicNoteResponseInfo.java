package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.1E9;
import X.1aC;
import X.C3035269k;
import X.C376379Ht;
import X.C44227Cao;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class ImmutablePandoMusicNoteResponseInfo extends 17P implements MusicNoteResponseInfoIntf {
    public static final C3035269k CREATOR = new C376379Ht(2);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final User BYz() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.MusicNoteResponseInfoIntf, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44227Cao.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final MusicInfo BUr() {
        return (MusicInfo) A04(-780321144, ImmutablePandoMusicInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final Integer BXH() {
        return getOptionalIntValueByHashCode(1956716504);
    }

    public final String Brj() {
        return A0i(-608838120);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final Boolean Can() {
        return getOptionalBooleanValueByHashCode(2120043935);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final Boolean CcP() {
        return getOptionalBooleanValueByHashCode(936256575);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo] */
    public final MusicNoteResponseInfo F6Z(1E9 r9) {
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(2120043935);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(936256575);
        MusicInfoImpl F6V = BUr().F6V(r9);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1956716504);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-821815367, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = 1aC.A01(r9, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) r9.A00(A01);
                return new MusicNoteResponseInfo(F6V, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, A0i(-608838120));
            }
        }
        user = null;
        return new MusicNoteResponseInfo(F6V, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, A0i(-608838120));
    }
}

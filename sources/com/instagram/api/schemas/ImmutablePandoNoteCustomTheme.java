package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C16843V7y;
import X.C20731Wy4;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoNoteCustomTheme extends 17P implements NoteCustomTheme {
    public static final C3035269k CREATOR = new CTB(25);

    public final NoteActivationType AYd() {
        return (NoteActivationType) A0N(1287259331, C20731Wy4.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteCustomTheme, com.instagram.api.schemas.NoteCustomTheme] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16843V7y.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aej() {
        return A0i(-1604143506);
    }

    public final String Aur() {
        return A0i(717313528);
    }

    public final String C1z() {
        return A0i(-259686756);
    }

    public final String C54() {
        return A0i(-1569721427);
    }

    public final NoteCustomThemeImpl F6q() {
        return new NoteCustomThemeImpl(AYd(), A0i(-1604143506), A0i(717313528), A0i(-259686756), A0i(-1569721427));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteCustomTheme] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

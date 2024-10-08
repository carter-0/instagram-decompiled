package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C393419wP;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoNotePogImageDict extends 17P implements NotePogImageDictIntf {
    public static final C3035269k CREATOR = new CTB(26);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNotePogImageDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.NotePogImageDictIntf, com.instagram.api.schemas.ImmutablePandoNotePogImageDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393419wP.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getPk() {
        return A0k(3579);
    }

    public final String BGL() {
        return A0h(-877823861);
    }

    public final NotePogImageDict F6t() {
        return new NotePogImageDict(A0g(), A0h(-877823861), A0k(3579));
    }

    public final String getId() {
        return A0g();
    }
}

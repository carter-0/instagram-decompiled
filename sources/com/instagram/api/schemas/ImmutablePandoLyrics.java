package com.instagram.api.schemas;

import X.0Yv;
import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C393389wM;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoLyrics extends 17P implements LyricsIntf {
    public static final C3035269k CREATOR = new CTB(14);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLyrics] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final List BcI() {
        return A0o(-593086246, ImmutablePandoPhrase.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.LyricsIntf, com.instagram.api.schemas.ImmutablePandoLyrics] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393389wM.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Lyrics F5h() {
        List<PhraseIntf> BcI = BcI();
        ArrayList arrayList = new ArrayList(0Yv.A1E(BcI, 10));
        for (PhraseIntf F7V : BcI) {
            arrayList.add(F7V.F7V());
        }
        return new Lyrics(arrayList);
    }
}

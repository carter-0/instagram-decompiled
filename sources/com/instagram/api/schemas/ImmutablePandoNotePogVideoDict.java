package com.instagram.api.schemas;

import X.0Yv;
import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C376379Ht;
import X.C393429wQ;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoNotePogVideoDict extends 17P implements NotePogVideoDictIntf {
    public static final C3035269k CREATOR = new C376379Ht(4);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNotePogVideoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final ImageInfo BGO() {
        return (ImageInfo) A04(-1876344045, ImmutablePandoImageInfo.class);
    }

    public final List CEY() {
        return A0o(713258463, ImmutablePandoVideoVersion.class);
    }

    public final NotePogVideoDict F6u() {
        String A0k = A0k(3355);
        ImageInfoImpl FEa = BGO().FEa();
        String A0k2 = A0k(3579);
        List<VideoVersionIntf> CEY = CEY();
        ArrayList arrayList = new ArrayList(0Yv.A1E(CEY, 10));
        for (VideoVersionIntf FEd : CEY) {
            arrayList.add(FEd.FEd());
        }
        return new NotePogVideoDict(FEa, A0k, A0k2, arrayList);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNotePogVideoDict, com.instagram.api.schemas.NotePogVideoDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393429wQ.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getId() {
        return A0k(3355);
    }

    public final String getPk() {
        return A0k(3579);
    }
}

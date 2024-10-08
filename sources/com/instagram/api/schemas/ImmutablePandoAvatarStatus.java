package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoAvatarStatus extends 17P implements AvatarStatus {
    public static final C3035269k CREATOR = new CTC(16);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarStatus] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BAb();
        A1H.put("has_avatar", Boolean.valueOf(getBooleanValueByHashCode(1670245022)));
        return new TreeUpdaterJNI(0Yt.A0B(A1H), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarStatus] */
    public final boolean BAb() {
        return getBooleanValueByHashCode(1670245022);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarStatus] */
    public final AvatarStatusImpl F0j() {
        return new AvatarStatusImpl(getBooleanValueByHashCode(1670245022));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAvatarStatus] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

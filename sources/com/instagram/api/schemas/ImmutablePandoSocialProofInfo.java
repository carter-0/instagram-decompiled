package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TH;
import X.C273654mx;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoSocialProofInfo extends 17P implements SocialProofInfo {
    public static final C3035269k CREATOR = new CTB(77);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.api.schemas.ImmutablePandoSocialProofInfo, com.facebook.pando.TreeJNI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (getOptionalIntValueByHashCode(1696323444) != null) {
            linkedHashMap.put(C273654mx.A00(3091), getOptionalIntValueByHashCode(1696323444));
        }
        return new TreeUpdaterJNI(0Yt.A0B(linkedHashMap), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoSocialProofInfo, com.facebook.pando.TreeJNI] */
    public final Integer BX2() {
        return getOptionalIntValueByHashCode(1696323444);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.api.schemas.ImmutablePandoSocialProofInfo, com.facebook.pando.TreeJNI] */
    public final SocialProofInfoImpl F9D() {
        return new SocialProofInfoImpl(getOptionalIntValueByHashCode(1696323444));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoSocialProofInfo, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

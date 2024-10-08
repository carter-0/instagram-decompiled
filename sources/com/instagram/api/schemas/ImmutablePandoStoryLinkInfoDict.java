package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C14203Tri;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryLinkInfoDict extends 17P implements StoryLinkInfoDictIntf {
    public static final C3035269k CREATOR = new CTB(81);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.StoryLinkInfoDictIntf, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C14203Tri.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AnT() {
        return A0j(906452786);
    }

    public final String Auq() {
        return A0i(-1581376446);
    }

    public final String AyG() {
        return A0i(1714674802);
    }

    public final String BMs() {
        return A0i(1186582995);
    }

    public final String BMv() {
        return A0i(-1624275873);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final Boolean BYN() {
        return getOptionalBooleanValueByHashCode(4887561);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final Boolean BuQ() {
        return getOptionalBooleanValueByHashCode(-1864688508);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final Integer C4C() {
        return getOptionalIntValueByHashCode(1488281845);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final Boolean CRc() {
        return getOptionalBooleanValueByHashCode(-1844659745);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final Boolean Cdp() {
        return getOptionalBooleanValueByHashCode(488622371);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final StoryLinkInfoDict FAL() {
        String A0j = A0j(906452786);
        String A0i = A0i(-1581376446);
        String A0i2 = A0i(1714674802);
        return new StoryLinkInfoDict(getOptionalBooleanValueByHashCode(-1844659745), getOptionalBooleanValueByHashCode(488622371), getOptionalBooleanValueByHashCode(4887561), getOptionalBooleanValueByHashCode(-1864688508), getOptionalIntValueByHashCode(1488281845), A0j, A0i, A0i2, A0i(1186582995), A0i(-1624275873), A0V());
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

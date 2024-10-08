package com.instagram.feed.media;

import X.0qQ;
import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.JU1;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class ImmutablePandoEffectActionSheet extends 17P implements EffectActionSheetIntf {
    public static final C3035269k CREATOR = CTA.A00(28);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectActionSheet, com.instagram.feed.media.EffectActionSheetIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, JU1.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectActionSheet] */
    public final List BfN() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1909990464);
        0qQ.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectActionSheet] */
    public final List BqS() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-157962958);
        0qQ.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    public final EffectActionSheet FE0() {
        return new EffectActionSheet(BfN(), BqS());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectActionSheet] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

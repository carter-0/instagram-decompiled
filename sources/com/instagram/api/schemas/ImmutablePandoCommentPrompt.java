package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CW8;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCommentPrompt extends 17P implements CommentPrompt {
    public static final C3035269k CREATOR = CTC.A00(40);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentPrompt, com.instagram.api.schemas.CommentPrompt] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CW8.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BaV() {
        return A0j(1376653744);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentPrompt] */
    public final Integer BmI() {
        return getOptionalIntValueByHashCode(139882362);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoCommentPrompt] */
    public final CommentPromptImpl F20() {
        return new CommentPromptImpl(A0j(1376653744), getOptionalIntValueByHashCode(139882362));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentPrompt] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

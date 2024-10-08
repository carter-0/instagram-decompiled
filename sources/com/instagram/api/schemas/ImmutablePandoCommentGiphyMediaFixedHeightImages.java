package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CW4;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCommentGiphyMediaFixedHeightImages extends 17P implements CommentGiphyMediaFixedHeightImages {
    public static final C3035269k CREATOR = CTC.A00(37);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages, com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CW4.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final Integer BCu() {
        return getOptionalIntValueByHashCode(-1221029593);
    }

    public final String BUJ() {
        return A0i(108273);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final Integer BUK() {
        return getOptionalIntValueByHashCode(-1111056241);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final Integer Bwe() {
        return getOptionalIntValueByHashCode(3530753);
    }

    public final String CGK() {
        return A0i(3645340);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final Integer CGL() {
        return getOptionalIntValueByHashCode(-329753916);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final Integer CGY() {
        return getOptionalIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final CommentGiphyMediaFixedHeightImagesImpl F1v() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1221029593);
        String A0i = A0i(108273);
        return new CommentGiphyMediaFixedHeightImagesImpl(optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1111056241), getOptionalIntValueByHashCode(3530753), getOptionalIntValueByHashCode(-329753916), getOptionalIntValueByHashCode(113126854), A0i, A0V(), A0i(3645340));
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

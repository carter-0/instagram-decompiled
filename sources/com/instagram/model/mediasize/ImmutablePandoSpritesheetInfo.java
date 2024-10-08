package com.instagram.model.mediasize;

import X.17P;
import X.AnonymousClass7TH;
import X.C14022ToO;
import X.C3035269k;
import X.C41845B3m;
import X.C41891B5m;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoSpritesheetInfo extends 17P implements SpritesheetInfo {
    public static final C3035269k CREATOR = CTA.A00(35);

    public final List ByT() {
        return A0p(248549918, C41891B5m.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.SpritesheetInfo, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C14022ToO.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer B5j() {
        return getOptionalIntValueByHashCode(-1163893102);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer BPQ() {
        return getOptionalIntValueByHashCode(-666356284);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer Blq() {
        return getOptionalIntValueByHashCode(-600590916);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer ByS() {
        return getOptionalIntValueByHashCode(-2045979679);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer ByU() {
        return getOptionalIntValueByHashCode(-883315764);
    }

    public final Float C6u() {
        return A0K(-1104578681);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer C6w() {
        return getOptionalIntValueByHashCode(-147481638);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer C77() {
        return getOptionalIntValueByHashCode(2087420083);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer C79() {
        return getOptionalIntValueByHashCode(777273472);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final Integer C8r() {
        return getOptionalIntValueByHashCode(-750947634);
    }

    public final Float CE8() {
        return A0K(-209702102);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo, X.17P] */
    public final SpritesheetInfoImpl FEc() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1163893102);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-666356284);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-600590916);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(-2045979679);
        List ByT = ByT();
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(-883315764);
        return new SpritesheetInfoImpl(A0K(-1104578681), A0K(-209702102), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, getOptionalIntValueByHashCode(-147481638), getOptionalIntValueByHashCode(2087420083), getOptionalIntValueByHashCode(777273472), getOptionalIntValueByHashCode(-750947634), ByT);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

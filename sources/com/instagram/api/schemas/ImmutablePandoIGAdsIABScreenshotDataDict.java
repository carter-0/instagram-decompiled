package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48329Ecm;
import X.C51810G2u;
import X.C51811G2v;
import X.C51812G2w;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGAdsIABScreenshotDataDict extends 17P implements IGAdsIABScreenshotDataDict {
    public static final C3035269k CREATOR = new CTC(93);

    public final IABScreenshotEffectOnUserAction Bpw() {
        return (IABScreenshotEffectOnUserAction) A0N(2008461599, C51810G2u.A00);
    }

    public final IABScreenshotTransitionTime Bpz() {
        return (IABScreenshotTransitionTime) A0N(-1867449698, C51811G2v.A00);
    }

    public final IGAdsIABScreenshotVariant Bq1() {
        return (IGAdsIABScreenshotVariant) A0N(-1513523540, C51812G2w.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IGAdsIABScreenshotDataDict, com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48329Ecm.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float BPL() {
        return A0K(983388894);
    }

    public final Float BTC() {
        return A0K(-254701364);
    }

    public final Float Bpx() {
        return A0K(960189328);
    }

    public final Float Bpy() {
        return A0K(-1409054167);
    }

    public final String Bq0() {
        return A0i(-525510890);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict] */
    public final Boolean Bvf() {
        return getOptionalBooleanValueByHashCode(726605322);
    }

    public final String C5A() {
        return A0i(-976216347);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict, X.17P] */
    public final IGAdsIABScreenshotDataDictImpl F3x() {
        Float A0K = A0K(983388894);
        Float A0K2 = A0K(-254701364);
        IABScreenshotEffectOnUserAction Bpw = Bpw();
        Float A0K3 = A0K(960189328);
        Float A0K4 = A0K(-1409054167);
        return new IGAdsIABScreenshotDataDictImpl(Bpw, Bpz(), Bq1(), getOptionalBooleanValueByHashCode(726605322), A0K, A0K2, A0K3, A0K4, A0i(-525510890), A0i(-976216347));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

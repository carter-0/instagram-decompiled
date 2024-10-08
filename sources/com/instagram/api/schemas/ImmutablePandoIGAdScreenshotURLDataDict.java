package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44169CYi;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGAdScreenshotURLDataDict extends 17P implements IGAdScreenshotURLDataDict {
    public static final C3035269k CREATOR = CTC.A00(92);

    public final IGProjectPortalInfoDict BPk() {
        return (IGProjectPortalInfoDict) A05(1758667881, ImmutablePandoIGProjectPortalInfoDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict, com.instagram.api.schemas.IGAdScreenshotURLDataDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44169CYi.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict] */
    public final Integer BCu() {
        return getOptionalIntValueByHashCode(-1221029593);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict] */
    public final Integer CGY() {
        return getOptionalIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict] */
    public final IGAdScreenshotURLDataDictImpl F3t() {
        IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl;
        String A0i = A0i(1714924804);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1221029593);
        IGProjectPortalInfoDict BPk = BPk();
        if (BPk != null) {
            iGProjectPortalInfoDictImpl = BPk.F4w();
        } else {
            iGProjectPortalInfoDictImpl = null;
        }
        return new IGAdScreenshotURLDataDictImpl(iGProjectPortalInfoDictImpl, optionalIntValueByHashCode, getOptionalIntValueByHashCode(113126854), A0i, A0V());
    }

    public final String getDominantColor() {
        return A0i(1714924804);
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

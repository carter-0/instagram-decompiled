package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44327Cd9;
import X.C46084DLp;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoSMBSupportStickerDict extends 17P implements SMBSupportStickerDictIntf {
    public static final C3035269k CREATOR = CTB.A00(71);

    public final BusinessProfileDict Aib() {
        return (BusinessProfileDict) A05(-1813565398, ImmutablePandoBusinessProfileDict.class);
    }

    public final SMBPartnerType Bso() {
        return (SMBPartnerType) A0N(360082052, C46084DLp.A00);
    }

    public final SMBSupportStickerDict F8n() {
        BusinessProfileDictImpl businessProfileDictImpl;
        BusinessProfileDict Aib = Aib();
        if (Aib != null) {
            businessProfileDictImpl = Aib.F12();
        } else {
            businessProfileDictImpl = null;
        }
        String A1C = C41847B3o.A1C(this);
        String A0i = A0i(-2071290626);
        String A0i2 = A0i(476855145);
        String A0i3 = A0i(1082060480);
        String A0i4 = A0i(432371099);
        String A0i5 = A0i(-209971210);
        return new SMBSupportStickerDict(businessProfileDictImpl, Bso(), A0K(752358592), A1C, A0i, A0i2, A0i3, A0i4, A0i5, A0i(161747874), C41845B3m.A0o(this), A0i(-132220081), A0i(-1663079300), A0Y(), A0i(844796604));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.SMBSupportStickerDictIntf, com.instagram.api.schemas.ImmutablePandoSMBSupportStickerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44327Cd9.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return C41847B3o.A1C(this);
    }

    public final String Ais() {
        return A0i(-2071290626);
    }

    public final String AtV() {
        return A0i(1082060480);
    }

    public final String Axm() {
        return A0i(432371099);
    }

    public final Float BZE() {
        return A0K(752358592);
    }

    public final String Bao() {
        return A0i(161747874);
    }

    public final String C2c() {
        return A0i(-1663079300);
    }

    public final String C7r() {
        return A0i(844796604);
    }

    public final String getCtaTitle() {
        return A0i(476855145);
    }

    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    public final String getPk() {
        return C41845B3m.A0o(this);
    }

    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoSMBSupportStickerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C46056DKn;
import X.C63016Kq6;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGenAIToolInfoDict extends 17P implements GenAIToolInfoDictIntf {
    public static final C3035269k CREATOR = CTC.A00(75);

    public final CameraTool C8A() {
        return (CameraTool) A0M(-415949439, C46056DKn.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.GenAIToolInfoDictIntf, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C63016Kq6.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aqe() {
        return A0i(264552097);
    }

    public final String Bhm() {
        return A0i(-979805852);
    }

    public final String Bk7() {
        return A0i(-963237835);
    }

    public final String BnF() {
        return A0i(37109963);
    }

    public final String Bnp() {
        return A0i(1847552473);
    }

    public final String Bzk() {
        return A0i(-1061345759);
    }

    public final String C8V() {
        return A0i(110546223);
    }

    public final GenAIToolInfoDict F3O() {
        return new GenAIToolInfoDict(C8A(), C41845B3m.A0r(this), A0i(264552097), A0i(-979805852), A0i(-963237835), A0i(37109963), A0i(1847552473), A0i(-1061345759), A0i(110546223));
    }

    public final String getBackgroundColor() {
        return C41845B3m.A0r(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

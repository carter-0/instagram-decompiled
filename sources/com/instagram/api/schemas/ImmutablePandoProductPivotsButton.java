package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C17666Vbx;
import X.C3035269k;
import X.C41847B3o;
import X.CTB;
import X.DLX;
import X.DLY;
import android.os.Parcel;
import com.instagram.user.model.User;

public final class ImmutablePandoProductPivotsButton extends 17P implements ProductPivotsButton {
    public static final C3035269k CREATOR = CTB.A00(48);

    public final /* synthetic */ C17666Vbx AKJ() {
        return new C17666Vbx(this);
    }

    public final ProductPivotsButtonActionType AYE() {
        return (ProductPivotsButtonActionType) A0M(-1422950858, DLX.A00);
    }

    public final ProductPivotsButtonActionType Awi() {
        return (ProductPivotsButtonActionType) A0N(1205427403, DLY.A00);
    }

    public final User BRo() {
        return null;
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return C41847B3o.A1C(this);
    }

    public final String Awd() {
        return A0j(912984812);
    }

    public final String Awf() {
        return A0i(2090789161);
    }

    public final String Awg() {
        return A0i(-1286928665);
    }

    public final String getText() {
        return A0X();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductPivotsButton] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

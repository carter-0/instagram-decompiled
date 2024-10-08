package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.CTB;
import X.CaL;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class ImmutablePandoMediaVCRTappableData extends 17P implements MediaVCRTappableDataIntf {
    public static final C3035269k CREATOR = CTB.A00(18);
    public User A00;

    public final User BZ1() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'originalCommentAuthor' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.MediaVCRTappableDataIntf, com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CaL.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float B1i() {
        return A0E();
    }

    public final String BZ7() {
        return A0i(-930319210);
    }

    public final Float Byt() {
        return A0D();
    }

    public final MediaVCRTappableDataIntf E7a(1E9 r2) {
        this.A00 = C41846B3n.A0c(r2, this, 963379097);
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData] */
    public final MediaVCRTappableData F64(1E9 r13) {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-2048029722);
        String A0i = A0i(-209971210);
        return new MediaVCRTappableData(C41847B3o.A0r(r13, this, 963379097), A0E(), A0D(), A0i, A0k(-1970527703), A0h(403787451), A0i(-930319210), A0k(-1824429564), A0i(-132220081), C41845B3m.A0p(this), booleanValueByHashCode);
    }

    public final MediaVCRTappableData F65(1E6 r2) {
        return F64(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData] */
    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return getBooleanValueByHashCode(-2048029722);
    }

    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    public final String getOriginalCommentId() {
        return A0k(-1970527703);
    }

    public final String getOriginalCommentText() {
        return A0h(403787451);
    }

    public final String getOriginalMediaId() {
        return A0k(-1824429564);
    }

    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

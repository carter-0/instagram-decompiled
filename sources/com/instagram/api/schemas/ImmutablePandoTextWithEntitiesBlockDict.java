package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44533CgT;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.textwithentities.model.ImmutablePandoTextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;

public final class ImmutablePandoTextWithEntitiesBlockDict extends 17P implements TextWithEntitiesBlockDictIntf {
    public static final C3035269k CREATOR = CTA.A00(9);

    public final TextWithEntitiesIntf C5k() {
        return (TextWithEntitiesIntf) A05(1854819208, ImmutablePandoTextWithEntities.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict, com.instagram.api.schemas.TextWithEntitiesBlockDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44533CgT.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict] */
    public final Integer AwO() {
        return getOptionalIntValueByHashCode(95472323);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict, X.17P] */
    public final TextWithEntitiesBlockDict FCq() {
        TextWithEntities textWithEntities;
        String A0i = A0i(1286558636);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(95472323);
        TextWithEntitiesIntf C5k = C5k();
        if (C5k != null) {
            textWithEntities = C5k.FDs();
        } else {
            textWithEntities = null;
        }
        return new TextWithEntitiesBlockDict(textWithEntities, optionalIntValueByHashCode, A0i);
    }

    public final String getBlockType() {
        return A0i(1286558636);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

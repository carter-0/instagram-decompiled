package com.instagram.model.shopping;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44910Cn0;
import X.C46148DOb;
import X.C46149DOc;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import java.util.HashMap;
import java.util.Map;

public final class ImmutablePandoProductArEffectMetadata extends 17P implements ProductArEffectMetadataIntf {
    public static final C3035269k CREATOR = CTA.A00(39);

    public final Map B06() {
        return null;
    }

    public final ContainerEffectEnum AqK() {
        return (ContainerEffectEnum) A0N(31904362, C46148DOb.A00);
    }

    public final DynamicEffectState Azb() {
        return (DynamicEffectState) A0N(1993431139, C46149DOc.A00);
    }

    public final EffectThumbnailImageDictIntf B0G() {
        return (EffectThumbnailImageDictIntf) A05(1217710490, ImmutablePandoEffectThumbnailImageDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ProductArEffectMetadataIntf, com.instagram.model.shopping.ImmutablePandoProductArEffectMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44910Cn0.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B07() {
        return A0i(469587505);
    }

    public final ProductArEffectMetadata FFJ() {
        ContainerEffectEnum AqK = AqK();
        DynamicEffectState Azb = Azb();
        String A0j = A0j(-1468661111);
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        String A0i = A0i(469587505);
        EffectThumbnailImageDictIntf B0G = B0G();
        if (B0G != null) {
            effectThumbnailImageDict = B0G.FFI();
        }
        return new ProductArEffectMetadata(AqK, Azb, effectThumbnailImageDict, A0j, A0i, (HashMap) null);
    }

    public final String getEffectId() {
        return A0j(-1468661111);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductArEffectMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

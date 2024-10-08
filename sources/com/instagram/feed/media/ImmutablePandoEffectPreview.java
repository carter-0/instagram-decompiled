package com.instagram.feed.media;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41873B4r;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ImmutablePandoEffectThumbnailImageDict;

public final class ImmutablePandoEffectPreview extends 17P implements EffectPreviewIntf {
    public static final C3035269k CREATOR = CTA.A00(29);

    public final AttributionUser AdD() {
        return (AttributionUser) A04(115051403, ImmutablePandoAttributionUser.class);
    }

    public final EffectActionSheetIntf Azy() {
        return (EffectActionSheetIntf) A05(-1579695612, ImmutablePandoEffectActionSheet.class);
    }

    public final EffectThumbnailImageDictIntf C6y() {
        return (EffectThumbnailImageDictIntf) A05(2074606664, ImmutablePandoEffectThumbnailImageDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectPreview, com.instagram.feed.media.EffectPreviewIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41873B4r.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Awu() {
        return A0i(1977249010);
    }

    public final ImageUrl BEO() {
        return A0A(-737588055);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectPreview] */
    public final Boolean COY() {
        return getOptionalBooleanValueByHashCode(1258407760);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectPreview, X.17P] */
    public final EffectPreview FE1() {
        EffectActionSheet effectActionSheet;
        AttributionUserImpl F0a = AdD().F0a();
        String A0i = A0i(1977249010);
        EffectActionSheetIntf Azy = Azy();
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        if (Azy != null) {
            effectActionSheet = Azy.FE0();
        } else {
            effectActionSheet = null;
        }
        String A0j = A0j(-1468661111);
        String A0i2 = A0i(-190801022);
        String A0i3 = A0i(1743941273);
        String A0i4 = A0i(1181455637);
        ImageUrl A0A = A0A(-737588055);
        String A0g = A0g();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1258407760);
        String A0Q = A0Q();
        String A0h = A0h(841995508);
        EffectThumbnailImageDictIntf C6y = C6y();
        if (C6y != null) {
            effectThumbnailImageDict = C6y.FFI();
        }
        return new EffectPreview(F0a, A0A, effectActionSheet, effectThumbnailImageDict, optionalBooleanValueByHashCode, A0i, A0j, A0i2, A0i3, A0i4, A0g, A0Q, A0h, A0Y());
    }

    public final String getEffectId() {
        return A0j(-1468661111);
    }

    public final String getFailureCode() {
        return A0i(-190801022);
    }

    public final String getFailureReason() {
        return A0i(1743941273);
    }

    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    public final String getId() {
        return A0g();
    }

    public final String getName() {
        return A0Q();
    }

    public final String getSaveStatus() {
        return A0h(841995508);
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoEffectPreview] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

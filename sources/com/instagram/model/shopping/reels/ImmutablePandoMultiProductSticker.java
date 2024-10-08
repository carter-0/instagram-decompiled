package com.instagram.model.shopping.reels;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CTA;
import X.CnP;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData;
import com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoMultiProductSticker extends 17P implements MultiProductStickerIntf {
    public static final C3035269k CREATOR = CTA.A00(55);
    public List A00;

    public final List BN4() {
        return A08(102977465, ImmutablePandoStoryMultiProductStickerLinkData.class);
    }

    public final List BUc() {
        List list = this.A00;
        if (list == null) {
            return A08(-1537804310, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    public final List Bzq() {
        return A08(1531715286, ImmutablePandoStoryProductItemStickerTappableData.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.MultiProductStickerIntf, com.instagram.model.shopping.reels.ImmutablePandoMultiProductSticker] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CnP.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String C5C() {
        return A0i(-1064897719);
    }

    public final String C5b() {
        return A0i(1914398503);
    }

    public final String CDo() {
        return A0i(1595179052);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoMultiProductSticker] */
    public final Boolean CYe() {
        return getOptionalBooleanValueByHashCode(-1403186180);
    }

    public final MultiProductStickerIntf EA8(1E9 r4) {
        ArrayList arrayList;
        List BUc = BUc();
        if (BUc != null) {
            arrayList = AnonymousClass7TG.A0r(BUc);
            Iterator it = BUc.iterator();
            while (it.hasNext()) {
                C41848B3p.A1R(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.shopping.reels.ImmutablePandoMultiProductSticker] */
    public final MultiProductSticker FFe(1E9 r14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1403186180);
        List<StoryMultiProductStickerLinkData> BN4 = BN4();
        ArrayList arrayList3 = null;
        if (BN4 != null) {
            arrayList = AnonymousClass7TF.A0p(BN4);
            for (StoryMultiProductStickerLinkData FAU : BN4) {
                arrayList.add(FAU.FAU());
            }
        } else {
            arrayList = null;
        }
        String A0f = A0f();
        List BUc = BUc();
        if (BUc != null) {
            arrayList2 = AnonymousClass7TF.A0p(BUc);
            Iterator it = BUc.iterator();
            while (it.hasNext()) {
                C41848B3p.A1S(r14, arrayList2, it);
            }
        } else {
            arrayList2 = null;
        }
        List<StoryProductItemStickerTappableDataIntf> Bzq = Bzq();
        if (Bzq != null) {
            arrayList3 = AnonymousClass7TF.A0p(Bzq);
            for (StoryProductItemStickerTappableDataIntf FAk : Bzq) {
                arrayList3.add(FAk.FAk());
            }
        }
        return new MultiProductSticker(optionalBooleanValueByHashCode, A0e, A0f, A0X(), A0i(-1064897719), A0i(1914398503), C41845B3m.A0n(this), A0i(1595179052), arrayList, arrayList2, arrayList3);
    }

    public final MultiProductSticker FFf(1E6 r2) {
        return FFe(C41847B3o.A0p());
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getText() {
        return A0X();
    }

    public final String getUserId() {
        return C41845B3m.A0n(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoMultiProductSticker] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

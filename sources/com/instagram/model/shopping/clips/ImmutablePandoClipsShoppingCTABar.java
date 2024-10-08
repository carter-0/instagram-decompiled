package com.instagram.model.shopping.clips;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44914Cn5;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoClipsShoppingCTABar extends 17P implements ClipsShoppingCTABarIntf {
    public static final C3035269k CREATOR = CTA.A00(42);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf, com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44914Cn5.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float Abn() {
        return A0K(-870720966);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar] */
    public final Integer AzW() {
        return getOptionalIntValueByHashCode(-1951372724);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar] */
    public final List BgO() {
        return getOptionalStringListByHashCode(1380866040);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar, X.17P] */
    public final ClipsShoppingCTABar FFN() {
        Float A0K = A0K(-870720966);
        String A0i = A0i(-1644797643);
        String A0i2 = A0i(-1429847026);
        String A0i3 = A0i(1714924804);
        return new ClipsShoppingCTABar(A0K, getOptionalIntValueByHashCode(-1951372724), A0i, A0i2, A0i3, A0U(), A0Y(), A0i(1483766239), A0i(1984645353), getOptionalStringListByHashCode(1380866040));
    }

    public final String getCtaBarType() {
        return A0i(-1644797643);
    }

    public final String getDestination() {
        return A0i(-1429847026);
    }

    public final String getDominantColor() {
        return A0i(1714924804);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }

    public final String getToggledDestination() {
        return A0i(1483766239);
    }

    public final String getToggledTitle() {
        return A0i(1984645353);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}

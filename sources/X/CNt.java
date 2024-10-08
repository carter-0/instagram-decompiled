package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.ImmutablePandoLocationDict;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

public final class CNt extends 17P implements AnonymousClass3I8 {
    public final LocationDictIntf BNj() {
        return (LocationDictIntf) A05(-1797083648, ImmutablePandoLocationDict.class);
    }

    public final MultiAuthorStoryType CAS() {
        return (MultiAuthorStoryType) A0N(3575610, C46080DLl.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3I8, X.CNt] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44306Cco.A00(this));
    }

    public final String getPk() {
        return A0h(3579);
    }

    public final String Amd() {
        return A0i(112359031);
    }

    public final Float BLV() {
        return A0K(106911);
    }

    public final Float BNV() {
        return A0K(107301);
    }

    public final ImageUrl Bh3() {
        return A0A(1782139044);
    }

    public final String Bh5() {
        return A0i(899464897);
    }

    public final AnonymousClass3I7 F8Y() {
        LocationDict locationDict;
        String A0i = A0i(112359031);
        Float A0K = A0K(106911);
        Float A0K2 = A0K(107301);
        LocationDictIntf BNj = BNj();
        if (BNj != null) {
            locationDict = BNj.FG5();
        } else {
            locationDict = null;
        }
        String A0W = A0W();
        String A0h = A0h(3579);
        return new AnonymousClass3I7(CAS(), A0A(1782139044), locationDict, A0K, A0K2, A0i, A0W, A0h, A0i(899464897), A0i(1565793390));
    }

    public final String getName() {
        return A0W();
    }

    public final String getShortName() {
        return A0i(1565793390);
    }
}

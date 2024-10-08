package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import java.util.ArrayList;
import java.util.List;

public final class CSH extends 17P implements DV0 {
    public ProductCollection A00;

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final DropsLaunchAnimationIntf AzD() {
        return (DropsLaunchAnimationIntf) A05(461462899, ImmutablePandoDropsLaunchAnimation.class);
    }

    public final DropsEventPageNavigationMetadata B2L() {
        return (DropsEventPageNavigationMetadata) A05(935996751, ImmutablePandoDropsEventPageNavigationMetadata.class);
    }

    public final List Bzq() {
        return A08(1531715286, C43988CPa.class);
    }

    public final DV0 EA9(1E9 r2) {
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            A0w.EAX(r2);
        } else {
            A0w = null;
        }
        this.A00 = A0w;
        return this;
    }

    public final C42131BIk FFi(1E9 r14) {
        ProductCollectionImpl productCollectionImpl;
        DropsLaunchAnimation dropsLaunchAnimation;
        DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl;
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        ArrayList arrayList = null;
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r14);
        } else {
            productCollectionImpl = null;
        }
        DropsLaunchAnimationIntf AzD = AzD();
        if (AzD != null) {
            dropsLaunchAnimation = AzD.FFR();
        } else {
            dropsLaunchAnimation = null;
        }
        DropsEventPageNavigationMetadata B2L = B2L();
        if (B2L != null) {
            dropsEventPageNavigationMetadataImpl = B2L.F2h();
        } else {
            dropsEventPageNavigationMetadataImpl = null;
        }
        String A0e = A0e();
        String A0f = A0f();
        String A0j = A0j(574223090);
        List<DS8> Bzq = Bzq();
        if (Bzq != null) {
            arrayList = AnonymousClass7TG.A0r(Bzq);
            for (DS8 FBE : Bzq) {
                arrayList.add(FBE.FBE());
            }
        }
        return new C42131BIk(dropsEventPageNavigationMetadataImpl, dropsLaunchAnimation, productCollectionImpl, A0e, A0f, A0j, A0X(), A0i(-1064897719), C41845B3m.A0n(this), A0i(1595179052), arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DV0, X.CSH] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44934CnU.A00(this));
    }

    public final String BRr() {
        return A0j(574223090);
    }

    public final String C5C() {
        return A0i(-1064897719);
    }

    public final String CDo() {
        return A0i(1595179052);
    }

    public final C42131BIk FFj(1E6 r2) {
        return FFi(C41847B3o.A0p());
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
}

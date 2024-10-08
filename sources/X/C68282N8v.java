package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;

/* renamed from: X.N8v  reason: case insensitive filesystem */
public final class C68282N8v extends AnonymousClass0T0 implements C74546Pwf {
    public final FeaturedProductPermissionStatus A00;
    public final SurfaceVisibility A01;
    public final Long A02;

    public final C68282N8v FFU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68282N8v) {
                C68282N8v n8v = (C68282N8v) obj;
                if (!(0qQ.A0K(this.A02, n8v.A02) && this.A00 == n8v.A00 && this.A01 == n8v.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Long BEY() {
        return this.A02;
    }

    public final FeaturedProductPermissionStatus BzM() {
        return this.A00;
    }

    public final SurfaceVisibility C3M() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingFeaturedProductPermissionDict", O1H.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C68282N8v(FeaturedProductPermissionStatus featuredProductPermissionStatus, SurfaceVisibility surfaceVisibility, Long l) {
        this.A02 = l;
        this.A00 = featuredProductPermissionStatus;
        this.A01 = surfaceVisibility;
    }
}

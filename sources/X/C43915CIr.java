package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

/* renamed from: X.CIr  reason: case insensitive filesystem */
public final class C43915CIr extends 17P implements C279484yi {
    public final ImageInfo BGO() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4yi, X.CIr] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41906B6b.A00(this));
    }

    public final C279474yh F1i() {
        ImageInfoImpl imageInfoImpl;
        ImageInfo BGO = BGO();
        if (BGO != null) {
            imageInfoImpl = BGO.FEa();
        } else {
            imageInfoImpl = null;
        }
        return new C279474yh(imageInfoImpl, A0h(-1729814302), A0h(-790686341));
    }

    public final String getOwnerUsername() {
        return A0h(-1729814302);
    }

    public final String getTemplateMediaId() {
        return A0h(-790686341);
    }
}

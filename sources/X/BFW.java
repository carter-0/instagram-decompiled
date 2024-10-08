package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;

public final class BFW extends AnonymousClass0T0 implements C46252DSh {
    public final MetaGalleryNetegoInStoryMediaType A00;
    public final String A01;

    public final BFW F6C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFW) {
                BFW bfw = (BFW) obj;
                if (this.A00 != bfw.A00 || !0qQ.A0K(this.A01, bfw.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final MetaGalleryNetegoInStoryMediaType BR6() {
        return this.A00;
    }

    public final String BRI() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMetaGalleryNetegoInStoryMediaInfo", CaS.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BFW(MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType, String str) {
        this.A00 = metaGalleryNetegoInStoryMediaType;
        this.A01 = str;
    }
}

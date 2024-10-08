package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.4yh  reason: invalid class name and case insensitive filesystem */
public final class C279474yh extends AnonymousClass0T0 implements C279484yi {
    public final ImageInfo A00;
    public final String A01;
    public final String A02;

    public C279474yh(ImageInfo imageInfo, String str, String str2) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        this.A00 = imageInfo;
        this.A01 = str;
        this.A02 = str2;
    }

    public final C279474yh F1i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279474yh) {
                C279474yh r5 = (C279474yh) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ImageInfo imageInfo = this.A00;
        return ((((imageInfo == null ? 0 : imageInfo.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public final ImageInfo BGO() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateAttributionInfo", C41906B6b.A00(this));
    }

    public final String getOwnerUsername() {
        return this.A01;
    }

    public final String getTemplateMediaId() {
        return this.A02;
    }
}

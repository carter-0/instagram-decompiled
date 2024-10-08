package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3I9  reason: invalid class name */
public final class AnonymousClass3I9 extends AnonymousClass0T0 implements AnonymousClass3IA {
    public final ImageUrl A00;
    public final String A01;

    public AnonymousClass3I9(ImageUrl imageUrl, String str) {
        0qQ.A0B(str, 2);
        this.A00 = imageUrl;
        this.A01 = str;
    }

    public final AnonymousClass3I9 F8c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I9) {
                AnonymousClass3I9 r5 = (AnonymousClass3I9) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        return ((imageUrl == null ? 0 : imageUrl.hashCode()) * 31) + this.A01.hashCode();
    }

    public final ImageUrl BGK() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelToastAPI", C44307Ccp.A00(this));
    }

    public final String getText() {
        return this.A01;
    }
}

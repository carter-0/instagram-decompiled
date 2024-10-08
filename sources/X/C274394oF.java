package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4oF  reason: invalid class name and case insensitive filesystem */
public final class C274394oF extends AnonymousClass0T0 implements C274404oG {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C274394oF(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 4);
        0qQ.A0B(str4, 6);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    public final C274394oF F5O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274394oF) {
                C274394oF r5 = (C274394oF) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode2 = (hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A01;
        int hashCode3 = (((hashCode2 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31) + this.A03.hashCode()) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.A05.hashCode();
    }

    public final String AyG() {
        return this.A02;
    }

    public final ImageUrl B40() {
        return this.A00;
    }

    public final ImageUrl BGK() {
        return this.A01;
    }

    public final String Bjg() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkPreviewAttachment", C54801HTi.A00(this));
    }

    public final String getTitle() {
        return this.A04;
    }

    public final String getUrl() {
        return this.A05;
    }
}

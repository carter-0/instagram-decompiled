package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BGd  reason: case insensitive filesystem */
public final class C42075BGd extends AnonymousClass0T0 implements C46287DTq {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C42075BGd(ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass7TF.A1D(str, 2, str3);
        this.A00 = imageUrl;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final C42075BGd F9Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42075BGd) {
                C42075BGd bGd = (C42075BGd) obj;
                if (!0qQ.A0K(this.A00, bGd.A00) || !0qQ.A0K(this.A01, bGd.A01) || !0qQ.A0K(this.A02, bGd.A02) || !0qQ.A0K(this.A03, bGd.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl Ad3() {
        return this.A00;
    }

    public final String Ad5() {
        return this.A01;
    }

    public final String AgB() {
        return this.A02;
    }

    public final String AgD() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryBloksAttributionDict", C44380Ce0.A00(this));
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A08(this.A01, A0C) + C41845B3m.A00(this.A02)) * 31);
    }
}

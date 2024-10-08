package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.UNl  reason: case insensitive filesystem */
public final class C15068UNl extends AnonymousClass0T0 implements XAS {
    public final C21024XAd A00;
    public final List A01;

    public final C15068UNl FDV() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15068UNl) {
                C15068UNl uNl = (C15068UNl) obj;
                if (!0qQ.A0K(this.A00, uNl.A00) || !0qQ.A0K(this.A01, uNl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C21024XAd Aeh() {
        return this.A00;
    }

    public final List ApR() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardCommentCardMultiCardPayload", C16847V8c.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C15068UNl(C21024XAd xAd, List list) {
        this.A00 = xAd;
        this.A01 = list;
    }
}

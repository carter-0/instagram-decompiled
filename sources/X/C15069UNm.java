package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UNm  reason: case insensitive filesystem */
public final class C15069UNm extends AnonymousClass0T0 implements C21027XAg {
    public final C21024XAd A00;
    public final C21030XAj A01;
    public final C21032XAl A02;
    public final XAX A03;

    public final C15069UNm FDW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15069UNm) {
                C15069UNm uNm = (C15069UNm) obj;
                if (!0qQ.A0K(this.A00, uNm.A00) || !0qQ.A0K(this.A01, uNm.A01) || !0qQ.A0K(this.A02, uNm.A02) || !0qQ.A0K(this.A03, uNm.A03)) {
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

    public final C21030XAj ApC() {
        return this.A01;
    }

    public final C21032XAl BaH() {
        return this.A02;
    }

    public final XAX C6r() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardCommentCardSingleCardPayload", C16849V8e.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C15069UNm(C21024XAd xAd, C21030XAj xAj, C21032XAl xAl, XAX xax) {
        this.A00 = xAd;
        this.A01 = xAj;
        this.A02 = xAl;
        this.A03 = xax;
    }
}

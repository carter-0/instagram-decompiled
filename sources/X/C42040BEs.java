package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BEs  reason: case insensitive filesystem */
public final class C42040BEs extends AnonymousClass0T0 implements C46278DTh {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C42040BEs F3J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42040BEs) {
                C42040BEs bEs = (C42040BEs) obj;
                if (!0qQ.A0K(this.A00, bEs.A00) || !0qQ.A0K(this.A02, bEs.A02) || !0qQ.A0K(this.A01, bEs.A01) || !0qQ.A0K(this.A03, bEs.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Aem() {
        return this.A00;
    }

    public final String Aev() {
        return this.A02;
    }

    public final Integer Aex() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGIFSCreateModeInfo", C44159CXy.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public C42040BEs(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = str2;
    }
}

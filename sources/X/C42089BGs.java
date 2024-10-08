package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGs  reason: case insensitive filesystem */
public final class C42089BGs extends AnonymousClass0T0 implements C46261DSq {
    public final int A00;
    public final String A01;

    public C42089BGs(int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final C42089BGs FA1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42089BGs) {
                C42089BGs bGs = (C42089BGs) obj;
                if (this.A00 != bGs.A00 || !0qQ.A0K(this.A01, bGs.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int C4B() {
        return this.A00;
    }

    public final String C4G() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFeatureLinkingStickerTapModel", C44394CeE.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }
}

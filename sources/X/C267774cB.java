package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4cB  reason: invalid class name and case insensitive filesystem */
public final class C267774cB extends AnonymousClass0T0 implements C250703lv {
    public final Float A00;
    public final Float A01;

    public final C267774cB F18() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C267774cB) {
                C267774cB r5 = (C267774cB) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.A01;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public final Float CGt() {
        return this.A00;
    }

    public final Float CHS() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTAStickerCustomPositionInfo", CVI.A00(this));
    }

    public C267774cB(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.47e  reason: invalid class name and case insensitive filesystem */
public final class C2608247e extends AnonymousClass0T0 implements C2608347f {
    public final Boolean A00;
    public final Boolean A01;

    public final C2608247e F2a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2608247e) {
                C2608247e r5 = (C2608247e) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final Boolean Buc() {
        return this.A00;
    }

    public final Boolean Bud() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCtmAdsInfoDict", C54793HTa.A00(this));
    }

    public C2608247e(Boolean bool, Boolean bool2) {
        this.A00 = bool;
        this.A01 = bool2;
    }
}

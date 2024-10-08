package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3kx  reason: invalid class name and case insensitive filesystem */
public final class C250133kx extends AnonymousClass0T0 implements C250143ky {
    public final Boolean A00;
    public final String A01;

    public final C250133kx F5q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250133kx) {
                C250133kx r5 = (C250133kx) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final Boolean CUr() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaIabAutofilllOptoutInfo", Q1Y.A00(this));
    }

    public final String getDomain() {
        return this.A01;
    }

    public C250133kx(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }
}

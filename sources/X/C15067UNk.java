package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UNk  reason: case insensitive filesystem */
public final class C15067UNk extends AnonymousClass0T0 implements C274364oB {
    public final String A00;
    public final String A01;
    public final String A02;

    public final C15067UNk FCe() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15067UNk) {
                C15067UNk uNk = (C15067UNk) obj;
                if (!0qQ.A0K(this.A00, uNk.A00) || !0qQ.A0K(this.A01, uNk.A01) || !0qQ.A0K(this.A02, uNk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BI9() {
        return this.A00;
    }

    public final String BWS() {
        return this.A01;
    }

    public final String BjO() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppDebugInfo", V8Y.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public C15067UNk(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3ID  reason: invalid class name */
public final class AnonymousClass3ID extends AnonymousClass0T0 implements AnonymousClass3IE {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass3ID(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final AnonymousClass3ID FGY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ID) {
                AnonymousClass3ID r5 = (AnonymousClass3ID) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A02.hashCode();
    }

    public final String BGL() {
        return this.A00;
    }

    public final String BGM() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingGlyphClientDict", C45008Col.A00(this));
    }

    public final String getName() {
        return this.A02;
    }
}

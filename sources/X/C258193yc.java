package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3yc  reason: invalid class name and case insensitive filesystem */
public final class C258193yc extends AnonymousClass0T0 implements C258203yd {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public final C258193yc F98() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C258193yc) {
                C258193yc r5 = (C258193yc) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
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
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final String AYN() {
        return this.A01;
    }

    public final String AYO() {
        return this.A02;
    }

    public final Boolean CUi() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextActionMetadata", GAL.A00(this));
    }

    public C258193yc(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }
}

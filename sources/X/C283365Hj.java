package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Hj  reason: invalid class name and case insensitive filesystem */
public final class C283365Hj extends AnonymousClass0T0 implements C283375Hk {
    public final String A00;
    public final String A01;

    public final C283365Hj FAE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283365Hj) {
                C283365Hj r5 = (C283365Hj) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryHashtagDict", C44402CeM.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }

    public C283365Hj(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}

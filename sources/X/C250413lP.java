package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3lP  reason: invalid class name and case insensitive filesystem */
public final class C250413lP extends AnonymousClass0T0 implements C250423lQ {
    public final Long A00;
    public final String A01;
    public final String A02;

    public final C250413lP FG0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250413lP) {
                C250413lP r5 = (C250413lP) obj;
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
        Long l = this.A00;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String Apa() {
        return this.A01;
    }

    public final String BMR() {
        return this.A02;
    }

    public final Long BoN() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationInstructionConditionDict", B53.A00(this));
    }

    public C250413lP(Long l, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = l;
    }
}

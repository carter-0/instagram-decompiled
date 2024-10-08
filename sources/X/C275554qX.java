package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4qX  reason: invalid class name and case insensitive filesystem */
public final class C275554qX extends AnonymousClass0T0 implements C269884fq {
    public final C275524qU A00;
    public final String A01;
    public final List A02;

    public final C275554qX F0K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275554qX) {
                C275554qX r5 = (C275554qX) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A02;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C275524qU r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode2 + i;
    }

    public final List Bip() {
        return this.A02;
    }

    public final String C9w() {
        return this.A01;
    }

    public final C275524qU CBM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiFeedIniInfo", HTF.A00(this));
    }

    public C275554qX(C275524qU r1, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = r1;
    }
}

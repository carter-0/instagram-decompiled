package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UND extends AnonymousClass0T0 implements C274414oH {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final UND F5e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UND) {
                UND und = (UND) obj;
                if (!0qQ.A0K(this.A04, und.A04) || !0qQ.A0K(this.A05, und.A05) || !0qQ.A0K(this.A00, und.A00) || !0qQ.A0K(this.A01, und.A01) || !0qQ.A0K(this.A02, und.A02) || !0qQ.A0K(this.A03, und.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String ApY() {
        return this.A04;
    }

    public final String ApZ() {
        return this.A05;
    }

    public final Integer BX0() {
        return this.A03;
    }

    public final Boolean CWg() {
        return this.A00;
    }

    public final Boolean CWh() {
        return this.A01;
    }

    public final Boolean Cei() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppMediaLoopCommunityInfo", C16823V7e.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public UND(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = num;
    }
}

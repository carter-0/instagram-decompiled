package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.47l  reason: invalid class name and case insensitive filesystem */
public final class C2608947l extends AnonymousClass0T0 implements C2609047m {
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final boolean A05;

    public final C2608947l F2G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2608947l) {
                C2608947l r5 = (C2608947l) obj;
                if (this.A00 != r5.A00 || this.A05 != r5.A05 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int AdN() {
        return this.A00;
    }

    public final boolean COP() {
        return this.A05;
    }

    public final Boolean CQH() {
        return this.A01;
    }

    public final Boolean CTt() {
        return this.A02;
    }

    public final Boolean CVt() {
        return this.A03;
    }

    public final Boolean Ccj() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreatorBroadcastChatThreadPreviewResponse", B6G.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        Boolean bool = this.A01;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Boolean bool3 = this.A03;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        Boolean bool4 = this.A04;
        if (bool4 != null) {
            i4 = bool4.hashCode();
        }
        return i7 + i4;
    }

    public C2608947l(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A04 = bool4;
    }
}

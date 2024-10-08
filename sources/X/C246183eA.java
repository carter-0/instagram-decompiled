package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3eA  reason: invalid class name and case insensitive filesystem */
public final class C246183eA extends AnonymousClass0T0 implements C246193eB {
    public final 1eB A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C246183eA(1eB r2, String str, String str2, String str3, String str4, boolean z) {
        0qQ.A0B(str2, 3);
        0qQ.A0B(str4, 6);
        this.A01 = str;
        this.A00 = r2;
        this.A02 = str2;
        this.A05 = z;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final C246183eA F3D() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246183eA) {
                C246183eA r5 = (C246183eA) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A05 != r5.A05 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1eD AwK() {
        return this.A00;
    }

    public final boolean BvY() {
        return this.A05;
    }

    public final String C27() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFollowUpOption", GAZ.A00(this));
    }

    public final String getData() {
        return this.A01;
    }

    public final String getId() {
        return this.A02;
    }

    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        1eB r0 = this.A00;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int hashCode3 = (((i2 + hashCode2) * 31) + this.A02.hashCode()) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (hashCode3 + i3) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i4 + i) * 31) + this.A04.hashCode();
    }
}

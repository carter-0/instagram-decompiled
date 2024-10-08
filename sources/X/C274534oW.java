package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4oW  reason: invalid class name and case insensitive filesystem */
public final class C274534oW extends AnonymousClass0T0 implements C274544oX {
    public final C274524oV A00;
    public final C274524oV A01;
    public final C274524oV A02;
    public final C274524oV A03;
    public final C274524oV A04;

    public final C274534oW FCK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274534oW) {
                C274534oW r5 = (C274534oW) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C274524oV r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C274524oV r02 = this.A01;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        C274524oV r03 = this.A02;
        int hashCode3 = (hashCode2 + (r03 == null ? 0 : r03.hashCode())) * 31;
        C274524oV r04 = this.A03;
        int hashCode4 = (hashCode3 + (r04 == null ? 0 : r04.hashCode())) * 31;
        C274524oV r05 = this.A04;
        if (r05 != null) {
            i = r05.hashCode();
        }
        return hashCode4 + i;
    }

    public final C274524oV BPy() {
        return this.A00;
    }

    public final C274524oV CB4() {
        return this.A01;
    }

    public final C274524oV CB5() {
        return this.A02;
    }

    public final C274524oV CB6() {
        return this.A03;
    }

    public final C274524oV CB7() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUMediaNavigationInfo", HU5.A00(this));
    }

    public C274534oW(C274524oV r1, C274524oV r2, C274524oV r3, C274524oV r4, C274524oV r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}

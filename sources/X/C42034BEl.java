package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BEl  reason: case insensitive filesystem */
public final class C42034BEl extends AnonymousClass0T0 implements C46277DTg {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C42034BEl(int i, int i2, String str, String str2) {
        AnonymousClass7TF.A1D(str, 3, str2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final C42034BEl F30() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42034BEl) {
                C42034BEl bEl = (C42034BEl) obj;
                if (this.A00 != bEl.A00 || this.A01 != bEl.A01 || !0qQ.A0K(this.A02, bEl.A02) || !0qQ.A0K(this.A03, bEl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bgr() {
        return this.A02;
    }

    public final String BhP() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFbMentionedUserData", C44136CXb.A00(this));
    }

    public final int getLength() {
        return this.A00;
    }

    public final int getOffset() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, ((this.A00 * 31) + this.A01) * 31));
    }
}

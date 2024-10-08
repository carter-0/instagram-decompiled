package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BGQ extends AnonymousClass0T0 implements C46285DTo {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public BGQ(int i, String str, String str2, int i2) {
        0qQ.A0B(str2, 3);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }

    public final BGQ F94() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGQ) {
                BGQ bgq = (BGQ) obj;
                if (this.A00 != bgq.A00 || !0qQ.A0K(this.A02, bgq.A02) || !0qQ.A0K(this.A03, bgq.A03) || this.A01 != bgq.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String CAh() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShowreelNativeImage", C44353CdZ.A00(this));
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, ((this.A00 * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + this.A01;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFP extends AnonymousClass0T0 implements DTH {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public final BFP F5i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFP) {
                BFP bfp = (BFP) obj;
                if (!(0qQ.A0K(this.A00, bfp.A00) && this.A01 == bfp.A01 && this.A02 == bfp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BWs() {
        return this.A00;
    }

    public final boolean BvA() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaAchievementsInfo", Ca9.A00(this));
    }

    public final boolean getShowAchievements() {
        return this.A01;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A09 + i;
    }

    public BFP(Integer num, boolean z, boolean z2) {
        this.A00 = num;
        this.A01 = z;
        this.A02 = z2;
    }
}

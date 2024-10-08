package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.58p  reason: invalid class name and case insensitive filesystem */
public final class C2815858p extends AnonymousClass0T0 implements C2815958q {
    public final long A00;
    public final LiveUserPaySupportTier A01;
    public final String A02;

    public C2815858p(LiveUserPaySupportTier liveUserPaySupportTier, String str, long j) {
        0qQ.A0B(str, 2);
        0qQ.A0B(liveUserPaySupportTier, 3);
        this.A00 = j;
        this.A02 = str;
        this.A01 = liveUserPaySupportTier;
    }

    public final C2815858p F5Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2815858p) {
                C2815858p r8 = (C2815858p) obj;
                if (!(this.A00 == r8.A00 && 0qQ.A0K(this.A02, r8.A02) && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long Ax1() {
        return this.A00;
    }

    public final String Bwo() {
        return this.A02;
    }

    public final LiveUserPaySupportTier C36() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayTierInfo", C63020KqB.A00(this));
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }
}

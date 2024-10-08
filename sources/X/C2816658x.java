package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.58x  reason: invalid class name and case insensitive filesystem */
public final class C2816658x extends AnonymousClass0T0 implements C2816758y {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C2816458v A03;
    public final C2816258t A04;
    public final List A05;

    public C2816658x(C2816458v r2, C2816258t r3, List list, long j, long j2, long j3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 5);
        0qQ.A0B(list, 6);
        this.A03 = r2;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A04 = r3;
        this.A05 = list;
    }

    public final C2816658x F5b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2816658x) {
                C2816658x r8 = (C2816658x) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A02 != r8.A02 || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C2816558w AqC() {
        return this.A03;
    }

    public final long Ax0() {
        return this.A00;
    }

    public final long Ax1() {
        return this.A01;
    }

    public final long Baw() {
        return this.A02;
    }

    public final C2816258t BcY() {
        return this.A04;
    }

    public final List C7B() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayViewerPayConfig", C63022KqD.A00(this));
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        long j3 = this.A02;
        return (((((((((this.A03.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
    }
}

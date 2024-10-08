package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UOA extends AnonymousClass0T0 implements C21021XAa {
    public final UN8 A00;
    public final UN9 A01;
    public final UNA A02;

    public final UOA FFD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOA) {
                UOA uoa = (UOA) obj;
                if (!0qQ.A0K(this.A00, uoa.A00) || !0qQ.A0K(this.A01, uoa.A01) || !0qQ.A0K(this.A02, uoa.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C21023XAc Ax4() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ XAO BjX() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ XAW C8b() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardDisplayInfoDict", C17016VEq.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public UOA(UN8 un8, UN9 un9, UNA una) {
        this.A00 = un8;
        this.A01 = un9;
        this.A02 = una;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BIy  reason: case insensitive filesystem */
public final class C42143BIy extends AnonymousClass0T0 implements C46272DTb {
    public final Float A00;
    public final Integer A01;
    public final Integer A02;

    public final C42143BIy FGc() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42143BIy) {
                C42143BIy bIy = (C42143BIy) obj;
                if (!0qQ.A0K(this.A01, bIy.A01) || !0qQ.A0K(this.A02, bIy.A02) || !0qQ.A0K(this.A00, bIy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BYC() {
        return this.A01;
    }

    public final Integer BZz() {
        return this.A02;
    }

    public final Float CDD() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPredicateClientDict", C45097CqF.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42143BIy(Float f, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = f;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BIh  reason: case insensitive filesystem */
public final class C42129BIh extends AnonymousClass0T0 implements DUI {
    public final C269814fj A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;

    public final C42129BIh FFC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42129BIh) {
                C42129BIh bIh = (C42129BIh) obj;
                if (!0qQ.A0K(this.A00, bIh.A00) || !0qQ.A0K(this.A01, bIh.A01) || !0qQ.A0K(this.A02, bIh.A02) || !0qQ.A0K(this.A03, bIh.A03) || !0qQ.A0K(this.A04, bIh.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C269824fk AlW() {
        return this.A00;
    }

    public final Integer BCu() {
        return this.A01;
    }

    public final Integer Byw() {
        return this.A02;
    }

    public final Integer Byy() {
        return this.A03;
    }

    public final Integer CGY() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryAdAutoCropDict", C44906Cmw.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C42129BIh(C269814fj r1, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A04 = num4;
    }
}

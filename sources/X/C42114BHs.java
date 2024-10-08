package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHs  reason: case insensitive filesystem */
public final class C42114BHs extends AnonymousClass0T0 implements DTT {
    public final int A00;
    public final C42113BHr A01;
    public final Integer A02;

    public C42114BHs(C42113BHr bHr, Integer num, int i) {
        0qQ.A0B(bHr, 1);
        this.A01 = bHr;
        this.A02 = num;
        this.A00 = i;
    }

    public final C42114BHs FCd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42114BHs) {
                C42114BHs bHs = (C42114BHs) obj;
                if (!0qQ.A0K(this.A01, bHs.A01) || !0qQ.A0K(this.A02, bHs.A02) || this.A00 != bHs.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C46290DTt B1r() {
        return this.A01;
    }

    public final Integer BMP() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextEntityRange", C44520CgG.A00(this));
    }

    public final int getOffset() {
        return this.A00;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00;
    }
}

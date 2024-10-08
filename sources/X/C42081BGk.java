package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGk  reason: case insensitive filesystem */
public final class C42081BGk extends AnonymousClass0T0 implements C257973yG {
    public final Boolean A00;
    public final String A01;

    public final C42081BGk F9o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42081BGk) {
                C42081BGk bGk = (C42081BGk) obj;
                if (!0qQ.A0K(this.A00, bGk.A00) || !0qQ.A0K(this.A01, bGk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean AcF() {
        return this.A00;
    }

    public final String AcZ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryDynamicAdFlexibleTilesInfo", C44387Ce7.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C42081BGk(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHj  reason: case insensitive filesystem */
public final class C42106BHj extends AnonymousClass0T0 implements C46268DSx {
    public final C42107BHk A00;
    public final AnonymousClass3IJ A01;

    public final C42106BHj FCF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42106BHj) {
                C42106BHj bHj = (C42106BHj) obj;
                if (!0qQ.A0K(this.A00, bHj.A00) || !0qQ.A0K(this.A01, bHj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C46317DUu Bie() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3IK BwY() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSurveyDataDict", C44496Cfs.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42106BHj(C42107BHk bHk, AnonymousClass3IJ r2) {
        this.A00 = bHk;
        this.A01 = r2;
    }
}

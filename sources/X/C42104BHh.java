package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHh  reason: case insensitive filesystem */
public final class C42104BHh extends AnonymousClass0T0 implements C46266DSv {
    public final C42106BHj A00;
    public final String A01;

    public final C42104BHh FCD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42104BHh) {
                C42104BHh bHh = (C42104BHh) obj;
                if (!0qQ.A0K(this.A00, bHh.A00) || !0qQ.A0K(this.A01, bHh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C46268DSx AvA() {
        return this.A00;
    }

    public final String CAh() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSurveyAttachmentDict", C44493Cfp.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C42104BHh(C42106BHj bHj, String str) {
        this.A00 = bHj;
        this.A01 = str;
    }
}

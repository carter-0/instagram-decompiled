package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;

/* renamed from: X.3xg  reason: invalid class name and case insensitive filesystem */
public final class C257613xg extends AnonymousClass0T0 implements C257623xh {
    public final C301005yJ A00;
    public final IgShowreelComposition A01;

    public final C257613xg F2E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257613xg) {
                C257613xg r5 = (C257613xg) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelComposition igShowreelComposition = this.A01;
        int i = 0;
        int hashCode = (igShowreelComposition == null ? 0 : igShowreelComposition.hashCode()) * 31;
        C301005yJ r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode + i;
    }

    public final IgShowreelComposition Bw9() {
        return this.A01;
    }

    public final C301005yJ BwA() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeTransformation", CWW.A00(this));
    }

    public C257613xg(C301005yJ r1, IgShowreelComposition igShowreelComposition) {
        this.A01 = igShowreelComposition;
        this.A00 = r1;
    }
}

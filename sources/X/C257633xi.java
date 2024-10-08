package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.3xi  reason: invalid class name and case insensitive filesystem */
public final class C257633xi extends AnonymousClass0T0 implements C257643xj {
    public final IgShowreelComposition A00;
    public final IgShowreelNativeAnimation A01;

    public final C257633xi F2F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257633xi) {
                C257633xi r5 = (C257633xi) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelComposition igShowreelComposition = this.A00;
        int i = 0;
        int hashCode = (igShowreelComposition == null ? 0 : igShowreelComposition.hashCode()) * 31;
        IgShowreelNativeAnimation igShowreelNativeAnimation = this.A01;
        if (igShowreelNativeAnimation != null) {
            i = igShowreelNativeAnimation.hashCode();
        }
        return hashCode + i;
    }

    public final IgShowreelComposition Bw9() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ IgShowreelNativeAnimationIntf BwB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreativeTransformationsFeedInfo", CWX.A00(this));
    }

    public C257633xi(IgShowreelComposition igShowreelComposition, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        this.A00 = igShowreelComposition;
        this.A01 = igShowreelNativeAnimation;
    }
}

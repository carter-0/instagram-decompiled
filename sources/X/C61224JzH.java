package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.JzH  reason: case insensitive filesystem */
public final class C61224JzH extends AnonymousClass0T0 implements C66562MWq {
    public final C61223JzG A00;

    public final C61224JzH FF2() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61224JzH) && 0qQ.A0K(this.A00, ((C61224JzH) obj).A00));
    }

    public final /* bridge */ /* synthetic */ C66561MWp BGj() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (BGj() != null) {
            C66561MWp BGj = BGj();
            if (BGj != null) {
                treeUpdaterJNI = BGj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("incentive", treeUpdaterJNI);
        }
        return new TreeUpdaterJNI("XDTShoppingNetegoInStoryRichDestination", 0Yt.A0B(A1H));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C61224JzH(C61223JzG jzG) {
        this.A00 = jzG;
    }
}

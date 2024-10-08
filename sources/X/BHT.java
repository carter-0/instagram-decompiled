package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BHT extends AnonymousClass0T0 implements DSP {
    public final List A00;

    public BHT(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final BHT FBk() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BHT) && 0qQ.A0K(this.A00, ((BHT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List AdE() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTextAttributions", C44457CfF.A00(this));
    }
}

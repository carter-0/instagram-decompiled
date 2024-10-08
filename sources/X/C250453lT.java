package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3lT  reason: invalid class name and case insensitive filesystem */
public final class C250453lT extends AnonymousClass0T0 implements C250463lU {
    public final C250433lR A00;

    public final C250453lT FG1() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C250453lT) && 0qQ.A0K(this.A00, ((C250453lT) obj).A00));
    }

    public final int hashCode() {
        C250433lR r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    public final /* bridge */ /* synthetic */ C250443lS BI2() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (BI2() != null) {
            C250443lS BI2 = BI2();
            if (BI2 != null) {
                treeUpdaterJNI = BI2.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("instruction", treeUpdaterJNI);
        }
        return new TreeUpdaterJNI("XDTClientInvalidationInstruction", 0Yt.A0B(linkedHashMap));
    }

    public C250453lT(C250433lR r1) {
        this.A00 = r1;
    }
}

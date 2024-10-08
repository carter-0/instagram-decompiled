package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BE9 extends AnonymousClass0T0 implements C270544gu {
    public final int A00;
    public final List A01;

    public final BE9 F1Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE9) {
                BE9 be9 = (BE9) obj;
                if (this.A00 != be9.A00 || !0qQ.A0K(this.A01, be9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List BRn() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsMerchandisingPillInfo", C44087CVe.A00(this));
    }

    public final int getLoopTime() {
        return this.A00;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public BE9(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BJ1 extends AnonymousClass0T0 implements DU1 {
    public final Integer A00;
    public final List A01;

    public final BJ1 FGt(1E9 r1) {
        return this;
    }

    public final BJ1 FGu(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BJ1) {
                BJ1 bj1 = (BJ1) obj;
                if (!0qQ.A0K(this.A01, bj1.A01) || !0qQ.A0K(this.A00, bj1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List AdK() {
        return this.A01;
    }

    public final Integer AdM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProfileNoteOnProfileResponse", C45134Cqs.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BJ1(Integer num, List list) {
        this.A01 = list;
        this.A00 = num;
    }

    public final DU1 EAa(1E9 r1) {
        return this;
    }
}

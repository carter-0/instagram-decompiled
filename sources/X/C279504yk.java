package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4yk  reason: invalid class name and case insensitive filesystem */
public final class C279504yk extends AnonymousClass0T0 implements C279514yl {
    public final Long A00;
    public final List A01;

    public final C279504yk F1j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279504yk) {
                C279504yk r5 = (C279504yk) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A00;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final Long BZc() {
        return this.A00;
    }

    public final List BrQ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateEffectsInfo", B6c.A00(this));
    }

    public C279504yk(Long l, List list) {
        this.A00 = l;
        this.A01 = list;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4fm  reason: invalid class name and case insensitive filesystem */
public final class C269844fm extends AnonymousClass0T0 implements C269854fn {
    public final String A00;
    public final List A01;

    public final C269844fm FFB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C269844fm) {
                C269844fm r5 = (C269844fm) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final List BKJ() {
        return this.A01;
    }

    public final String BTi() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdKeywordHighlightDict", C44905Cmv.A00(this));
    }

    public C269844fm(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}

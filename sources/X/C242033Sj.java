package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Sj  reason: invalid class name and case insensitive filesystem */
public final class C242033Sj extends AnonymousClass0T0 implements C242043Sk {
    public final Boolean A00;
    public final List A01;

    public C242033Sj(Boolean bool, List list) {
        0qQ.A0B(list, 2);
        this.A00 = bool;
        this.A01 = list;
    }

    public final C242033Sj F7W() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C242033Sj) {
                C242033Sj r5 = (C242033Sj) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.A01.hashCode();
    }

    public final Boolean BBw() {
        return this.A00;
    }

    public final List BcT() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPinnedChannelsInfoDict", C41864B4i.A00(this));
    }
}

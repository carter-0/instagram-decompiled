package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BFq  reason: case insensitive filesystem */
public final class C42063BFq extends AnonymousClass0T0 implements C46257DSm {
    public final String A00;
    public final boolean A01;

    public C42063BFq(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final C42063BFq F7b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42063BFq) {
                C42063BFq bFq = (C42063BFq) obj;
                if (!0qQ.A0K(this.A00, bFq.A00) || this.A01 != bFq.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Be7() {
        return this.A00;
    }

    public final boolean Bue() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (Be7() != null) {
            A1H.put("post_friction_reason", Be7());
        }
        Bue();
        return C41845B3m.A0T("XDTPostFrictionInfo", C41845B3m.A0u("should_show_post_friction", Boolean.valueOf(Bue()), A1H));
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0O + i;
    }
}

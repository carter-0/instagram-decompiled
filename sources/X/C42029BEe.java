package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BEe  reason: case insensitive filesystem */
public final class C42029BEe extends AnonymousClass0T0 implements C46245DSa {
    public final String A00;
    public final String A01;

    public final C42029BEe F2l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42029BEe) {
                C42029BEe bEe = (C42029BEe) obj;
                if (!0qQ.A0K(this.A00, bEe.A00) || !0qQ.A0K(this.A01, bEe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getId() != null) {
            C41845B3m.A0x(getId(), A1H);
        }
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        return C41845B3m.A0T("XDTEventBadge", 0Yt.A0B(A1H));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C42029BEe(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}

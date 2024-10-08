package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BFo  reason: case insensitive filesystem */
public final class C42061BFo extends AnonymousClass0T0 implements DTK {
    public final String A00;
    public final String A01;
    public final List A02;

    public final C42061BFo F7Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42061BFo) {
                C42061BFo bFo = (C42061BFo) obj;
                if (!0qQ.A0K(this.A00, bFo.A00) || !0qQ.A0K(this.A02, bFo.A02) || !0qQ.A0K(this.A01, bFo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List C48() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPollCreateModeSticker", CbX.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A01);
    }

    public C42061BFo(String str, String str2, List list) {
        AnonymousClass7TG.A1O(str, list);
        this.A00 = str;
        this.A02 = list;
        this.A01 = str2;
    }
}

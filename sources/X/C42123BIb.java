package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BIb  reason: case insensitive filesystem */
public final class C42123BIb extends AnonymousClass0T0 implements DTZ {
    public final C42105BHi A00;
    public final String A01;
    public final String A02;

    public final C42123BIb FEi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42123BIb) {
                C42123BIb bIb = (C42123BIb) obj;
                if (!0qQ.A0K(this.A01, bIb.A01) || !0qQ.A0K(this.A00, bIb.A00) || !0qQ.A0K(this.A02, bIb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Agd() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C46267DSw AjX() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLearnMore", C44872CmO.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C42123BIb(C42105BHi bHi, String str, String str2) {
        AnonymousClass7TG.A1P(str, str2);
        this.A01 = str;
        this.A00 = bHi;
        this.A02 = str2;
    }
}

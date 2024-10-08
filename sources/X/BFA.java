package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFA extends AnonymousClass0T0 implements C257753xu {
    public final String A00;
    public final String A01;

    public final BFA F4q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFA) {
                BFA bfa = (BFA) obj;
                if (!0qQ.A0K(this.A00, bfa.A00) || !0qQ.A0K(this.A01, bfa.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BI8() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGOopsSurveyInfoDict", CZC.A00(this));
    }

    public final String getCategory() {
        return this.A00;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BFA(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}

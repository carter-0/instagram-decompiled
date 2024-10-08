package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BIc  reason: case insensitive filesystem */
public final class C42124BIc extends AnonymousClass0T0 implements DUH {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final C42124BIc FEj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42124BIc) {
                C42124BIc bIc = (C42124BIc) obj;
                if (!0qQ.A0K(this.A04, bIc.A04) || !0qQ.A0K(this.A01, bIc.A01) || !0qQ.A0K(this.A02, bIc.A02) || !0qQ.A0K(this.A00, bIc.A00) || !0qQ.A0K(this.A03, bIc.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Abw() {
        return this.A04;
    }

    public final String BiQ() {
        return this.A01;
    }

    public final Integer C8q() {
        return this.A00;
    }

    public final String CAh() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSurveyQuestion", C44874CmQ.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0C(this.A04) * 31);
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }

    public C42124BIc(Integer num, String str, String str2, String str3, List list) {
        AnonymousClass7TG.A1Q(str, str2);
        0qQ.A0B(str3, 5);
        this.A04 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
    }
}

package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHg  reason: case insensitive filesystem */
public final class C42103BHg extends AnonymousClass0T0 implements C46289DTs {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public C42103BHg(Boolean bool, Integer num, String str, String str2) {
        AnonymousClass7TF.A1D(str, 3, str2);
        this.A00 = bool;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }

    public final C42103BHg FCB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42103BHg) {
                C42103BHg bHg = (C42103BHg) obj;
                if (!0qQ.A0K(this.A00, bHg.A00) || !0qQ.A0K(this.A01, bHg.A01) || !0qQ.A0K(this.A02, bHg.A02) || !0qQ.A0K(this.A03, bHg.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BXD() {
        return this.A01;
    }

    public final Boolean CSq() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSurveyAnswer", C44491Cfn.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final String getValue() {
        return this.A03;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }
}

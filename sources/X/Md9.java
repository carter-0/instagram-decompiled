package X;

public final class Md9 extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final C328607Fl A00;
    public final C66809Mcv A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Md9) {
                Md9 md9 = (Md9) obj;
                if (!0qQ.A0K(this.A02, md9.A02) || !0qQ.A0K(this.A01, md9.A01) || !0qQ.A0K(this.A00, md9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Md9 md9 = (Md9) obj;
        if (md9 == null || !0qQ.A0K(this.A02, md9.A02)) {
            return false;
        }
        C66809Mcv mcv = this.A01;
        C66809Mcv mcv2 = md9.A01;
        0qQ.A0B(mcv2, 0);
        if (!mcv.equals(mcv2) || !this.A00.equals(md9.A00)) {
            return false;
        }
        return true;
    }

    public Md9(C328607Fl r1, C66809Mcv mcv, String str) {
        this.A02 = str;
        this.A01 = mcv;
        this.A00 = r1;
    }
}

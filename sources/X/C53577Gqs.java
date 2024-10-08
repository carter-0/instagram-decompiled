package X;

/* renamed from: X.Gqs  reason: case insensitive filesystem */
public final class C53577Gqs extends AnonymousClass0T0 implements C59508JMg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C53577Gqs(C267324bN r1, AnonymousClass3W1 r2, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53577Gqs)) {
            return false;
        }
        C53577Gqs gqs = (C53577Gqs) obj;
        if (gqs.A00 != i || !0qQ.A0K(this.A01, gqs.A01) || !0qQ.A0K(this.A02, gqs.A02) || this.A03 != gqs.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }
}

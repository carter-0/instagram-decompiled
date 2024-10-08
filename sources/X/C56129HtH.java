package X;

/* renamed from: X.HtH  reason: case insensitive filesystem */
public final class C56129HtH {
    public final C56564I1s A00;
    public final C59584JPe A01;
    public final String A02;
    public final boolean A03;
    public final JMV A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56129HtH) {
                C56129HtH htH = (C56129HtH) obj;
                if (!0qQ.A0K(this.A01, htH.A01) || !0qQ.A0K(this.A04, htH.A04) || !0qQ.A0K(this.A00, htH.A00) || !0qQ.A0K(this.A02, htH.A02) || this.A03 != htH.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, G9w.A01(AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A01))))));
    }

    public C56129HtH(C56564I1s i1s, C59584JPe jPe, JMV jmv, String str, boolean z) {
        this.A01 = jPe;
        this.A04 = jmv;
        this.A00 = i1s;
        this.A02 = str;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiConfiguration(iconResolver=");
        A1A.append(this.A01);
        A1A.append(", appTheme=");
        A1A.append(this.A04);
        A1A.append(", metaAiLinks=");
        A1A.append(this.A00);
        A1A.append(", appName=");
        A1A.append(this.A02);
        C51975G9x.A1G(A1A, ", shouldShowCloseButton=");
        A1A.append(", shouldShowFeedbackInPopover=");
        return G9t.A1C(A1A, this.A03);
    }
}

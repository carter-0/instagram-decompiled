package X;

/* renamed from: X.Hsb  reason: case insensitive filesystem */
public final class C56088Hsb {
    public final long A00;
    public final C56087Hsa A01;

    public C56088Hsb(C56087Hsa hsa, long j) {
        0qQ.A0B(hsa, 3);
        this.A01 = hsa;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56088Hsb) {
                C56088Hsb hsb = (C56088Hsb) obj;
                if (!0qQ.A0K(this.A01, hsb.A01) || this.A00 != hsb.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, G9w.A01(2245082)) + C51968G9o.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIPromptSheetParams(metaAiPromptSheetAppSurface=");
        A1A.append("IGD");
        C51975G9x.A1G(A1A, ", isDarkModeForced=");
        A1A.append(", metaAIPromptSheetLoggingParams=");
        A1A.append(this.A01);
        A1A.append(Pxd.A00(309));
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}

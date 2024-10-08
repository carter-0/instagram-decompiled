package X;

/* renamed from: X.GIs  reason: case insensitive filesystem */
public final class C52201GIs extends AnonymousClass0T0 implements C59510JMi {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final boolean A02;
    public final AnonymousClass4Ke A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52201GIs) {
                C52201GIs gIs = (C52201GIs) obj;
                if (!0qQ.A0K(this.A00, gIs.A00) || !0qQ.A0K(this.A01, gIs.A01) || !0qQ.A0K(this.A03, gIs.A03) || this.A02 != gIs.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        return DbS.A06(this.A02, (AnonymousClass7TF.A07(this.A01, A0K) + AnonymousClass7TG.A0C(this.A03)) * 31);
    }

    public C52201GIs(C267324bN r1, C52058GDe gDe, AnonymousClass4Ke r3, boolean z) {
        this.A00 = r1;
        this.A01 = gDe;
        this.A03 = r3;
        this.A02 = z;
    }
}

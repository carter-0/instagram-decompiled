package X;

/* renamed from: X.GmW  reason: case insensitive filesystem */
public final class C53346GmW extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final C53400GnX A02;
    public final C231672s5 A03;
    public final C46312DUp A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass3W1 A06;
    public final AnonymousClass3ZT A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53346GmW) {
                C53346GmW gmW = (C53346GmW) obj;
                if (!0qQ.A0K(this.A07, gmW.A07) || !0qQ.A0K(this.A06, gmW.A06) || Float.compare(this.A00, gmW.A00) != 0 || !0qQ.A0K(this.A04, gmW.A04) || this.A01 != gmW.A01 || !0qQ.A0K(this.A05, gmW.A05) || !0qQ.A0K(this.A03, gmW.A03) || !0qQ.A0K(this.A02, gmW.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A07);
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A06, A0K), this.A00) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31)));
    }

    public C53346GmW(C53400GnX gnX, C231672s5 r2, C46312DUp dUp, AnonymousClass4DU r4, AnonymousClass3W1 r5, AnonymousClass3ZT r6, float f, int i) {
        this.A07 = r6;
        this.A06 = r5;
        this.A00 = f;
        this.A04 = dUp;
        this.A01 = i;
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = gnX;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaGuideUiState(lazyMediaFetcher=");
        A1A.append(this.A07);
        A1A.append(AnonymousClass000.A00(202));
        A1A.append(this.A06);
        A1A.append(C66579MXk.A00(77));
        A1A.append(this.A00);
        A1A.append(", guideFeedMetadata=");
        A1A.append(this.A04);
        A1A.append(", position=");
        A1A.append(this.A01);
        A1A.append(", insightsHost=");
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(2021));
        A1A.append(this.A03);
        A1A.append(", actions=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}

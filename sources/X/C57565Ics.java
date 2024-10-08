package X;

/* renamed from: X.Ics  reason: case insensitive filesystem */
public final class C57565Ics implements JMQ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final 0sP A04;
    public final 0sP A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57565Ics) {
                C57565Ics ics = (C57565Ics) obj;
                if (!0qQ.A0K(this.A01, ics.A01) || !0qQ.A0K(this.A02, ics.A02) || !0qQ.A0K(this.A00, ics.A00) || !0qQ.A0K(this.A03, ics.A03) || this.A06 != ics.A06 || !0qQ.A0K(this.A05, ics.A05) || !0qQ.A0K(this.A04, ics.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01));
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A08(this.A00, A08) + AnonymousClass7TG.A0E(this.A03)) * 31)));
    }

    public C57565Ics(String str, String str2, String str3, String str4, 0sP r5, 0sP r6, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A06 = z;
        this.A05 = r5;
        this.A04 = r6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAISearchLinkUIState(searchEngineIconUrl=");
        A1A.append(this.A01);
        A1A.append(", searchQuery=");
        A1A.append(this.A02);
        A1A.append(", attributionUri=");
        A1A.append(this.A00);
        A1A.append(", sourcesUrl=");
        A1A.append(this.A03);
        A1A.append(", isSourceVisible=");
        A1A.append(this.A06);
        A1A.append(", onSourcesFooterTextClicked=");
        A1A.append(this.A05);
        A1A.append(", onSearchInfoCardClicked=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}

package X;

/* renamed from: X.IdF  reason: case insensitive filesystem */
public final class C57588IdF implements C59563JOj {
    public final int A00;
    public final String A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final 0sP A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57588IdF) {
                C57588IdF idF = (C57588IdF) obj;
                if (this.A00 != idF.A00 || !0qQ.A0K(this.A01, idF.A01) || !0qQ.A0K(this.A03, idF.A03) || !0qQ.A0K(this.A02, idF.A02) || !0qQ.A0K(this.A04, idF.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C251263mp Ezq(C70832Wc r9) {
        int i = this.A00;
        String str = this.A01;
        C62320sa r4 = this.A03;
        C62320sa r5 = this.A02;
        0sP r6 = this.A04;
        return new C53818Gul(2WX.A02, C243573Zh.FLEX_START, str, r4, r5, r6, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A01, this.A00 * 31))));
    }

    public C57588IdF(String str, C62320sa r2, C62320sa r3, 0sP r4, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = r4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextSuggestion(id=");
        A1A.append(this.A00);
        A1A.append(", text=");
        A1A.append(this.A01);
        A1A.append(", resultOnVisible=");
        A1A.append(this.A03);
        A1A.append(", resultOnClick=");
        A1A.append(this.A02);
        A1A.append(", feedbackOnClick=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}

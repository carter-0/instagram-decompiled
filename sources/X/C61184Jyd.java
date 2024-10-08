package X;

/* renamed from: X.Jyd  reason: case insensitive filesystem */
public final class C61184Jyd extends AnonymousClass0T0 implements AnonymousClass8IM {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61184Jyd) {
                C61184Jyd jyd = (C61184Jyd) obj;
                if (!(0qQ.A0K(this.A02, jyd.A02) && 0qQ.A0K(this.A01, jyd.A01) && this.A04 == jyd.A04 && this.A03 == jyd.A03 && this.A00 == jyd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A04;
    }

    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A04, ((AnonymousClass7TG.A0E(this.A02) * 31) + C41845B3m.A00(this.A01)) * 31)) + this.A00;
    }

    public C61184Jyd(String str, String str2, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextToSpeechListItemModel(name=");
        A1A.append(this.A02);
        A1A.append(", emojiCode=");
        A1A.append(this.A01);
        A1A.append(", isSelected=");
        A1A.append(this.A04);
        A1A.append(C66579MXk.A00(27));
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(80));
        return C51975G9x.A0j(A1A, this.A00);
    }

    public C61184Jyd() {
        this((String) null, (String) null, 0, false, false);
    }
}

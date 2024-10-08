package X;

/* renamed from: X.Jyk  reason: case insensitive filesystem */
public final class C61191Jyk extends AnonymousClass0T0 implements C66472MTa {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61191Jyk) {
                C61191Jyk jyk = (C61191Jyk) obj;
                if (!0qQ.A0K(this.A01, jyk.A01) || !0qQ.A0K(this.A00, jyk.A00) || this.A03 != jyk.A03 || this.A02 != jyk.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A03;
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, ((AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00)) * 31));
    }

    public C61191Jyk(String str, String str2, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TtsVoiceModel(name=");
        A1A.append(this.A01);
        A1A.append(", emojiCode=");
        A1A.append(this.A00);
        A1A.append(", isSelected=");
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(27));
        return G9t.A1C(A1A, this.A02);
    }

    public C61191Jyk() {
        this((String) null, (String) null, false, false);
    }
}

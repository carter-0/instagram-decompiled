package X;

/* renamed from: X.WDj  reason: case insensitive filesystem */
public final class C18931WDj implements XAM {
    public final SRG A00;
    public final CharSequence A01;

    public final int Cra(int i) {
        do {
            SRG srg = this.A00;
            SRG.A00(srg, i);
            i = srg.A00.following(i);
            if (i == -1) {
                return -1;
            }
        } while (C13988Tno.A1Z(this.A01, i - 1));
        return i;
    }

    public final int Cre(int i) {
        CharSequence charSequence;
        do {
            SRG srg = this.A00;
            SRG.A00(srg, i);
            i = srg.A00.following(i);
            if (i != -1) {
                charSequence = this.A01;
                if (i != charSequence.length()) {
                }
            }
            return -1;
        } while (C13988Tno.A1Z(charSequence, i));
        return i;
    }

    public final int E4N(int i) {
        do {
            SRG srg = this.A00;
            SRG.A00(srg, i);
            i = srg.A00.preceding(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (C13988Tno.A1Z(this.A01, i - 1));
        return i;
    }

    public final int E4P(int i) {
        do {
            SRG srg = this.A00;
            SRG.A00(srg, i);
            i = srg.A00.preceding(i);
            if (i == -1) {
                return -1;
            }
        } while (C13988Tno.A1Z(this.A01, i));
        return i;
    }

    public C18931WDj(SRG srg, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = srg;
    }
}

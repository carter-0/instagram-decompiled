package X;

import java.text.BreakIterator;
import java.util.Locale;

public final class SRG {
    public final BreakIterator A00;
    public final int A01;
    public final int A02;
    public final CharSequence A03;

    public SRG(CharSequence charSequence, Locale locale, int i) {
        this.A03 = charSequence;
        if (0 > charSequence.length()) {
            throw AnonymousClass7TE.A0w("input start index is outside the CharSequence");
        } else if (i < 0 || i > charSequence.length()) {
            throw AnonymousClass7TE.A0w("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.A00 = wordInstance;
            this.A02 = Math.max(0, -50);
            this.A01 = Math.min(charSequence.length(), i + 50);
            wordInstance.setText(new TLX(charSequence, i));
        }
    }

    public static final void A00(SRG srg, int i) {
        int i2 = srg.A02;
        int i3 = srg.A01;
        if (i > i3 || i2 > i) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Invalid offset: ");
            A1A.append(i);
            A1A.append(". Valid range is [");
            A1A.append(i2);
            A1A.append(" , ");
            A1A.append(i3);
            throw AnonymousClass7TE.A0w(Pxg.A0w(A1A));
        }
    }

    public static final boolean A01(SRG srg, int i) {
        int i2 = srg.A02 + 1;
        if (i > srg.A01 || i2 > i || !Character.isLetterOrDigit(Character.codePointBefore(srg.A03, i))) {
            return false;
        }
        return true;
    }

    public static final boolean A02(SRG srg, int i) {
        int i2 = srg.A02;
        if (i >= srg.A01 || i2 > i || !Character.isLetterOrDigit(Character.codePointAt(srg.A03, i))) {
            return false;
        }
        return true;
    }

    public final boolean A03(int i) {
        int i2 = this.A02 + 1;
        if (i > this.A01 || i2 > i) {
            return false;
        }
        return C9151RRc.A00(Character.codePointBefore(this.A03, i));
    }

    public final boolean A04(int i) {
        int i2 = this.A02;
        if (i >= this.A01 || i2 > i) {
            return false;
        }
        return C9151RRc.A00(Character.codePointAt(this.A03, i));
    }
}

package X;

import java.text.BreakIterator;

public final class U6h extends C18930WDi {
    public final BreakIterator A00;
    public final CharSequence A01;

    public U6h(CharSequence charSequence) {
        this.A01 = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        C13988Tno.A1P(charSequence, characterInstance);
        this.A00 = characterInstance;
    }
}

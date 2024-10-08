package X;

import android.text.Spanned;
import java.text.BreakIterator;

/* renamed from: X.VlF  reason: case insensitive filesystem */
public abstract class C18085VlF {
    public static final int A00(String str, int i) {
        int i2;
        int length;
        String str2 = str;
        if (C13993Tnu.A09 != null) {
            C13993Tnu A00 = C13993Tnu.A00();
            if (A00.A01() == 1) {
                02V.A07(C13988Tno.A1W(A00.A01(), 1), "Not initialized yet");
                02V.A03(str2, "charSequence cannot be null");
                2ER r5 = A00.A01.A01;
                if (i < 0 || i >= (length = str2.length())) {
                    i2 = -1;
                } else {
                    if (str2 instanceof Spanned) {
                        Spanned spanned = (Spanned) str2;
                        C299975wK[] r1 = (C299975wK[]) spanned.getSpans(i, i + 1, C299975wK.class);
                        if (r1.length > 0) {
                            i2 = spanned.getSpanEnd(r1[0]);
                        }
                    }
                    i2 = ((WE2) 2ER.A00(new WE2(i), r5, str2, Math.max(0, i - 16), Math.min(length, i + 16), Integer.MAX_VALUE, true)).A00;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (!(i2 == -1 || valueOf == null)) {
                    return i2;
                }
            }
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int A01(String str, int i) {
        int i2;
        int length;
        String str2 = str;
        if (C13993Tnu.A09 != null) {
            C13993Tnu A00 = C13993Tnu.A00();
            if (A00.A01() == 1) {
                int max = Math.max(0, i - 1);
                02V.A07(C13988Tno.A1W(A00.A01(), 1), "Not initialized yet");
                02V.A03(str2, "charSequence cannot be null");
                2ER r6 = A00.A01.A01;
                if (max < 0 || max >= (length = str2.length())) {
                    i2 = -1;
                } else {
                    if (str2 instanceof Spanned) {
                        Spanned spanned = (Spanned) str2;
                        C299975wK[] r1 = (C299975wK[]) spanned.getSpans(max, max + 1, C299975wK.class);
                        if (r1.length > 0) {
                            i2 = spanned.getSpanStart(r1[0]);
                        }
                    }
                    i2 = ((WE2) 2ER.A00(new WE2(max), r6, str2, Math.max(0, max - 16), Math.min(length, max + 16), Integer.MAX_VALUE, true)).A01;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (!(i2 == -1 || valueOf == null)) {
                    return i2;
                }
            }
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.preceding(i);
    }
}

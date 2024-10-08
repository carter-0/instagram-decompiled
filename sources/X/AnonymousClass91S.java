package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;

/* renamed from: X.91S  reason: invalid class name */
public abstract class AnonymousClass91S {
    public static final void A01(Editable editable, C358868bb r9, boolean z) {
        Integer num;
        0qQ.A0B(editable, 1);
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = r9.A08;
        }
        if (num == null || num.intValue() != 0) {
            A00(editable);
            return;
        }
        int length = editable.length();
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i >= length) {
                return;
            }
            if (!Character.isLowerCase(editable.charAt(i))) {
                i++;
            } else if (i != -1) {
                int length2 = editable.length() - 1;
                if (i <= length2) {
                    while (true) {
                        if (!Character.isLowerCase(editable.charAt(length2))) {
                            if (length2 == i) {
                                break;
                            }
                            length2--;
                        } else {
                            i2 = length2;
                            break;
                        }
                    }
                }
                if (i == i2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(Character.toUpperCase(editable.charAt(i))));
                    spannableStringBuilder.setSpan(new Object(), 0, 1, 33);
                    editable.replace(i, i + 1, spannableStringBuilder);
                    return;
                }
                String upperCase = editable.toString().toUpperCase(AnonymousClass1Q2.A02());
                0qQ.A07(upperCase);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(upperCase);
                int min = Math.min(spannableStringBuilder2.length() - 1, i2);
                C263324Kh.A04(spannableStringBuilder2, editable, Object.class);
                if (i <= min) {
                    while (true) {
                        if (Character.isLowerCase(editable.charAt(i))) {
                            spannableStringBuilder2.setSpan(new Object(), i, i + 1, 33);
                        }
                        if (i == min) {
                            break;
                        }
                        i++;
                    }
                }
                editable.replace(0, editable.length(), spannableStringBuilder2);
                return;
            } else {
                return;
            }
        }
    }

    public static final void A00(Editable editable) {
        for (AnonymousClass91T r0 : (AnonymousClass91T[]) C263324Kh.A06(editable, AnonymousClass91T.class)) {
            int spanStart = editable.getSpanStart(r0);
            editable.removeSpan(r0);
            editable.replace(spanStart, spanStart + 1, String.valueOf(Character.toLowerCase(editable.charAt(spanStart))));
        }
    }
}

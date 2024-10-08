package X;

import android.text.Layout;
import android.text.SpannableString;
import java.util.ArrayList;

public abstract class HSZ {
    public static final int A00(Layout layout, SpannableString spannableString, SpannableString spannableString2, C55901HpO hpO, Integer num, 0sJ r14, int i) {
        boolean z;
        int i2;
        ArrayList A00 = hpO.A00(layout, num, (String) null);
        if (spannableString2 != null) {
            CharSequence text = layout.getText();
            0qQ.A07(text);
            z = 00l.A0a(text, spannableString2);
        } else {
            z = false;
        }
        int length = layout.getText().length();
        if (!z || spannableString2 == null) {
            i2 = 0;
        } else {
            i2 = spannableString2.length();
        }
        int i3 = length - i2;
        int size = A00.size();
        for (int i4 = 0; i4 < size; i4++) {
            0eP r4 = (0eP) A00.get(i4);
            if (C51970G9q.A0B(r4) >= i) {
                int A0B = C51970G9q.A0B(r4);
                while (A0B < C51969G9p.A0A(r4)) {
                    int nextSpanTransition = spannableString.nextSpanTransition(A0B, C51969G9p.A0A(r4), (Class) null);
                    int min = Math.min(nextSpanTransition, i3);
                    if (A0B < min) {
                        C51967G9n.A1L(spannableString, AnonymousClass7TF.A0x(Integer.valueOf(A0B), min), (Object) null, r14, i4);
                    }
                    A0B = nextSpanTransition;
                }
            }
        }
        return A00.size();
    }
}

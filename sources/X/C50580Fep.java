package X;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* renamed from: X.Fep  reason: case insensitive filesystem */
public final class C50580Fep implements G5y {
    public static final C50580Fep A00 = new Object();
    public static final 11S A01 = new 11S("\\{|\\}");

    public final void E4T(SpannableStringBuilder spannableStringBuilder, String str, 0sP r7) {
        0qQ.A0B(str, 0);
        Iterator it = A01.A03(str).iterator();
        while (it.hasNext()) {
            CharSequence A18 = AnonymousClass7TE.A18(it);
            if (00l.A0d(A18, "|", false)) {
                A18 = (CharSequence) r7.invoke(A18);
            }
            spannableStringBuilder.append(A18);
        }
    }
}

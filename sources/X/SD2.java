package X;

import android.os.Bundle;
import android.text.Spanned;

public abstract class SD2 {
    public static final String A00 = Integer.toString(1, 36);
    public static final String A01 = Integer.toString(2, 36);
    public static final String A02 = Integer.toString(4, 36);
    public static final String A03 = Integer.toString(0, 36);
    public static final String A04 = Integer.toString(3, 36);

    public static Bundle A00(Bundle bundle, Spanned spanned, Object obj, int i) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt(A03, spanned.getSpanStart(obj));
        A0a.putInt(A00, spanned.getSpanEnd(obj));
        A0a.putInt(A01, spanned.getSpanFlags(obj));
        A0a.putInt(A04, i);
        if (bundle != null) {
            A0a.putBundle(A02, bundle);
        }
        return A0a;
    }
}

package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public final class WTB implements C2364933y {
    public static long A00;
    public static boolean A01;

    public final boolean A8I(Spannable spannable, int i) {
        A00(spannable, 0, -1);
        return true;
    }

    public final boolean A8K(Spannable spannable, int i, boolean z) {
        A00(spannable, 0, -1);
        return true;
    }

    public final Drawable B0r(String str, int i) {
        Typeface typeface = AnonymousClass5B7.A00;
        if (!C337107fh.A02(str) || typeface == null) {
            return null;
        }
        return new C59989Jcy(typeface, str, i);
    }

    public final boolean CSY() {
        if (!A01 || AnonymousClass5B7.A00 == null) {
            return false;
        }
        return true;
    }

    public final void A00(Spannable spannable, int i, int i2) {
        if (CSY()) {
            Spannable spannable2 = spannable;
            int length = spannable.length();
            int i3 = i;
            if (i2 != -1) {
                length = i + i2;
            }
            W0M.A00().A03(spannable2, i3, length, Integer.MAX_VALUE, 0);
        }
    }

    public final boolean A8J(Spannable spannable, int i, int i2, int i3) {
        A00(spannable, i2, i3);
        return true;
    }

    public final InputConnection AMD(EditorInfo editorInfo, InputConnection inputConnection, EditText editText) {
        if (CSY()) {
            editText.addTextChangedListener(new AnonymousClass6UI(this));
        }
        return inputConnection;
    }

    public final KeyListener AMI(KeyListener keyListener, EditText editText) {
        if (CSY()) {
            editText.addTextChangedListener(new AnonymousClass6UI(this));
        }
        return keyListener;
    }

    public final Typeface B76(String str) {
        int length = str.length();
        C253133qG r1 = C253123qF.A00;
        if (r1 == null || r1.A01(str, 0, length) != length) {
            return null;
        }
        return AnonymousClass5B7.A00;
    }

    public final void CMS(Context context, 0lg r6, int i) {
        A00 = System.currentTimeMillis();
        C18946WDz wDz = new C18946WDz(context, AnonymousClass5B7.A00(context), VJK.A00);
        C14757U7o u7o = new C14757U7o(r6);
        04u r2 = new 04u(0);
        r2.add(u7o);
        if (W0M.A07 == null) {
            synchronized (W0M.A06) {
                if (W0M.A07 == null) {
                    W0M.A07 = new W0M(wDz, r2);
                }
            }
        }
    }

    public final CharSequence Cmk(int i, CharSequence charSequence) {
        if (!CSY() || !C2364733w.A00(charSequence, 0, charSequence.length())) {
            return charSequence;
        }
        return W0M.A00().A02(charSequence);
    }
}

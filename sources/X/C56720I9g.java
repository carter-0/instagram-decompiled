package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.I9g  reason: case insensitive filesystem */
public final class C56720I9g implements InputFilter {
    public final /* synthetic */ 0sL A00;

    public C56720I9g(0sL r1) {
        this.A00 = r1;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuilder sb = new StringBuilder(obj);
        sb.replace(i3, i4, charSequence.toString());
        if (AnonymousClass7TE.A1a(this.A00.invoke(obj, DbT.A10(sb)))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}

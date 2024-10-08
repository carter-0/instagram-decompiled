package X;

import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: X.4az  reason: invalid class name and case insensitive filesystem */
public final class C267114az implements C267124b0 {
    public C267134b1 A00;
    public final X03 A01;

    public final /* bridge */ /* synthetic */ Object Bny() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4b1, java.lang.Object] */
    public final boolean CIg(C69862Ca r5, CharSequence charSequence, int i, int i2) {
        Spannable spannableString;
        boolean z = false;
        if ((r5.A02 & 4) > 0) {
            z = true;
        }
        if (!z) {
            if (this.A00 == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                ? obj = new Object();
                obj.A01 = false;
                obj.A00 = spannableString;
                this.A00 = obj;
            }
            this.A00.setSpan(new C299975wK(r5), i, i2, 33);
        }
        return true;
    }

    public C267114az(X03 x03, C267134b1 r2) {
        this.A00 = r2;
        this.A01 = x03;
    }
}

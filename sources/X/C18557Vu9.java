package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* renamed from: X.Vu9  reason: case insensitive filesystem */
public final class C18557Vu9 {
    public final C20838X0n A00;
    public final int A01;
    public final int A02;

    public final void A01(SpannableStringBuilder spannableStringBuilder, int i) {
        if (i >= 0) {
            int i2 = 34;
            int i3 = this.A02;
            if (i3 == 0) {
                i2 = 18;
            }
            int i4 = 255 - i;
            if (i4 < 0) {
                0I1.A04("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
            }
            spannableStringBuilder.setSpan(this.A00, i3, this.A01, ((Math.max(i4, 0) << 16) & 16711680) | (-16711681 & i2));
            return;
        }
        throw DbT.A0m();
    }

    public static void A00(C20838X0n x0n, List list, int i, int i2) {
        list.add(new C18557Vu9(x0n, i, i2));
    }

    public C18557Vu9(C20838X0n x0n, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = x0n;
    }
}

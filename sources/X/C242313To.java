package X;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: X.3To  reason: invalid class name and case insensitive filesystem */
public final class C242313To extends C242323Tp {
    public final C242333Tq A00;

    public final void A02(boolean z) {
        boolean z2 = false;
        if (C13993Tnu.A09 != null) {
            z2 = true;
        }
        boolean z3 = !z2;
        C242333Tq r0 = this.A00;
        if (z3) {
            r0.A00 = z;
        } else {
            r0.A02(z);
        }
    }

    public final InputFilter[] A04(InputFilter[] inputFilterArr) {
        if (C13993Tnu.A09 != null) {
            return this.A00.A04(inputFilterArr);
        }
        return inputFilterArr;
    }

    public C242313To(TextView textView) {
        this.A00 = new C242333Tq(textView);
    }
}

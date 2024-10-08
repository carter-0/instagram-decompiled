package X;

import android.content.res.Resources;
import android.text.SpannableString;

/* renamed from: X.Nw1  reason: case insensitive filesystem */
public abstract class C70023Nw1 {
    public static final SpannableString A00(Resources resources, C270194gL r3, boolean z) {
        String A0e;
        AnonymousClass7TG.A1N(resources, r3);
        C278114wI r1 = r3.A06;
        if (r1 == null) {
            r1 = C278114wI.UNKNOWN;
        }
        if (r1 == C278114wI.POST_LIVE || !r1.A00()) {
            int i = 2131959641;
            if (z) {
                i = 2131959644;
            }
            A0e = AnonymousClass7TF.A0e(resources, r3.A03().getUsername(), i);
        } else {
            int i2 = 2131959643;
            if (z) {
                i2 = 2131959645;
            }
            A0e = resources.getString(i2);
        }
        return C66580MXl.A0D(A0e);
    }
}

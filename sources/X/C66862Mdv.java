package X;

import android.content.res.Resources;

/* renamed from: X.Mdv  reason: case insensitive filesystem */
public abstract class C66862Mdv {
    public static final AnonymousClass59G A00(Resources resources, int i, int i2, int i3) {
        String A0i;
        boolean z = false;
        int max = Math.max(0, i2 - i3);
        if (i > i2) {
            max = Math.max(1, max);
            A0i = JTS.A0i(resources, max, 2131960766);
            z = true;
        } else if (max == 0) {
            A0i = resources.getString(2131959785);
        } else {
            A0i = JTS.A0i(resources, max, 2131959786);
        }
        0qQ.A0A(A0i);
        return new AnonymousClass59G(Integer.valueOf(max), Boolean.valueOf(z), A0i);
    }
}

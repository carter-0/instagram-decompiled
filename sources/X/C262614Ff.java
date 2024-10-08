package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.4Ff  reason: invalid class name and case insensitive filesystem */
public abstract class C262614Ff {
    public static final int A00(UserSession userSession, 1Xj r10) {
        int A0o;
        boolean z;
        0qQ.A0B(r10, 0);
        0qQ.A0B(userSession, 1);
        if (182.A06(0Tu.A05, userSession, 36327756807551668L)) {
            A0o = r10.A0p();
        } else {
            A0o = r10.A0o();
        }
        boolean[] zArr = new boolean[A0o];
        for (int i = 0; i < A0o; i++) {
            1Xj A1c = r10.A1c(i);
            if (A1c != null) {
                z = A1c.A5f();
            } else {
                z = false;
            }
            zArr[i] = z;
        }
        return Arrays.hashCode(new Object[]{r10.A3E(), Boolean.valueOf(r10.A4g()), r10.A3b(), Integer.valueOf(A0o), r10.A0C.BYK(), Boolean.valueOf(r10.A57()), Integer.valueOf(Arrays.hashCode(zArr))});
    }
}

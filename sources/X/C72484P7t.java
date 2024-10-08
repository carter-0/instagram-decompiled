package X;

import android.content.Context;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.P7t  reason: case insensitive filesystem */
public final class C72484P7t implements C74326Pt2 {
    public static final C72484P7t A00 = new Object();

    public final N4R AWd(Context context, C61072JwA jwA, AnonymousClass7LQ r6, int i, int i2, boolean z) {
        String str;
        int i3;
        String A0h;
        int i4;
        User user = r6.A0K;
        String str2 = null;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        N49 n49 = (N49) jwA.A02;
        if (n49 != null) {
            str2 = n49.A00;
        }
        if (0qQ.A0K(str2, "screen_recording")) {
            if (z) {
                i4 = 2131961733;
            } else if (str == null || str.length() == 0) {
                i4 = 2131961734;
            } else {
                i3 = 2131961732;
                A0h = DbW.A0h(context, str, i3);
                0qQ.A07(A0h);
                return new N4R(C66580MXl.A0D(A0h), (List) 0sn.A00);
            }
        } else if (z) {
            i4 = 2131961736;
        } else if (str == null || str.length() == 0) {
            i4 = 2131961737;
        } else {
            i3 = 2131961735;
            A0h = DbW.A0h(context, str, i3);
            0qQ.A07(A0h);
            return new N4R(C66580MXl.A0D(A0h), (List) 0sn.A00);
        }
        A0h = context.getString(i4);
        0qQ.A07(A0h);
        return new N4R(C66580MXl.A0D(A0h), (List) 0sn.A00);
    }
}

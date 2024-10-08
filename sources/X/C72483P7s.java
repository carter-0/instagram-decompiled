package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P7s  reason: case insensitive filesystem */
public final class C72483P7s implements C74326Pt2 {
    public static final C72483P7s A00 = new Object();

    public final N4R AWd(Context context, C61072JwA jwA, AnonymousClass7LQ r14, int i, int i2, boolean z) {
        String str;
        String str2;
        String A0x;
        N49 n49 = (N49) jwA.A02;
        if (n49 == null || (str = n49.A01) == null) {
            str = "";
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        int i3 = i2;
        if (z) {
            A0E.append(DbY.A0c(context, str, 2131955083));
        } else {
            User user = r14.A0K;
            if (user != null) {
                str2 = user.getUsername();
            } else {
                str2 = "";
            }
            String A0u = DbV.A0u(context, str2, str, 2131955082);
            0qQ.A07(A0u);
            int length = str2.length();
            if (length != 0) {
                int A08 = 00l.A08(A0u, str2, 0, false);
                A0E.append(A0u);
                A0E.setSpan(new C255733ud(AnonymousClass05K.A0u, str2, "", i3, true), A08, length + A08, 33);
                A1C.add(002.A0R("instagram://user?username=", str2));
            }
        }
        String A16 = AnonymousClass7TE.A16(context, 2131955084);
        A0E.append(" ");
        int length2 = A0E.length();
        int A05 = C51966G9m.A05(A16, length2);
        A0E.append(A16);
        A0E.setSpan(new C255733ud(AnonymousClass05K.A0u, A16, "", i3, true), length2, A05, 33);
        C254793t3 r0 = r14.A0G.A0P;
        if (!(r0 == null || (A0x = C66580MXl.A0x(r0)) == null || A0x.length() == 0)) {
            A1C.add(002.A0g("instagram://thread/", A0x, "/details/change_theme"));
        }
        return new N4R(C66580MXl.A0D(A0E), (List) A1C);
    }
}

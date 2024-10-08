package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MdV  reason: case insensitive filesystem */
public abstract class C66837MdV {
    public static final C66838MdW A00(Context context, UserSession userSession, AnonymousClass9HC r9, AnonymousClass7LQ r10, AnonymousClass7L2 r11) {
        CharSequence charSequence;
        0qQ.A0B(context, 0);
        C51974G9v.A1P(r10, userSession, r11, r9);
        C254703su r3 = r10.A0e;
        Object obj = r3.A1T;
        CharSequence charSequence2 = null;
        if (obj instanceof AnonymousClass7FJ) {
            AnonymousClass7FJ r2 = (AnonymousClass7FJ) obj;
            String str = r2.A06;
            String str2 = r2.A05;
            if (str == null || str2 == null) {
                throw AnonymousClass7TE.A0z("A title and message for placeholder should be provided");
            }
            charSequence2 = C66582MXn.A0C(userSession, str);
            charSequence = C66582MXn.A0C(userSession, str2);
        } else if (obj instanceof AnonymousClass7FN) {
            charSequence = C328527Fd.A0C(context, userSession, r10);
            if (charSequence == null) {
                throw AnonymousClass7TE.A0y();
            }
        } else if (AnonymousClass9J6.A00(6, obj)) {
            AnonymousClass9J6 r22 = (AnonymousClass9J6) obj;
            charSequence2 = r22.A01;
            charSequence = r22.A00;
        } else if (obj instanceof List) {
            Object A0J = 00k.A0J((List) obj);
            if (A0J == null || !(A0J instanceof C254873tC)) {
                charSequence = r3.A1V;
            } else {
                charSequence = ((C254873tC) A0J).A0t;
            }
        } else {
            throw AnonymousClass7TE.A1B("Can't adapt content to ExpiredPlaceholderContentViewModel");
        }
        int i = r11.A00;
        2FW r0 = 2FW.A0p;
        return new C66838MdW(AnonymousClass7FG.A00(context, userSession, r9, r10, r0), C66582MXn.A0V(userSession, r9, r10, r11, r0), charSequence2, charSequence, i);
    }
}

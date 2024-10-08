package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.HVr  reason: case insensitive filesystem */
public abstract class C54860HVr {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Long l;
        String str;
        FragmentActivity A04 = C308206Td.A04(r10);
        0lg A0R = DbW.A0R(r10);
        C276544tV r3 = (C276544tV) r11.A00.get(0);
        if (r3 != null) {
            r3.A0O();
            l = Long.valueOf(r3.A04(35, -1));
            str = r3.A0K(44);
        } else {
            l = null;
            str = null;
        }
        C54678HOj hOj = C54678HOj.MEMU_IN_FEED_THREE_DOT_MENU;
        C54135H0e h0e = new C54135H0e();
        Bundle A0a = AnonymousClass7TE.A0a();
        if (l != null) {
            A0a.putLong("arg_mifu_content_id", l.longValue());
        }
        A0a.putString("arg_entry_point", hOj.toString());
        if (str != null) {
            A0a.putString("arg_mifu_session_id", str);
        }
        h0e.setArguments(A0a);
        C309516Yo A0Q = DbU.A0Q(A04, A0R);
        0qQ.A0A(h0e);
        A0Q.A0B((Bundle) null, h0e);
        A0Q.A04();
        return null;
    }
}

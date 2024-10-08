package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.F6o  reason: case insensitive filesystem */
public abstract class C49781F6o {
    public static final E1X A00(UserSession userSession, Boolean bool, Integer num, String str, String str2, String str3, ArrayList arrayList) {
        0qQ.A0B(str, 1);
        E1X e1x = new E1X();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putParcelableArrayList("argument_rows", arrayList);
        if (num != null) {
            A0a.putInt("argument_header_icon_id", num.intValue());
        }
        A0a.putString("argument_header_text", str2);
        A0a.putString(AnonymousClass000.A00(511), str);
        A0a.putString("argument_footer_text", str3);
        if (bool != null) {
            A0a.putBoolean("argument_use_default_icon_size", bool.booleanValue());
        }
        e1x.setArguments(A0a);
        return e1x;
    }

    public static final E1X A01(UserSession userSession, String str, ArrayList arrayList) {
        return A00(userSession, (Boolean) null, (Integer) null, str, (String) null, (String) null, arrayList);
    }
}

package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.6jB  reason: invalid class name and case insensitive filesystem */
public final class C314996jB {
    public final UserSession A00;
    public final 0xa A01;

    public C314996jB(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A39, getClass());
    }

    public final HashMap A00() {
        String string = this.A01.getString("follow_creator_dialog_count_map", (String) null);
        if (string == null) {
            return new HashMap();
        }
        Object A09 = new Gson().A09(string, new C8688R1d().A00);
        0qQ.A07(A09);
        return (HashMap) A09;
    }

    public final HashMap A01() {
        String string = this.A01.getString("follow_creator_dialog_timestamp_map", (String) null);
        if (string == null) {
            return new HashMap();
        }
        Object A09 = new Gson().A09(string, new C8689R1e().A00);
        0qQ.A07(A09);
        return (HashMap) A09;
    }
}

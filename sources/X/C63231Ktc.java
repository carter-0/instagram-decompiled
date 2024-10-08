package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ktc  reason: case insensitive filesystem */
public abstract class C63231Ktc {
    public static final C61436K7l A00(UserSession userSession, MSH msh, String str, String str2) {
        DbY.A1S(userSession, str2);
        Bundle A0A = DbV.A0A(userSession);
        A0A.putString("arg_key_creator_user_id", str);
        A0A.putString("arg_key_thread_id", str2);
        C61436K7l k7l = new C61436K7l();
        k7l.setArguments(A0A);
        k7l.A01 = msh;
        return k7l;
    }
}

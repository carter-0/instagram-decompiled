package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Mnd  reason: case insensitive filesystem */
public abstract class C67422Mnd {
    public static final LinkedHashMap A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        List list = C67377Mmt.A00(userSession).A00.A01;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(list));
        for (Object next : list) {
            String string = context.getString(2131972867, new Object[]{((C67389Mn6) next).A01});
            0qQ.A07(string);
            A0x.put(string, next);
        }
        return A0x;
    }
}

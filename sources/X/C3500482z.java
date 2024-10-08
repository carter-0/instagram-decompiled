package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.82z  reason: invalid class name and case insensitive filesystem */
public final class C3500482z implements AnonymousClass0lh {
    public final Map A00 = new HashMap();
    public final Context A01;
    public final AnonymousClass12V A02;
    public final UserSession A03;
    public final 2Nn A04;

    public C3500482z(Context context, AnonymousClass12V r3, UserSession userSession, 2Nn r5) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r3, 4);
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final AnonymousClass835 A00(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A00;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new AnonymousClass835(this.A01, this.A02, this.A03, this.A04);
            map.put(str, obj);
        }
        return (AnonymousClass835) obj;
    }

    public final void onSessionWillEnd() {
        Map map = this.A00;
        for (AnonymousClass835 A002 : map.values()) {
            A002.A00();
        }
        map.clear();
    }
}

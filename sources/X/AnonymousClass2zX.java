package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2zX  reason: invalid class name */
public final class AnonymousClass2zX extends C234532y8 {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C235232za A02;
    public final Context A03;
    public final C235222zY A04;
    public final AnonymousClass2zZ A05;

    public final void Csk(C2354830a r4, 1Xj r5, AnonymousClass3W1 r6, int i) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        C243013Xb r2 = C243013Xb.A00;
        if (C243013Xb.A02(i) && r2.A05(this.A00, r5, this.A01)) {
            r4.A00(this.A05);
        }
    }

    public final void Dcw(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        if ((obj instanceof 1Xj) && C243013Xb.A02(i)) {
            C235222zY r1 = this.A04;
            1Xj r7 = (1Xj) obj;
            0qQ.A0B(r7, 1);
            Map map = r1.A00;
            018.A17(map.entrySet(), new AnonymousClass9LT(view, 4));
            String id = r7.getId();
            if (id != null) {
                map.put(id, view);
            }
        }
    }

    public AnonymousClass2zX(Context context, UserSession userSession, AnonymousClass4DU r5) {
        this.A00 = userSession;
        this.A03 = context;
        this.A01 = r5;
        C235222zY r1 = new C235222zY();
        this.A04 = r1;
        this.A05 = new AnonymousClass2zZ(context, userSession, r5, r1);
        this.A02 = new C235232za(context, userSession, r5, r1);
    }
}

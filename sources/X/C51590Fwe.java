package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fwe  reason: case insensitive filesystem */
public final class C51590Fwe implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C51590Fwe(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A04 = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.A00;
        C46521DgO dgO = (C46521DgO) this.A02;
        if (i != 0) {
            C283155Gi r4 = (C283155Gi) this.A03;
            int i2 = this.A01;
            Activity activity = (Activity) this.A04;
            C46521DgO.A04(dgO, r4, "delete_notification_failed", i2);
            if (C46521DgO.A05(dgO)) {
                C358248ab A0X = DbS.A0X(activity);
                A0X.A08(2131968333);
                A0X.A04();
                DbT.A1V(A0X);
            }
            dgO.A06.CNU(r4, i2);
        } else {
            C283155Gi r7 = (C283155Gi) this.A03;
            int i3 = this.A01;
            C46521DgO.A04(dgO, r7, "delete_notification_success", i3);
            UserSession userSession = dgO.A03;
            Dd0 A012 = C46354Dcy.A01(userSession);
            String str = userSession.A06;
            AnonymousClass0iw r6 = dgO.A01;
            G7E g7e = dgO.A04;
            A012.A0G((JV7) this.A04, r6, r7, str, g7e.AbI(), g7e.BcQ(), i3);
        }
        return C60340gF.A00;
    }
}

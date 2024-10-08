package X;

import android.app.Activity;

/* renamed from: X.Ej7  reason: case insensitive filesystem */
public abstract class C48722Ej7 {
    public static final C331127Pr A00(Activity activity, C18972WEz wEz, 0lg r6, C273494mf r7) {
        0qQ.A0B(r6, 1);
        C13690Tf8 tf8 = wEz.A01;
        0qQ.A0C(tf8, AnonymousClass000.A00(1627));
        FRI fri = (FRI) tf8;
        C331127Pr A0W = DbS.A0W(r6);
        A0W.A0T = r7;
        A0W.A0f = wEz.A06;
        A0W.A03 = fri.A00;
        A0W.A0a = fri.A02;
        A0W.A0x = fri.A07;
        A0W.A0y = !fri.A06;
        A0W.A0k = !fri.A05;
        A0W.A13 = fri.A08;
        Integer num = fri.A04;
        if (num != null && num.intValue() == 16 && 0nA.A0x(activity)) {
            A0W.A0Z = true;
        }
        return A0W;
    }
}

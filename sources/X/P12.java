package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P12 implements C74386Pu2 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C73908Plj.A00(this, 0eO.A02, 0);

    public final void E2a(Context context, 1a8 r11, Integer num, Integer num2, 0sP r14, boolean z) {
        Integer num3 = num;
        Integer num4 = num2;
        AnonymousClass7TG.A1T(num, num2, context);
        1a8 r3 = r11;
        0qQ.A0B(r11, 3);
        UserSession userSession = this.A00;
        OO6 A002 = C69891Ntt.A00(context, userSession, num);
        0sP r8 = r14;
        if (z) {
            A002.A00(context).A04(new C71534OmV(r3, A002, this, num3, num4, r8));
            return;
        }
        PU8.A00(A002.A04(r11, num2), r11, new C72306P0x(C69901Nu3.A00(userSession, num), num, r14), 3);
    }

    public final void E2b(Activity activity, 1a8 r9, C68714NUa nUa, 0sP r11, boolean z) {
        String str;
        Activity activity2 = activity;
        C68714NUa nUa2 = nUa;
        DbZ.A0t(0, activity, r9, nUa);
        UserSession userSession = this.A00;
        C69902Nu4.A00(userSession, activity.getApplication(), "attempt blockstore restore");
        if (z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        C68714NUa.A05(nUa, str);
        nUa.A0D("RESTORE_TYPE", "BLOCKSTORE");
        r9.A02(C69891Ntt.A00(activity, userSession, AnonymousClass05K.A1I).A03(r9, userSession), new PSW(1, activity2, nUa2, this, r11));
    }

    public P12(UserSession userSession) {
        this.A00 = userSession;
    }
}

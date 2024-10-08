package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class T79 implements C61110lV {
    public final Context A00;
    public final 0wc A01;
    public final 0na A02 = new 0na(1892066561, 3, false, false);
    public final 1vn A03;
    public final 0xa A04;
    public final String A05;
    public final long A06;
    public final UserSession A07;

    public T79(UserSession userSession, Context context) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A07 = userSession;
        this.A00 = context;
        this.A04 = 0xn.A00(context, "on_device_app_history_top_spend_apps");
        this.A03 = 1vm.A01(userSession);
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A01 = "on_device_app_history_top_spend_apps";
        this.A01 = r0.A00();
        0Tu r2 = 0Tu.A05;
        this.A05 = 182.A04(r2, userSession, 36880338710888765L);
        this.A06 = 182.A01(r2, userSession, 36598863734246707L);
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(15263988, AnonymousClass0fD.A03(-1242841962));
    }

    public final void onAppForegrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(275533813);
        long j = this.A04.getLong("last_query_time_in_sec", -1);
        if (j > 0 && AnonymousClass7TG.A0I() - j <= this.A06) {
            i = -1738806711;
        } else if (00l.A0W(this.A05)) {
            i = -1413034364;
        } else {
            this.A02.execute(new C12933TDw(this));
            i = 1927953894;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}

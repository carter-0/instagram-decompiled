package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class S51 {
    public Q6J A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public S51(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        if (context != null) {
            this.A00 = Q6J.A00(context);
        }
        this.A01 = userSession;
        this.A09 = C58675Ivk.A00(this, 27);
        this.A04 = C58675Ivk.A00(this, 22);
        this.A07 = C58675Ivk.A00(this, 25);
        this.A08 = C58675Ivk.A00(this, 26);
        this.A03 = C58675Ivk.A00(this, 21);
        this.A02 = C58675Ivk.A00(this, 20);
        this.A06 = C58675Ivk.A00(this, 24);
        this.A05 = C58675Ivk.A00(this, 23);
    }

    public final List A00() {
        String string = ((0xa) this.A09.getValue()).getString("proactive_checkout_session_list", (String) null);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (string != null) {
            return (List) new Gson().A09(string, new R2Q().type);
        }
        return A1C;
    }

    public final void A01(S1K s1k, long j) {
        List<S1K> A002 = A00();
        018.A1A(A002, new C58734Iwh(j, this, 5));
        A002.add(s1k);
        AnonymousClass0eM r3 = this.A09;
        0xY AR4 = ((0xa) r3.getValue()).AR4();
        String A0f = Pxf.A0f(A002);
        0qQ.A07(A0f);
        AR4.E5g("proactive_checkout_session_list", A0f);
        AR4.apply();
        Integer num = s1k.A01;
        if (num == null) {
            int i = 0;
            for (S1K s1k2 : A002) {
                long j2 = j - s1k2.A00;
                if (s1k2.A01 == null && j2 < AnonymousClass7TE.A0R(AnonymousClass7TE.A14(this.A08))) {
                    i++;
                }
                if (!((0xa) r3.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false) && i >= DbX.A07(this.A07)) {
                    DbX.A1V((0xa) r3.getValue(), "proactive_checkout_should_stop_showing_banner", true);
                }
            }
            return;
        }
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (S1K s1k3 : A002) {
                long j3 = j - s1k3.A00;
                if (s1k3.A01 == num2) {
                    if (j3 < AnonymousClass7TE.A0R(AnonymousClass7TE.A14(this.A03))) {
                        i2++;
                    }
                    if (j3 < AnonymousClass7TE.A0R(AnonymousClass7TE.A14(this.A06))) {
                        i3++;
                    }
                }
            }
            boolean A1P = JTQ.A1P(i2, DbX.A07(this.A02));
            if (i3 >= DbX.A07(this.A05)) {
                z = true;
            }
            if (A1P || z) {
                0xY AR42 = ((0xa) r3.getValue()).AR4();
                AR42.E5c("proactive_checkout_cooldown_start_time_ms", j);
                AR42.apply();
            }
        }
    }
}

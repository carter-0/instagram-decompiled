package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GXv  reason: case insensitive filesystem */
public final class C52570GXv {
    public final 0wc A00;
    public final 1Bk A01;
    public final C230372pW A02;
    public final 2el A03;

    public final void A00(View view, Integer num, String str, String str2) {
        0qQ.A0B(str2, 3);
        AnonymousClass30Y A0a = DbU.A0a(this.A02, AnonymousClass30Y.A00(new C55788HnN(num, str, str2, ""), 0, str));
        2el r0 = this.A03;
        if (r0 != null) {
            r0.A05(view, A0a);
        }
    }

    public C52570GXv(0wc r3, UserSession userSession, 2el r5) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A03 = r5;
        this.A00 = r3;
        1Bk A0i = C51969G9p.A0i(1Bk.A03, userSession, "ig_search_lazy_preferences");
        this.A01 = A0i;
        this.A02 = new C52571GXw(A0i, this);
    }

    public final void A01(Integer num, String str, String str2, String str3) {
        boolean A1Y = C51970G9q.A1Y(str2);
        String str4 = str;
        if (str2.length() > 0) {
            str4 = 002.A0C(str, '1');
        }
        1Bk r3 = this.A01;
        if (!r3.A0F(str4)) {
            this.A02.A03(new C55788HnN(num, str, str2, str3), Integer.valueOf(A1Y ? 1 : 0));
            r3.A0C(str4, System.currentTimeMillis());
        }
    }
}

package X;

import com.instagram.user.model.User;

public final class GAO extends C229202n0 {
    public final C320216s0 A00;

    public GAO(1Bk r4, C320216s0 r5, String str) {
        super(r4, new IP6(str, 1), 250);
        this.A00 = r5;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, long j, Object obj2) {
        0eP r9 = (0eP) obj;
        int A0j = G9t.A0j(obj2, r9);
        User user = (User) r9.A01;
        C320216s0 r2 = this.A00;
        0qQ.A0B(user, 1);
        if (r2.A02.add(user.getId())) {
            r2.A01.A00(j, user.getId(), A0j, user.A0P(), user.A03.BxN());
        }
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C51965G9l.A1U(obj2);
    }
}

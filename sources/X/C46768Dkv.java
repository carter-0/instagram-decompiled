package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dkv  reason: case insensitive filesystem */
public final class C46768Dkv extends 2YL {
    public 05G A00;
    public 05G A01;
    public 05G A02;
    public final 05G A03;
    public final 05G A04 = 106.A01((Object) null);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public final void A00(UserSession userSession, String str) {
        05G r0;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1O(this.A00, true);
        05G r1 = this.A02;
        String str2 = str;
        AnonymousClass7TF.A1O(r1, 0qQ.A0K(str, "partial_ci"));
        ? obj = new Object();
        if (DbX.A1b(r1)) {
            r0 = this.A03;
        } else {
            r0 = this.A04;
        }
        obj.A00 = r0;
        1OC A022 = C46396DeJ.A02(userSession2, (String) null, (String) null, str2, true, false);
        EDV.A00(A022, obj, userSession, 25);
        1ES.A06(A022, 413491125, false);
    }

    public C46768Dkv() {
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A00 = DbS.A10(A0u);
        this.A01 = DbS.A10(A0u);
        this.A03 = 106.A01((Object) null);
        this.A02 = DbS.A10(A0u);
    }
}

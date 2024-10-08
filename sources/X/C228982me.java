package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2me  reason: invalid class name and case insensitive filesystem */
public final class C228982me extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public C228982me(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-1976263283, AnonymousClass0fD.A03(-1858447343));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        1Az C7A;
        String str;
        int i;
        int A03 = AnonymousClass0fD.A03(-1500994664);
        AnonymousClass3JC r9 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(-1872519126);
        0qQ.A0B(r9, 0);
        C229002mg r0 = (C229002mg) r9.A01;
        if (r0 == null) {
            i = 1779234241;
        } else {
            AnonymousClass4LE CGz = r0.CGz();
            if (CGz == null) {
                i = 701293203;
            } else {
                if (CGz.BJ0()) {
                    1Av A002 = 1Au.A00(this.A00);
                    boolean BJ0 = CGz.BJ0();
                    A002.A0H.Epx(A002, Boolean.valueOf(BJ0), 1Av.A8a[367]);
                }
                boolean BJ1 = CGz.BJ1();
                1Av A003 = 1Au.A00(this.A00);
                if (BJ1) {
                    C7A = 1Az.A0A;
                } else {
                    C7A = CGz.C7A();
                    if (C7A == null) {
                        str = null;
                        A003.A0I.Epx(A003, str, 1Av.A8a[368]);
                        i = -1554103048;
                    }
                }
                str = C7A.toString();
                A003.A0I.Epx(A003, str, 1Av.A8a[368]);
                i = -1554103048;
            }
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-437111708, A03);
    }
}

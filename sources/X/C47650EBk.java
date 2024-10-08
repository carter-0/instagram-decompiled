package X;

import com.instagram.user.model.User;

/* renamed from: X.EBk  reason: case insensitive filesystem */
public final class C47650EBk extends 1P0 {
    public final /* synthetic */ C293975le A00;
    public final /* synthetic */ User A01;

    public C47650EBk(C293975le r1, User user) {
        this.A01 = user;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        Integer num;
        int A03 = AnonymousClass0fD.A03(665759370);
        C293975le r2 = this.A00;
        User user = r2.A00;
        if (user == this.A01) {
            if (user.A1z()) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            r2.A01 = num;
            C293975le.A01(r2);
        }
        AnonymousClass0fD.A0A(1971994941, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-249404092);
        int A032 = AnonymousClass0fD.A03(-889390030);
        User user = this.A01;
        user.A1A(true);
        0eE r1 = AnonymousClass0t1.A01;
        C293975le r3 = this.A00;
        C262184Cl A0h = DbS.A0h(r3.A04, r1);
        Integer Afi = A0h.Afi();
        int i = 1;
        if (Afi != null) {
            i = Afi.intValue() + 1;
        }
        A0h.EPa(Integer.valueOf(i));
        if (r3.A00 == user) {
            r3.A01 = AnonymousClass05K.A00;
            C293975le.A01(r3);
        }
        AnonymousClass0fD.A0A(1333490445, A032);
        AnonymousClass0fD.A0A(326716238, A03);
    }
}

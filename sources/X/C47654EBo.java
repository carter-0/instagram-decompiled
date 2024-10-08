package X;

import android.app.Activity;
import com.instagram.user.model.User;

/* renamed from: X.EBo  reason: case insensitive filesystem */
public final class C47654EBo extends 1P0 {
    public final /* synthetic */ C2355930l A00;
    public final /* synthetic */ F24 A01;
    public final /* synthetic */ User A02;

    public C47654EBo(C2355930l r1, F24 f24, User user) {
        this.A02 = user;
        this.A00 = r1;
        this.A01 = f24;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(751735328);
        F24 f24 = this.A01;
        if (f24 != null) {
            f24.A00();
        }
        C59689JTv.A07(this.A00.A00, 2131961740);
        AnonymousClass0fD.A0A(1466057573, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-235185334);
        int A032 = AnonymousClass0fD.A03(717320608);
        User user = this.A02;
        user.A1A(true);
        0eE r1 = AnonymousClass0t1.A01;
        C2355930l r3 = this.A00;
        C262184Cl A0h = DbS.A0h(r3.A01, r1);
        Integer Afi = A0h.Afi();
        int i = 1;
        if (Afi != null) {
            i = Afi.intValue() + 1;
        }
        A0h.EPa(Integer.valueOf(i));
        if (this.A01 == null) {
            Activity activity = r3.A00;
            String A0e = AnonymousClass7TF.A0e(activity.getResources(), user.getUsername(), 2131952454);
            0qQ.A07(A0e);
            C59689JTv.A09(activity, A0e);
        }
        AnonymousClass0fD.A0A(-747509933, A032);
        AnonymousClass0fD.A0A(-149070217, A03);
    }
}

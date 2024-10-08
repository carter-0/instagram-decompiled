package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ED7 extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ 1sw A03;
    public final /* synthetic */ AnonymousClass6ST A04;
    public final /* synthetic */ C270394gf A05;

    public ED7(Context context, UserSession userSession, 1Xj r3, 1sw r4, AnonymousClass6ST r5, C270394gf r6) {
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = context;
    }

    public final void onFail(C268654dm r6) {
        String str;
        int A032 = AnonymousClass0fD.A03(-696033769);
        1sw r3 = this.A03;
        1sw r0 = 1sw.A04;
        int i = 2131975885;
        if (r3 == r0) {
            i = 2131963384;
        }
        Context context = this.A00;
        if (r3 == r0) {
            str = "hide_post_failed";
        } else {
            str = "unhide_post_failed";
        }
        C59689JTv.A0F(context, str, i);
        AnonymousClass0fD.A0A(459121736, A032);
    }

    public final void onFinish() {
        Boolean bool;
        int A032 = AnonymousClass0fD.A03(1808432863);
        AnonymousClass6ST r2 = this.A04;
        Activity ownerActivity = r2.getOwnerActivity();
        if (ownerActivity != null) {
            bool = Boolean.valueOf(ownerActivity.isDestroyed());
        } else {
            bool = null;
        }
        if (AnonymousClass7TF.A1Y(bool, false)) {
            r2.dismiss();
        }
        AnonymousClass0fD.A0A(1403478635, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1074129601);
        AnonymousClass0fN.A00(this.A04);
        AnonymousClass0fD.A0A(-1071931733, A032);
    }

    public final void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1617031405);
        C270394gf r4 = this.A05;
        if (r4 != null) {
            Integer num = AnonymousClass05K.A0C;
            UserSession userSession = this.A01;
            0xG A0O = DbS.A0O("activity_center");
            String A2n = this.A02.A2n();
            if (A2n != null) {
                F8R.A00(A0O, userSession, r4, num, A2n);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(1244171694, A032);
                throw A0y;
            }
        }
        1Xj r42 = this.A02;
        1sw r3 = this.A03;
        r42.A0C.Eqi(r3.A00);
        UserSession userSession2 = this.A01;
        r42.AE7(userSession2);
        User A2A = r42.A2A(userSession2);
        if (A2A == null) {
            i = -972878707;
        } else {
            if (r3 == 1sw.A04) {
                A2A.A0X();
            } else if (r3 == 1sw.A05) {
                A2A.A0Y();
            }
            A2A.A0d(userSession2);
            i = 1885071377;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}

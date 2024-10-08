package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class PS3 implements C59583JPd {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ P26 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onFailure(Throwable th) {
    }

    public PS3(Activity activity, UserSession userSession, P26 p26, String str, boolean z) {
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A00 = activity;
        this.A02 = p26;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long j;
        AnonymousClass7JY r1;
        UserSession userSession = this.A01;
        HYV.A00(userSession).A00(true);
        String str = this.A03;
        if (str != null && str.length() != 0) {
            boolean z = this.A04;
            0qQ.A0B(userSession, 0);
            0Tu r2 = 0Tu.A05;
            if (z) {
                j = 36325836958151955L;
            } else {
                j = 36325836957889808L;
            }
            if (DbY.A1Z(r2, userSession, j)) {
                Activity activity = this.A00;
                AnonymousClass9B9.A00();
                String A0a = JTQ.A0a(activity, 2131960533);
                0qQ.A07(A0a);
                String A0D = 002.A0D(AnonymousClass7TF.A0j(A0a), '/');
                boolean A0k = 00p.A0k(str, 002.A0C(A0D, ' '), false);
                C72527P9k p9k = this.A02.A00;
                if (A0k) {
                    str = C66580MXl.A0z(str, A0D.length() + 1);
                }
                0qQ.A0B(str, 0);
                AnonymousClass9H7 r22 = p9k.A00.A00;
                AnonymousClass9H7.A06(r22).A1Q(str);
                if (A0k) {
                    r1 = AnonymousClass7JY.IMAGINE;
                } else {
                    r1 = AnonymousClass7JY.AI;
                }
                AnonymousClass9H7.A06(r22).A1N(r1);
                p9k.EJK();
            }
        }
    }
}

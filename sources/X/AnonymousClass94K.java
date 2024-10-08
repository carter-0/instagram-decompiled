package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.contacts.ccu.intf.CCUJobService;

/* renamed from: X.94K  reason: invalid class name */
public final class AnonymousClass94K implements C61110lV, AnonymousClass0lh {
    public final Context A00;
    public final UserSession A01;

    private final void A00(String str) {
        UserSession userSession = this.A01;
        0xI A002 = 0xI.A00((AnonymousClass0iw) null, "continuous_contact_upload_job_scheduled");
        A002.A0C("source", str);
        19i A012 = 0jh.A04.A01(userSession).A01(19f.A1R);
        if (A012 != null) {
            A002.A0C("phone_id", A012.A01);
        }
        C60510iO.A00(userSession).EFq(A002);
        C227462jM.A00(this.A00, userSession).A04(new C227512jS(new C227502jR(CCUJobService.class, R.id.ccu_job_scheduler_id)));
    }

    public final void onSessionWillEnd() {
        A00("user_switch");
        14i.A06(this);
    }

    public AnonymousClass94K(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onAppBackgrounded() {
        int i;
        int A03 = AnonymousClass0fD.A03(-478459038);
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36311985687692114L)) {
            C393969xK.A00(userSession);
            Context context = this.A00;
            C227462jM A002 = C227462jM.A00(context, userSession);
            C227502jR r2 = new C227502jR(CCUJobService.class, R.id.ccu_job_scheduler_id);
            r2.A02 = 500;
            A002.A03(context, userSession, new C227512jS(r2));
            i = -1709967773;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            0xa r22 = 1Au.A00(userSession).A01;
            String A003 = Pxd.A00(238);
            if (currentTimeMillis - r22.getLong(A003, 0) < 86400000) {
                i = 692654858;
            } else if (!1Au.A00(userSession).A01.getBoolean(AnonymousClass000.A00(245), false)) {
                i = 801816520;
            } else {
                Context context2 = this.A00;
                if (!C267044ar.A01(context2, userSession)) {
                    i = 1233289960;
                } else {
                    1Av A004 = 1Au.A00(userSession);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    0xY AR4 = A004.A01.AR4();
                    AR4.E5c(A003, currentTimeMillis2);
                    AR4.apply();
                    C393969xK.A00(userSession);
                    C227462jM A005 = C227462jM.A00(context2, userSession);
                    C227502jR r23 = new C227502jR(CCUJobService.class, R.id.ccu_job_scheduler_id);
                    r23.A02 = 500;
                    A005.A03(context2, userSession, new C227512jS(r23));
                    i = 1658942203;
                }
            }
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1042005621);
        A00(C66579MXk.A00(664));
        AnonymousClass0fD.A0A(-799065619, A03);
    }
}

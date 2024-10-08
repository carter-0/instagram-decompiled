package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EMH extends C47695EDe {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final AnonymousClass0aP A02;
    public final AnonymousClass6ST A03;

    public EMH(Activity activity, AnonymousClass0iw r13, AnonymousClass0aP r14) {
        super(activity, (Uri) null, r13, r14, (G8H) null, C46634DiE.A0l, AnonymousClass05K.A01, (String) null);
        this.A02 = r14;
        AnonymousClass6ST r1 = new AnonymousClass6ST(activity);
        this.A03 = r1;
        DbU.A18(activity, r1, 2131965555);
        this.A00 = activity;
        this.A01 = r13;
    }

    private void A01(AnonymousClass0aP r5, UserSession userSession, String str, String str2, boolean z) {
        int i;
        if (!z || userSession == null) {
            i = -1;
        } else {
            A02(AnonymousClass7TF.A0Q(userSession), 1Q0.A0w);
            i = DbV.A04(userSession);
        }
        0xI A05 = 1Q0.A0m.A02(this.A02).A05((EXD) null, C46634DiE.A0l);
        A05.A09("successful", Boolean.valueOf(z));
        A05.A08(Integer.valueOf(i), "accounts_count");
        A05.A0C("current_activity", str);
        if (str2 != null) {
            A05.A0C("error", str2);
        }
        DbU.A1R(A05, r5);
    }

    public final void A04(EM4 em4) {
        int A032 = AnonymousClass0fD.A03(-333812134);
        EM4 em42 = em4;
        User user = em42.A00;
        user.A03.Ek2(em42.A08);
        DbY.A1P(user);
        AnonymousClass0aP r14 = this.A02;
        Activity activity = this.A00;
        String str = em42.A07;
        AnonymousClass0iw r6 = this.A01;
        UserSession A022 = C46413Dea.A02(activity, r6, r14, user, str, false);
        0BQ A002 = AnonymousClass0BO.A00(A022);
        if (A002.BNv() == 1) {
            C46413Dea.A07(activity, (Uri) null, r6, A022, DbS.A01(), false, true, false, false);
        } else if (A002.AG1(activity, A022, user)) {
            A002.E2S(activity, (Intent) null, A022, user, "feed_force_logout_login");
        }
        A01(r14, A022, activity.toString(), (String) null, true);
        AnonymousClass0fD.A0A(-302824895, A032);
    }

    public final void onFail(C268654dm r9) {
        String str;
        int A032 = AnonymousClass0fD.A03(-438331120);
        super.onFail(r9);
        AnonymousClass0aP r3 = this.A02;
        String obj = this.A00.toString();
        Throwable A012 = r9.A01();
        if (A012 != null) {
            str = A012.getMessage();
        } else {
            str = "unknown";
        }
        A01(r3, (UserSession) null, obj, str, false);
        AnonymousClass0fD.A0A(290517843, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(782163787);
        EMH.super.onFinish();
        this.A03.hide();
        AnonymousClass0fD.A0A(-845612712, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1860293603);
        EMH.super.onStart();
        AnonymousClass0fN.A00(this.A03);
        AnonymousClass0fD.A0A(1207077447, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(915540589, C47695EDe.A00(this, obj, 833879310));
    }
}

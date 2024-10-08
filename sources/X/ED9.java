package X;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class ED9 extends 1P0 {
    public AnonymousClass0iw A00;
    public AnonymousClass0aP A01;
    public C49858F9y A02;
    public C49633Ezq A03;
    public final Uri A04;
    public final FragmentActivity A05;
    public final AnonymousClass6ST A06;
    public final String A07;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1100643335);
        EM4 em4 = (EM4) obj;
        int A033 = AnonymousClass0fD.A03(-1810184901);
        User user = em4.A00;
        DbY.A1P(user);
        1Q0 r3 = 1Q0.A0u;
        AnonymousClass0aP r13 = this.A01;
        r3.A02(r13).A04().A0C("instagram_id", user.getId());
        C49922FEx fEx = new C49922FEx();
        fEx.A02();
        fEx.A00.putString(DbX.A0s(C48071EUp.A0B), AnonymousClass7TF.A0j("EMAIL_LINK_ONETAP"));
        C49216ErL.A00(r13, fEx, "", user.getId(), (String) null, (String) null, (String) null);
        FragmentActivity fragmentActivity = this.A05;
        String str = em4.A07;
        AnonymousClass0iw r7 = this.A00;
        UserSession A022 = C46413Dea.A02(fragmentActivity, r7, r13, user, str, false);
        C46413Dea.A07(fragmentActivity, this.A04, r7, A022, DbS.A01(), true, false, true, false);
        C49633Ezq ezq = this.A03;
        ezq.A04 = true;
        String A0q = DbX.A0q(A022);
        ezq.A03 = A0q;
        C49858F9y.A00(this.A02, ezq.A00, ezq.A01, ezq.A02, A0q, ezq.A04);
        0xY AR4 = DbV.A0d().AR4();
        AR4.E5T("has_one_clicked_logged_in", true);
        AR4.apply();
        AnonymousClass0fD.A0A(1700754649, A033);
        AnonymousClass0fD.A0A(-1265239319, A032);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Ezq, java.lang.Object] */
    public ED9(Uri uri, FragmentActivity fragmentActivity, AnonymousClass0iw r5, AnonymousClass0aP r6, String str, String str2) {
        AnonymousClass6ST A0h = DbV.A0h(fragmentActivity);
        this.A06 = A0h;
        DbU.A18(fragmentActivity, A0h, 2131965555);
        this.A04 = uri;
        this.A07 = str;
        this.A01 = r6;
        this.A00 = r5;
        this.A05 = fragmentActivity;
        this.A02 = new C49858F9y(r5, r6);
        ? obj = new Object();
        obj.A01 = str2;
        obj.A00 = C46634DiE.A0t;
        obj.A02 = str;
        this.A03 = obj;
    }

    public final void onFail(C268654dm r10) {
        int i;
        C50020FJf fJf;
        C50020FJf fJf2;
        int A032 = AnonymousClass0fD.A03(1172842726);
        1Q0 r0 = 1Q0.A1D;
        AnonymousClass0aP r5 = this.A01;
        0xI A052 = r0.A02(r5).A05((EXD) null, C46634DiE.A0r);
        A052.A0C("event_type", "one_click");
        A052.A0C("uid_encoded", this.A07);
        DbU.A1R(A052, r5);
        C49633Ezq ezq = this.A03;
        ezq.A04 = false;
        C49858F9y.A00(this.A02, ezq.A00, ezq.A01, ezq.A02, ezq.A03, false);
        EM4 em4 = (EM4) r10.A00();
        if (em4 == null) {
            i = 1422846675;
        } else if (C46413Dea.A09(r10)) {
            F19 f19 = em4.A01;
            new Handler().post(new C51469Fud(em4.A00, f19, this));
            i = 542722757;
        } else {
            String str = em4.mErrorTitle;
            String errorMessage = em4.getErrorMessage();
            ArrayList arrayList = em4.A0A;
            FragmentActivity fragmentActivity = this.A05;
            C358248ab A0X = DbS.A0X(fragmentActivity);
            if (TextUtils.isEmpty(str)) {
                str = fragmentActivity.getString(2131961740);
            }
            A0X.A05 = str;
            if (TextUtils.isEmpty(errorMessage)) {
                errorMessage = fragmentActivity.getString(2131972232);
            }
            A0X.A0q(errorMessage);
            if (arrayList == null || arrayList.isEmpty()) {
                A0X.A0I((DialogInterface.OnClickListener) null, 2131960862);
            } else {
                C49590Eyz eyz = (C49590Eyz) arrayList.get(0);
                String str2 = eyz.A01;
                C48085EVd eVd = C48085EVd.SWITCH_TO_SIGNUP_FLOW;
                if (eVd == eyz.A00) {
                    fJf = C50020FJf.A00(this, 53);
                } else {
                    fJf = null;
                }
                A0X.A0b(fJf, str2);
                if (arrayList.size() > 1) {
                    C49590Eyz eyz2 = (C49590Eyz) arrayList.get(1);
                    String str3 = eyz2.A01;
                    if (eVd == eyz2.A00) {
                        fJf2 = C50020FJf.A00(this, 53);
                    } else {
                        fJf2 = null;
                    }
                    A0X.A0c(fJf2, str3);
                }
            }
            if (!fragmentActivity.isFinishing()) {
                11Z.A02(new C51309Fs2(A0X));
            }
            i = -131258822;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(427358625);
        ED9.super.onFinish();
        AnonymousClass6ST r1 = this.A06;
        if (r1.isShowing()) {
            r1.hide();
        }
        AnonymousClass0fD.A0A(881896084, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-508739484);
        ED9.super.onStart();
        AnonymousClass6ST r1 = this.A06;
        if (!r1.isShowing()) {
            AnonymousClass0fN.A00(r1);
        }
        AnonymousClass0fD.A0A(875489093, A032);
    }
}

package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ED8 extends 1P0 {
    public FragmentActivity A00;
    public AnonymousClass0iw A01;
    public AnonymousClass0aP A02;
    public AnonymousClass3M8 A03;
    public boolean A04;
    public final Uri A05;
    public final String A06;
    public final AnonymousClass6ST A07;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1749067234);
        EM0 em0 = (EM0) obj;
        int A033 = AnonymousClass0fD.A03(1315927710);
        User user = em0.A00;
        DbY.A1P(user);
        1Q0 r0 = 1Q0.A0u;
        AnonymousClass0aP r7 = this.A02;
        r0.A02(r7).A04().A0C("instagram_id", user.getId());
        C49922FEx fEx = new C49922FEx();
        fEx.A02();
        fEx.A00.putString(DbX.A0s(C48071EUp.A0B), AnonymousClass7TF.A0j("EMAIL_LINK_ONETAP"));
        C49216ErL.A00(r7, fEx, "", user.getId(), (String) null, (String) null, (String) null);
        FragmentActivity fragmentActivity = this.A00;
        String str = em0.A07;
        AnonymousClass0iw r12 = this.A01;
        UserSession A022 = C46413Dea.A02(fragmentActivity, r12, r7, user, str, false);
        if (em0.A00 == null || em0.A01 == null) {
            C46413Dea.A05(fragmentActivity, this.A05, r12, A022);
        } else {
            new Handler().post(new C51467Fub(A022, em0, this));
        }
        0xY A0d = DbS.A0d(DbS.A0e());
        A0d.E5T("has_one_clicked_logged_in", true);
        A0d.apply();
        AnonymousClass0fD.A0A(1701975600, A033);
        AnonymousClass0fD.A0A(672191894, A032);
    }

    public ED8(Uri uri, FragmentActivity fragmentActivity, AnonymousClass0iw r5, AnonymousClass0aP r6, AnonymousClass3M8 r7, String str, boolean z) {
        AnonymousClass6ST A0h = DbV.A0h(fragmentActivity);
        this.A07 = A0h;
        DbU.A18(fragmentActivity, A0h, 2131965555);
        this.A05 = uri;
        this.A06 = str;
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = fragmentActivity;
        this.A04 = z;
        this.A03 = r7;
    }

    public final void onFail(C268654dm r7) {
        int i;
        Uri uri;
        int A032 = AnonymousClass0fD.A03(806586516);
        1Q0 r0 = 1Q0.A1D;
        AnonymousClass0aP r3 = this.A02;
        0xI A052 = r0.A02(r3).A05((EXD) null, C46634DiE.A0r);
        A052.A0C("event_type", "one_click");
        A052.A0C("uid_encoded", this.A06);
        DbU.A1R(A052, r3);
        Object A002 = r7.A00();
        if (A002 != null) {
            1XP r1 = (1XP) A002;
            String errorMessage = r1.getErrorMessage();
            if (C46413Dea.A09(r7)) {
                C47361Dvv dvv = (C47361Dvv) A002;
                F19 f19 = dvv.A01;
                new Handler().post(new C51468Fuc(dvv.A00, f19, this));
                i = -1990073696;
                AnonymousClass0fD.A0A(i, A032);
            }
            if ("invalid_link".equals(r1.mErrorType)) {
                DbU.A1R(1Q0.A0t.A02(r3).A04(), r3);
                C358248ab A0X = DbS.A0X(this.A00);
                A0X.A09(2131961854);
                A0X.A0q(errorMessage);
                C50020FJf.A01(A0X, this, 52, 2131973091);
                DbX.A16(C50020FJf.A00(this, 51), A0X);
            } else if (!TextUtils.isEmpty(errorMessage) && !errorMessage.equals("checkpoint_required")) {
                C59689JTv.A0G(errorMessage);
            }
            if (this.A04 && DbV.A04(r3) > 0) {
                AnonymousClass14B A003 = AnonymousClass14B.A00();
                FragmentActivity fragmentActivity = this.A00;
                Intent A012 = A003.A01(fragmentActivity);
                uri = this.A05;
                if (uri == null || uri.getBooleanQueryParameter("redirect_on_fail", true)) {
                    A012.setData(uri);
                }
                0kR.A0B(fragmentActivity, A012);
            }
            i = -943820181;
            AnonymousClass0fD.A0A(i, A032);
        }
        DbZ.A0s(2131975944);
        AnonymousClass14B A0032 = AnonymousClass14B.A00();
        FragmentActivity fragmentActivity2 = this.A00;
        Intent A0122 = A0032.A01(fragmentActivity2);
        uri = this.A05;
        A0122.setData(uri);
        0kR.A0B(fragmentActivity2, A0122);
        i = -943820181;
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-10864417);
        ED8.super.onFinish();
        AnonymousClass6ST r1 = this.A07;
        if (r1.isShowing()) {
            r1.hide();
        }
        AnonymousClass0fD.A0A(-1898441754, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1220440710);
        ED8.super.onStart();
        AnonymousClass6ST r1 = this.A07;
        if (!r1.isShowing()) {
            AnonymousClass0fN.A00(r1);
        }
        AnonymousClass0fD.A0A(-1426610705, A032);
    }
}

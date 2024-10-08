package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class H4T extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C317556nS A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public H4T(Activity activity, View view, UserSession userSession, C317556nS r4, String str, String str2, int i) {
        this.A04 = r4;
        this.A03 = userSession;
        this.A05 = str;
        this.A01 = activity;
        this.A00 = i;
        this.A06 = str2;
        this.A02 = view;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-485581782);
        0qQ.A0B(r6, 0);
        H4T.super.onFail(r6);
        this.A04.EcX(false);
        LBZ lbz = C60071Jf4.A01;
        Activity activity = this.A01;
        lbz.A00(activity, activity.getString(2131963032), 0).show();
        AnonymousClass0fD.A0A(720041886, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-891121027);
        int A033 = AnonymousClass0fD.A03(1370504945);
        C317556nS r9 = this.A04;
        r9.EcX(false);
        UserSession userSession = this.A03;
        C57090IOe A002 = C54951HZh.A00(userSession);
        String str = this.A05;
        A002.A00.add(str);
        r9.FJq(userSession);
        Activity activity = this.A01;
        int i2 = this.A00;
        String str2 = this.A06;
        View view = this.A02;
        C57269IVe iVe = new C57269IVe(activity, userSession, r9, str, str2, i2);
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i = (AnonymousClass0nB.A00(activity) - (iArr[1] + view.getHeight())) + ((int) 0nA.A00(activity, 16.0f));
        } else {
            i = 0;
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(activity, A0a, 2131966209);
        DbW.A0q(activity, A0a, 2131975851);
        A0a.A0A = iVe;
        A0a.A0L = true;
        A0a.A06();
        A0a.A0R = true;
        A0a.A02 = i;
        DbY.A1N(A0a);
        AnonymousClass0fD.A0A(1304437568, A033);
        AnonymousClass0fD.A0A(731478407, A032);
    }
}

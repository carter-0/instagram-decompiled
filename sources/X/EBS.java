package X;

import androidx.fragment.app.FragmentActivity;

public final class EBS extends 1P0 {
    public final /* synthetic */ ED8 A00;

    public EBS(ED8 ed8) {
        this.A00 = ed8;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-847977922);
        EBS.super.onFail(r3);
        C59689JTv.A0G(((C47344Dve) r3.A00()).A01);
        AnonymousClass0fD.A0A(1077685193, A03);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.MVB] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(529948222);
        C47344Dve dve = (C47344Dve) obj;
        int A032 = AnonymousClass0fD.A03(-29784227);
        EBS.super.onSuccess(dve);
        C310336ap A0a = DbS.A0a();
        ED8 ed8 = this.A00;
        FragmentActivity fragmentActivity = ed8.A00;
        A0a.A0D = DbW.A0h(fragmentActivity, dve.A00, 2131965069);
        A0a.A0D(fragmentActivity.getString(2131968772));
        A0a.A0A(new Object());
        A0a.A0L = true;
        ed8.A03.A0A(A0a.A00());
        AnonymousClass0fD.A0A(-1971647898, A032);
        AnonymousClass0fD.A0A(-1264430188, A03);
    }
}

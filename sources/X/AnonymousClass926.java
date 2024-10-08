package X;

import android.content.Context;
import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.926  reason: invalid class name */
public final class AnonymousClass926 extends 1P0 {
    public final /* synthetic */ AnonymousClass921 A00;

    public AnonymousClass926(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-671590205);
        C59689JTv.A0B(this.A00.A01, "something_went_wrong");
        AnonymousClass0fD.A0A(-869611009, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(109967903);
        int A032 = AnonymousClass0fD.A03(-1746433450);
        AnonymousClass921 r5 = this.A00;
        0wc A02 = AnonymousClass0kN.A02(r5.A05);
        String str = r5.A09;
        boolean z = false;
        if (r5.A00 == LimitedInteractionsVersions.V2_CUSTOMIZABLE) {
            z = true;
        }
        I4R.A00(A02, str, C66579MXk.A00(155), z);
        C310336ap r2 = new C310336ap();
        r2.A06();
        Context context = r5.A01;
        r2.A0D = context.getString(2131965009);
        r2.A0I = context.getString(2131965010);
        String string = context.getString(2131965011);
        0qQ.A07(string);
        r2.A0G = string;
        r2.A0A(new C72727PHh(r5));
        r2.A0L = true;
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        AnonymousClass0fD.A0A(-2081225415, A032);
        AnonymousClass0fD.A0A(-1938542163, A03);
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ECE extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1029538433);
        C43842CFi cFi = (C43842CFi) obj;
        int A033 = AnonymousClass0fD.A03(1485677757);
        0qQ.A0B(cFi, 0);
        this.A03.dismiss();
        String str = cFi.A00;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        String str2 = this.A06;
        String str3 = this.A05;
        if (str == null || Long.parseLong(str) == 0) {
            C49233Erc.A00(fragmentActivity, userSession, this.A02, this.A04);
        } else {
            LTV.A0A(fragmentActivity, userSession, str, "fb_fundraiser_sticker", str2, str3, false);
        }
        AnonymousClass0fD.A0A(-530091678, A033);
        AnonymousClass0fD.A0A(2135079002, A032);
    }

    public ECE(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3, AnonymousClass6ST r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = r3;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-2006809126);
        this.A03.dismiss();
        C49233Erc.A00(this.A00, this.A01, this.A02, this.A04);
        AnonymousClass0fD.A0A(-55133318, A032);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.EQo  reason: case insensitive filesystem */
public final class C48005EQo extends EC6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48005EQo(Activity activity, Context context, 0hq r5, UserSession userSession, AnonymousClass4DU r7, C255773uh r8, Runnable runnable, String str, String str2) {
        super(context, (View) null, r5, false);
        this.A06 = str;
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = str2;
        this.A04 = runnable;
    }

    public final void onFail(C268654dm r9) {
        int A032 = AnonymousClass0fD.A03(-437950725);
        super.onFail(r9);
        C22031Xty.A0H(this.A02, this.A01, this.A03.A0j, this.A05, "user_sms", r9.A01());
        this.A04.run();
        AnonymousClass0fD.A0A(-1173491653, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-464760075);
        int A033 = AnonymousClass0fD.A03(1867271052);
        String str = ((DvL) obj).A00;
        C49899FCc.A02(this.A00, this.A06, str);
        C22031Xty.A0I(this.A02, this.A01, this.A03.A0j, this.A05, "user_sms", str);
        this.A04.run();
        AnonymousClass0fD.A0A(-1040395020, A033);
        AnonymousClass0fD.A0A(-1815018267, A032);
    }
}

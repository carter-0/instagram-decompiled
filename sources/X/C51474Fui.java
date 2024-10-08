package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Fui  reason: case insensitive filesystem */
public final class C51474Fui implements Runnable {
    public final /* synthetic */ EEM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C51474Fui(EEM eem, String str, String str2) {
        this.A00 = eem;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        EEM eem = this.A00;
        CallerContext callerContext = EEM.A0B;
        Activity activity = eem.A04;
        AnonymousClass0aP r7 = eem.A08;
        String str = this.A02;
        1OC A0B = FHA.A0B(r7, (Boolean) null, (String) null, str, (String) null, (String) null, 0qv.A00(activity), DbT.A0s(activity), "sign_up_continue_button", true, true, false, false, true);
        String str2 = this.A01;
        C2612848z r20 = C2612848z.A00;
        AnonymousClass4DH r4 = eem.A06;
        AnonymousClass6ST A0Y = DbW.A0Y(r4);
        A0Y.A00(DbV.A0z(r4, r4.getString(2131961885), 2131956551));
        A0B.A00 = new C47694EDd(r20, r7, eem, A0Y, str, str2, (String) null, false, false, true);
        r4.schedule(A0B);
    }
}

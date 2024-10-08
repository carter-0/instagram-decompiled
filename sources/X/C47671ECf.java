package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ECf  reason: case insensitive filesystem */
public final class C47671ECf extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 0hq A01;
    public final /* synthetic */ AnonymousClass2hV A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C47671ECf(Activity activity, 0hq r2, AnonymousClass2hV r3, UserSession userSession, AnonymousClass4DU r5, Boolean bool, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0A = str;
        this.A07 = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A04 = r5;
        this.A03 = userSession;
        this.A02 = r3;
        this.A06 = runnable;
        this.A05 = bool;
        this.A09 = str5;
        this.A0C = str6;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-455156519);
        int A033 = AnonymousClass0fD.A03(994133216);
        String str = ((DvG) obj).A00;
        if (str != null) {
            String str2 = this.A0A;
            String str3 = this.A07;
            String str4 = this.A0B;
            String str5 = this.A08;
            AnonymousClass4DU r4 = this.A04;
            UserSession userSession = this.A03;
            C46395DeI.A0W(userSession, r4, str2, str3, str4, str5, str);
            this.A02.apply(str);
            Runnable runnable = this.A06;
            if (runnable != null) {
                runnable.run();
            }
            if (this.A05.booleanValue()) {
                C22031Xty.A0K(r4, userSession, this.A09, str3, str4, str, (String) null, (String) null, this.A0C);
            }
            AnonymousClass0fD.A0A(-328727545, A033);
            AnonymousClass0fD.A0A(-1602142142, A032);
            return;
        }
        0qQ.A0F("highlightUrl");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFail(C268654dm r15) {
        int A032 = AnonymousClass0fD.A03(-1172857013);
        C59689JTv.A0D(this.A00, "fetch_highlight_permalink_failed");
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A03;
        AnonymousClass4DU r4 = this.A04;
        String str = this.A09;
        String str2 = this.A07;
        String str3 = this.A0B;
        C22031Xty.A0H(r4, userSession, str, str2, str3, r15.A01());
        C46395DeI.A0W(userSession, r4, this.A0A, str2, str3, this.A08, (String) null);
        AnonymousClass0fD.A0A(417771721, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1297202307);
        11Z.A03(new C51312Fs5(this.A01));
        AnonymousClass0fD.A0A(123253488, A032);
    }
}

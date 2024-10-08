package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EQg  reason: case insensitive filesystem */
public final class C47997EQg extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass2hV A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47997EQg(Activity activity, 0hq r2, AnonymousClass2hV r3, AnonymousClass0iw r4, UserSession userSession, Boolean bool, Runnable runnable, String str, String str2, String str3) {
        super(r2);
        this.A01 = r3;
        this.A04 = bool;
        this.A03 = userSession;
        this.A02 = r4;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = runnable;
        this.A00 = activity;
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(573526928);
        C59689JTv.A0D(this.A00, "fetch_location_permalink_failed");
        C22031Xty.A0H(this.A02, this.A03, this.A07, this.A06, this.A08, r10.A01());
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(508009100, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1875975527);
        DvI dvI = (DvI) obj;
        int A033 = AnonymousClass0fD.A03(-779146803);
        this.A01.apply(dvI.A00);
        if (this.A04.booleanValue()) {
            C22031Xty.A0I(this.A02, this.A03, this.A07, this.A06, this.A08, dvI.A00);
        }
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(-1452524936, A033);
        AnonymousClass0fD.A0A(1910296184, A032);
    }
}

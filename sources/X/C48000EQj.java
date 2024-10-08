package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EQj  reason: case insensitive filesystem */
public final class C48000EQj extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass2hV A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48000EQj(Activity activity, 0hq r2, AnonymousClass2hV r3, AnonymousClass0iw r4, UserSession userSession, User user, Boolean bool, String str, String str2, boolean z) {
        super(r2);
        this.A08 = z;
        this.A01 = r3;
        this.A05 = bool;
        this.A03 = userSession;
        this.A02 = r4;
        this.A04 = user;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = activity;
    }

    public final void onFail(C268654dm r11) {
        int A032 = AnonymousClass0fD.A03(-749527475);
        User user = this.A04;
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass0iw r4 = this.A02;
        String str = this.A06;
        Throwable A012 = r11.A01();
        String str2 = this.A07;
        0nC.A00(activity, DbY.A0i(user));
        C59689JTv.A07(activity, 2131965058);
        C22031Xty.A0H(r4, userSession, user.getId(), str, str2, A012);
        AnonymousClass0fD.A0A(-101419260, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-304776074);
        if (!this.A08) {
            super.onStart();
        }
        AnonymousClass0fD.A0A(-1123137019, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1101081216);
        DvK dvK = (DvK) obj;
        int A033 = AnonymousClass0fD.A03(-1407530041);
        this.A01.apply(dvK.A00);
        if (this.A05.booleanValue()) {
            C22031Xty.A0I(this.A02, this.A03, this.A04.getId(), this.A06, this.A07, dvK.A00);
        }
        AnonymousClass0fD.A0A(2026200552, A033);
        AnonymousClass0fD.A0A(222916856, A032);
    }
}

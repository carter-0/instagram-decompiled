package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EQp  reason: case insensitive filesystem */
public final class C48006EQp extends EC6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48006EQp(Activity activity, Context context, 0hq r5, UserSession userSession, AnonymousClass4DU r7, C255773uh r8, User user, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z) {
        super(context, (View) null, r5, false);
        this.A03 = r8;
        this.A06 = str;
        this.A09 = str2;
        this.A04 = user;
        this.A02 = r7;
        this.A01 = userSession;
        this.A08 = str3;
        this.A07 = str4;
        this.A0B = z;
        this.A00 = activity;
        this.A0A = str5;
        this.A05 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1105409254);
        int A033 = AnonymousClass0fD.A03(1177096519);
        String str = ((DvL) obj).A00;
        C255773uh r0 = this.A03;
        String str2 = r0.A0j;
        String str3 = this.A06;
        String str4 = this.A09;
        User user = this.A04;
        String id = user.getId();
        AnonymousClass4DU r11 = this.A02;
        UserSession userSession = this.A01;
        C46395DeI.A0W(userSession, r11, str2, str3, str4, id, str);
        Bundle A0D = DbX.A0D(str);
        String str5 = this.A08;
        String str6 = this.A07;
        boolean z = this.A0B;
        String str7 = str2;
        String str8 = r0.A0k;
        C46395DeI.A03(this.A00, A0D, userSession, r11, user, str5, str6, str, str8, str7, str3, false, z);
        C22031Xty.A0K(r11, userSession, str2, str3, str4, str, (String) null, (String) null, this.A0A);
        this.A05.run();
        AnonymousClass0fD.A0A(1343298954, A033);
        AnonymousClass0fD.A0A(-1120601127, A032);
    }

    public final void onFail(C268654dm r14) {
        int A032 = AnonymousClass0fD.A03(-1102635288);
        super.onFail(r14);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A02;
        String str = this.A03.A0j;
        String str2 = this.A06;
        String str3 = this.A09;
        C22031Xty.A0H(r3, userSession, str, str2, str3, r14.A01());
        this.A05.run();
        C46395DeI.A0W(userSession, r3, str, str2, str3, this.A04.getId(), (String) null);
        AnonymousClass0fD.A0A(-415410902, A032);
    }
}

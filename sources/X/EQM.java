package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public final class EQM extends C47647EBh {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQM(Activity activity, Context context, 0hq r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(context, r3);
        this.A08 = str;
        this.A02 = r5;
        this.A01 = userSession;
        this.A07 = str2;
        this.A09 = str3;
        this.A06 = str4;
        this.A0B = z;
        this.A00 = activity;
        this.A05 = str5;
        this.A03 = r6;
        this.A04 = runnable;
        this.A0A = str6;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A012;
        int A032 = AnonymousClass0fD.A03(-2070572189);
        int A033 = AnonymousClass0fD.A03(-2074343055);
        String str = ((DvJ) obj).A00;
        String str2 = this.A08;
        if (str2 != null) {
            A012 = 002.A0g(str2, "\n", str);
        } else {
            A012 = C46395DeI.A01(this.A01, this.A02, str);
        }
        String str3 = this.A07;
        String str4 = this.A09;
        String str5 = this.A06;
        boolean z = this.A0B;
        Activity activity = this.A00;
        1Xj r5 = this.A02;
        String str6 = this.A05;
        AnonymousClass4DU r3 = this.A03;
        UserSession userSession = this.A01;
        Runnable runnable = this.A04;
        String str7 = this.A0A;
        1Xj r20 = r5;
        String str8 = str3;
        AnonymousClass4DU r18 = r3;
        UserSession userSession2 = userSession;
        C46395DeI.A0O(activity, (Uri) null, DbX.A0D(A012), r18, userSession2, r20, str8, str5, str, str6, false, z);
        String id = r5.getId();
        id.getClass();
        C22031Xty.A0K(r3, userSession, id, str6, str4, str, (String) null, DbT.A0x(r5), str7);
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(1394752393, A033);
        AnonymousClass0fD.A0A(-825219717, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(2018822019);
        super.onFail(r10);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A03;
        1Xj r1 = this.A02;
        String str = this.A05;
        String str2 = this.A09;
        Throwable A012 = r10.A01();
        Runnable runnable = this.A04;
        String id = r1.getId();
        id.getClass();
        C22031Xty.A0H(r3, userSession, id, str, str2, A012);
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(-2067679185, A032);
    }
}

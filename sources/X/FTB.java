package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class FTB implements AnonymousClass2hV {
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

    public /* synthetic */ FTB(Activity activity, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A05 = str;
        this.A02 = r3;
        this.A01 = userSession;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0B = z;
        this.A00 = activity;
        this.A0A = str5;
        this.A03 = r4;
        this.A04 = runnable;
        this.A06 = str6;
    }

    public final Object apply(Object obj) {
        String A012;
        String str = this.A05;
        1Xj r11 = this.A02;
        UserSession userSession = this.A01;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A09;
        boolean z = this.A0B;
        Activity activity = this.A00;
        String str5 = this.A0A;
        AnonymousClass4DU r9 = this.A03;
        Runnable runnable = this.A04;
        String str6 = this.A06;
        String str7 = (String) obj;
        if (str7 == null) {
            return null;
        }
        if (str != null) {
            A012 = 002.A0g(str, "\n", str7);
        } else {
            A012 = C46395DeI.A01(userSession, r11, str7);
        }
        C46395DeI.A0O(activity, (Uri) null, DbX.A0D(A012), r9, userSession, r11, str2, str4, str7, str5, false, z);
        String id = r11.getId();
        id.getClass();
        C22031Xty.A0K(r9, userSession, id, str5, str3, str7, (String) null, DbT.A0x(r11), str6);
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}

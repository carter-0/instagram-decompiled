package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final /* synthetic */ class FTA implements AnonymousClass2hV {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ FTA(Activity activity, UserSession userSession, AnonymousClass4DU r3, User user, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A09 = z;
        this.A00 = activity;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = user;
        this.A08 = str5;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final Object apply(Object obj) {
        String str = this.A04;
        String str2 = this.A05;
        boolean z = this.A09;
        Activity activity = this.A00;
        String str3 = this.A06;
        String str4 = this.A07;
        User user = this.A03;
        String str5 = this.A08;
        AnonymousClass4DU r3 = this.A02;
        UserSession userSession = this.A01;
        String str6 = (String) obj;
        if (str6 == null) {
            return null;
        }
        Bundle A0D = DbX.A0D(str6);
        if (str4 == null) {
            str4 = "";
        }
        C46395DeI.A03(activity, A0D, userSession, r3, user, str, str2, str6, str3, str4, str5, false, z);
        return null;
    }
}

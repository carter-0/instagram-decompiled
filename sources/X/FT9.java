package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Locale;

public final /* synthetic */ class FT9 implements AnonymousClass2hV {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ FT9(Activity activity, UserSession userSession, AnonymousClass4DU r3, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = z;
        this.A06 = str4;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass4DU r7 = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        boolean z = this.A07;
        String str4 = this.A06;
        String str5 = (String) obj;
        if (str5 == null) {
            return null;
        }
        String string = activity.getResources().getString(2131970996);
        Locale locale = Locale.ROOT;
        new LT3(activity, r7, userSession, new C50999Fmm(userSession, r7, str, str4, str5, z), str5, str, string, str2.toUpperCase(locale), str3.toUpperCase(locale), false).A04();
        return null;
    }
}

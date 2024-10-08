package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;

public final class IR6 implements AnonymousClass7YK {
    public final C332257Ug A00;
    public final Activity A01;
    public final UserSession A02;
    public final AnonymousClass7SN A03;
    public final AnonymousClass4DU A04;

    public IR6(Activity activity, UserSession userSession, C332257Ug r4, AnonymousClass7SN r5, AnonymousClass4DU r6) {
        C51973G9u.A0r(3, r6, r4, r5);
        this.A01 = activity;
        this.A02 = userSession;
        this.A04 = r6;
        this.A00 = r4;
        this.A03 = r5;
    }

    public final void CfY(AnonymousClass76V r25) {
        String str;
        this.A03.CLU();
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = this.A02;
        DbU.A1D(A0a, userSession);
        A0a.putBoolean(AnonymousClass000.A00(2215), false);
        String moduleName = this.A04.getModuleName();
        Integer num = AnonymousClass05K.A00;
        boolean A1Y = DbW.A1Y(moduleName);
        AnonymousClass76V r1 = r25;
        ImageUrl imageUrl = r1.A01;
        boolean z = true;
        if (r1.A00 != A1Y) {
            z = false;
        }
        String str2 = null;
        if (r1.A0A) {
            str = null;
            str2 = r1.A03;
        } else {
            str = r1.A03;
        }
        String str3 = r1.A05;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        A0a.putParcelable(AnonymousClass000.A00(280), new DirectCollectionArguments(imageUrl, r1.A02, Boolean.valueOf(r1.A08), num, moduleName, str6, str5, str4, r1.A06, r1.A04, r1.A07, z));
        H1P h1p = new H1P();
        C331127Pr A0V = DbV.A0V(A0a, h1p, userSession);
        A0V.A0T = h1p;
        A0V.A1G = A1Y;
        DbS.A1S(A0V, A1Y);
        Activity activity = this.A01;
        A0V.A03 = H1P.A0P.A00(activity, false) / ((float) 0nA.A08(activity));
        C57385IZq.A00(A0V, this, 4);
        DbU.A0y(activity, h1p, A0V);
        this.A00.Cyt();
    }
}

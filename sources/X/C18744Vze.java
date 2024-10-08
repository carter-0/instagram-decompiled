package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vze  reason: case insensitive filesystem */
public final class C18744Vze {
    public static final C18744Vze A00 = new Object();

    public final void A01(Activity activity, Bundle bundle, AnonymousClass0iw r11, UserSession userSession, AnonymousClass4DU r13, C45884D9d d9d, String str) {
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1T(activity, userSession, str);
        String str2 = d9d.A01;
        String str3 = d9d.A05;
        String str4 = d9d.A00;
        if (str2 != null) {
            Intent intent = new Intent(C66579MXk.A00(10));
            intent.setData(0cp.A03(str2));
            0kR.A0D(activity, intent);
        } else if (str4 != null) {
            A00(bundle, userSession, r13, str, str4);
            0kR.A0F(activity, DbT.A09(str4));
        } else if (str3 != null) {
            A00(bundle, userSession, r13, str, str3);
            SUL sul = new SUL(activity2, userSession2, 2EG.A2C, 0cp.A03(str3).toString(), false);
            sul.A0S = r11.getModuleName();
            sul.A0A();
        }
    }

    public static final void A00(Bundle bundle, UserSession userSession, AnonymousClass4DU r26, String str, String str2) {
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("carouselIndex");
        int i2 = bundle2.getInt("mediaPosition");
        UserSession userSession2 = userSession;
        1Xj A0U = DbV.A0U(userSession2, str);
        if (A0U != null) {
            Integer valueOf = Integer.valueOf(i);
            C271794jb r7 = new C271794jb(userSession2, A0U);
            r7.A00 = i;
            r7.A01 = i2;
            C233822wX.A04((C257603xf) null, (IntentAwareAdsInfoIntf) null, (0jB) null, (0jB) null, userSession2, r7, A0U, r26, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Float) null, (Float) null, (Float) null, (Float) null, valueOf, (Integer) null, (Integer) null, "lead_confirmation_page", "webclick", str2, (String) null, (String) null, (String) null, (String) null, i2);
        }
    }
}

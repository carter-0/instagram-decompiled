package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final class FOH implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass70J A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;

    public FOH(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass70J r4, User user, String str) {
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = user;
        this.A00 = context;
    }

    public final void onClick(View view) {
        C50672FgX A022;
        int i;
        int A052 = AnonymousClass0fD.A05(-116786744);
        String str = this.A05;
        UserSession userSession = this.A02;
        AnonymousClass0iw r4 = this.A01;
        C49075Eot.A00(r4, userSession, "click", C273654mx.A00(1532), "viewer", "ig_profile", str, (Map) null);
        AnonymousClass70J r0 = this.A03;
        if (!(r0 == null || (A022 = r0.A02()) == null)) {
            User user = this.A04;
            Context context = this.A00;
            UserSession userSession2 = A022.A02;
            String A032 = A022.A07.A03();
            Ey4 ey4 = new Ey4(context, r4, A022);
            Bundle A0B = DbV.A0B(A032, 1);
            E62 e62 = new E62();
            DbU.A1D(A0B, userSession2);
            A0B.putString("ProfileMultipleAddressesBottomsheetFragment.USER_ID", A032);
            e62.setArguments(A0B);
            e62.A00 = ey4;
            List AZa = user.A03.AZa();
            if (AZa != null) {
                i = AZa.size();
            } else {
                i = 0;
            }
            int i2 = ((i + 1) * 66) + 110;
            if (AnonymousClass35I.A00(userSession2).booleanValue() && 182.A06(0Tu.A05, userSession2, 2342172144706207563L)) {
                i2 += 156;
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float f = ((float) i2) / (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (f > 1.0f) {
                f = 1.0f;
            }
            C331127Pr A0W = DbS.A0W(userSession2);
            A0W.A0a = true;
            A0W.A1O = true;
            A0W.A0x = true;
            A0W.A03 = f;
            A0W.A0Z = true;
            A0W.A00().A02(A022.A00, e62);
        }
        AnonymousClass0fD.A0C(388507509, A052);
    }
}

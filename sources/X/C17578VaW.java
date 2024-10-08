package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.VaW  reason: case insensitive filesystem */
public final class C17578VaW {
    public String A00;
    public final Context A01;
    public final UserSession A02;
    public final C15364UbH A03;
    public final C331157Pu A04;
    public final C331137Ps A05;

    public C17578VaW(UserSession userSession, Context context, String str) {
        this.A02 = userSession;
        this.A01 = context;
        WA3 wa3 = new WA3(context, new C70573OBv(this, 1Au.A00(userSession)), this, str, 0);
        C331137Ps r2 = new C331137Ps();
        r2.A06 = context.getString(2131973082);
        r2.A05 = wa3;
        this.A05 = r2;
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A1O = true;
        DbS.A1S(r1, true);
        r1.A03 = 1.0f;
        DbZ.A0z(context, r1, 2131968289);
        r2.A0A = false;
        r1.A07(r2.A00());
        this.A04 = r1.A00();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_id", str);
        Fragment r12 = new AnonymousClass4DH();
        this.A03 = r12;
        r12.setArguments(bundle);
        r12.A01 = new VN4(this);
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.WNo  reason: case insensitive filesystem */
public final class C19156WNo implements X6J {
    public C18624VvH A00;
    public String A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C19156WNo(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        if (str3 == null) {
            User A0j = DbV.A0j(userSession, str);
            if (A0j != null) {
                str4 = A0j.A03.getStorefrontAttributionUsername();
            } else {
                str4 = null;
            }
            this.A01 = str4;
            return;
        }
        this.A01 = str3;
    }

    public final void onDestroy() {
        C18624VvH vvH = this.A00;
        if (vvH != null) {
            vvH.A01();
        }
    }

    public final void AJ3(Context context, 2da r15) {
        Dbb.A1I(r15);
        String str = this.A04;
        String str2 = this.A05;
        AnonymousClass0iw r3 = this.A02;
        String moduleName = r3.getModuleName();
        Context context2 = context;
        C18624VvH vvH = new C18624VvH(context2, (AnonymousClass4DH) null, r3, this.A03, new C19601WcQ(), (C323536xe) null, str, str2, moduleName, (String) null, this.A01, this.A06);
        this.A00 = vvH;
        vvH.A02(r15);
    }
}

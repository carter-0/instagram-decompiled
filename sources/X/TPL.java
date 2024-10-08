package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class TPL implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public TPL(Context context, UserSession userSession, S3Q s3q, String str, int i) {
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = context;
        this.A04 = str;
        this.A03 = s3q;
    }

    public final Object invoke(Object obj) {
        int i;
        int i2 = this.A00;
        UserSession userSession = (UserSession) this.A01;
        if (i2 != 0) {
            Context context = (Context) this.A02;
            String str = this.A04;
            S3Q s3q = (S3Q) this.A03;
            Boolean bool = (Boolean) obj;
            Ri1.A00(userSession).A06(bool);
            SAP.A00(userSession, context, str);
            if (bool.booleanValue()) {
                SAP.A01(userSession, context, str);
            } else {
                C11423SSz.A00(userSession);
                C11242SHc.A00(s3q.A03, "settings_clear_confirm_clicked", (String) null);
            }
            s3q.A06.invoke();
            return null;
        }
        Context context2 = (Context) this.A02;
        String str2 = this.A04;
        S3Q s3q2 = (S3Q) this.A03;
        if (AnonymousClass7TE.A1a(obj)) {
            SAP.A00(userSession, context2, str2);
            C11423SSz.A00(userSession);
            s3q2.A06.invoke();
            C11242SHc.A00(s3q2.A03, "settings_clear_confirm_clicked", (String) null);
            i = 2131954302;
        } else {
            C11242SHc.A00(s3q2.A03, "settings_clear_error", "EMPTY ERROR MESSAGE");
            i = 2131954301;
        }
        C59689JTv.A07(context2, i);
        return C60340gF.A00;
    }
}

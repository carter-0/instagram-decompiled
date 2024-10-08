package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E8e  reason: case insensitive filesystem */
public final class C47566E8e extends C47567E8f {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47566E8e(Context context, 04x r3, NJ7 nj7, Integer num, String str, String str2, int i) {
        super(r3, num, str, i);
        this.A01 = context;
        this.A02 = nj7;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        Context context;
        UserSession userSession;
        String str;
        String str2;
        if (this.A00 != 0) {
            context = (Context) this.A01;
            userSession = ((NJ7) this.A02).A09();
            str = this.A03;
            0qQ.A0B(userSession, 1);
            str2 = AnonymousClass7TE.A16(context, 2131963164);
        } else {
            C47038DpV dpV = (C47038DpV) this.A02;
            List list = C47038DpV.A0A;
            context = dpV.A00;
            userSession = dpV.A04;
            str = ((N4H) this.A01).A05;
            if (str != null) {
                str2 = this.A03;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        FGP.A04(context, userSession, str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47566E8e(04x r2, N4H n4h, C47038DpV dpV, Integer num, String str, int i) {
        super(r2, num, str, i);
        this.A03 = str;
        this.A02 = dpV;
        this.A01 = n4h;
    }
}

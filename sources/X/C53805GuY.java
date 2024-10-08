package X;

import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GuY  reason: case insensitive filesystem */
public final class C53805GuY extends C251343mx {
    public final C61047Jvl A00;
    public final UserSession A01;
    public final JTC A02;
    public final C59603JPx A03;
    public final long A04;
    public final long A05;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        UserSession userSession = this.A01;
        0Tu A0J = DbS.A0J(userSession, 0);
        int intValue = C55244HeZ.A00(182.A04(A0J, userSession, 36885307987526237L)).intValue();
        if (intValue == 1 || intValue == 0) {
            C52248GKp.A00(182.A04(A0J, userSession, 36885307987198555L)).intValue();
            AnonymousClass3XV r0 = 2WX.A02;
            long j = this.A04;
            Integer num = AnonymousClass05K.A00;
            2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, j);
            Integer num2 = AnonymousClass05K.A01;
            2WX A0U = C51972G9s.A0U(C51973G9u.A0Z(C51974G9v.A0J(AnonymousClass9JR.A00(AnonymousClass9JR.A00(A002, num2, 0, j), AnonymousClass05K.A0A, 0, this.A05), C51972G9s.A0W(r13, 2131964345, 0), num), J6J.A00(this, 14)), num2, 0);
            return new C244603bS(C244013aV.A0D(r13, R.drawable.instagram_this_or_that_outline_44), ImageView.ScaleType.FIT_CENTER, (2V5) null, A0U, C51972G9s.A09(r13.A05.A0C, r13), 0);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53805GuY(C61047Jvl jvl, UserSession userSession, JTC jtc, C59603JPx jPx, long j, long j2) {
        AnonymousClass7TG.A1O(userSession, jvl);
        AnonymousClass7TG.A1S(jtc, jPx);
        this.A01 = userSession;
        this.A00 = jvl;
        this.A04 = j;
        this.A05 = j2;
        this.A02 = jtc;
        this.A03 = jPx;
    }
}

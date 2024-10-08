package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.H2i  reason: case insensitive filesystem */
public final class C54188H2i extends F1F {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C56603I4c A01;
    public final /* synthetic */ C267624bv A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0rm A06;

    public C54188H2i(Activity activity, C56603I4c i4c, C267624bv r3, String str, String str2, String str3, 0rm r7) {
        this.A00 = activity;
        this.A02 = r3;
        this.A01 = i4c;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = r7;
        this.A03 = str3;
    }

    public final void A00(UserSession userSession) {
        long j;
        if (userSession != null) {
            Activity activity = this.A00;
            C267624bv r5 = this.A02;
            C56603I4c i4c = this.A01;
            String str = this.A05;
            String str2 = this.A04;
            0rm r1 = this.A06;
            String str3 = this.A03;
            C52480GUi.A00(activity, r5, userSession);
            if (i4c.A05(str, str2)) {
                C57699If2 if2 = (C57699If2) r1.A00;
                C53221GkV gkV = C53221GkV.A03;
                if (gkV == null) {
                    gkV = new C53221GkV(userSession);
                    C53221GkV.A03 = gkV;
                }
                if (if2 != null) {
                    j = AnonymousClass30M.A06(AnonymousClass30J.MILLISECONDS, AnonymousClass49C.A01.A00(if2.A00));
                } else {
                    j = 0;
                }
                gkV.A01(j, str3, false);
            }
        }
    }
}

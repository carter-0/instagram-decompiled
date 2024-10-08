package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3NR  reason: invalid class name */
public final class AnonymousClass3NR implements AnonymousClass3NS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass3BT A04;
    public final /* synthetic */ AnonymousClass3N5 A05;
    public final /* synthetic */ C230242pG A06;
    public final /* synthetic */ List A07;

    public final void DcV(String str) {
        User user;
        String A002;
        Integer num;
        AnonymousClass3BT r2 = this.A04;
        Reel reel = r2.A03;
        boolean A0d = reel.A0d();
        boolean A0s = reel.A0s();
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            user = r0.CCd();
        } else {
            user = null;
        }
        if (!A0s || user == null) {
            UserSession userSession = this.A03;
            if (!reel.A15(userSession) || !reel.A0g()) {
                String str2 = str;
                if (ORX.A01(userSession)) {
                    ORX.A00(this.A01, userSession, new C19853WgY(this, str2));
                } else if (!A0d ? C70349O3b.A00(userSession, AnonymousClass05K.A00) : C70349O3b.A00(userSession, AnonymousClass05K.A0C)) {
                    1Av A003 = 1Au.A00(userSession);
                    0xa r5 = A003.A01;
                    if (A0d) {
                        A002 = C66579MXk.A00(183);
                    } else {
                        A002 = AnonymousClass000.A00(200);
                    }
                    int i = r5.getInt(A002, 0);
                    1R7 C82 = AnonymousClass1Qz.A00(userSession).C82();
                    WA7 wa7 = new WA7(A003, this, str2, i, A0d);
                    Context context = this.A01;
                    AnonymousClass0iw r9 = this.A02;
                    ImageUrl A072 = reel.A07();
                    Boolean valueOf = Boolean.valueOf(r2.A04(userSession));
                    if (A0d) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A00;
                    }
                    C49256Erz.A00(context, wa7, C82, r9, A072, valueOf, num);
                } else {
                    C230242pG r22 = this.A06;
                    int i2 = this.A00;
                    r22.Dca(this.A05, (AnonymousClass3O9) null, (Integer) null, str2, (String) null, this.A07, i2, false);
                }
            } else {
                this.A06.D0J(reel);
            }
        } else {
            this.A06.Dci(user.getId());
        }
    }

    public AnonymousClass3NR(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass3BT r4, AnonymousClass3N5 r5, C230242pG r6, List list, int i) {
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = userSession;
        this.A00 = i;
        this.A07 = list;
        this.A05 = r5;
        this.A01 = context;
        this.A02 = r2;
    }

    public final void DcM(String str) {
        this.A06.Dcf(this.A07, this.A00, str);
    }
}

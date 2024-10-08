package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9mH  reason: invalid class name and case insensitive filesystem */
public final class C387479mH extends AA8 {
    public int A00;
    public List A01 = 0sn.A00;
    public boolean A02;
    public final AnonymousClass87H A03;
    public final Context A04;
    public final UserSession A05;

    public static final void A00(AnonymousClass57C r4, C387479mH r5) {
        UserSession userSession = r5.A05;
        C16150Upb upb = new C16150Upb(r5.A04, userSession, (C19477WaP) r5.A01.get(r5.A00));
        upb.A00 = !r5.A02;
        r5.A02 = true;
        r5.A03.A0A(upb, r4, C317876nz.A1I);
    }

    public C387479mH(Context context, UserSession userSession, AnonymousClass87H r4) {
        AnonymousClass7TG.A1P(r4, userSession);
        this.A03 = r4;
        this.A04 = context;
        this.A05 = userSession;
    }
}

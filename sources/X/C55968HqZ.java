package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.HqZ  reason: case insensitive filesystem */
public final class C55968HqZ {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final JR5 A02;
    public final Context A03;

    public final void A00() {
        JR5 jr5 = this.A02;
        SavedCollection Aog = jr5.Aog();
        if (Aog != null) {
            Context context = this.A03;
            UserSession userSession = this.A01;
            C46498Dg1 dg1 = new C46498Dg1(context, userSession);
            String str = userSession.A06;
            if (!Aog.A07(str) && Aog.A05 == null && I31.A00(userSession)) {
                HED hed = new HED();
                dg1.A02(new ICB(13, jr5, hed, Aog, this), hed.A00);
            } else if (Aog.A07(str)) {
                if (Aog.A07 != C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
                    0Tu r3 = 0Tu.A05;
                    if (182.A06(r3, userSession, 36324234934366101L)) {
                        HEB heb = new HEB();
                        dg1.A02(new ICB(13, jr5, heb, Aog, this), heb.A00);
                    }
                    HEC hec = new HEC();
                    dg1.A04(new ICB(12, jr5, hec, Aog, this), hec.A00);
                    if (182.A06(r3, userSession, 36324234934431638L)) {
                        HEA hea = new HEA();
                        dg1.A04(new ICB(12, jr5, hea, Aog, this), hea.A00);
                    }
                }
                if (jr5.CJz()) {
                    HEE hee = new HEE();
                    dg1.A04(new ICB(12, jr5, hee, Aog, this), hee.A00);
                }
            }
            if (AnonymousClass7TE.A1b(dg1.A09)) {
                new C49945FFy(dg1).A03(C61270mF.A00(context));
                return;
            }
            throw DbT.A0m();
        }
    }

    public C55968HqZ(Context context, AnonymousClass0iw r2, UserSession userSession, JR5 jr5) {
        AnonymousClass7TG.A1Q(jr5, userSession);
        this.A03 = context;
        this.A02 = jr5;
        this.A01 = userSession;
        this.A00 = r2;
    }
}

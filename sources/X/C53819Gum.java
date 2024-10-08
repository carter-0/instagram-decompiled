package X;

import android.graphics.Color;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Gum  reason: case insensitive filesystem */
public final class C53819Gum extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass3W1 A01;
    public final C59571JOr A02;
    public final JPE A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final UpcomingEvent A06;

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        ClipsShoppingCTABarIntf clipsShoppingCTABarIntf;
        1Xj r0;
        String str;
        int A08;
        float f;
        String title;
        AnonymousClass3Y5 r7 = r20;
        0qQ.A0B(r7, 0);
        C267324bN r9 = this.A00;
        1Xj r02 = r9.A02;
        if (r02 != null) {
            clipsShoppingCTABarIntf = C14064TpC.A00(r02);
        } else {
            clipsShoppingCTABarIntf = null;
        }
        UpcomingEvent upcomingEvent = this.A06;
        if (!(upcomingEvent == null || (r0 = r9.A02) == null)) {
            ClipsShoppingCTABarIntf A002 = C14064TpC.A00(r0);
            if (A002 != null) {
                str = A002.getDestination();
            } else {
                str = null;
            }
            Integer A012 = C14064TpC.A01(str, upcomingEvent.getReminderEnabled());
            if (A012 == AnonymousClass05K.A0Y || A012 == AnonymousClass05K.A0j) {
                UserSession userSession = this.A05;
                if (new C310296al(userSession).A00(upcomingEvent) && clipsShoppingCTABarIntf != null) {
                    String dominantColor = clipsShoppingCTABarIntf.getDominantColor();
                    if (dominantColor != null) {
                        A08 = Color.parseColor(dominantColor);
                    } else {
                        A08 = C51969G9p.A08(r7, R.color.badge_color);
                    }
                    Integer AzW = clipsShoppingCTABarIntf.AzW();
                    if (AzW != null) {
                        f = (float) AzW.intValue();
                    } else {
                        f = 4.0f;
                    }
                    C52058GDe gDe = this.A04;
                    C58705IwE A013 = C58705IwE.A01(this, 32);
                    JPE jpe = this.A03;
                    if (!new C310296al(userSession).A01(upcomingEvent) || clipsShoppingCTABarIntf.getToggledTitle() == null) {
                        title = clipsShoppingCTABarIntf.getTitle();
                    } else {
                        title = clipsShoppingCTABarIntf.getToggledTitle();
                    }
                    return I3N.A00((C251263mp) null, r7, jpe, r9, gDe, userSession, title, A013, f, A08, true, this.A01.A1u, false);
                }
            }
        }
        return null;
    }

    public C53819Gum(JPE jpe, C267324bN r2, C52058GDe gDe, UserSession userSession, AnonymousClass3W1 r5, UpcomingEvent upcomingEvent, C59571JOr jOr) {
        C51972G9s.A1E(jOr, userSession);
        this.A00 = r2;
        this.A04 = gDe;
        this.A01 = r5;
        this.A06 = upcomingEvent;
        this.A03 = jpe;
        this.A02 = jOr;
        this.A05 = userSession;
    }
}

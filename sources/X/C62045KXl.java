package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.KXl  reason: case insensitive filesystem */
public final class C62045KXl extends C65614Lwp {
    public final Context A00;
    public final View A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final IgdsInlineSearchBox A04;
    public final C336227eH A05;
    public final K9H A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62045KXl(Context context, View view, AnonymousClass07i r11, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, C336227eH r14, K9H k9h) {
        super(context, view, r11, userSession, igdsInlineSearchBox, k9h, (String) null);
        C51974G9v.A1M(userSession, igdsInlineSearchBox, view);
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = igdsInlineSearchBox;
        this.A01 = view;
        this.A02 = r11;
        this.A06 = k9h;
        this.A05 = r14;
    }

    public final void A02() {
        UserSession userSession = this.A03;
        C228602lw r4 = new C228602lw(this.A00, this.A02, (Integer) null);
        C336227eH r0 = this.A05;
        0qQ.A0B(userSession, 0);
        boolean A1Z = DbW.A1Z(r0);
        C336297eO r3 = new C336297eO(r4, new Af6(userSession), new C336247eJ((AnonymousClass4D6) r4, r0, A1Z), false, A1Z);
        this.A00 = r3;
        r3.EcJ(this);
    }
}

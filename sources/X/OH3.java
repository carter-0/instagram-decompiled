package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

public final class OH3 {
    public AnonymousClass4UE A00;
    public C231002qi A01;
    public boolean A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C230882qT A05;

    public OH3(AnonymousClass4DH r16, AnonymousClass0iw r17, UserSession userSession, C70495O8u o8u) {
        UserSession userSession2 = userSession;
        this.A04 = userSession2;
        this.A03 = r17;
        1YN A002 = AnonymousClass2bO.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(QPTooltipAnchor.PENDING_INBOX_RANKING_DROPDOWN, new C230872qQ());
        C230882qT A042 = A002.A04(userSession2, A1E);
        this.A05 = A042;
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0Y;
        AnonymousClass2bO.A00();
        C70495O8u o8u2 = o8u;
        AnonymousClass4DH r10 = r16;
        AnonymousClass4DH r11 = r10;
        this.A01 = A003.A01(r10, r11, userSession2, 2bV.A01((C230942qc) null, (AnonymousClass2qY) null, new C72760PIw(this, o8u2), new LvU(this, 2), new C50737Fhc(0, o8u2, this), A042, (Boolean) null), quickPromotionSlot);
    }
}

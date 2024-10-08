package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.3Dz  reason: invalid class name and case insensitive filesystem */
public final class C238933Dz {
    public final boolean A00;
    public final C230822qK A01;

    public C238933Dz(UserSession userSession, C230822qK r5) {
        this.A01 = r5;
        this.A00 = 182.A06(0Tu.A05, userSession, 36325231366779635L);
    }

    public static final void A00(AnonymousClass3Q2 r1, C238933Dz r2) {
        Trigger trigger;
        0sl of;
        ShareType A0E = r1.A0E();
        C63506KyH kyH = C63506KyH.$redex_init_class;
        int ordinal = A0E.ordinal();
        if (ordinal == 4 || ordinal == 2) {
            trigger = Trigger.A22;
            of = EnumSet.of(trigger);
        } else if (ordinal != 0) {
            of = 0sl.A00;
        } else {
            trigger = Trigger.A1a;
            of = EnumSet.of(trigger);
        }
        if (!of.isEmpty()) {
            r2.A01.A05.AVg(of);
        }
    }
}

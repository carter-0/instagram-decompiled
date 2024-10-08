package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.OOr  reason: case insensitive filesystem */
public abstract class C70860OOr {
    public static final void A00(Context context, 1P0 r6, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        C358248ab A0Y = DbS.A0Y(context);
        DbT.A19(context, A0Y, 2131957337);
        DbU.A17(context, A0Y, 2131957336);
        A0Y.A0L(new C71186Of4(r6, userSession, str, 0), 2131957531);
        A0Y.A0C(C71204OfQ.A00);
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A01(1P0 r6, UserSession userSession, String str) {
        String str2;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("media/delete_cutout_sticker/");
        A0a.A9m("cutout_sticker_id", str);
        A0a.A0Q(C43775CCt.class, C45542CyG.class);
        A0a.A0R = true;
        1OC A0M = A0a.A0M();
        A0M.A00 = r6;
        1ES.A05(A0M, 759527209, 2, true, false);
        int A04 = DbS.A04(0Tu.A05, userSession, 36609803016607670L);
        List A00 = OPI.A00(userSession, A04);
        ArrayList<PUH> A1C = AnonymousClass7TE.A1C();
        for (Object next : A00) {
            PUH puh = (PUH) next;
            if (puh.A03 == C69304Nj5.CUTOUT) {
                C317966o8 r0 = puh.A02;
                if (r0 != null) {
                    str2 = r0.A0S;
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str2, str)) {
                }
            }
            A1C.add(next);
        }
        if (A1C.size() < OPI.A00(userSession, A04).size()) {
            1Av A002 = 1Au.A00(userSession);
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            for (PUH A003 : A1C) {
                A0r.add(OPJ.A00(A003));
            }
            Set A0k = 00k.A0k(A0r);
            0xa r2 = A002.A01;
            0xY AR4 = r2.AR4();
            AR4.ED3("recent_direct_stickers");
            AR4.apply();
            JTU.A1E(r2, "recent_direct_stickers", A0k);
        }
        27p.A01(userSession).A09.A0T("CUTOUT_STICKER_DELETION_DIALOG_DELETE_TAP", str);
    }
}

package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ONs  reason: case insensitive filesystem */
public final class C70841ONs {
    public final UserSession A00;
    public final OTF A01;

    public final ArrayList A03(2Eo r5, boolean z) {
        C69415Nkv nkv;
        List A1I;
        0qQ.A0B(r5, 0);
        UserSession userSession = this.A00;
        List A0a = 00k.A0a(C2612048r.A00(userSession).A00);
        int ordinal = r5.ordinal();
        if (ordinal == 6 || ordinal == 3) {
            if (!z && (C272094k5.A07(userSession) || C272094k5.A0B(userSession, true))) {
                nkv = C69415Nkv.NON_STORY_REPLIES;
                A1I = AnonymousClass7TE.A1I(nkv);
                return 00k.A0S(A1I, A0a);
            }
        } else if (ordinal == 4) {
            A1I = 00k.A0a(this.A01.A01);
            return 00k.A0S(A1I, A0a);
        } else if (ordinal == 7 || ordinal == 5) {
            nkv = C69415Nkv.STORY_REPLIES;
            A1I = AnonymousClass7TE.A1I(nkv);
            return 00k.A0S(A1I, A0a);
        }
        A1I = 0sn.A00;
        return 00k.A0S(A1I, A0a);
    }

    public final 2EM A00() {
        int ordinal = C69991NvV.A00(this.A00).A00.ordinal();
        if (ordinal == 9 || ordinal == 10) {
            return AnonymousClass43H.A00;
        }
        if (ordinal == 5 || ordinal == 8) {
            return C271084hs.A00;
        }
        return AnonymousClass4iZ.A00;
    }

    public C70841ONs(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = (OTF) userSession.A01(OTF.class, new C73914Plp(userSession, 28));
    }

    public final ArrayList A01() {
        Object A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A02().iterator();
        while (it.hasNext()) {
            2EM r2 = (2EM) it.next();
            if (0qQ.A0K(r2, AnonymousClass43H.A00)) {
                A03 = 00k.A0a(C2612048r.A00(this.A00).A00);
            } else {
                A03 = A03(C70889OQh.A00(r2).A01, false);
            }
            A1C.add(new Pair(r2, A03));
        }
        return A1C;
    }

    public final ArrayList A02() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(AnonymousClass4iZ.A00);
        UserSession userSession = this.A00;
        if (!C272094k5.A0A(userSession, true)) {
            A1C.add(C67225MkL.A00);
        }
        if (C272094k5.A0C(userSession, true) && 182.A06(0Tu.A05, userSession, 36317161123484466L)) {
            A1C.add(C271084hs.A00);
        }
        if (C272094k5.A03(userSession)) {
            A1C.add(AnonymousClass43H.A00);
        }
        return A1C;
    }
}

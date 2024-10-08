package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class I3z {
    public static final Map A00 = C51975G9x.A0n(IGAdTransparencyDisclaimerPlacement.OVERFLOW_MENU, HOR.OVERFLOW_MENU, AnonymousClass7TE.A1L(IGAdTransparencyDisclaimerPlacement.ABOVE_IMAGE, HOR.ABOVE_IMAGE), AnonymousClass7TE.A1L(IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE, HOR.BELOW_IMAGE));
    public static final Map A01 = C51975G9x.A0n(C54646HMd.REELS, HOS.REELS, AnonymousClass7TE.A1L(C54646HMd.FEED, HOS.FEED), AnonymousClass7TE.A1L(C54646HMd.STORIES, HOS.STORIES));

    public static final void A00(FragmentActivity fragmentActivity, IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, UserSession userSession, 1Xj r18, C54646HMd hMd, C62320sa r20) {
        0qQ.A0B(fragmentActivity, 1);
        1Xj r5 = r18;
        C54646HMd hMd2 = hMd;
        C51972G9s.A1C(r5, hMd2);
        UserSession userSession2 = userSession;
        C229382nI A04 = C229382nI.A04(fragmentActivity, DbS.A0O("political_ad_info_sheet"), userSession2);
        String A07 = C231122qu.A07(userSession2, r5);
        if (A07 != null) {
            String A0F = C231122qu.A0F(userSession2, r5);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            BitSet A0w = DbS.A0w(1);
            A1H.put("ad_id", A07);
            A0w.set(0);
            A1H.put("ad_client_token", A0F);
            IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement2 = iGAdTransparencyDisclaimerPlacement;
            A1H.put("disclaimer_placement", iGAdTransparencyDisclaimerPlacement2.toString());
            A1H.put("source_surface", hMd2.A00);
            A1H.put("dismiss_callback", new Q3B(new C66310MMt(new C58218IoM(31, iGAdTransparencyDisclaimerPlacement2, r20, userSession, hMd2, r5), 36)));
            if (A0w.nextClearBit(0) >= 1) {
                C11844ShW shW = new C11844ShW("com.bloks.www.ig.ad_transparency_disclaimer.info_sheet", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 0, true);
                A01(HOJ.DISCLAIMER_LABEL_CLICKED, iGAdTransparencyDisclaimerPlacement2, userSession2, r5, hMd2);
                FragmentActivity fragmentActivity2 = A04.A03;
                C307506Qj A002 = C48721Ej6.A00(userSession2, false);
                FRI fri = new FRI((UKI) null, (Boolean) null, (Integer) null, (Integer) null, 1.0f, false, false, false, true);
                0qQ.A0B(A002, 1);
                shW.E0s(fragmentActivity2, fri, A002);
                return;
            }
            throw DbT.A0n();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(HOJ hoj, IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, UserSession userSession, 1Xj r7, C54646HMd hMd) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_ad_transparency_disclaimer_client");
        if (A0e.isSampled()) {
            String A0F = C231122qu.A0F(userSession, r7);
            A0e.A8M(hoj, "event");
            A0e.A8M((HOS) 0Yt.A01(hMd, A01), "source_surface");
            A0e.AAJ("ad_client_token", A0F);
            A0e.A8M((HOR) 0Yt.A01(iGAdTransparencyDisclaimerPlacement, A00), "disclaimer_placement");
            A0e.Cgf();
        }
    }
}

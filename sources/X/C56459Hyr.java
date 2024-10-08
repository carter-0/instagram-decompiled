package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Hyr  reason: case insensitive filesystem */
public abstract class C56459Hyr {
    public static final HashMap A00 = C51975G9x.A0n(3, C54646HMd.REELS, AnonymousClass7TE.A1L(1, C54646HMd.FEED), AnonymousClass7TE.A1L(2, C54646HMd.STORIES));

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C270594gz r8, 1Xj r9, AnonymousClass4DU r10, C62320sa r11, int i) {
        C60510iO.A00(userSession);
        C254523sc A01 = C233822wX.A01(r8, r9, r10, "political_ad_unit_action");
        A01.A53 = "ad_transparency_disclaimer_info_bottom_sheet";
        C233822wX.A0H(userSession, A01, r10);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        I3z.A00(fragmentActivity2, IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE, userSession, r9, (C54646HMd) 0Yt.A01(Integer.valueOf(i), A00), r11);
    }
}

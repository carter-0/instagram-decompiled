package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dl9  reason: case insensitive filesystem */
public final class C46781Dl9 extends 2YL {
    public final 2Fk A00;
    public final C49376Eue A01;
    public final C249513ju A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04 = DbS.A10(false);
    public final 05G A05;
    public final 05G A06 = DbS.A10(false);
    public final UserSession A07;
    public final List A08;
    public final 05G A09;

    public C46781Dl9(UserSession userSession, C49376Eue eue, List list) {
        AnonymousClass7TF.A1C(userSession, 1, eue);
        this.A07 = userSession;
        this.A08 = list;
        this.A01 = eue;
        1HR r0 = new 1HR(0);
        this.A02 = r0;
        this.A03 = 0u9.A04(r0);
        02z A10 = DbS.A10(true);
        this.A05 = A10;
        02z A012 = 106.A01(0sn.A00);
        this.A09 = A012;
        C61820pm A032 = AnonymousClass10H.A03(new C67296MlV(2, (AnonymousClass4D7) null), A10, A012);
        05F A022 = 10b.A02(HDA.A00, C318116oQ.A00(this), A032, AnonymousClass10A.A00);
        19B r3 = 19B.A00;
        this.A00 = C226292g8.A00(r3, A022);
        A10.Epw(true);
        if (list == null || !list.contains(UserMonetizationProductType.REELS_OVERLAY_ADS)) {
            A10.Epw(false);
            A00(this);
            return;
        }
        1Eo.A05(r3, new C51647Fy6((Object) this, (AnonymousClass4D7) null, 12), C318116oQ.A00(this));
    }

    public static final void A00(C46781Dl9 dl9) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        List list = dl9.A08;
        if (list != null) {
            if (list.contains(UserMonetizationProductType.REELS_OVERLAY_ADS)) {
                if (!182.A06(0Tu.A06, dl9.A07, 36315133899574283L)) {
                    A1C.add(new Object());
                    A1C.add(new C50642Fg2(DbX.A1b(dl9.A06)));
                    A1C.add(new Object());
                }
                A1C.add(new C50643Fg3(IGRevShareProductType.REELS_OVERLAY_ADS, 2131952912));
            }
            if (list.contains(UserMonetizationProductType.IGTV_REVSHARE)) {
                A1C.add(new C50643Fg3(IGRevShareProductType.PROFILE_ADS, 2131952913));
            }
        }
        dl9.A09.Epw(A1C);
    }
}

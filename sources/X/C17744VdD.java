package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.VdD  reason: case insensitive filesystem */
public final class C17744VdD {
    public final int A00;
    public final int A01;
    public final FragmentActivity A02;
    public final XIGIGBoostDestination A03;
    public final G7V A04;
    public final BoostFlowType A05;
    public final PromoteLaunchOrigin A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C16616UyC A09;
    public final 1Xj A0A;
    public final ProductType A0B;
    public final AudioOverlayTrack A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final String[] A0R;

    public C17744VdD(C17945Via via) {
        BoostFlowType boostFlowType;
        XIGIGBoostDestination xIGIGBoostDestination;
        C17945Via via2 = via;
        String A002 = via2.A00();
        1Xj r0 = via2.A0J;
        String str = via2.A0K;
        UserSession userSession = via2.A0I;
        FragmentActivity fragmentActivity = via2.A0G;
        int ordinal = r0.A1Z().ordinal();
        if (ordinal == 7) {
            boostFlowType = BoostFlowType.DRAFT;
        } else if (ordinal != 5) {
            boostFlowType = BoostFlowType.ORIGINAL;
        } else {
            boostFlowType = BoostFlowType.BOOST_AGAIN;
        }
        AnonymousClass0iw r25 = via2.A0H;
        boolean A4u = r0.A4u();
        ProductType A1v = r0.A1v();
        String[] A1b = DbU.A1b(03t.A0I(r0.A6i()), 0);
        C16616UyC A1Z = r0.A1Z();
        C16616UyC uyC = C16616UyC.NOT_BOOSTED;
        if (A1Z == uyC && r0.A0C.BYl() == OrganicCTAType.CLICK_TO_DIRECT) {
            xIGIGBoostDestination = XIGIGBoostDestination.DIRECT_MESSAGE;
        } else if (r0.A1Z() == uyC && !r0.A5G() && r0.A0C.BYl() == OrganicCTAType.CLICK_TO_WHATSAPP) {
            xIGIGBoostDestination = XIGIGBoostDestination.WHATSAPP_MESSAGE;
        } else {
            xIGIGBoostDestination = null;
        }
        boolean z = via2.A0D;
        String str2 = via2.A05;
        int i = via2.A00;
        String str3 = via2.A06;
        String str4 = via2.A07;
        int i2 = via2.A01;
        boolean z2 = via2.A0C;
        boolean z3 = via2.A0E;
        boolean z4 = via2.A0F;
        String str5 = via2.A08;
        PromoteLaunchOrigin promoteLaunchOrigin = via2.A03;
        G7V g7v = via2.A02;
        String str6 = via2.A0A;
        AudioOverlayTrack audioOverlayTrack = via2.A04;
        String str7 = via2.A09;
        boolean A1V = AnonymousClass7TF.A1V(r0.A0C.BFi());
        C16616UyC A1Z2 = r0.A1Z();
        C51969G9p.A1N(A002, 1, A1b);
        0qQ.A0B(A1Z2, 37);
        this.A0H = A002;
        this.A0A = r0;
        this.A0G = str;
        this.A08 = userSession;
        this.A02 = fragmentActivity;
        this.A05 = boostFlowType;
        this.A07 = r25;
        this.A0M = A4u;
        this.A0B = A1v;
        this.A0R = A1b;
        this.A03 = xIGIGBoostDestination;
        this.A0O = z;
        this.A0D = str2;
        this.A00 = i;
        this.A0E = str3;
        this.A0F = str4;
        this.A01 = i2;
        this.A0N = z2;
        this.A0P = z3;
        this.A0Q = z4;
        this.A0I = str5;
        this.A06 = promoteLaunchOrigin;
        this.A04 = g7v;
        this.A0K = str6;
        this.A0C = audioOverlayTrack;
        this.A0J = str7;
        this.A0L = A1V;
        this.A09 = A1Z2;
    }
}

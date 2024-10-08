package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

public final class P45 implements C74511Pw6 {
    public final /* synthetic */ C71126OdL A00;
    public final /* synthetic */ C68770NWf A01;

    public final DirectShareTarget BtL() {
        return null;
    }

    public final void Csp(C317966o8 r1, C69319NjK njK, int i) {
    }

    public final void CuT() {
    }

    public final void D7d(C317966o8 r1) {
    }

    public final void DNZ(N34 n34, String str) {
    }

    public final void DOo() {
    }

    public final void DT2(C66569MWx mWx) {
    }

    public final void Dnb(N34 n34, DirectStoreSticker directStoreSticker, String str) {
    }

    public final void Du2() {
    }

    public final void Duk(String str) {
    }

    public final void Dul(String str) {
    }

    public final void EuP() {
    }

    public P45(C71126OdL odL, C68770NWf nWf) {
        this.A00 = odL;
        this.A01 = nWf;
    }

    public final void CxN(C317966o8 r16, N34 n34, String str) {
        AnonymousClass37D bottomSheetNavigator;
        ExtendedImageUrl extendedImageUrl;
        C71126OdL odL = this.A00;
        17i r3 = odL.A0Y;
        C68770NWf nWf = this.A01;
        User A02 = r3.A02(nWf.A08);
        if (A02 != null) {
            DirectShareTarget directShareTarget = new DirectShareTarget(A02);
            C317966o8 r7 = r16;
            if (r16 != null) {
                C71126OdL.A02(odL, nWf);
                C67755MuA muA = odL.A0U;
                String str2 = nWf.A09;
                String str3 = nWf.A0B;
                ImageUrl imageUrl = nWf.A04;
                String str4 = nWf.A0E;
                AnonymousClass7TG.A1Q(str2, str3);
                UserSession userSession = muA.A02;
                Long valueOf = Long.valueOf(muA.A00);
                if (imageUrl != null) {
                    extendedImageUrl = new ExtendedImageUrl(imageUrl);
                } else {
                    extendedImageUrl = null;
                }
                long longValue = valueOf.longValue();
                0qQ.A0B(userSession, 0);
                if (DbS.A0c(directShareTarget) instanceof C254773t1) {
                    AnonymousClass7VU A002 = AnonymousClass7VT.A00(userSession);
                    C254783t2 A0c = DbS.A0c(directShareTarget);
                    0qQ.A0C(A0c, AnonymousClass000.A00(30));
                    A002.A02((C254773t1) A0c, DbW.A0m(directShareTarget), new C73980Pmy(directShareTarget, userSession, r7, extendedImageUrl, str2, str3, str4, 1, longValue), true);
                }
            }
        }
        BaseFragmentActivity baseFragmentActivity = odL.A0O;
        if (baseFragmentActivity != null && (bottomSheetNavigator = baseFragmentActivity.getBottomSheetNavigator()) != null) {
            bottomSheetNavigator.A0B();
        }
    }

    public final void DI3(N34 n34, C68137N2b n2b, String str) {
        DirectShareTarget directShareTarget;
        DirectAnimatedMedia directAnimatedMedia;
        AnonymousClass37D bottomSheetNavigator;
        C71126OdL odL = this.A00;
        17i r1 = odL.A0Y;
        C68770NWf nWf = this.A01;
        User A02 = r1.A02(nWf.A08);
        ExtendedImageUrl extendedImageUrl = null;
        if (A02 != null) {
            directShareTarget = new DirectShareTarget(A02);
        } else {
            directShareTarget = null;
        }
        C71126OdL.A02(odL, nWf);
        UserSession userSession = odL.A0Q;
        if (directShareTarget != null) {
            Long valueOf = Long.valueOf(odL.A00);
            C68137N2b n2b2 = n2b;
            if (n2b == null || (directAnimatedMedia = n2b2.A00) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            String str2 = nWf.A09;
            String str3 = nWf.A0B;
            ImageUrl imageUrl = nWf.A04;
            if (imageUrl != null) {
                extendedImageUrl = new ExtendedImageUrl(imageUrl);
            }
            String str4 = nWf.A0E;
            long longValue = valueOf.longValue();
            AnonymousClass7TG.A1R(str2, str3);
            if (DbS.A0c(directShareTarget) instanceof C254773t1) {
                AnonymousClass7VU A002 = AnonymousClass7VT.A00(userSession);
                C254783t2 A0c = DbS.A0c(directShareTarget);
                0qQ.A0C(A0c, AnonymousClass000.A00(30));
                A002.A02((C254773t1) A0c, DbW.A0m(directShareTarget), new C73980Pmy(directShareTarget, userSession, extendedImageUrl, directAnimatedMedia, str2, str3, str4, 0, longValue), true);
            }
            BaseFragmentActivity baseFragmentActivity = odL.A0O;
            if (baseFragmentActivity != null && (bottomSheetNavigator = baseFragmentActivity.getBottomSheetNavigator()) != null) {
                bottomSheetNavigator.A0B();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}

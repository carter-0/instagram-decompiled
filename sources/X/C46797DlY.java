package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DlY  reason: case insensitive filesystem */
public final class C46797DlY extends 2YL implements C229122ms {
    public static final Integer A09 = AnonymousClass05K.A05;
    public boolean A00;
    public final UserSession A01;
    public final C273004lm A02;
    public final SubscribedAndRecommendedCreatorListRepository A03;
    public final C314996jB A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final boolean A08;

    public static final C47243DtU A00(C46797DlY dlY, User user, boolean z) {
        C273014lo r3;
        UserSession userSession = dlY.A01;
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(userSession, 0);
        Reel A022 = AnonymousClass3PQ.A02(userSession, user);
        C266444Yx A002 = C324726zn.A00(userSession, user);
        if (user.A02 == 17M.A06) {
            r3 = C273014lo.SECONDARY;
        } else {
            r3 = C273014lo.PRIMARY;
        }
        return new C47243DtU(A002, r3, A022, user, z);
    }

    public final boolean CJz() {
        Collection collection;
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        Collection collection2 = (Collection) subscribedAndRecommendedCreatorListRepository.A0F.getValue();
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) subscribedAndRecommendedCreatorListRepository.A0E.getValue()) == null || collection.isEmpty()) && !(!((Collection) subscribedAndRecommendedCreatorListRepository.A0G.getValue()).isEmpty()))) {
            return false;
        }
        return true;
    }

    public final boolean CKB() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        if (subscribedAndRecommendedCreatorListRepository.A05 || subscribedAndRecommendedCreatorListRepository.A04) {
            return true;
        }
        return false;
    }

    public final boolean CT5() {
        return AnonymousClass7TE.A1a(this.A03.A0H.getValue());
    }

    public final boolean CWV() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        if (subscribedAndRecommendedCreatorListRepository.A05 || subscribedAndRecommendedCreatorListRepository.A04) {
            return true;
        }
        return false;
    }

    public final boolean isLoading() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        return 0sr.A1P(new EVL[]{subscribedAndRecommendedCreatorListRepository.A01, subscribedAndRecommendedCreatorListRepository.A00}).contains(EVL.IN_PROGRESS);
    }

    public /* synthetic */ C46797DlY(UserSession userSession, SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, boolean z) {
        C273004lm A002 = C272994ll.A00(userSession);
        C314996jB A003 = C314986jA.A00(userSession);
        AnonymousClass7TG.A1O(userSession, subscribedAndRecommendedCreatorListRepository);
        DbW.A1N(A002, 4, A003);
        this.A01 = userSession;
        this.A03 = subscribedAndRecommendedCreatorListRepository;
        this.A08 = z;
        this.A02 = A002;
        this.A04 = A003;
        02z A012 = 106.A01(EKT.A00);
        this.A05 = A012;
        this.A07 = A012;
        AnonymousClass0r6 A013 = AnonymousClass11E.A01(10q.A02(new C66194MHk((Object) this, (AnonymousClass4D7) null, 22), AnonymousClass10H.A03(new GQW(4, (AnonymousClass4D7) null), subscribedAndRecommendedCreatorListRepository.A0D, subscribedAndRecommendedCreatorListRepository.A0H)));
        05F A022 = 10b.A02(0sn.A00, C318116oQ.A00(this), A013, AnonymousClass10A.A01);
        this.A06 = A022;
        C73933PmD pmD = new C73933PmD(this, 47);
        AnonymousClass7TE.A1Z(new C66167MGe((Object) A022, (Object) pmD, (AnonymousClass4D7) null, 36), C318116oQ.A00(this));
    }

    public static final List A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            User user = (User) next;
            FanClubInfoDict B3v = user.A03.B3v();
            if (!(B3v == null || B3v.getFanClubId() == null || user.A02 == 17M.A05)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public final void CgO() {
        AnonymousClass7TE.A1Z(new C66182MGt((Object) this, (AnonymousClass4D7) null, 42), C318116oQ.A00(this));
    }
}

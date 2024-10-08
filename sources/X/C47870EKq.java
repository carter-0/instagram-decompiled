package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;

/* renamed from: X.EKq  reason: case insensitive filesystem */
public final class C47870EKq extends C46776Dl3 {
    public final UserSession A00;
    public final FanClubMemberListCategoryRepository A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final boolean A05;
    public final AnonymousClass12V A06;

    public final void A03(FanClubCategoryType fanClubCategoryType, boolean z, boolean z2) {
        1Eo.A05(((AnonymousClass12U) this.A06).A04, new MGK(this, fanClubCategoryType, (AnonymousClass4D7) null, 2, z, z2), C318116oQ.A00(this));
    }

    public C47870EKq(AnonymousClass12V r9, UserSession userSession, FanClubMemberListCategoryRepository fanClubMemberListCategoryRepository) {
        boolean z;
        AnonymousClass7TG.A1P(fanClubMemberListCategoryRepository, r9);
        this.A01 = fanClubMemberListCategoryRepository;
        this.A00 = userSession;
        this.A06 = r9;
        AnonymousClass11O.A03(C318116oQ.A00(this), 10q.A01(new C66181MGs(this, (AnonymousClass4D7) null, 15), fanClubMemberListCategoryRepository.A02));
        FanClubInfoDict B3v = DbX.A0m(userSession).B3v();
        if (B3v != null) {
            z = DbX.A1a(B3v.BB1());
        } else {
            z = false;
        }
        this.A05 = z;
        0pp A022 = AnonymousClass10H.A02(new C73572Pg2(this, (AnonymousClass4D7) null, 0), fanClubMemberListCategoryRepository.A03, fanClubMemberListCategoryRepository.A04, fanClubMemberListCategoryRepository.A05, this.A00, this.A01);
        this.A04 = 10b.A02(new N4E(), C318116oQ.A00(this), A022, AnonymousClass10A.A01);
        02z A012 = 106.A01(C72691PFv.A00);
        this.A02 = A012;
        this.A03 = A012;
    }
}

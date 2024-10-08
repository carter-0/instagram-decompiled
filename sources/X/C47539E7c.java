package X;

import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1;

/* renamed from: X.E7c  reason: case insensitive filesystem */
public final class C47539E7c extends AnonymousClass8ZF {
    public final AnonymousClass4HW A00 = C335967dq.A00(C59822JZw.A00);
    public final FollowRequestsRepository A01;
    public final C47538E7b A02;
    public final E7Z A03;
    public final C47537E7a A04;
    public final F2F A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C47539E7c(FollowRequestsRepository followRequestsRepository, C47538E7b e7b, E7Z e7z, C47537E7a e7a, F2F f2f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A02 = e7b;
        this.A04 = e7a;
        this.A03 = e7z;
        this.A01 = followRequestsRepository;
        this.A05 = f2f;
        this.A0B = z;
        this.A0C = z2;
        this.A0H = z3;
        this.A0I = z4;
        this.A0G = z5;
        this.A0F = z6;
        this.A0E = z7;
        this.A0D = z8;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A06 = r0;
        this.A07 = 10q.A04(new AnonymousClass0r6[]{0u9.A04(r0), e7b.A08, e7a.A06, e7z.A03});
        02z A10 = DbS.A10(false);
        this.A08 = A10;
        02z A012 = 106.A01((Object) null);
        this.A09 = A012;
        addCloseable(followRequestsRepository);
        e7b.A04(this, true);
        e7a.A04(this, true);
        e7z.A04(this, true);
        if (!this.A0G) {
            C51645Fy4.A01(this, C318116oQ.A00(this), 32);
        }
        0pq A013 = AnonymousClass10H.A01(new FollowRequestsViewModel$state$1(this, (AnonymousClass4D7) null), followRequestsRepository.A06, A10, e7a.A07, A012);
        this.A0A = 10b.A02(new LMY(C65520Luj.A00, AnonymousClass62M.A01, false), C318116oQ.A00(this), A013, AnonymousClass10A.A01);
    }

    public static final void A01(C47539E7c e7c) {
        05G r2 = e7c.A08;
        do {
        } while (!r2.AIY(r2.getValue(), AnonymousClass7TE.A0v()));
        if (!e7c.A0G) {
            e7c.A01.A01.CgS();
        }
    }

    public final C49725F3p A02() {
        return (C49725F3p) this.A02.A06.getValue();
    }

    public static C49725F3p A00(AnonymousClass0eM r0) {
        return ((C47539E7c) r0.getValue()).A02();
    }
}

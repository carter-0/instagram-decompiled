package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ggz  reason: case insensitive filesystem */
public final class C53008Ggz extends 2YL {
    public C57008ILa A00;
    public final PostViewStateRepository A01;
    public final C56505Hzb A02;
    public final C55896HpH A03;
    public final C55705Hm2 A04;
    public final C55829HoC A05;
    public final ILO A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final 1Av A09;
    public final User A0A;
    public final C62320sa A0B;
    public final 05G A0C;
    public final AnonymousClass0Ud A0D;

    public /* synthetic */ C53008Ggz(UserSession userSession, AnonymousClass4DU r24, String str, C62320sa r26) {
        UserSession userSession2 = userSession;
        String str2 = str;
        C54439HDr hDr = new C54439HDr(userSession2, str2, str2);
        0qQ.A0B(userSession2, 0);
        C56505Hzb hzb = (C56505Hzb) userSession2.A01(C56505Hzb.class, new C58707IwG((Object) userSession2, 14));
        PostViewStateRepository postViewStateRepository = (PostViewStateRepository) userSession2.A01(PostViewStateRepository.class, new C58713IwM(userSession2, 18));
        C55705Hm2 hm2 = (C55705Hm2) userSession2.A01(C55705Hm2.class, new C58707IwG((Object) userSession2, 31));
        AnonymousClass4DU r13 = r24;
        C62320sa r7 = r26;
        C51974G9v.A1M(str2, r13, r7);
        C51973G9u.A0s(6, hzb, postViewStateRepository, hm2);
        this.A07 = userSession2;
        this.A08 = r13;
        this.A0B = r7;
        this.A02 = hzb;
        this.A01 = postViewStateRepository;
        this.A04 = hm2;
        User A0Q = AnonymousClass7TF.A0Q(userSession2);
        this.A0A = A0Q;
        this.A09 = 1Au.A00(userSession2);
        this.A05 = new C55829HoC(userSession2, r13, r7, new C58728Iwb(this, 13), new C58142In8(this, 9));
        ILO ilo = new ILO(this);
        this.A06 = ilo;
        C55896HpH hpH = new C55896HpH(ilo, postViewStateRepository, hDr, hm2, userSession2, r13, A0Q, str2, str2, C318116oQ.A00(this));
        this.A03 = hpH;
        02z A10 = DbS.A10(new C61077JwF((C53334GmK) hpH.A0I.getValue(), AnonymousClass7TF.A0Q(userSession2).getUsername(), false));
        this.A0C = A10;
        this.A0D = 10b.A03(A10);
        C318136oS A002 = C318116oQ.A00(this);
        MH8 mh8 = new MH8((Object) this, (AnonymousClass4D7) null, 9);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mh8, A002);
        addCloseable(hDr);
        1Eo.A05(r3, new MH8((Object) hpH, (AnonymousClass4D7) null, 5), hpH.A0F);
    }
}

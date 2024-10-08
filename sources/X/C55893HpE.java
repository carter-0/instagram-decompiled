package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.barcelona.search.data.SearchTopicsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.HpE  reason: case insensitive filesystem */
public final class C55893HpE {
    public final C54437HDm A00;
    public final HDU A01;
    public final PostViewStateRepository A02;
    public final C55597HkH A03;
    public final AnonymousClass6CV A04;
    public final C55598HkI A05;
    public final C56505Hzb A06;
    public final SearchTopicsRepository A07;
    public final C63760L5s A08;
    public final UserSession A09;
    public final 1E8 A0A;
    public final AnonymousClass4DU A0B;
    public final Integer A0C;
    public final String A0D;
    public final 0sP A0E;
    public final 0sP A0F;
    public final C262224Cq A0G;

    public C55893HpE(C63760L5s l5s, UserSession userSession, AnonymousClass4DU r10, Integer num, String str, 0sP r13, 0sP r14, C262224Cq r15) {
        C51972G9s.A1C(r14, str);
        C55597HkH hkH = new C55597HkH(userSession, r10);
        0qQ.A0B(userSession, 0);
        C56505Hzb hzb = (C56505Hzb) userSession.A01(C56505Hzb.class, new C58707IwG((Object) userSession, 14));
        PostViewStateRepository postViewStateRepository = (PostViewStateRepository) userSession.A01(PostViewStateRepository.class, new C58713IwM(userSession, 18));
        HDU hdu = (HDU) userSession.A01(HDU.class, new C58713IwM(userSession, 16));
        C54437HDm hDm = (C54437HDm) userSession.A01(C54437HDm.class, new MMP(userSession, 49));
        1E8 A002 = 1E7.A00(userSession);
        C51972G9s.A1E(hzb, postViewStateRepository);
        C51973G9u.A0u(8, hdu, hDm, A002);
        this.A0E = r13;
        this.A0F = r14;
        this.A08 = l5s;
        this.A0D = str;
        this.A03 = hkH;
        this.A06 = hzb;
        this.A02 = postViewStateRepository;
        this.A01 = hdu;
        this.A00 = hDm;
        this.A0A = A002;
        this.A09 = userSession;
        this.A0B = r10;
        this.A0C = num;
        this.A0G = r15;
        this.A04 = AnonymousClass6CU.A00(userSession);
        this.A05 = (C55598HkI) userSession.A01(C55598HkI.class, C58286IpT.A00);
        this.A07 = (SearchTopicsRepository) userSession.A01(SearchTopicsRepository.class, new C58707IwG((Object) userSession, 30));
    }
}

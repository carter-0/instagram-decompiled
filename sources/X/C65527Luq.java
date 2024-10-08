package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

/* renamed from: X.Luq  reason: case insensitive filesystem */
public final class C65527Luq implements AnonymousClass2sT {
    public final int A00;
    public final Object A01;

    public C65527Luq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DaJ(AnonymousClass3Q2 r12) {
        AnonymousClass3QD r1;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r12, 0);
                if (!r12.A0n() && r12.A6J == (r1 = AnonymousClass3QD.CONFIGURED) && r12.A1f == r1) {
                    C53040GhW ghW = (C53040GhW) this.A01;
                    AnonymousClass3Q2 r13 = ghW.A00;
                    if (r13 != null) {
                        r13.A0Z(ghW.A08);
                    }
                    ghW.A00 = null;
                    C53040GhW.A04(ghW, true);
                    AnonymousClass7TE.A1Z(new MFS(ghW, (AnonymousClass4D7) null, 9), C318116oQ.A00(ghW));
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r12, 0);
                if (r12.A1f == AnonymousClass3QD.UPLOADED) {
                    r12.A0Z(this);
                    FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                    if (FollowersShareFragment.A0Q(followersShareFragment) && C64191LSy.A00(FollowersShareFragment.A00(followersShareFragment), true) > 3) {
                        UserSession A0l = AnonymousClass7TE.A0l(followersShareFragment.A0f);
                        C61822KNl kNl = followersShareFragment.A0C;
                        if (kNl == null) {
                            JTO.A1M();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        String str = kNl.A0M;
                        AnonymousClass3Q2 A012 = LRK.A01(followersShareFragment);
                        if (A012 != null) {
                            String str2 = A012.A3t;
                            long currentTimeMillis = System.currentTimeMillis() - followersShareFragment.A00;
                            boolean A1Z = JTP.A1Z(followersShareFragment);
                            AnonymousClass7TF.A1B(A0l, 0, str);
                            0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(followersShareFragment, A0l), "ig_suggested_tags_media_uploaded");
                            String str3 = A0l.A06;
                            LTQ.A06(A0e, str3, str2);
                            A0e.AAJ(C39829ABa.A00(0, 10, 18), str);
                            A0e.A9F("ig_user_id", 00y.A0n(10, str3));
                            A0e.A9F(TraceFieldType.Duration, Long.valueOf(currentTimeMillis));
                            JTQ.A17(A0e, A1Z);
                            A0e.Cgf();
                            FollowersShareFragment.A0I(followersShareFragment, r12);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(r12, 0);
                ((C249523jv) this.A01).FIG(Integer.valueOf(r12.A03()));
                return;
            default:
                0qQ.A0B(r12, 0);
                ((C249523jv) this.A01).FIG(r12);
                return;
        }
    }
}

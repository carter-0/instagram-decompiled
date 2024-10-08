package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

public final class WXP implements X99 {
    public final /* synthetic */ C15385Ubk A00;

    public WXP(C15385Ubk ubk) {
        this.A00 = ubk;
    }

    public final void D2W(Hashtag hashtag, int i) {
        C15385Ubk ubk = this.A00;
        ubk.A03.A05(ubk.A00, ubk.A06, hashtag, "follow_chaining_suggestions_list");
        AnonymousClass1Nd.A00(ubk.A00).A00(new C2370436c(hashtag, false));
    }

    public final void D2X(User user, int i) {
        0fE.A00(this.A00.A01, -950105942);
    }

    public final void D3H(Hashtag hashtag, int i) {
        C15385Ubk ubk = this.A00;
        ubk.A03.A06(ubk.A00, ubk.A06, hashtag, "follow_chaining_suggestions_list");
        AnonymousClass1Nd.A00(ubk.A00).A00(new C2370436c(hashtag, false));
    }

    public final void D9R(C17674Vc5 vc5, int i) {
        String A002;
        C15385Ubk ubk = this.A00;
        E90 e90 = ubk.A01;
        e90.A04.A00.remove(vc5);
        E90.A00(e90);
        if (C18214Vne.A00(vc5) == AnonymousClass05K.A00) {
            C320226s1 r1 = ubk.A02;
            Hashtag hashtag = vc5.A00;
            hashtag.getClass();
            r1.A00(hashtag, "similar_entity_dismiss_tapped", i);
        } else if (C18214Vne.A00(vc5) == AnonymousClass05K.A01) {
            C320226s1 r12 = ubk.A02;
            User user = vc5.A02;
            user.getClass();
            r12.A01(user, "similar_entity_dismiss_tapped", i);
        } else {
            Integer A003 = C18214Vne.A00(vc5);
            String A004 = AnonymousClass000.A00(127);
            if (A003 == null) {
                A002 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            } else {
                A002 = VEL.A00(A003);
            }
            throw AnonymousClass7TF.A0W(A004, A002);
        }
    }

    public final void Dg8(Hashtag hashtag, int i) {
        C15385Ubk ubk = this.A00;
        if (!(!AnonymousClass06S.A01(ubk.mFragmentManager))) {
            C309516Yo r3 = new C309516Yo(ubk.requireActivity(), ubk.A00);
            DbX.A18(W0l.A00(hashtag, "see_all_suggested_hashtag_fragment", "DEFAULT"), W0l.A01(ubk.A00), r3);
            ubk.A02.A00(hashtag, C273654mx.A00(961), i);
        }
    }

    public final void Dg9(User user, int i) {
        C15385Ubk ubk = this.A00;
        if (!(!AnonymousClass06S.A01(ubk.mFragmentManager))) {
            C309516Yo r5 = new C309516Yo(ubk.requireActivity(), ubk.A00);
            1a1 A02 = C46447Df9.A02();
            UserSession userSession = ubk.A00;
            r5.A0E(A02.A02(userSession, C46474Dfc.A01(userSession, user.getId(), "hashtag_follow_chaining", "see_all_suggested_hashtag_fragment")));
            r5.A0B = "account_recs";
            r5.A04();
            ubk.A02.A01(user, C273654mx.A00(961), i);
        }
    }
}

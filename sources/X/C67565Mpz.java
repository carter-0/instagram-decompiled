package X;

import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.user.model.User;

/* renamed from: X.Mpz  reason: case insensitive filesystem */
public final class C67565Mpz extends C67573Mq7 {
    public Integer A00 = AnonymousClass05K.A00;
    public boolean A01;
    public final UserSession A02;

    public C67565Mpz(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass1QO.A00(userSession);
        this.A02 = userSession;
    }

    public final void A06(C67256Mkq mkq, Integer num) {
        String str;
        CreatorSegmentation Ase;
        0qQ.A0B(mkq, 1);
        if (this.A00 == 0) {
            UserSession userSession = this.A02;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36314167531080161L)) {
                this.A00 = num;
                boolean z = false;
                this.A01 = false;
                1QP r2 = this.A01;
                switch (num.intValue()) {
                    case 1:
                        str = "FIRST_FETCH";
                        break;
                    case 2:
                        str = "LOAD_MORE";
                        break;
                    default:
                        str = "MANUAL_RETRY";
                        break;
                }
                this.A00 = r2.flowStartForMarker(70781771, AnonymousClass7TF.A0j(str), true);
                User A0Q = AnonymousClass7TF.A0Q(userSession);
                16V A0J = A0Q.A0J();
                if (A0J == null) {
                    A0J = 16V.A08;
                }
                A03("account_type", A0J.A01);
                A03("folder_type", mkq.A00);
                AnonymousClass16x AsZ = A0Q.A03.AsZ();
                if (!(AsZ == null || (Ase = AsZ.Ase()) == null)) {
                    A03("creator_segmentation", Ase.toString());
                }
                C67573Mq7.A00(this, new C73672Phl(this, "is_creator", 4, 2Ek.A01(A0Q)));
                C67573Mq7.A00(this, new C73672Phl(this, "is_enhanced_filtering_enabled", 4, C272094k5.A0A(userSession, true)));
                MutedWordsFilterManager A002 = AnonymousClass92E.A00(userSession);
                if (A002 != null) {
                    z = A002.A08();
                }
                C67573Mq7.A00(this, new C73672Phl(this, "hidden_words_enabled", 4, z));
            }
        }
    }

    public final void A05() {
        C67573Mq7.A00(this, new C73669Phi("render_event_interrupted", this, 49));
    }
}

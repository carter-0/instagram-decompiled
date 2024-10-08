package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class KQN extends C65261LqG {
    public final boolean A00 = AnonymousClass7TF.A1S(A01(), 2);
    public final Activity A01;
    public final String A02;
    public final String A03;

    public KQN(Activity activity, Context context, UserSession userSession, 2Er r6) {
        super(context, userSession, r6);
        this.A01 = activity;
        this.A02 = AnonymousClass7TE.A16(context, 2131954219);
        this.A03 = AnonymousClass7TE.A16(context, 2131954221);
    }

    public final void D9U() {
    }

    public final void A07() {
        boolean z;
        String str;
        A04(C62463KgD.IN_PROGRESS);
        UserSession userSession = this.A01;
        C313756gx A002 = C313746gw.A00(userSession);
        int A012 = A01();
        String A022 = A02();
        String A032 = A03();
        2Er r4 = this.A02;
        if (r4 != null) {
            z = r4.COP();
        } else {
            z = false;
        }
        1Ln A0J = DbT.A0J(A002);
        if (DbT.A1Y(A0J)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A1E.put("previously_joined", str);
            DbW.A17(A0J, A002);
            DbV.A1M(A0J, "join_chat_collaborator_attempt");
            A0J.A0p("accept_invite_button");
            JTQ.A1C(A0J, DbZ.A0b(A0J, "thread_view", A022, A032, A012), A1E);
        }
        if (r4 == null || !r4.COP()) {
            LPX.A02(userSession, new C65280LqZ(), A02(), A03(), A01());
        }
        String A023 = A02();
        String A033 = A03();
        int A013 = A01();
        C61500KAf kAf = new C61500KAf(this, 23);
        if (A023 != null) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/accept_collaborator_invite_to_broadcast_chat/");
            DbX.A1M(A0a, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A023);
            1OC A0M = A0a.A0M();
            A0M.A00 = new C61296K1j(kAf, userSession, A023, A033, A013, 0);
            1ES.A03(A0M);
        }
    }

    public final String AtC() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ CharSequence Axd() {
        return null;
    }

    public final /* bridge */ /* synthetic */ CharSequence B7G() {
        2Er r1 = this.A02;
        if (r1 != null) {
            if (r1.COP()) {
                return C51967G9n.A0p(this.A00, 2131954229);
            }
            String Asi = r1.Asi();
            if (Asi != null) {
                Context context = this.A00;
                int i = 2131954230;
                if (this.A00) {
                    i = 2131974606;
                }
                String A0h = DbW.A0h(context, Asi, i);
                if (A0h != null) {
                    return A0h;
                }
            }
        }
        return AnonymousClass7TE.A16(this.A00, 2131954231);
    }

    public final String BqX() {
        return this.A03;
    }

    public final void D7K() {
        2Er r6 = this.A02;
        if (r6 != null) {
            User Ash = r6.Ash();
            if (Ash != null) {
                if (!Ash.A29()) {
                    UserSession userSession = this.A01;
                    if (!182.A06(0Tu.A05, userSession, 36319407391776032L)) {
                        String id = Ash.getId();
                        String C6C = r6.C6C();
                        if (C6C != null) {
                            C61436K7l A002 = C63231Ktc.A00(userSession, new C65258LqD(this), id, C6C);
                            C331127Pr A0W = DbS.A0W(userSession);
                            A0W.A17 = true;
                            A0W.A0U = A002;
                            A0W.A00().A02(this.A01, A002);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                A07();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void Di5() {
        UserSession userSession = this.A01;
        C313756gx A002 = C313746gw.A00(userSession);
        int A012 = A01();
        String A022 = A02();
        String A032 = A03();
        1Ln A0J = DbT.A0J(A002);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A002);
            DbV.A1M(A0J, "decline_chat_collaborator");
            A0J.A0p("decline_invite_button");
            A0J.A0i(DbZ.A0b(A0J, "thread_view", A022, A032, A012));
            A0J.Cgf();
        }
        String A023 = A02();
        String A033 = A03();
        int A013 = A01();
        C61500KAf kAf = new C61500KAf(this, 24);
        if (A023 != null) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/decline_collaborator_invite_to_broadcast_chat/");
            DbX.A1M(A0a, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A023);
            1OC A0M = A0a.A0M();
            A0M.A00 = new C61296K1j(kAf, userSession, A023, A033, A013, 1);
            1ES.A03(A0M);
        }
    }
}

package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class PRA implements G6T {
    public final /* synthetic */ NKQ A00;

    public PRA(NKQ nkq) {
        this.A00 = nkq;
    }

    public final void CtJ(C46448DfA dfA) {
        0qQ.A0B(dfA, 0);
        NKQ nkq = this.A00;
        N4P n4p = nkq.A0A;
        if (n4p != null) {
            AnonymousClass0eM r3 = nkq.A0L;
            if (C69949Nup.A00(AnonymousClass7TE.A0l(r3), n4p, dfA.A0C)) {
                Context requireContext = nkq.requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                FragmentActivity requireActivity = nkq.requireActivity();
                C47167Dri dri = nkq.A09;
                if (dri != null) {
                    FFK.A00(requireContext, requireActivity, nkq, A0l, dri, dfA.A0C, AnonymousClass05K.A0N);
                    int ordinal = dfA.A0C.ordinal();
                    if (ordinal == 1) {
                        C72180Oxp A002 = C69867NtV.A00(AnonymousClass7TE.A0l(r3));
                        int A06 = n4p.A06();
                        C69871NtZ.A00(A002.A00, N4P.A03(n4p), n4p.A0Q, "add_moderators_sheet_rendered", "tap", "add_moderator_button", "thread_details_people", (HashMap) null, A06);
                    } else if (ordinal == 2) {
                        C313756gx r5 = nkq.A01;
                        if (r5 == null) {
                            0qQ.A0F("broadcastChatLogger");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        int A062 = n4p.A06();
                        String A03 = N4P.A03(n4p);
                        String str = n4p.A0Q;
                        1Ln A0J = DbT.A0J(r5);
                        if (DbT.A1Y(A0J)) {
                            DbW.A17(A0J, r5);
                            DbV.A1M(A0J, "add_collaborators_sheet_rendered");
                            A0J.A0p("add_collaborator_button");
                            A0J.A0i(DbZ.A0b(A0J, "thread_details_people", A03, str, A062));
                            A0J.Cgf();
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }
}

package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.P8p  reason: case insensitive filesystem */
public final class C72506P8p implements C332867Wr {
    public final Activity A00;
    public final UserSession A01;
    public final OT9 A02;
    public final AnonymousClass7SN A03;
    public final AnonymousClass0eK A04;

    public C72506P8p(Activity activity, UserSession userSession, OT9 ot9, AnonymousClass7SN r5, AnonymousClass0eK r6) {
        C51973G9u.A0r(1, r6, ot9, r5);
        this.A04 = r6;
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = ot9;
        this.A03 = r5;
    }

    public final boolean AFj(DirectMessageIdentifier directMessageIdentifier) {
        return false;
    }

    public final boolean CHm(DirectMessageIdentifier directMessageIdentifier, C62320sa r22) {
        AnonymousClass7AG r0;
        String str;
        Object obj;
        String str2;
        DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
        0qQ.A0B(directMessageIdentifier2, 0);
        C333517Zg A0V = C66580MXl.A0V(this.A04);
        OT9 ot9 = this.A02;
        UserSession userSession = this.A01;
        C254703su A002 = OT9.A00(ot9, directMessageIdentifier2.A01, "DirectThreadFragment.giveCreatorAIFeedback", false);
        if (!(A002 == null || (r0 = A002.A0Q) == null || (str = r0.A05) == null || str.length() == 0)) {
            String str3 = null;
            Iterator it = A0V.C6l().BRZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(DbS.A0q(obj), A002.A1u)) {
                    break;
                }
            }
            User user = (User) obj;
            AnonymousClass7ZY BSN = A0V.BSN();
            if (BSN.CXL(directMessageIdentifier2)) {
                User A0j = DbT.A0j(userSession);
                String ArO = BSN.ArO(directMessageIdentifier2);
                String AaJ = BSN.AaJ(directMessageIdentifier2);
                this.A03.CLU();
                1px A003 = AnonymousClass1q4.A00();
                Activity activity = this.A00;
                0eP A1L = AnonymousClass7TE.A1L("creator_ai_add_fact_question_extra", AaJ);
                0eP A1L2 = AnonymousClass7TE.A1L("creator_ai_add_fact_answer_extra", ArO);
                0eP A1L3 = AnonymousClass7TE.A1L("creator_ai_bot_response_id_extra", str);
                0eP A1L4 = AnonymousClass7TE.A1L("creator_ai_add_fact_message_igid_extra", A002.A0g());
                0eP A1L5 = AnonymousClass7TE.A1L("creator_ai_add_fact_message_otid_extra", A002.A0f());
                C254763t0 A0U = A002.A0U();
                if (A0U != null) {
                    str3 = A0U.A00;
                }
                0eP A1L6 = AnonymousClass7TE.A1L("creator_ai_add_fact_thread_igid_extra", str3);
                if (user == null || (str2 = user.A03.AaQ()) == null) {
                    str2 = A0j.A03.getFbidV2();
                }
                A003.Cfa(activity, Q21.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AnonymousClass7TE.A1L("creator_ai_creator_fbid", str2)), userSession);
                return true;
            }
        }
        return false;
    }

    public final boolean CHn(DirectMessageIdentifier directMessageIdentifier) {
        return false;
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.ONz  reason: case insensitive filesystem */
public final class C70846ONz {
    public final 0wc A00;

    public final void A00(C69497Nmf nmf, C69494Nmc nmc, String str, String str2, String str3) {
        0qQ.A0B(nmc, 1);
        1Ln A03 = 1Ln.A03(this.A00);
        if (DbT.A1Y(A03)) {
            A03.A0M(nmf, "action");
            A03.A0M(nmc, "source");
            A03.A0M(C69433Nld.A02, "prompt_type");
            A03.A0R("trending_text_prompt_id", str);
            A03.A0R("prompt_id", str3);
            A03.A0R("open_thread_id", str2);
            A03.Cgf();
        }
    }

    public final void A01(C69497Nmf nmf, String str) {
        1Ln A03 = 1Ln.A03(this.A00);
        if (DbT.A1Y(A03)) {
            A03.A0M(nmf, "action");
            A03.A0M(C69494Nmc.NUX, "source");
            A03.A0M(C69433Nld.A02, "prompt_type");
            A03.A0R("open_thread_id", str);
            A03.Cgf();
        }
    }

    public final void A02(C69497Nmf nmf, String str, String str2) {
        1Ln A03 = 1Ln.A03(this.A00);
        if (DbT.A1Y(A03)) {
            A03.A0M(nmf, "action");
            C66583MXo.A11(C69494Nmc.RESPONSE, A03, str, str2);
        }
    }

    public final void A04(DirectPromptTypes directPromptTypes, boolean z) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "direct_question_tab_send");
        Map A0g = C66584MXp.A0g(directPromptTypes);
        if (A0e.isSampled()) {
            if (z) {
                str = "impression";
            } else {
                str = "tap";
            }
            DbS.A1J(A0e, str);
            DbS.A1L(A0e, "question");
            C66583MXo.A18(A0e, A0g);
        }
    }

    public C70846ONz(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A03(DirectPromptTypes directPromptTypes, Boolean bool, String str) {
        0Aj r1;
        int i;
        1Ln r2;
        int ordinal = directPromptTypes.ordinal();
        if (ordinal == 1) {
            r1 = AnonymousClass7TE.A0e(this.A00, "direct_composer_tap_add_yours");
            i = 140;
            r2 = new 1Ln(r1, i);
        } else if (ordinal == 2) {
            r1 = AnonymousClass7TE.A0e(this.A00, "direct_composer_tap_question");
            i = 141;
            r2 = new 1Ln(r1, i);
        } else if (ordinal == 4) {
            r2 = 1Ln.A03(this.A00);
        } else {
            return;
        }
        if (r2.A00 == 146) {
            r2.A0M(C69497Nmf.TAP, "action");
            r2.A0M(C69494Nmc.STICKER_TAB, "source");
            r2.A0M(C69433Nld.A02, "prompt_type");
            r2.A0O("chat_has_recurring_prompt", bool);
            r2.A0R("open_thread_id", str);
        }
        if (DbT.A1Y(r2)) {
            r2.Cgf();
        }
    }
}

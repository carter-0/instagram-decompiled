package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.79D  reason: invalid class name */
public final class AnonymousClass79D extends AnonymousClass799 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final DirectPromptTypes A02;
    public final AnonymousClass7KX A03;
    public final AnonymousClass7KZ A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79D(AnonymousClass0iw r2, UserSession userSession, DirectPromptTypes directPromptTypes, AnonymousClass7KX r5, AnonymousClass7KZ r6, String str, boolean z) {
        super(2131952445);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 5);
        this.A01 = userSession;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = directPromptTypes;
        this.A00 = r2;
        this.A05 = str;
        this.A06 = z;
    }

    public final void DsH(AnonymousClass5Gv r5) {
        0xa r2 = 1Au.A00(this.A01).A01;
        0xY AR4 = r2.AR4();
        AR4.E5Z("add_yours_tool_tip_impression_count", r2.getInt("add_yours_tool_tip_impression_count", 0) + 1);
        AR4.E5c("add_yours_tool_tip_seen_ts", System.currentTimeMillis());
        AR4.apply();
    }
}

package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KWa  reason: case insensitive filesystem */
public final class C62026KWa extends C252733pa {
    public long A00;
    public List A01;
    public final long A02;
    public final UserSession A03;
    public final L4Q A04;
    public final 1Av A05;
    public final C262224Cq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62026KWa(UserSession userSession, C262224Cq r7) {
        super("NotesPromptSuggestionRepository", r7);
        1Av A002 = 1Au.A00(userSession);
        L4Q l4q = new L4Q(userSession, 1vm.A01(userSession));
        AnonymousClass7TG.A1Q(userSession, A002);
        this.A06 = r7;
        this.A03 = userSession;
        this.A05 = A002;
        this.A04 = l4q;
        0xa r1 = A002.A01;
        this.A01 = 00k.A0U(00k.A0X(r1.C1t("suggested_prompts_in_notes")));
        this.A00 = DbW.A06(r1, "suggested_prompts_in_notes_last_updated_timestamp");
        this.A02 = JTR.A0N(TimeUnit.HOURS) * 182.A01(0Tu.A05, userSession, 36607303344068131L);
    }
}

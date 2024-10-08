package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7W1  reason: invalid class name */
public final class AnonymousClass7W1 implements 1wn {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7W1(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1345786145);
        AnonymousClass7MJ r6 = (AnonymousClass7MJ) obj;
        int A032 = AnonymousClass0fD.A03(-1461759744);
        0qQ.A0B(r6, 0);
        C332677Vy r5 = this.A00;
        DirectThreadKey A002 = C332677Vy.A00(r5);
        if (A002 != null) {
            UserSession userSession = r5.A0J;
            if (182.A06(0Tu.A05, userSession, 36324136150445899L)) {
                AnonymousClass3U9 B33 = 1bJ.A00(userSession).B33(A002);
                if (B33 != null) {
                    C70846ONz oNz = new C70846ONz(new 0xG("DirectThreadEventListenerController"), userSession);
                    String str = A002.A00;
                    1Ln A033 = 1Ln.A03(oNz.A00);
                    if (A033.A00.isSampled()) {
                        A033.A0M(C69497Nmf.CAMERA_SHOWN, "action");
                        A033.A0M(C69494Nmc.PROMPT_CREATION, "source");
                        A033.A0M(C69433Nld.A02, "prompt_type");
                        A033.A0R("open_thread_id", str);
                        A033.Cgf();
                    }
                    OQ2.A01(r5.A03.requireActivity(), OQ2.A00(userSession, B33, DirectPromptTypes.ROLL_CALL, 0, r6.A00, r6.A01, true), userSession, (Integer) null);
                }
                i = -243388994;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(2028580427, A03);
            }
        }
        i = -1917784106;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(2028580427, A03);
    }
}

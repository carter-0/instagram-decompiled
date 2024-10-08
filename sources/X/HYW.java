package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.BitSet;
import java.util.LinkedHashMap;

public abstract class HYW {
    public static final void A00(Context context, UserSession userSession, String str, String str2, boolean z) {
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.HALF_SHEET;
        fFt.A02 = C46627Di7.ENABLED;
        C46471DfZ A03 = fFt.A03();
        C307506Qj A00 = C48721Ej6.A00(userSession, false);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(4);
        A1H.put("feedback_surface", "messenger_ai_creation_thread_theme");
        A0w.set(0);
        A1H.put(AnonymousClass000.A00(613), str);
        A0w.set(1);
        A1H.put(AnonymousClass000.A00(152), str2);
        A0w.set(2);
        Context context2 = context;
        A1H.put("on_complete", new Q3B(new C66310MMt(new C58672Ivh(context, 38), 38)));
        A0w.set(3);
        if (A0w.nextClearBit(0) >= 4) {
            C11844ShW shW = new C11844ShW("com.bloks.www.messenger.aicreation.feedback_submit_screen", (String) null, "AiCreationFeedbackBottomSheet", 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, SandboxRepository.CACHE_TTL, true);
            if (z) {
                AnonymousClass7TF.A1B(A03, 0, A00);
                shW.E3a(A03, A00, (JPG) null, true);
                return;
            }
            AnonymousClass7TF.A1B(A00, 1, A03);
            shW.E0s(context2, A03, A00);
            return;
        }
        throw DbT.A0n();
    }
}

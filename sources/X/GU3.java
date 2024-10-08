package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public abstract class GU3 {
    public static final AnonymousClass30S A00(Context context, FragmentActivity fragmentActivity, AnonymousClass4DJ r12, UserSession userSession, 2el r14, AnonymousClass4DU r15, AnonymousClass2lU r16, 1sy r17, AnonymousClass2xS r18, C228182kv r19, C234422xq r20, C249763kK r21, String str, List list) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 3);
        C249763kK r8 = r21;
        1sy r6 = r17;
        ArrayList A00 = C234542yA.A00(context, fragmentActivity, userSession2, new C232852uY(userSession, r8), r15, r16, r6, r19, r8, list);
        if (r6 != 1sy.A0A) {
            A00.add(new GTM(userSession, r6, str));
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass2xS r1 = r18;
        if (!(r18 == null || r1.A0B == null)) {
            A00.add(new AnonymousClass30B(r1));
        }
        C234422xq r13 = r20;
        if (r20 != null && AnonymousClass30D.A07(userSession)) {
            A00.add(new AnonymousClass30E(r13));
        }
        return new AnonymousClass30S(r12, userSession2, r14, A00, A1C);
    }
}

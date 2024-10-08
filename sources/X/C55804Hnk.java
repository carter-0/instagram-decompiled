package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hnk  reason: case insensitive filesystem */
public final class C55804Hnk {
    public final 2el A00;
    public final IPA A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final C230332pS A03;
    public final AnonymousClass2pP A04;

    public C55804Hnk(Context context, UserSession userSession, 2el r6, AnonymousClass4DU r7) {
        this.A00 = r6;
        AnonymousClass2pP A0f = C51972G9s.A0f(userSession);
        this.A04 = A0f;
        C57471IbF ibF = new C57471IbF(context, userSession, r7);
        this.A03 = ibF;
        this.A01 = new IPA(ibF, A0f);
    }
}

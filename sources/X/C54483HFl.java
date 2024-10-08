package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFl  reason: case insensitive filesystem */
public final class C54483HFl extends C232502tp {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass07Z A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54483HFl(Context context, AnonymousClass07Z r13, UserSession userSession) {
        super(context, r13, userSession, (String) null, J4O.A00, (0sP) null, 216);
        AnonymousClass7TG.A1O(context, userSession);
        this.A03 = userSession;
        this.A02 = r13;
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new C73927Pm7(context, 49));
        this.A00 = AnonymousClass0eN.A00(r2, new C73927Pm7(context, 48));
    }

    public final C251263mp A02(C62320sa r3, C62320sa r4) {
        0qQ.A0B(r3, 0);
        return new C53657GsA(this.A03, r3);
    }

    public final int A00() {
        return DbX.A07(this.A00);
    }

    public final int A01() {
        return DbX.A07(this.A01);
    }

    public final String A04() {
        return "LITHO_STORY_AD";
    }
}

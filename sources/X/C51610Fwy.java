package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fwy  reason: case insensitive filesystem */
public final class C51610Fwy implements 0sP {
    public boolean A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        if (context == null) {
            return "";
        }
        if (!this.A00) {
            this.A00 = true;
            C249713kF.A00.A0f(context, this.A01, (String) null);
        }
        String A16 = AnonymousClass7TE.A16(context, 2131973759);
        Integer A0Y = C249713kF.A00.A0Y(this.A01);
        if (A0Y == null || A0Y.intValue() == 0) {
            return A16;
        }
        String A0g = 002.A0g(A16, " · ", 0mp.A06("%d", new Object[]{A0Y}));
        0qQ.A0A(A0g);
        return A0g;
    }

    public C51610Fwy(UserSession userSession) {
        this.A01 = userSession;
    }
}

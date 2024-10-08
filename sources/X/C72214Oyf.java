package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Oyf  reason: case insensitive filesystem */
public final class C72214Oyf implements 0lm {
    public Context A00;
    public String A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final UserSession A05;
    public final OCE A06;
    public final List A07 = AnonymousClass7TE.A1C();

    public final synchronized void onUserSessionWillEnd(boolean z) {
        if (z) {
            OCE oce = this.A06;
            oce.A00.A04(oce.A01);
        }
    }

    public C72214Oyf(Context context, UserSession userSession) {
        this.A00 = context;
        this.A05 = userSession;
        this.A06 = new OCE(002.A0R("direct_share_sheet_recipients_", userSession.A06));
    }
}

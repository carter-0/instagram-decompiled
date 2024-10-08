package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFd  reason: case insensitive filesystem */
public final class C54475HFd extends C232502tp {
    public final Context A00;
    public final AnonymousClass0eM A01 = C58684Ivt.A00(this, 25);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54475HFd(Context context, AnonymousClass07Z r11, UserSession userSession) {
        super(context, r11, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1P(context, userSession);
        this.A00 = context;
    }

    public final C251263mp A02(C62320sa r2, C62320sa r3) {
        0qQ.A0B(r2, 0);
        return new C53635Gro(r2);
    }

    public final int A01() {
        return C51967G9n.A01(DbX.A07(this.A01));
    }

    public final String A04() {
        return "LITHO_OPEN_CAROUSEL_REVIEW_MEDIA_CTA_ROW";
    }
}

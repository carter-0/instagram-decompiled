package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFg  reason: case insensitive filesystem */
public final class C54478HFg extends C232502tp {
    public final AnonymousClass0eM A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54478HFg(Context context, AnonymousClass07Z r11, UserSession userSession, AnonymousClass4DU r13) {
        super(context, r11, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = userSession;
        this.A02 = r13;
        this.A00 = C58684Ivt.A00(context, 26);
    }

    public final C251263mp A02(C62320sa r4, C62320sa r5) {
        0qQ.A0B(r4, 0);
        return new C53688Gsf(this.A01, this.A02, r4);
    }

    public final int A01() {
        return C51967G9n.A01(DbX.A07(this.A00));
    }

    public final String A04() {
        return "POTATO_MEDIA";
    }
}

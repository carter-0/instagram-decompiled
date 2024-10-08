package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.HFh  reason: case insensitive filesystem */
public final class C54479HFh extends C232502tp {
    public final Context A00;
    public final WeakReference A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C58684Ivt(this, 24));
    public final UserSession A03;
    public final A4B A04;
    public final AnonymousClass3YT A05;
    public final AnonymousClass4DU A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54479HFh(Context context, AnonymousClass07Z r13, UserSession userSession, A4B a4b, AnonymousClass3YT r16, AnonymousClass4DU r17) {
        super(context, r13, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = r17;
        this.A04 = a4b;
        this.A05 = r16;
        this.A01 = C51965G9l.A0v(r13);
    }

    public final C251263mp A02(C62320sa r8, C62320sa r9) {
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A03;
        AnonymousClass4DU r5 = this.A06;
        return new C53791GuK(userSession, this.A04, this.A05, new C55496Hie(this), r5, r8);
    }

    public final int A01() {
        return C51967G9n.A01(DbX.A07(this.A02));
    }

    public final String A04() {
        return "AD_CTA";
    }
}

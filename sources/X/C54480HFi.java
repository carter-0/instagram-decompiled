package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFi  reason: case insensitive filesystem */
public final class C54480HFi extends C232502tp {
    public final Context A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C58684Ivt(this, 27));
    public final UserSession A02;
    public final AnonymousClass33B A03;
    public final AnonymousClass3WV A04;
    public final AnonymousClass416 A05;
    public final AnonymousClass4DU A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54480HFi(Context context, AnonymousClass07Z r13, UserSession userSession, AnonymousClass33B r15, AnonymousClass3WV r16, AnonymousClass416 r17, AnonymousClass4DU r18, boolean z) {
        super(context, r13, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1O(context, userSession);
        AnonymousClass3WV r2 = r16;
        AnonymousClass416 r1 = r17;
        C51973G9u.A0s(6, r2, r15, r1);
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = r18;
        this.A07 = z;
        this.A04 = r2;
        this.A03 = r15;
        this.A05 = r1;
    }

    public final C251263mp A02(C62320sa r8, C62320sa r9) {
        0qQ.A0B(r8, 0);
        AnonymousClass4DU r5 = this.A06;
        UserSession userSession = this.A02;
        AnonymousClass33B r2 = this.A03;
        AnonymousClass416 r4 = this.A05;
        return new C53792GuL(userSession, r2, this.A04, r4, r5, r8);
    }

    public final int A01() {
        return C51967G9n.A01(DbX.A07(this.A01));
    }

    public final String A04() {
        return "LITHO_SOCIAL_CONTEXT_BUBBLES";
    }
}

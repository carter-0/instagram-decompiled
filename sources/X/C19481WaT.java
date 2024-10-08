package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.WaT  reason: case insensitive filesystem */
public final class C19481WaT implements AnonymousClass3PN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ C309406Yd A02;
    public final /* synthetic */ C311266cP A03;

    public C19481WaT(Context context, C250973mM r2, C309406Yd r3, C311266cP r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void DOJ(String str) {
        C311266cP r1 = this.A03;
        r1.A0A.remove(this);
        C250973mM r0 = this.A02.A01;
        C250973mM r2 = this.A01;
        if (r0 == r2) {
            UserSession userSession = r1.A02;
            AnonymousClass6VB.A00(userSession).A06(r2.A08(userSession));
        }
    }

    public final void DOW(String str, boolean z) {
        C311266cP r1 = this.A03;
        r1.A0A.remove(this);
        C250973mM r7 = this.A01;
        UserSession userSession = r1.A02;
        r7.A0B(userSession);
        C309406Yd r12 = this.A02;
        if (r12.A01 != r7) {
            return;
        }
        if (!r7.A0E(userSession)) {
            C255773uh A09 = r7.A09(userSession);
            int A022 = r7.A02(userSession);
            int A032 = r7.A03(userSession, A09);
            AnonymousClass6VB.A00(userSession).A07(r7.A08(userSession));
            Context context = this.A00;
            C309426Yf Bz3 = r1.A06.Bz3(A09);
            C309666Zd r13 = r1.A07;
            C310236ae r11 = r1.A09;
            ReelViewerConfig reelViewerConfig = r1.A03;
            AnonymousClass3BQ r9 = r1.A04;
            C307066Or.A01(context, r1.A01, userSession, r1.A08, A09, r7, reelViewerConfig, r9, Bz3, r11, r12, r13, A022, A032);
            return;
        }
        String str2 = str;
        if (str != null && !str2.equals(r1.A00)) {
            r1.A00 = str2;
            LS4.A02(userSession, str2, "reel_empty", r1.A04.A00);
        }
        if (r12.A01 == r7) {
            AnonymousClass6VB.A00(userSession).A06(r7.A08(userSession));
        }
    }
}

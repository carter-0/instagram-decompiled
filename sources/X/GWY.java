package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GWY {
    public C55919Hpg A00;
    public Long A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0JR A04 = new Object();
    public final C46329Dbx A05;
    public final UserSession A06;
    public final GX7 A07;
    public final C3723190i A08;
    public final GT0 A09;
    public final C52526GWd A0A;
    public final GXO A0B = new GXO(this);
    public final GXK A0C;
    public final AnonymousClass4DU A0D;
    public final String A0E;
    public final String A0F;
    public final AnonymousClass0eM A0G = C58675Ivk.A00(this, 18);
    public final AnonymousClass0eM A0H = C58675Ivk.A00(this, 19);
    public final boolean A0I;
    public final Context A0J;
    public final AnonymousClass07i A0K;
    public final C52544GWv A0L;
    public final C228312lJ A0M;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.0JR] */
    public GWY(Context context, AnonymousClass07i r3, C46329Dbx dbx, UserSession userSession, C52544GWv gWv, GX7 gx7, C3723190i r8, GT0 gt0, C52526GWd gWd, GXK gxk, AnonymousClass4DU r12, C228312lJ r13, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 3);
        this.A0J = context;
        this.A0K = r3;
        this.A06 = userSession;
        this.A0D = r12;
        this.A09 = gt0;
        this.A0E = str;
        this.A05 = dbx;
        this.A0I = z;
        this.A0F = str2;
        this.A07 = gx7;
        this.A0C = gxk;
        this.A08 = r8;
        this.A0M = r13;
        this.A0L = gWv;
        this.A0A = gWd;
    }

    public static final void A01(GWY gwy, boolean z, boolean z2, boolean z3) {
        Integer num;
        C233042ur r0;
        GWY gwy2 = gwy;
        if (gwy.A09.A03()) {
            0xI A002 = 0xI.A00(gwy.A0D, "action_bar_feed_retry");
            AnonymousClass6WL.A03(gwy.A0J, A002);
            DbU.A1R(A002, gwy.A06);
        }
        boolean z4 = z2;
        boolean z5 = z3;
        if (z3 || !z2) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        C52544GWv gWv = gwy2.A0L;
        if (!(gWv == null || !G9t.A1b(gwy2.A0G) || (r0 = gWv.A00) == null)) {
            r0.Dpi();
        }
        A00(gwy2, num, true, z, gwy2.A0I, z4, z5);
    }

    public static final void A00(GWY gwy, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str;
        C3723190i r2 = gwy.A08;
        String str2 = gwy.A0E;
        String moduleName = gwy.A0D.getModuleName();
        boolean z6 = gwy.A02;
        String str3 = gwy.A0F;
        boolean z7 = z;
        if (z) {
            str = null;
        } else {
            str = gwy.A09.A05;
        }
        gwy.A09.A00(new C3723390k(r2, num, str2, moduleName, str, str3, 30720, z2, z7, z4, z5, z3, z6));
    }

    public final void A02(boolean z) {
        C228312lJ r0 = this.A0M;
        if (r0 != null) {
            r0.A02();
        }
        if (!C321536uL.A02(this.A06) && !this.A09.A04()) {
            if (GM7.A00 == 0) {
                GM7.A00 = System.currentTimeMillis();
            }
            this.A0A.A05(true, true);
            A01(this, true, true, z);
        }
    }
}

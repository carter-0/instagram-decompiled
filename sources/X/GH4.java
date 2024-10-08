package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GH4 extends 0Yg implements 0sP {
    public final /* synthetic */ C70832Wc A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ S6e A02;
    public final /* synthetic */ GFJ A03;
    public final /* synthetic */ C52129GFx A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GH4(C70832Wc r2, 1Xj r3, S6e s6e, GFJ gfj, C52129GFx gFx, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A09 = z;
        this.A03 = gfj;
        this.A01 = r3;
        this.A05 = z2;
        this.A07 = z3;
        this.A06 = z4;
        this.A02 = s6e;
        this.A08 = z5;
        this.A00 = r2;
        this.A04 = gFx;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A002;
        AnonymousClass37D A012;
        C70762Uy A0a = C51968G9o.A0a(obj);
        if (this.A09) {
            GFJ gfj = this.A03;
            1Xj r10 = this.A01;
            boolean z = this.A05;
            boolean z2 = this.A07;
            boolean z3 = this.A06;
            S6e s6e = this.A02;
            boolean z4 = this.A08;
            Context A003 = C243803a8.A00(this.A00);
            C52129GFx gFx = this.A04;
            A002 = true;
            if (z2 || z3) {
                if (z4) {
                    C52058GDe gDe = gfj.A08;
                    UserSession userSession = gfj.A0A;
                    0qQ.A06(A0a.A01);
                    AnonymousClass3W1 r0 = gDe.A0E;
                    if (r0 != null && r0.A1q) {
                        Dba.A0j(1, userSession, r10);
                        C51974G9v.A1G(userSession, r10);
                    }
                    GED.A00.A05(A003, gDe, userSession, r10, s6e, true);
                    return Boolean.valueOf(A002);
                }
            } else if (!z4) {
                A002 = C52129GFx.A00(A0a, gFx);
                return Boolean.valueOf(A002);
            } else if (z && ((A012 = AnonymousClass37D.A00.A01(C61270mF.A00(A003))) == null || A012.A0Y())) {
                C52058GDe gDe2 = gfj.A08;
                UserSession userSession2 = gfj.A0A;
                0qQ.A06(A0a.A01);
                AnonymousClass3W1 r02 = gDe2.A0E;
                if (r02 != null && r02.A1q) {
                    Dba.A0j(1, userSession2, r10);
                    C51974G9v.A1G(userSession2, r10);
                }
                GED.A00.A05(A003, gDe2, userSession2, r10, s6e, true);
            }
        } else if (!this.A07 && !this.A06) {
            A002 = C52129GFx.A00(A0a, this.A04);
            return Boolean.valueOf(A002);
        }
        A002 = false;
        return Boolean.valueOf(A002);
    }
}

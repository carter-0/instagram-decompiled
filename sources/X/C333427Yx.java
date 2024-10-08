package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.thread.infra.open.DirectThreadHeaderRepository$updateViewModel$1;
import com.instagram.user.model.User;

/* renamed from: X.7Yx  reason: invalid class name and case insensitive filesystem */
public final class C333427Yx extends C252733pa implements C333437Yy {
    public AnonymousClass7LZ A00;
    public AnonymousClass2Ep A01;
    public int A02;
    public C329967Kx A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final UserSession A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A00(0eO.A03, new AnonymousClass9L4(this, 47));
    public final 05G A0C;
    public final Capabilities A0D;
    public final String A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C333427Yx(UserSession userSession, Capabilities capabilities, String str, boolean z, boolean z2) {
        super("DirectThreadHeaderRepository", AnonymousClass43D.A01(1806075965, 3));
        this.A0A = userSession;
        this.A0D = capabilities;
        this.A0G = z;
        this.A0H = z2;
        this.A0E = str;
        02z A012 = 106.A01((Object) null);
        this.A0C = A012;
        this.A0F = 10b.A03(A012);
    }

    public static final void A01(C333427Yx r7, boolean z) {
        AnonymousClass2Ep r6;
        C329967Kx r5;
        C333427Yx r4 = r7;
        if (182.A06(0Tu.A05, r7.A0A, 36329053887676168L) && (r6 = r7.A01) != null && (r5 = r7.A03) != null) {
            if (z) {
                r7.A00 = A00(r7, r5, r6);
            }
            C262224Cq r2 = r7.A01;
            DirectThreadHeaderRepository$updateViewModel$1 directThreadHeaderRepository$updateViewModel$1 = new DirectThreadHeaderRepository$updateViewModel$1(r4, r5, r6, (AnonymousClass4D7) null, z);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, directThreadHeaderRepository$updateViewModel$1, r2);
        }
    }

    public final void D9Z() {
        A01(this, false);
    }

    public final void DrB(C329967Kx r3) {
        if (!0qQ.A0K(this.A03, r3)) {
            this.A03 = r3;
            A01(this, false);
        }
    }

    public static final AnonymousClass7LZ A00(C333427Yx r24, C329967Kx r25, AnonymousClass2Ep r26) {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        C333427Yx r0 = r24;
        UserSession userSession = r0.A0A;
        Capabilities capabilities = r0.A0D;
        AnonymousClass2Ep r13 = r26;
        boolean isPending = r13.isPending();
        boolean CUG = r13.CUG();
        boolean A042 = C66640Ma9.A04(r13.BRZ(), r13.BSK(), isPending, CUG);
        boolean booleanValue = ((Boolean) r0.A0B.getValue()).booleanValue();
        boolean z = r0.A06;
        int i = r0.A02;
        boolean z2 = true;
        if (r13.CUG() || r13.BRZ().size() != 1 || !((User) r13.BRZ().get(0)).A2R()) {
            z2 = false;
        }
        boolean z3 = r0.A05;
        boolean z4 = r0.A07;
        boolean z5 = r0.A0G;
        boolean z6 = r0.A0H;
        return C327837Cj.A00(context, userSession, capabilities, r25, r13, r0.A0E, i, A042, booleanValue, z, z2, z3, z4, z5, z6, r0.A08, r0.A09, r0.A04);
    }

    public final AnonymousClass0Ud AvG() {
        return this.A0F;
    }

    public final AnonymousClass7LZ BHC() {
        return this.A00;
    }

    public final void CyK(boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (this.A08 != z) {
            this.A08 = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.A09 != z2) {
            this.A09 = z2;
            z4 = true;
        }
        if (this.A04 != z3) {
            this.A04 = z3;
        } else if (!z4) {
            return;
        }
        A01(this, false);
    }

    public final void CzH(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            A01(this, false);
        }
    }

    public final void DEx(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            A01(this, false);
        }
    }

    public final void DMf(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A01(this, false);
        }
    }

    public final void DNv(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            A01(this, false);
        }
    }
}

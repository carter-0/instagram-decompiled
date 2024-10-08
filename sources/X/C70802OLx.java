package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.OLx  reason: case insensitive filesystem */
public final class C70802OLx {
    public final float A00;
    public final Context A01;
    public final UserSession A02;
    public final DirectShareTarget A03;
    public final User A04;
    public final ONV A05;
    public final NJB A06;
    public final C74488Pvi A07;
    public final NHU A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final String A00(String str) {
        int i;
        if ("evidence_confirmation".equals(str)) {
            boolean A082 = C49960FGs.A08(this.A02, this.A03, this.A04, this.A0D);
            boolean z = this.A0E;
            Context context = this.A01;
            if (A082) {
                i = 2131962794;
                if (z) {
                    i = 2131962795;
                }
            } else {
                i = 2131962798;
                if (z) {
                    i = 2131962799;
                }
            }
            return context.getString(i);
        }
        C70754OKa oKa = this.A08.A00().A0F;
        if (oKa != null) {
            return oKa.A00;
        }
        return null;
    }

    public C70802OLx(Context context, UserSession userSession, DirectShareTarget directShareTarget, User user, ONV onv, NJB njb, C74488Pvi pvi, NHU nhu, String str, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = njb;
        this.A01 = context;
        this.A04 = user;
        this.A08 = nhu;
        this.A03 = directShareTarget;
        this.A02 = userSession;
        this.A07 = pvi;
        this.A09 = str;
        this.A05 = onv;
        this.A0C = z;
        this.A00 = f;
        this.A0D = z2;
        this.A0A = nhu.A00().A0H;
        this.A0B = z3;
        this.A0E = z4;
    }
}

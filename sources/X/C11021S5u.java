package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.S5u  reason: case insensitive filesystem */
public final class C11021S5u {
    public final C270254gR A00;
    public final UserSession A01;
    public final WeakReference A02;

    public final void A00(RRP rrp) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        if (rrp != null) {
            rrp.A0I = "PROMPTED_AUTOMATIC_AUTOFILL";
            C11265SHz A002 = rrp.A00();
            WeakReference weakReference = this.A02;
            C7580QKv A0Q = Pxe.A0Q(weakReference);
            Bundle bundle4 = null;
            if (A0Q != null) {
                bundle = A0Q.A02();
            } else {
                bundle = null;
            }
            C270254gR r2 = this.A00;
            SUR.A0A(bundle, r2, A002);
            rrp.A0I = "ACCEPTED_AUTOMATIC_AUTOFILL";
            C11265SHz A003 = rrp.A00();
            C7580QKv A0Q2 = Pxe.A0Q(weakReference);
            if (A0Q2 != null) {
                bundle2 = A0Q2.A02();
            } else {
                bundle2 = null;
            }
            SUR.A0A(bundle2, r2, A003);
            rrp.A01("enabled_automatic_autofill", "true");
            rrp.A0I = "PROMPTED_AUTOFILL";
            C11265SHz A004 = rrp.A00();
            C7580QKv A0Q3 = Pxe.A0Q(weakReference);
            if (A0Q3 != null) {
                bundle3 = A0Q3.A02();
            } else {
                bundle3 = null;
            }
            SUR.A0A(bundle3, r2, A004);
            rrp.A0I = "ACCEPTED_AUTOFILL";
            C11265SHz A005 = rrp.A00();
            C7580QKv A0Q4 = Pxe.A0Q(weakReference);
            if (A0Q4 != null) {
                bundle4 = A0Q4.A02();
            }
            SUR.A0A(bundle4, r2, A005);
        }
    }

    public final boolean A01() {
        if (!this.A00.A04.A0A(false) || !AnonymousClass7TE.A0q(this.A01).getBoolean("contact_autofill_eligible_for_automatic_autofill", false)) {
            return false;
        }
        return true;
    }

    public C11021S5u(C270254gR r1, UserSession userSession, WeakReference weakReference) {
        AnonymousClass7TG.A1P(userSession, r1);
        this.A02 = weakReference;
        this.A00 = r1;
        this.A01 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (X.S8I.A00(r5, new X.C61084JwM(r4, r3, r4, 3)) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r6 = this;
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0038
            X.4gR r0 = r6.A00
            X.RzL r5 = r0.A00
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r1 = 3
            X.JwM r0 = new X.JwM
            r0.<init>((java.lang.Integer) r4, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r1)
            boolean r2 = X.S8I.A01(r5, r0)
            X.JwM r0 = new X.JwM
            r0.<init>((java.lang.Integer) r4, (java.lang.Integer) r4, (java.lang.Integer) r4, (int) r1)
            boolean r0 = X.S8I.A00(r5, r0)
            if (r0 != 0) goto L_0x0033
            X.JwM r0 = new X.JwM
            r0.<init>((java.lang.Integer) r4, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r1)
            boolean r1 = X.S8I.A00(r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r2 == 0) goto L_0x003a
            if (r0 != 0) goto L_0x003a
        L_0x0038:
            r0 = 0
            return r0
        L_0x003a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11021S5u.A02():boolean");
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ne3  reason: case insensitive filesystem */
public final class C69066Ne3 extends C252733pa {
    public final Context A00;
    public final AnonymousClass4HW A01 = C335967dq.A00(AnonymousClass4HU.A00);
    public final UserSession A02;
    public final C70936OSj A03;
    public final 2Dm A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C69066Ne3 r8, X.N2K r9) {
        /*
            X.3su r4 = r9.A04
            int r7 = r9.A02
            r5 = 0
            r6 = 6
            r1 = 1
            if (r7 <= r6) goto L_0x005f
            android.content.Context r0 = r8.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131964239(0x7f13314f, float:1.9565254E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x0018:
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            X.0qQ.A0A(r0)
        L_0x0021:
            r3 = 0
            if (r4 == 0) goto L_0x003f
            com.instagram.common.session.UserSession r1 = r8.A02
            java.lang.String r1 = r1.A06
            boolean r1 = X.AnonymousClass7F3.A01(r4, r1)
            if (r1 != 0) goto L_0x0047
            android.content.Context r6 = r8.A00
            long r1 = r4.C7c()
            double r3 = (double) r1
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            java.lang.String r3 = X.1G0.A04(r6, r3)
        L_0x003f:
            X.0qQ.A0B(r0, r5)
            r9.A01 = r0
            r9.A00 = r3
            return
        L_0x0047:
            X.2FW r2 = r4.A10
            X.2FW r1 = X.2FW.A1g
            if (r2 != r1) goto L_0x003f
            boolean r1 = r9.A08
            if (r1 != 0) goto L_0x003f
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131964240(0x7f133150, float:1.9565256E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x003f
        L_0x005f:
            if (r7 <= r1) goto L_0x0071
            android.content.Context r0 = r8.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131964238(0x7f13314e, float:1.9565252E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0018
        L_0x0071:
            java.lang.String r0 = r9.A06
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69066Ne3.A00(X.Ne3, X.N2K):void");
    }

    public C69066Ne3(Context context, AnonymousClass0iw r4, UserSession userSession) {
        super("Direct", AnonymousClass43D.A00(1316016357));
        this.A02 = userSession;
        this.A00 = context;
        this.A04 = 1bJ.A00(userSession);
        this.A03 = new C70936OSj(r4, userSession);
        02z A012 = 106.A01(NW4.A00);
        this.A05 = A012;
        this.A06 = 10b.A03(A012);
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class HDL extends AnonymousClass3CO {
    public boolean A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final Context A05;
    public final AnonymousClass2lP A06 = new IWC(this);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cn8(X.AnonymousClass9J0 r14, X.C233632w4 r15, X.C238523Ce r16, java.lang.String r17, java.lang.String r18, double r19, boolean r21) {
        /*
            r13 = this;
            r8 = r15
            r9 = r16
            X.DbY.A1S(r15, r9)
            r3 = 1
            r11 = r17
            r12 = r18
            if (r14 == 0) goto L_0x007b
            boolean r0 = r14.A02
            if (r0 != r3) goto L_0x007b
            X.3kU r1 = r13.A03
            java.util.LinkedList r0 = r1.A02
            boolean r2 = r0.isEmpty()
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1.A08()
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x0031
            X.0eM r0 = r13.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x007a
        L_0x0031:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A05
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x007a
            X.1PX r0 = r13.A01
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x007a
            if (r2 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x007a
        L_0x0045:
            r13.A00 = r3
            X.0eM r2 = r13.A01
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r2)
            X.02m r1 = (X.02m) r1
            r0 = 424097382(0x19473666, float:1.02990445E-23)
            r1.markerStart(r0)
            X.0eM r0 = r13.A04
            java.lang.Object r3 = r0.getValue()
            X.2lS r3 = (X.C228352lS) r3
            if (r3 == 0) goto L_0x007a
            android.content.Context r0 = r13.A05
            android.content.Context r4 = X.DbT.A05(r0)
            java.lang.Object r7 = r14.A00
            X.5K5 r7 = (X.AnonymousClass5K5) r7
            java.lang.String r10 = r14.A01
            if (r10 != 0) goto L_0x006f
            java.lang.String r10 = ""
        L_0x006f:
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r2)
            X.02m r5 = (X.02m) r5
            X.2lP r6 = r13.A06
            r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x007a:
            return
        L_0x007b:
            super.Cn8(r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDL.Cn8(X.9J0, X.2w4, X.3Ce, java.lang.String, java.lang.String, double, boolean):void");
    }

    public HDL(Context context, AnonymousClass07i r4, UserSession userSession, C233172vA r6, AnonymousClass3BQ r7, AnonymousClass3CK r8, 1PX r9, C233212vI r10, C249863kU r11, C249763kK r12, String str) {
        super(context, r4, userSession, r6, r7, r8, r9, r10, r11, r12, str);
        this.A05 = context;
        this.A03 = AnonymousClass0eN.A01(new MJ1(userSession, 16));
        this.A04 = AnonymousClass0eN.A01(new MJ1(userSession, 17));
        this.A01 = AnonymousClass0eN.A01(new MJ1(userSession, 14));
        this.A02 = AnonymousClass0eN.A01(new MJ1(userSession, 15));
    }
}

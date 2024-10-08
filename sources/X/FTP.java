package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class FTP implements 2IR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C331157Pu A03;
    public final /* synthetic */ C331127Pr A04;
    public final /* synthetic */ AnonymousClass17A A05;
    public final /* synthetic */ G7R A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onFailure(Throwable th) {
    }

    public FTP(Context context, UserSession userSession, C331157Pu r3, C331127Pr r4, AnonymousClass17A r5, G7R g7r, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = r5;
        this.A08 = z;
        this.A00 = i;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = g7r;
        this.A09 = z2;
        this.A07 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r2.getCoercedBooleanField(0, r1) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            X.3JD r15 = (X.AnonymousClass3JD) r15
            android.content.Context r3 = r14.A01
            com.instagram.common.session.UserSession r4 = r14.A02
            X.17A r7 = r14.A05
            boolean r10 = r14.A08
            int r9 = r14.A00
            X.7Pu r5 = r14.A03
            X.7Pr r6 = r14.A04
            X.G7R r8 = r14.A06
            boolean r11 = r14.A09
            if (r15 == 0) goto L_0x0032
            java.lang.Object r2 = r15.Bny()
            if (r2 == 0) goto L_0x0032
            X.3lr r2 = (X.C250663lr) r2
            r0 = 4282(0x10ba, float:6.0E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            boolean r0 = r2.getCoercedBooleanField(r0, r1)
            r12 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r12 = 0
        L_0x0033:
            boolean r13 = r14.A07
            X.FCZ.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTP.onSuccess(java.lang.Object):void");
    }
}

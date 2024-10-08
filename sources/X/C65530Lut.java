package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Lut  reason: case insensitive filesystem */
public final class C65530Lut implements AnonymousClass2sT {
    public boolean A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C69410Nkp A04;
    public final /* synthetic */ DirectThreadKey A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r7.A13() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaJ(X.AnonymousClass3Q2 r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7.A4w
            if (r0 == 0) goto L_0x000c
            boolean r0 = r7.A5Q
            if (r0 == 0) goto L_0x0019
        L_0x000c:
            boolean r0 = r7.A0n()
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7.A13()
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0023
            r0 = 1
            r6.A00 = r0
        L_0x0023:
            X.3QD r1 = r7.A1f
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 == r0) goto L_0x0031
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED
            if (r1 != r0) goto L_0x003f
            boolean r0 = r7.A53
            if (r0 == 0) goto L_0x003f
        L_0x0031:
            r7.A0Z(r6)
            com.instagram.model.direct.DirectThreadKey r0 = r6.A05
            java.lang.String r3 = r0.A00
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x0057
        L_0x003e:
            return
        L_0x003f:
            boolean r0 = r7.A4w
            if (r0 == 0) goto L_0x0047
            boolean r0 = r7.A5Q
            if (r0 == 0) goto L_0x003e
        L_0x0047:
            boolean r0 = r7.A0n()
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7.A13()
            if (r0 != 0) goto L_0x003e
            r7.A0Z(r6)
            return
        L_0x0057:
            com.instagram.common.session.UserSession r2 = r6.A03
            X.Nkp r0 = r6.A04
            java.lang.String r4 = X.DbT.A10(r0)
            java.lang.Long r0 = r7.A2I
            java.lang.String r5 = java.lang.String.valueOf(r0)
            android.view.View r0 = r6.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            android.graphics.Bitmap r1 = r6.A01
            X.C64176LSd.A01(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65530Lut.DaJ(X.3Q2):void");
    }

    public C65530Lut(Bitmap bitmap, View view, UserSession userSession, C69410Nkp nkp, DirectThreadKey directThreadKey) {
        this.A05 = directThreadKey;
        this.A03 = userSession;
        this.A04 = nkp;
        this.A02 = view;
        this.A01 = bitmap;
    }
}

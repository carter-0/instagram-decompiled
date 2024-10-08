package X;

import java.util.Map;

/* renamed from: X.ShE  reason: case insensitive filesystem */
public final class C11828ShE implements C13689Tf6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11828ShE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Cy0() {
        if (this.A00 == 0) {
            C12178SoT soT = (C12178SoT) this.A02;
            soT.A03.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_stopped");
            long j = soT.A00;
            if (j <= 16000) {
                soT.A00 = 4 * j;
                soT.A02.postDelayed(new TG0(this, soT), j);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cy1(X.C11230SGo r8) {
        /*
            r7 = this;
            int r1 = r7.A00
            r0 = 0
            X.0qQ.A0B(r8, r0)
            int r0 = r8.A00
            if (r1 == 0) goto L_0x0066
            java.lang.Object r3 = r7.A02
            X.SId r3 = (X.C11266SId) r3
            if (r0 != 0) goto L_0x003f
            X.LCD r0 = r3.A07
            X.90R r0 = r0.A00()
            X.0xa r2 = r0.A00
            java.lang.String r1 = "ig_in_app_purchases_synchronization_required"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
        L_0x0026:
            X.RFl r1 = X.C8918RFl.SUCCESSFUL
        L_0x0028:
            java.lang.StringBuilder r2 = X.C51975G9x.A0l(r1)
            java.lang.String r0 = "Setup complete: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r1, r0, r2)
            java.lang.String r0 = "DCP"
            X.0KC.A0C(r0, r2)
            X.Tca r0 = r3.A03
            if (r0 == 0) goto L_0x003e
            r0.Djb(r1)
        L_0x003e:
            return
        L_0x003f:
            java.lang.String r1 = r8.A01
            X.0qQ.A07(r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            X.SKS.A01(r1, r0)
            X.SKS.A00(r8, r0)
            int r2 = r8.A00
            X.RFl r1 = X.C8918RFl.IAB_INIT_FAILED
            r0 = 1
            if (r2 == 0) goto L_0x0026
            if (r2 == r0) goto L_0x0063
            r0 = 3
            if (r2 == r0) goto L_0x0060
            r0 = 7
            if (r2 != r0) goto L_0x0028
            X.RFl r1 = X.C8918RFl.PENDING_PURCHASE_ON_SKU
            goto L_0x0028
        L_0x0060:
            X.RFl r1 = X.C8918RFl.BILLING_UNAVAILABLE
            goto L_0x0028
        L_0x0063:
            X.RFl r1 = X.C8918RFl.USER_CANCELLED_PAYMENT
            goto L_0x0028
        L_0x0066:
            java.lang.Object r6 = r7.A02
            X.SoT r6 = (X.C12178SoT) r6
            X.SPQ r3 = r6.A03
            if (r0 != 0) goto L_0x0082
            r2 = 0
            X.TjB r1 = r3.A00
            java.lang.String r0 = "client_init_iap_store_connection_success"
            r1.Cgp(r2, r2, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.A00 = r0
            java.lang.Object r0 = r7.A01
            X.Tf6 r0 = (X.C13689Tf6) r0
            r0.Cy1(r8)
            return
        L_0x0082:
            java.lang.String r1 = r8.A01
            X.0qQ.A07(r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            X.SKS.A01(r1, r0)
            X.SKS.A00(r8, r0)
            X.TjB r3 = r3.A00
            java.util.LinkedHashMap r2 = X.0Yt.A03(r0)
            X.SKS.A00(r8, r2)
            r1 = 0
            java.lang.String r0 = "client_init_iap_store_connection_fail"
            r3.Cgp(r2, r1, r0)
            java.lang.Object r0 = r7.A01
            X.Tf6 r0 = (X.C13689Tf6) r0
            r0.Cy1(r8)
            long r2 = r6.A00
            r4 = 16000(0x3e80, double:7.905E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x003e
            r0 = 4
            long r0 = r0 * r2
            r6.A00 = r0
            android.os.Handler r1 = r6.A02
            X.TG0 r0 = new X.TG0
            r0.<init>(r7, r6)
            r1.postDelayed(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11828ShE.Cy1(X.SGo):void");
    }
}

package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.TNb  reason: case insensitive filesystem */
public final /* synthetic */ class C13143TNb implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ C13527Tbw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C13143TNb(STX stx, C13527Tbw tbw, String str, List list) {
        this.A00 = stx;
        this.A02 = str;
        this.A03 = list;
        this.A01 = tbw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        X.Pxf.A1C(X.C10139RnG.A00, r2, r1, 8);
        r7 = "Item is unavailable for purchase.";
        r9 = null;
        r4 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r24 = this;
            r0 = r24
            X.STX r13 = r0.A00
            java.lang.String r15 = r0.A02
            java.util.List r12 = r0.A03
            X.Tbw r11 = r0.A01
            r17 = 0
            java.lang.String r10 = "BillingClient"
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            int r8 = r12.size()
            r1 = 0
        L_0x0017:
            java.lang.String r7 = "Error trying to decode SkuDetails."
            java.lang.String r16 = "Item is unavailable for purchase."
            if (r1 >= r8) goto L_0x008f
            int r6 = r1 + 20
            r0 = r6
            if (r6 <= r8) goto L_0x0023
            r0 = r8
        L_0x0023:
            java.util.List r0 = r12.subList(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ITEM_ID_LIST"
            r5.putStringArrayList(r0, r1)
            java.lang.String r14 = r13.A0G
            java.lang.String r4 = "playBillingLibraryVersion"
            r5.putString(r4, r14)
            r3 = 8
            boolean r0 = r13.A07     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.play_billing.zzs r0 = r13.A0K     // Catch:{ Exception -> 0x007a }
            r18 = r0
            android.content.Context r0 = r13.A01     // Catch:{ Exception -> 0x007a }
            java.lang.String r21 = r0.getPackageName()     // Catch:{ Exception -> 0x007a }
            int r2 = r13.A00     // Catch:{ Exception -> 0x007a }
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()     // Catch:{ Exception -> 0x007a }
            r0 = 9
            if (r2 < r0) goto L_0x005f
            r1.putString(r4, r14)     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = "enablePendingPurchases"
            r0 = 1
            r1.putBoolean(r2, r0)     // Catch:{ Exception -> 0x007a }
        L_0x005f:
            r23 = 10
            r19 = r5
            r20 = r1
            r22 = r15
            android.os.Bundle r2 = r18.FQE(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x007a }
            goto L_0x0093
        L_0x006c:
            com.google.android.gms.internal.play_billing.zzs r2 = r13.A0K     // Catch:{ Exception -> 0x007a }
            r1 = 3
            android.content.Context r0 = r13.A01     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x007a }
            android.os.Bundle r2 = r2.FQB(r5, r0, r15, r1)     // Catch:{ Exception -> 0x007a }
            goto L_0x0093
        L_0x007a:
            r1 = move-exception
            java.lang.String r0 = "querySkuDetailsAsync got a remote exception (try to reconnect)."
            X.SUN.A0B(r10, r0, r1)
            X.TjE r2 = r13.A02
            r1 = 43
            X.SGo r0 = X.C10139RnG.A0D
            X.Pxf.A1C(r0, r2, r1, r3)
            r4 = -1
            java.lang.String r7 = "Service connection is disconnected."
            r9 = 0
            goto L_0x00a8
        L_0x008f:
            java.lang.String r7 = ""
            r4 = 0
            goto L_0x00a8
        L_0x0093:
            if (r2 != 0) goto L_0x00b2
            java.lang.String r0 = "querySkuDetailsAsync got null sku details list"
            X.SUN.A0A(r10, r0)
            X.TjE r2 = r13.A02
            r1 = 44
        L_0x009f:
            X.SGo r0 = X.C10139RnG.A00
            X.Pxf.A1C(r0, r2, r1, r3)
            r7 = r16
            r9 = 0
            r4 = 4
        L_0x00a8:
            X.SGo r0 = X.C10139RnG.A0J
            X.SGo r0 = X.C11230SGo.A00(r7, r4)
            r11.DlO(r0, r9)
            return r17
        L_0x00b2:
            java.lang.String r1 = "DETAILS_LIST"
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x00db
            int r4 = X.SUN.A02(r2, r10)
            java.lang.String r7 = X.SUN.A07(r2, r10)
            if (r4 == 0) goto L_0x0127
            java.lang.String r0 = "getSkuDetails() failed. Response code: "
            java.lang.String r0 = X.002.A0O(r0, r4)
            X.SUN.A0A(r10, r0)
            X.TjE r2 = r13.A02
            r1 = 23
            X.SGo r0 = X.C10139RnG.A0J
            X.SGo r0 = X.C11230SGo.A00(r7, r4)
            X.Pxf.A1C(r0, r2, r1, r3)
            goto L_0x00a8
        L_0x00db:
            java.util.ArrayList r5 = r2.getStringArrayList(r1)
            if (r5 != 0) goto L_0x00ec
            java.lang.String r0 = "querySkuDetailsAsync got null response list"
            X.SUN.A0A(r10, r0)
            X.TjE r2 = r13.A02
            r1 = 46
            goto L_0x009f
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x013d
            java.lang.Object r0 = r5.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            com.android.billingclient.api.SkuDetails r2 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x0111 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "Got sku details: "
            java.lang.String r0 = r0.concat(r1)
            X.SUN.A09(r10, r0)
            r9.add(r2)
            int r4 = r4 + 1
            goto L_0x00ed
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "Got a JSON exception trying to decode SkuDetails."
            X.SUN.A0B(r10, r0, r1)
            X.TjE r4 = r13.A02
            r2 = 47
            r1 = 6
            X.SGo r0 = X.C10139RnG.A0J
            X.SGo r0 = X.C11230SGo.A00(r7, r1)
            X.Pxf.A1C(r0, r4, r2, r3)
            r9 = 0
            goto L_0x013a
        L_0x0127:
            java.lang.String r0 = "getSkuDetails() returned a bundle with neither an error nor a detail list."
            X.SUN.A0A(r10, r0)
            X.TjE r4 = r13.A02
            r2 = 45
            r1 = 6
            X.SGo r0 = X.C10139RnG.A0J
            X.SGo r0 = X.C11230SGo.A00(r7, r1)
            X.Pxf.A1C(r0, r4, r2, r3)
        L_0x013a:
            r4 = 6
            goto L_0x00a8
        L_0x013d:
            r1 = r6
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13143TNb.call():java.lang.Object");
    }
}

package com.facebook.browser.lite.extensions.commercecheckout.models;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class ShopsLiteLineItemDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer> r2 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x006d }
            A00 = r0     // Catch:{ all -> 0x006d }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x006d }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            goto L_0x0060
        L_0x0018:
            int r1 = r4.hashCode()     // Catch:{ Exception -> 0x0064 }
            r0 = -1285004149(0xffffffffb368648b, float:-5.4108153E-8)
            if (r1 == r0) goto L_0x004b
            r0 = -238100612(0xfffffffff1cedf7c, float:-2.0487708E30)
            if (r1 == r0) goto L_0x003b
            r0 = -82113408(0xfffffffffb1b0c80, float:-8.0505954E35)
            if (r1 != r0) goto L_0x0061
            java.lang.String r1 = "variantId"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0061
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0064 }
            goto L_0x005a
        L_0x003b:
            java.lang.String r1 = "requiresShipping"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0061
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0064 }
            goto L_0x005a
        L_0x004b:
            java.lang.String r1 = "quantity"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0061
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0064 }
        L_0x005a:
            java.util.Map r0 = A00     // Catch:{ all -> 0x006d }
            r0.put(r4, r1)     // Catch:{ all -> 0x006d }
            goto L_0x0016
        L_0x0060:
            return r1
        L_0x0061:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            return r0
        L_0x0064:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x006d }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItemDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public ShopsLiteLineItemDeserializer() {
        this.A00 = ShopsLiteLineItem.class;
    }
}

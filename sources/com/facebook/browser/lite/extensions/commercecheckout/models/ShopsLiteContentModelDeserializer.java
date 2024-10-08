package com.facebook.browser.lite.extensions.commercecheckout.models;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class ShopsLiteContentModelDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        A00.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer> r3 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.class
            monitor-enter(r3)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0087 }
            A00 = r0     // Catch:{ all -> 0x0087 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0087 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            goto L_0x007a
        L_0x0018:
            int r0 = r5.hashCode()     // Catch:{ Exception -> 0x007e }
            switch(r0) {
                case -1857612946: goto L_0x0065;
                case -1816387540: goto L_0x004f;
                case -1698419884: goto L_0x003f;
                case -941747028: goto L_0x002f;
                case -832507385: goto L_0x0020;
                default: goto L_0x001f;
            }     // Catch:{ Exception -> 0x007e }
        L_0x001f:
            goto L_0x007b
        L_0x0020:
            java.lang.String r1 = "fallbackCheckoutUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x007e }
            goto L_0x0074
        L_0x002f:
            java.lang.String r1 = "merchantDomain"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x007e }
            goto L_0x0074
        L_0x003f:
            java.lang.String r1 = "sourceUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x007e }
            goto L_0x0074
        L_0x004f:
            java.lang.String r1 = "lineItems"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x007e }
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem> r1 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteLineItem.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField((java.lang.reflect.Field) r2, (java.lang.Class) r1, (X.TA4) r0)     // Catch:{ Exception -> 0x007e }
            goto L_0x0074
        L_0x0065:
            java.lang.String r1 = "visitToken"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x007e }
        L_0x0074:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0087 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0087 }
            goto L_0x0016
        L_0x007a:
            return r1
        L_0x007b:
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            return r0
        L_0x007e:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0087 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.commercecheckout.models.ShopsLiteContentModelDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public ShopsLiteContentModelDeserializer() {
        this.A00 = ShopsLiteContentModel.class;
    }
}

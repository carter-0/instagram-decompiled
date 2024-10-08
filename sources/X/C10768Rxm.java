package X;

/* renamed from: X.Rxm  reason: case insensitive filesystem */
public final class C10768Rxm {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final RLN A04;
    public final C8553Qwr A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.RLN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.RLN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.RLN} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10768Rxm(org.json.JSONObject r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "formattedPrice"
            java.lang.String r0 = r6.optString(r0)
            r5.A01 = r0
            java.lang.String r0 = "priceAmountMicros"
            long r0 = r6.optLong(r0)
            r5.A00 = r0
            java.lang.String r0 = "priceCurrencyCode"
            java.lang.String r0 = r6.optString(r0)
            r5.A02 = r0
            java.lang.String r0 = "offerIdToken"
            java.lang.String r3 = r6.optString(r0)
            boolean r1 = r3.isEmpty()
            r0 = 1
            r2 = 0
            if (r0 != r1) goto L_0x002d
            r3 = r2
        L_0x002d:
            r5.A03 = r3
            java.lang.String r0 = "offerId"
            r6.optString(r0)
            java.lang.String r0 = "purchaseOptionId"
            r6.optString(r0)
            java.lang.String r0 = "offerType"
            r6.optInt(r0)
            java.lang.String r0 = "offerTags"
            org.json.JSONArray r4 = r6.optJSONArray(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r4 == 0) goto L_0x005a
            r1 = 0
        L_0x004f:
            int r0 = r4.length()
            if (r1 >= r0) goto L_0x005a
            int r1 = X.Pxg.A09(r3, r4, r1)
            goto L_0x004f
        L_0x005a:
            X.Qwr r0 = X.C8553Qwr.A02(r3)
            r5.A05 = r0
            java.lang.String r1 = "fullPriceMicros"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x006b
            r6.optLong(r1)
        L_0x006b:
            java.lang.String r0 = "discountDisplayInfo"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "percentageDiscount"
            r1.getInt(r0)
        L_0x0079:
            java.lang.String r0 = "validTimeWindow"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "startTimeMillis"
            r1.getLong(r0)
            java.lang.String r0 = "endTimeMillis"
            r1.getLong(r0)
        L_0x008d:
            java.lang.String r0 = "limitedQuantityInfo"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x00a1
            java.lang.String r0 = "maximumQuantity"
            r1.getInt(r0)
            java.lang.String r0 = "remainingQuantity"
            r1.getInt(r0)
        L_0x00a1:
            java.lang.String r0 = "preorderDetails"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = "preorderReleaseTimeMillis"
            r1.getLong(r0)
            java.lang.String r0 = "preorderPresaleEndTimeMillis"
            r1.getLong(r0)
        L_0x00b6:
            java.lang.String r0 = "rentalDetails"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x00d0
            X.RLN r2 = new X.RLN
            r2.<init>()
            java.lang.String r0 = "rentalPeriod"
            r1.getString(r0)
            java.lang.String r0 = "rentalExpirationPeriod"
            r1.optString(r0)
        L_0x00d0:
            r5.A04 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10768Rxm.<init>(org.json.JSONObject):void");
    }
}

package X;

import java.util.HashSet;
import java.util.Map;

public final class S3V {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashSet A07;
    public final HashSet A08;
    public final HashSet A09;
    public final HashSet A0A;
    public final boolean A0B;
    public final String A0C;

    public final Map A00() {
        return DbY.A0p("Accept-Language", "en-US", AnonymousClass7TE.A1L("x-amz-customer-ip-address", this.A0C));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r5.getBooleanExtra("IS_BWP_3P_ENABLED", false) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S3V(android.content.Intent r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "IS_BWP_1P_ENABLED"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "IS_BWP_3P_ENABLED"
            boolean r1 = r5.getBooleanExtra(r0, r1)
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4.A0B = r0
            java.lang.String r0 = "BWP_API_KEY_COOKIE_NAME"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "x-aa-h-api-key"
        L_0x0023:
            r4.A02 = r0
            java.lang.String r2 = "BWP_API_KEY_TTL"
            r0 = 0
            long r0 = r5.getLongExtra(r2, r0)
            r4.A00 = r0
            java.lang.String r0 = "BWP_ACCESS_TOKEN_COOKIE_NAME"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "x-aa-h-bearer-token"
        L_0x003a:
            r4.A01 = r0
            java.lang.String r0 = "BWP_1P_COOKIE_DOMAIN"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "web.shop-external.amazon"
        L_0x0047:
            r4.A03 = r0
            java.lang.String r0 = "BWP_3P_COOKIE_DOMAIN"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "order.buywithprime.amazon.com"
        L_0x0054:
            r4.A04 = r0
            java.lang.String r0 = "BWP_1P_ALLOWED_DOMAINS"
            java.lang.String r2 = r5.getStringExtra(r0)
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "shop-external.amazon"
        L_0x0061:
            java.lang.String r3 = "\\s+"
            X.11S r0 = new X.11S
            r0.<init>(r3)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.A00(r2, r1)
            java.lang.String r2 = ","
            java.util.List r0 = X.DbV.A18(r0, r2)
            java.util.HashSet r0 = X.00k.A0V(r0)
            r4.A07 = r0
            java.lang.String r0 = "BWP_3P_ALLOWED_DOMAINS"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "buywithprime.amazon.com"
        L_0x0084:
            java.lang.String r0 = X.Pxf.A0d(r0, r3, r1)
            java.util.List r0 = X.DbV.A18(r0, r2)
            java.util.HashSet r0 = X.00k.A0V(r0)
            r4.A08 = r0
            java.lang.String r0 = "BWP_1P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "amazon.com"
        L_0x009c:
            java.lang.String r0 = X.Pxf.A0d(r0, r3, r1)
            java.util.List r0 = X.DbV.A18(r0, r2)
            java.util.HashSet r0 = X.00k.A0V(r0)
            r4.A09 = r0
            java.lang.String r0 = "BWP_3P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "amazon.com"
        L_0x00b4:
            java.lang.String r0 = X.Pxf.A0d(r0, r3, r1)
            java.util.List r0 = X.DbV.A18(r0, r2)
            java.util.HashSet r0 = X.00k.A0V(r0)
            r4.A0A = r0
            java.lang.String r0 = "BWP_1P_SUBTITLE_URL"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "web.shop-external.amazon.com"
        L_0x00cd:
            r4.A05 = r0
            java.lang.String r0 = "BWP_3P_SUBTITLE_URL"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "order.buywithprime.amazon.com"
        L_0x00da:
            r4.A06 = r0
            java.lang.String r0 = "BWP_REQUEST_HEADER_IP_ADDRESS"
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 != 0) goto L_0x00e5
            r0 = r1
        L_0x00e5:
            r4.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3V.<init>(android.content.Intent):void");
    }
}

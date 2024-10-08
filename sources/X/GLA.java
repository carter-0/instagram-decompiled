package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;

public final class GLA extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0eM A05 = C51970G9q.A0o(this, 43);
    public final int A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GLA) {
                GLA gla = (GLA) obj;
                if (this.A02 != gla.A02 || !0qQ.A0K(this.A03, gla.A03) || this.A00 != gla.A00 || !0qQ.A0K(this.A04, gla.A04) || this.A01 != gla.A01 || !0qQ.A0K(this.A08, gla.A08) || this.A06 != gla.A06 || !0qQ.A0K(this.A07, gla.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0P("total_num_items", this.A02);
            String str = this.A04;
            if (str != null) {
                A0K.A0q("last_non_organic_item");
                A0K.A0c();
                A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                A0K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 2);
                A0K.A0P("index", this.A01);
                A0K.A0Z();
            }
            A0K.A0q("last_organic_item");
            A0K.A0c();
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A03);
            A0K.A0P("index", this.A00);
            A0K.A0Z();
            A0K.A0Z();
            A0K.close();
        } catch (IOException e) {
            0KC.A0F("ClipsApiUtil", "Error writing pagination info to request createPagingTokenString", e);
        }
        return DbT.A10(stringWriter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r7.A08 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01() {
        /*
            r7 = this;
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            X.17W r4 = X.AnonymousClass7TF.A0K(r6)     // Catch:{ IOException -> 0x0076 }
            java.lang.String r1 = "total_num_items"
            int r0 = r7.A02     // Catch:{ IOException -> 0x0076 }
            r4.A0P(r1, r0)     // Catch:{ IOException -> 0x0076 }
            java.lang.String r1 = r7.A04     // Catch:{ IOException -> 0x0076 }
            java.lang.String r3 = "index"
            java.lang.String r5 = "id"
            if (r1 != 0) goto L_0x001c
            java.lang.String r0 = r7.A08     // Catch:{ IOException -> 0x0076 }
            if (r0 == 0) goto L_0x005a
        L_0x001c:
            java.lang.String r0 = "last_non_organic_items"
            r4.A0q(r0)     // Catch:{ IOException -> 0x0076 }
            r4.A0b()     // Catch:{ IOException -> 0x0076 }
            java.lang.String r2 = "type"
            if (r1 == 0) goto L_0x003a
            r4.A0c()     // Catch:{ IOException -> 0x0076 }
            r4.A0R(r5, r1)     // Catch:{ IOException -> 0x0076 }
            r0 = 2
            r4.A0P(r2, r0)     // Catch:{ IOException -> 0x0076 }
            int r0 = r7.A01     // Catch:{ IOException -> 0x0076 }
            r4.A0P(r3, r0)     // Catch:{ IOException -> 0x0076 }
            r4.A0Z()     // Catch:{ IOException -> 0x0076 }
        L_0x003a:
            java.lang.String r0 = r7.A08     // Catch:{ IOException -> 0x0076 }
            if (r0 == 0) goto L_0x0057
            r4.A0c()     // Catch:{ IOException -> 0x0076 }
            r4.A0R(r5, r0)     // Catch:{ IOException -> 0x0076 }
            java.lang.String r1 = "host_media_id"
            java.lang.String r0 = r7.A07     // Catch:{ IOException -> 0x0076 }
            r4.A0R(r1, r0)     // Catch:{ IOException -> 0x0076 }
            r0 = 5
            r4.A0P(r2, r0)     // Catch:{ IOException -> 0x0076 }
            int r0 = r7.A06     // Catch:{ IOException -> 0x0076 }
            r4.A0P(r3, r0)     // Catch:{ IOException -> 0x0076 }
            r4.A0Z()     // Catch:{ IOException -> 0x0076 }
        L_0x0057:
            r4.A0Y()     // Catch:{ IOException -> 0x0076 }
        L_0x005a:
            java.lang.String r0 = "last_organic_item"
            r4.A0q(r0)     // Catch:{ IOException -> 0x0076 }
            r4.A0c()     // Catch:{ IOException -> 0x0076 }
            java.lang.String r0 = r7.A03     // Catch:{ IOException -> 0x0076 }
            r4.A0R(r5, r0)     // Catch:{ IOException -> 0x0076 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x0076 }
            r4.A0P(r3, r0)     // Catch:{ IOException -> 0x0076 }
            r4.A0Z()     // Catch:{ IOException -> 0x0076 }
            r4.A0Z()     // Catch:{ IOException -> 0x0076 }
            r4.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r2 = move-exception
            java.lang.String r1 = "ClipsApiUtil"
            java.lang.String r0 = "Error writing pagination info to request createPagingTokenStringV2"
            X.0KC.A0F(r1, r0, r2)
        L_0x007e:
            java.lang.String r0 = X.DbT.A10(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLA.A01():java.lang.String");
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TF.A08(this.A03, this.A02 * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + this.A06) * 31) + C41845B3m.A00(this.A07);
    }

    public GLA(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = str2;
        this.A01 = i3;
        this.A08 = str3;
        this.A06 = i4;
        this.A07 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsPagingTokenInfo(totalNumItems=");
        A1A.append(this.A02);
        A1A.append(", lastOrganicId=");
        A1A.append(this.A03);
        A1A.append(", lastOrganicPosition=");
        A1A.append(this.A00);
        A1A.append(", lastSponsoredId=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(2031));
        A1A.append(this.A01);
        A1A.append(", lastOverlayAdId=");
        A1A.append(this.A08);
        A1A.append(", lastOverlayAdPosition=");
        A1A.append(this.A06);
        A1A.append(", lastOverlayAdHostingMediaId=");
        return C51975G9x.A0i(this.A07, A1A);
    }
}

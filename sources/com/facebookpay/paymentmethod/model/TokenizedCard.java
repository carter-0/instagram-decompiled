package com.facebookpay.paymentmethod.model;

import X.C7648QRp;
import X.C7742QVf;
import X.SWW;
import android.os.Parcelable;

public final class TokenizedCard extends CreditCard {
    public static final Parcelable.Creator CREATOR = SWW.A00(13);
    public final C7648QRp A00;
    public final C7742QVf A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.00l.A0W(r3) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TokenizedCard(X.C7648QRp r6, X.C7742QVf r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            int r4 = X.DbW.A02(r0, r6, r7)
            r5.<init>(r6, r8, r9)
            r5.A00 = r6
            r5.A01 = r7
            r5.A05 = r8
            r5.A04 = r9
            java.lang.String r0 = "issuer_card_art_url"
            java.lang.String r3 = r7.A08(r0)
            if (r3 == 0) goto L_0x001f
            boolean r1 = X.00l.A0W(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r3 = r2
        L_0x0024:
            r5.A02 = r3
            java.lang.String r0 = "issuer_name"
            java.lang.String r1 = r7.getOptionalStringField(r4, r0)
            if (r1 == 0) goto L_0x0035
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0035
            r2 = r1
        L_0x0035:
            r5.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.TokenizedCard.<init>(X.QRp, X.QVf, boolean, boolean):void");
    }
}

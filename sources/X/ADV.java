package X;

public final class ADV {
    public static final ADV A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        if (r6 != null) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r12, X.C270854hQ r13, com.instagram.common.session.UserSession r14, X.C255773uh r15, X.C250973mM r16, X.C309756Zm r17, X.AnonymousClass6P0 r18, boolean r19) {
        /*
            r11 = this;
            r2 = 0
            X.0qQ.A0B(r12, r2)
            if (r13 == 0) goto L_0x013b
            r3 = r18
            X.3oV r7 = r3.A04
            r7.setVisibility(r2)
            java.lang.Integer r5 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x012e
            if (r5 != r0) goto L_0x00d2
            int r0 = X.AnonymousClass7TG.A02(r12)
            X.0nA.A0X(r1, r0)
        L_0x001e:
            android.widget.TextView r1 = r3.A02
            if (r1 == 0) goto L_0x002a
            r0 = 8
            if (r19 == 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            r1.setVisibility(r0)
        L_0x002a:
            java.lang.String r6 = r13.AyB()
            r4 = 1
            if (r6 == 0) goto L_0x0128
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0128
            android.widget.TextView r1 = r3.A03
            if (r1 == 0) goto L_0x0131
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 != r0) goto L_0x0040
            r4 = 3
        L_0x0040:
            r1.setMaxLines(r4)
            android.widget.TextView r1 = r3.A03
            if (r1 == 0) goto L_0x0131
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            android.widget.TextView r0 = r3.A03
            if (r0 == 0) goto L_0x0131
            r0.setText(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x0069
            android.view.View r4 = r3.A00
            if (r4 == 0) goto L_0x012e
            r1 = 57
            X.FPH r0 = new X.FPH
            r5 = r17
            r6 = r16
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r15)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x0069:
            java.util.List r0 = r13.C2F()
            r5 = 0
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DSi r0 = (X.C46253DSi) r0
            if (r0 == 0) goto L_0x00d0
            java.lang.String r4 = r0.BE9()
        L_0x007c:
            r7 = 8
            if (r4 == 0) goto L_0x011d
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321683723986576(0x810a6100032690, double:3.033317270505614E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x011d
            X.XDU r10 = X.C14091Tpi.A03(r4)
            if (r10 == 0) goto L_0x00f0
            X.GOf r0 = X.C52337GOf.FILLED
            X.GOg r1 = X.GOg.SIZE_12
            java.lang.Integer r9 = X.C14091Tpi.A04(r10, r1, r0)
            X.GOg r8 = X.GOg.SIZE_24
            java.lang.Integer r6 = X.C14091Tpi.A04(r10, r8, r0)
            X.GOf r0 = X.C52337GOf.OUTLINE
            java.lang.Integer r1 = X.C14091Tpi.A04(r10, r1, r0)
            java.lang.Integer r0 = X.C14091Tpi.A04(r10, r8, r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r9, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r8 = r0.iterator()
            r6 = 0
        L_0x00b8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d7
            if (r6 != 0) goto L_0x00d9
            java.lang.Object r1 = r8.next()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00ce
            int r0 = r1.intValue()
            if (r0 == 0) goto L_0x00b8
        L_0x00ce:
            r6 = r1
            goto L_0x00b8
        L_0x00d0:
            r4 = r5
            goto L_0x007c
        L_0x00d2:
            X.0nA.A0X(r1, r2)
            goto L_0x001e
        L_0x00d7:
            if (r6 == 0) goto L_0x00f0
        L_0x00d9:
            int r0 = r6.intValue()
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r0)
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x0125
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r2)
            return
        L_0x00f0:
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r7)
            X.0wj r2 = X.0wj.A01
            r1 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r0 = "PopularityProofInvalidMoreInfoIconString"
            X.0f9 r3 = r2.AEf(r0, r1)
            java.lang.String r2 = "The media "
            X.1Xj r0 = r15.A0b
            if (r0 == 0) goto L_0x010c
            java.lang.String r5 = r0.getId()
        L_0x010c:
            java.lang.String r1 = " was provided the icon "
            r0 = 46
            java.lang.String r1 = X.002.A0v(r2, r5, r1, r4, r0)
            java.lang.String r0 = "message"
            r3.ABQ(r0, r1)
            r3.report()
            return
        L_0x011d:
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r7)
            return
        L_0x0125:
            java.lang.String r0 = "icon"
            goto L_0x0133
        L_0x0128:
            r0 = 8
            r7.setVisibility(r0)
            return
        L_0x012e:
            java.lang.String r0 = "container"
            goto L_0x0133
        L_0x0131:
            java.lang.String r0 = "text"
        L_0x0133:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ADV.A00(android.content.Context, X.4hQ, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6Zm, X.6P0, boolean):void");
    }
}

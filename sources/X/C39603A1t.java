package X;

/* renamed from: X.A1t  reason: case insensitive filesystem */
public abstract class C39603A1t {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C306386Ly A00(android.content.Context r14, X.DV5 r15, com.instagram.common.session.UserSession r16, java.lang.String r17) {
        /*
            r12 = 0
            r7 = 1
            r10 = r14
            X.0qQ.A0B(r14, r7)
            r8 = 2
            r0 = r16
            X.0qQ.A0B(r0, r8)
            r4 = 3
            r2 = r17
            X.0qQ.A0B(r2, r4)
            com.instagram.api.schemas.ClipsTextFormatType r0 = r15.C5D()
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "classic_v2"
        L_0x001e:
            r5 = 0
            X.8bb r3 = X.C358878bc.A01(r0, r12, r12, r12, r12)
            java.lang.Float r9 = r15.B79()
            r15.BpV()
            java.util.List r0 = r15.Ap5()
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3iK r0 = (X.C248643iK) r0
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = r0.getHexRgbaColor()
        L_0x003a:
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.AnonymousClass7TF.A03(r14, r0)
            int r14 = X.0nH.A0B(r1, r0)
            com.instagram.api.schemas.ClipsTextEmphasisMode r0 = r15.C56()
            if (r0 == 0) goto L_0x012d
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x0129
            r0 = 5
            if (r1 == r0) goto L_0x0125
            if (r1 == r8) goto L_0x0121
            r0 = 6
            if (r1 != r0) goto L_0x012d
            X.6Mr r6 = X.C306576Mr.INVERTED_OUTLINED
        L_0x005b:
            com.instagram.api.schemas.ClipsTextAlignment r0 = r15.Aah()
            if (r0 == 0) goto L_0x011d
            int r0 = r0.ordinal()
            if (r0 == r8) goto L_0x0119
            if (r0 != r4) goto L_0x011d
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x006b:
            r15.COk()
            android.text.Editable$Factory r0 = android.text.Editable.Factory.getInstance()
            android.text.Editable r11 = r0.newEditable(r2)
            X.0qQ.A0A(r11)
            X.AnonymousClass91Z.A00(r11, r3)
            X.AnonymousClass91U.A02(r10, r11, r3)
            X.8bi r0 = r3.A06
            int r0 = r0.A00(r10)
            X.6Ly r4 = X.AnonymousClass7TE.A0s(r10, r0)
            r4.A0L(r11)
            r4.A0K(r1)
            if (r9 == 0) goto L_0x00a6
            float r8 = r9.floatValue()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            float r0 = android.util.TypedValue.applyDimension(r7, r8, r1)
            r4.A0A(r0)
        L_0x00a6:
            X.0qq r1 = X.AnonymousClass0qo.A00(r10)
            X.0qm r0 = X.0qm.A0z
            X.AnonymousClass7TE.A1X(r0, r1, r4)
            X.AnonymousClass91Y.A00(r5, r3, r4)
            r4.A09()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A0M = r0
            X.C358948bj.A03(r11)
            int r15 = X.0nH.A04(r14)
            X.6Mr r0 = X.C306576Mr.OUTLINED
            if (r6 == r0) goto L_0x0117
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            if (r6 != r0) goto L_0x010a
            r0 = r15
        L_0x00c9:
            r4.A0F(r0)
            X.8bh r7 = r3.A05
            r2 = 0
            android.text.StaticLayout r1 = r4.A0G
            r0 = 3645(0xe3d, float:5.108E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            float[][] r0 = X.A1T.A00(r1)
            X.91R r5 = new X.91R
            r5.<init>(r10, r7, r0, r2)
            r5.A03 = r6
            r5.ESD(r14, r15)
            android.text.Spannable r2 = r4.A0F
            int r1 = r2.length()
            r0 = 65554(0x10012, float:9.1861E-41)
            r2.setSpan(r5, r12, r1, r0)
        L_0x00f4:
            android.text.TextPaint r2 = r4.A0b
            float r0 = r2.getTextSize()
            float r1 = X.C39815AAm.A00(r10, r11, r3, r4, r0)
            float r0 = r2.getTextSize()
            float r0 = X.C39815AAm.A01(r10, r11, r3, r4, r0)
            r4.A0C(r1, r0)
            return r4
        L_0x010a:
            X.8f1 r0 = r3.A04
            X.C358948bj.A02(r10, r6, r0, r4)
            int r13 = r2.length()
            X.C358838bY.A03(r10, r11, r12, r13, r14, r15)
            goto L_0x00f4
        L_0x0117:
            r0 = r14
            goto L_0x00c9
        L_0x0119:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x006b
        L_0x011d:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x006b
        L_0x0121:
            X.6Mr r6 = X.C306576Mr.OUTLINED
            goto L_0x005b
        L_0x0125:
            X.6Mr r6 = X.C306576Mr.INVERTED
            goto L_0x005b
        L_0x0129:
            X.6Mr r6 = X.C306576Mr.DEFAULT
            goto L_0x005b
        L_0x012d:
            X.6Mr r6 = X.C306576Mr.DISABLED
            goto L_0x005b
        L_0x0131:
            r1 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39603A1t.A00(android.content.Context, X.DV5, com.instagram.common.session.UserSession, java.lang.String):X.6Ly");
    }
}

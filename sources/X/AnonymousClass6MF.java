package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.6MF  reason: invalid class name */
public final class AnonymousClass6MF extends AnonymousClass6MD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 0rN A05;
    public AnonymousClass6MH A06;
    public int A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final UserSession A0D;
    public final IgTextView A0E;
    public final C252063oV A0F;
    public final C252063oV A0G;
    public final C255773uh A0H;
    public final C250973mM A0I;
    public final AnonymousClass6LR A0J;
    public final C309426Yf A0K;
    public final AnonymousClass6M8 A0L;
    public final AnonymousClass6M6 A0M;
    public final C309846Zv A0N;
    public final AnonymousClass6MA A0O;
    public final String A0P;
    public final boolean A0Q;
    public final AnonymousClass6M9 A0R;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6MF(com.instagram.common.session.UserSession r9, X.C252063oV r10, X.C252063oV r11, X.C255773uh r12, X.C250973mM r13, X.AnonymousClass6M9 r14, X.C309426Yf r15, X.AnonymousClass6M8 r16, X.AnonymousClass6M6 r17, X.C309846Zv r18, X.AnonymousClass6MA r19, boolean r20) {
        /*
            r8 = this;
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r0 = 2
            X.0qQ.A0B(r11, r0)
            r0 = 3
            r1 = r17
            X.0qQ.A0B(r1, r0)
            X.6ME r0 = X.AnonymousClass6ME.CAPTION
            r8.<init>(r1, r0)
            r8.A0G = r10
            r8.A0F = r11
            r8.A0M = r1
            r2 = r16
            r8.A0L = r2
            r8.A0I = r13
            r8.A0H = r12
            r8.A0K = r15
            r8.A0D = r9
            r8.A0R = r14
            r0 = r19
            r8.A0O = r0
            r0 = r18
            r8.A0N = r0
            if (r20 == 0) goto L_0x01c3
            int r0 = r1.A07
        L_0x0033:
            r8.A04 = r0
            if (r20 == 0) goto L_0x01bf
            int r0 = r1.A07
        L_0x0039:
            r8.A02 = r0
            android.view.View r4 = r10.getView()
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            r8.A0E = r4
            X.6LR r5 = r12.A0G()
            if (r5 == 0) goto L_0x01f9
            r8.A0J = r5
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x01e5
            r8.A0P = r0
            X.1P7.A02(r9)
            java.lang.String r3 = r5.A07
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = X.0nH.A0C(r3, r0)
            r8.A0C = r3
            boolean r0 = X.1P7.A02(r9)
            if (r0 == 0) goto L_0x01b9
            int r0 = X.W1z.A00(r5)
        L_0x0068:
            r8.A01 = r0
            boolean r0 = r12.A14()
            if (r0 == 0) goto L_0x01af
            int r0 = r1.A05
        L_0x0072:
            r8.A0B = r0
            boolean r1 = X.C297785sK.A0f(r12)
            X.6MH r0 = X.AnonymousClass6MH.A05
            r8.A06 = r0
            X.1Xj r0 = r12.A0b
            r0.getClass()
            boolean r0 = X.C231122qu.A0N(r9, r0)
            r8.A0Q = r0
            r7 = 0
            X.0qQ.A0B(r4, r7)
            X.6LK r0 = X.AnonymousClass6LK.A00
            r4.setMovementMethod(r0)
            r4.setClickable(r7)
            r4.setLongClickable(r7)
            int r0 = r2.A02
            r4.setMaxLines(r0)
            int r0 = r2.A03
            r4.setTextAlignment(r0)
            int r0 = r2.A01
            X.AnonymousClass6MI.A07(r4, r0)
            float r0 = r2.A00
            X.AnonymousClass6MI.A06(r4, r0)
            r4.setTextColor(r3)
            if (r1 == 0) goto L_0x011f
            X.6LR r0 = r8.A0J
            X.4fk r3 = r0.A00
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x01df
            X.6M6 r2 = r8.A0M
            int r0 = r2.A0F
            float r4 = (float) r0
            java.lang.Float r0 = r3.CGb()
            if (r0 == 0) goto L_0x01d9
            float r0 = r0.floatValue()
            float r0 = r0 * r4
            int r0 = (int) r0
            r8.A03 = r0
            int r0 = r2.A0E
            float r2 = (float) r0
            java.lang.Float r0 = r3.BCy()
            if (r0 == 0) goto L_0x01d3
            float r0 = r0.floatValue()
            float r0 = r0 * r2
            int r0 = (int) r0
            r8.A01 = r0
            java.lang.Float r0 = r3.Byx()
            if (r0 == 0) goto L_0x01cd
            float r0 = r0.floatValue()
            float r4 = r4 * r0
            int r5 = (int) r4
            java.lang.Float r0 = r3.Byz()
            if (r0 == 0) goto L_0x01c7
            float r0 = r0.floatValue()
            float r2 = r2 * r0
            int r6 = (int) r2
            int r3 = r8.A06()
            int r4 = r8.A04()
            X.6MH r2 = new X.6MH
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A06 = r2
            com.instagram.common.ui.base.IgTextView r2 = r8.A0E
            int r1 = X.AnonymousClass6MI.A00(r2, r3)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            X.0rN r0 = X.AnonymousClass6MI.A05(r0, r2, r1)
            r8.A05 = r0
            int r0 = r8.A06()
            r2.setMaxWidth(r0)
            int r1 = r8.A04()
        L_0x011b:
            A01(r8, r1)
        L_0x011e:
            return
        L_0x011f:
            com.instagram.common.ui.base.IgTextView r3 = r8.A0E
            int r0 = r8.A06()
            int r2 = X.AnonymousClass6MI.A00(r3, r0)
            X.3uh r0 = r8.A0H
            android.text.Layout$Alignment r0 = X.C297785sK.A05(r0)
            X.0rN r0 = X.AnonymousClass6MI.A05(r0, r3, r2)
            r8.A05 = r0
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x0186
            X.3oV r0 = r8.A0F
            android.view.View r4 = r0.getView()
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            X.6M8 r1 = r8.A0L
            X.0qQ.A0B(r4, r7)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            int r0 = r1.A01
            X.AnonymousClass6MI.A07(r4, r0)
            r0 = 1094713344(0x41400000, float:12.0)
            X.AnonymousClass6MI.A06(r4, r0)
            r0 = 2131952216(0x7f130258, float:1.9540868E38)
            r4.setText(r0)
            int r0 = r8.A0C
            r4.setTextColor(r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            X.0rN r2 = X.AnonymousClass6MI.A05(r0, r4, r2)
            java.lang.CharSequence r1 = r4.getText()
            X.0qQ.A07(r1)
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = X.AnonymousClass6MI.A02(r2, r1, r0)
            X.6M6 r0 = r8.A0M
            int r0 = r0.A0G
            int r1 = r1 + r0
            r8.A00 = r1
            java.lang.CharSequence r1 = r4.getText()
            X.0qQ.A07(r1)
            int r0 = r8.A01
            X.AnonymousClass6MI.A08(r4, r2, r1, r0)
        L_0x0186:
            java.lang.String r2 = r8.A0P
            X.0rN r1 = r8.A05
            if (r1 != 0) goto L_0x0196
            java.lang.String r0 = "textLayoutParams"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0196:
            int r0 = r3.getMaxLines()
            int r1 = X.AnonymousClass6MI.A02(r1, r2, r0)
            r8.A03 = r1
            int r0 = r8.A00
            int r1 = r1 + r0
            r8.A01 = r1
            int r0 = r8.A04()
            int r1 = r8.A0B
            if (r0 <= r1) goto L_0x011e
            goto L_0x011b
        L_0x01af:
            int r0 = r1.A0E
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L_0x0072
        L_0x01b9:
            int r0 = X.AnonymousClass6MG.A00(r5)
            goto L_0x0068
        L_0x01bf:
            int r0 = r8.A00
            goto L_0x0039
        L_0x01c3:
            int r0 = r8.A02
            goto L_0x0033
        L_0x01c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e5:
            java.lang.String r2 = "Caption model text should not be null for ad "
            X.3uh r1 = r8.A0H
            com.instagram.common.session.UserSession r0 = r8.A0D
            java.lang.String r0 = r1.A0U(r0)
            java.lang.String r1 = X.002.A0R(r2, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f9:
            java.lang.String r1 = "StoryAdCaption model should not be null for ad "
            java.lang.String r0 = r12.A0U(r9)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MF.<init>(com.instagram.common.session.UserSession, X.3oV, X.3oV, X.3uh, X.3mM, X.6M9, X.6Yf, X.6M8, X.6M6, X.6Zv, X.6MA, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v85, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0577, code lost:
        if (r5.A09 != false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0579, code lost:
        r5.A01 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6MF r34) {
        /*
            r5 = r34
            java.lang.String r6 = r5.A0P
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            X.0qQ.A0C(r6, r0)
            X.0rN r0 = r5.A05
            r24 = r0
            java.lang.String r0 = "textLayoutParams"
            if (r24 != 0) goto L_0x0019
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0019:
            r0 = r24
            android.text.StaticLayout r0 = r0.A00(r6)
            int r2 = r0.getLineCount()
            r25 = 1
            r4 = 0
            com.instagram.common.ui.base.IgTextView r0 = r5.A0E
            r34 = r0
            int r1 = r34.getMaxLines()
            r0 = 0
            if (r2 <= r1) goto L_0x0032
            r0 = 1
        L_0x0032:
            r5.A0A = r0
            int r1 = r34.getMaxLines()
            int[] r0 = new int[]{r2, r1}
            r0 = r0[r4]
            if (r1 >= r0) goto L_0x0041
            r0 = r1
        L_0x0041:
            r5.A07 = r0
            X.6Mh r7 = new X.6Mh
            r7.<init>(r5)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x009f
            X.6M8 r1 = r5.A0L
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0057
            boolean r0 = r1.A06
            r1 = 1
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            int r9 = r34.getMaxLines()
            int r10 = r5.A0C
            X.6M6 r0 = r5.A0M
            X.0qQ.A0B(r6, r4)
            if (r1 == 0) goto L_0x012f
            X.6Ng r1 = new X.6Ng
            r1.<init>(r7)
        L_0x006a:
            java.lang.String r0 = r0.A0K
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
            java.lang.String r0 = r8.toString()
            if (r0 == 0) goto L_0x012c
            int r3 = r0.length()
        L_0x007b:
            r2 = 33
            if (r1 == 0) goto L_0x0082
            r8.setSpan(r1, r4, r3, r2)
        L_0x0082:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r8.setSpan(r0, r4, r3, r2)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            int r1 = X.0nH.A07(r10, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r8.setSpan(r0, r4, r3, r2)
            r0 = r24
            android.text.SpannableStringBuilder r6 = X.AnonymousClass6MI.A04(r8, r0, r6, r9)
        L_0x009f:
            com.instagram.common.session.UserSession r3 = r5.A0D
            boolean r2 = X.1P7.A02(r3)
            int r1 = r5.A0C
            X.6M9 r0 = r5.A0R
            if (r2 == 0) goto L_0x0124
            android.text.SpannableStringBuilder r2 = X.W1z.A01(r3, r0, r6, r1)
        L_0x00af:
            X.6M8 r1 = r5.A0L
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x00d7
        L_0x00bd:
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r2)
            java.lang.String r0 = r6.toString()
            if (r0 == 0) goto L_0x0122
            int r2 = r0.length()
        L_0x00cc:
            X.6Ng r1 = new X.6Ng
            r1.<init>(r7)
            r0 = 33
            r6.setSpan(r1, r4, r2, r0)
            r2 = r6
        L_0x00d7:
            X.6LR r10 = r5.A0J
            X.4fn r0 = r10.A01
            if (r0 == 0) goto L_0x057b
            boolean r1 = X.1P7.A02(r3)
            java.lang.String r9 = "Required value was null."
            X.4fn r0 = r10.A01
            if (r1 == 0) goto L_0x010c
            if (r0 == 0) goto L_0x04a4
            java.util.List r6 = r0.BKJ()
            if (r6 == 0) goto L_0x04a4
            boolean r1 = r5.A0A
            X.6M6 r0 = r5.A0M
            java.lang.String r7 = r0.A0K
            java.util.ArrayList r0 = X.W1z.A03(r2, r7, r6, r1)
        L_0x00f9:
            r5.A08 = r0
            X.0wj r23 = X.0wj.A01
            X.1Zn r22 = X.1Zm.A00(r3)
            X.3uh r8 = r5.A0H
            java.lang.String r1 = r8.A0U(r3)
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = "Missing ad id"
            goto L_0x0132
        L_0x010c:
            if (r0 == 0) goto L_0x04aa
            java.util.List r6 = r0.BKJ()
            if (r6 == 0) goto L_0x04aa
            boolean r1 = r5.A0A
            X.6M6 r0 = r5.A0M
            java.lang.String r7 = r0.A0K
            java.util.ArrayList r0 = X.AnonymousClass6MG.A03(r2, r7, r6, r1)
            X.0qQ.A07(r0)
            goto L_0x00f9
        L_0x0122:
            r2 = 0
            goto L_0x00cc
        L_0x0124:
            android.text.SpannableStringBuilder r2 = X.AnonymousClass6MG.A01(r3, r0, r6, r1)
            X.0qQ.A07(r2)
            goto L_0x00af
        L_0x012c:
            r3 = 0
            goto L_0x007b
        L_0x012f:
            r1 = 0
            goto L_0x006a
        L_0x0132:
            r8.A0U(r3)     // Catch:{ Exception -> 0x04b0 }
            boolean r0 = X.1P7.A02(r3)     // Catch:{ Exception -> 0x04b0 }
            if (r0 == 0) goto L_0x02fe
            X.4fn r10 = r10.A01     // Catch:{ Exception -> 0x04b0 }
            if (r10 == 0) goto L_0x02f7
            float r27 = r34.getTextSize()     // Catch:{ Exception -> 0x04b0 }
            boolean r15 = r5.A0A     // Catch:{ Exception -> 0x04b0 }
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x04b0 }
            r11 = 11
            r6 = r23
            X.0qQ.A0B(r6, r11)     // Catch:{ Exception -> 0x04b0 }
            r11 = 12
            r6 = r22
            X.0qQ.A0B(r6, r11)     // Catch:{ Exception -> 0x04b0 }
            r6 = r24
            android.text.StaticLayout r26 = r6.A00(r2)     // Catch:{ Exception -> 0x04b0 }
            X.0qQ.A07(r26)     // Catch:{ Exception -> 0x04b0 }
            java.util.List r6 = r10.BKJ()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x02f1
            java.util.ArrayList r12 = X.W1z.A03(r2, r7, r6, r15)     // Catch:{ Exception -> 0x04b0 }
            X.0Tu r10 = X.0Tu.A06     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724117650(0x810a6100052692, double:3.0333172705885056E-306)
            boolean r21 = X.182.A06(r10, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724183187(0x810a6100062693, double:3.0333172706299515E-306)
            boolean r11 = X.182.A06(r10, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724248724(0x810a6100072694, double:3.0333172706713974E-306)
            boolean r20 = X.182.A06(r10, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 1082130432(0x40800000, float:4.0)
            if (r21 == 0) goto L_0x0191
            r6 = 1077936128(0x40400000, float:3.0)
            float r10 = r27 / r6
            goto L_0x0193
        L_0x0191:
            float r10 = r27 / r6
        L_0x0193:
            r14 = 0
            if (r11 == 0) goto L_0x0197
            goto L_0x019a
        L_0x0197:
            r19 = r14
            goto L_0x01a9
        L_0x019a:
            X.1Xj r6 = r8.A0b     // Catch:{ Exception -> 0x04b0 }
            r6.getClass()     // Catch:{ Exception -> 0x04b0 }
            X.1Xy r6 = r6.A0C     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = r6.getDominantColor()     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r19 = X.0nH.A0D(r6)     // Catch:{ Exception -> 0x04b0 }
        L_0x01a9:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x02cd
            int r18 = r6.length()     // Catch:{ Exception -> 0x04b0 }
        L_0x01b3:
            java.util.Iterator r17 = r12.iterator()     // Catch:{ Exception -> 0x04b0 }
            r7 = 0
        L_0x01b8:
            boolean r6 = r17.hasNext()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x02e3
            java.lang.Object r13 = r17.next()     // Catch:{ Exception -> 0x04b0 }
            X.DUi r13 = (X.C46305DUi) r13     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r12 = r13.C83()     // Catch:{ Exception -> 0x04b0 }
            if (r12 == 0) goto L_0x02dd
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            int r8 = X.00l.A08(r6, r12, r7, r4)     // Catch:{ Exception -> 0x04b0 }
            r6 = -1
            if (r8 != r6) goto L_0x0248
            r8 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r13 = "STORY_AD_TEXT_UTIL_HIGHLIGHT_ERROR"
            r6 = r23
            X.0f9 r8 = r6.AEf(r13, r8)     // Catch:{ Exception -> 0x04b0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04b0 }
            r11.<init>()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "Ad id: "
            r11.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r11.append(r1)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; shortText: "
            r11.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r11.append(r2)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; keywordToken: "
            r11.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r11.append(r12)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; shouldTruncateText: "
            r11.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r11.append(r15)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "message"
            r8.ABQ(r11, r6)     // Catch:{ Exception -> 0x04b0 }
            r8.report()     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r14 = X.AnonymousClass05K.A03     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r8 = X.AnonymousClass05K.A0T     // Catch:{ Exception -> 0x04b0 }
            r6 = r22
            X.1Zp r8 = r6.A01(r14, r8, r4)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "FAILURE_REASON"
            r8.A03(r6, r13)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r13 = "Encountered -1 startIndex within StoryAdTextUtil.buildHighlightedText"
            r8.A03(r11, r13)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "ad_id"
            r8.A03(r11, r1)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "short_text"
            r8.A03(r11, r13)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "should_truncate_text"
            r8.A04(r11, r15)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "keyword_token"
            r8.A03(r11, r12)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "logview_group_by"
            r8.A03(r11, r6)     // Catch:{ Exception -> 0x04b0 }
            r8.A00()     // Catch:{ Exception -> 0x04b0 }
            r14 = r12
            goto L_0x01b8
        L_0x0248:
            int r7 = r12.length()     // Catch:{ Exception -> 0x04b0 }
            int r7 = r7 + r8
            if (r20 == 0) goto L_0x0269
            r6 = r18
            if (r7 >= r6) goto L_0x0269
            char r6 = r2.charAt(r7)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = java.lang.Character.toString(r6)     // Catch:{ Exception -> 0x04b0 }
            java.util.regex.Pattern r6 = X.W1z.A00     // Catch:{ Exception -> 0x04b0 }
            java.util.regex.Matcher r6 = r6.matcher(r11)     // Catch:{ Exception -> 0x04b0 }
            boolean r6 = r6.matches()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x0269
            int r7 = r7 + 1
        L_0x0269:
            java.lang.String r6 = r13.BKE()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x02d7
            int r11 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x04b0 }
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x04b0 }
            r6.<init>(r11)     // Catch:{ Exception -> 0x04b0 }
            r11 = 33
            r0.setSpan(r6, r8, r7, r11)     // Catch:{ Exception -> 0x04b0 }
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r12 = r13.BKH()     // Catch:{ Exception -> 0x04b0 }
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r6 = com.instagram.api.schemas.StoryAdKeywordStyleEnum.BACKGROUND_CHANGE     // Catch:{ Exception -> 0x04b0 }
            if (r12 != r6) goto L_0x01b8
            if (r19 == 0) goto L_0x028c
            int r6 = r19.intValue()     // Catch:{ Exception -> 0x04b0 }
            goto L_0x0296
        L_0x028c:
            java.lang.String r6 = r13.BKD()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x02d1
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x04b0 }
        L_0x0296:
            r16 = 1039516303(0x3df5c28f, float:0.12)
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r12 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            if (r21 != 0) goto L_0x02aa
            r13 = 1028443341(0x3d4ccccd, float:0.05)
            r16 = 1034147594(0x3da3d70a, float:0.08)
            r12 = 1039516303(0x3df5c28f, float:0.12)
        L_0x02aa:
            float r28 = r27 * r13
            float r29 = r27 * r16
            float r31 = r27 * r12
            r30 = r28
            r32 = r8
            r33 = r7
            java.util.ArrayList r13 = X.C18698Vww.A01(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ Exception -> 0x04b0 }
            X.6MO r12 = new X.6MO     // Catch:{ Exception -> 0x04b0 }
            r12.<init>(r13, r10, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = r25
            r12.A03 = r6     // Catch:{ Exception -> 0x04b0 }
            r6 = r34
            X.C306486Mi.A00(r6, r10, r4)     // Catch:{ Exception -> 0x04b0 }
            r0.setSpan(r12, r8, r7, r11)     // Catch:{ Exception -> 0x04b0 }
            goto L_0x01b8
        L_0x02cd:
            r18 = 0
            goto L_0x01b3
        L_0x02d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x02d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x02dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x02e3:
            if (r14 == 0) goto L_0x0499
            java.lang.String r0 = "Failed to highlight keyword: "
            java.lang.String r6 = X.002.A0R(r0, r14)     // Catch:{ Exception -> 0x04b0 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x02f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x02f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
            goto L_0x04a3
        L_0x02fe:
            X.4fn r10 = r10.A01     // Catch:{ Exception -> 0x04b0 }
            if (r10 == 0) goto L_0x049e
            float r27 = r34.getTextSize()     // Catch:{ Exception -> 0x04b0 }
            boolean r12 = r5.A0A     // Catch:{ Exception -> 0x04b0 }
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x04b0 }
            r6 = r24
            android.text.StaticLayout r21 = r6.A00(r2)     // Catch:{ Exception -> 0x04b0 }
            java.util.List r6 = r10.BKJ()     // Catch:{ Exception -> 0x04b0 }
            r6.getClass()     // Catch:{ Exception -> 0x04b0 }
            java.util.ArrayList r13 = X.AnonymousClass6MG.A03(r2, r7, r6, r12)     // Catch:{ Exception -> 0x04b0 }
            X.0Tu r9 = X.0Tu.A06     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724117650(0x810a6100052692, double:3.0333172705885056E-306)
            boolean r20 = X.182.A06(r9, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724183187(0x810a6100062693, double:3.0333172706299515E-306)
            boolean r11 = X.182.A06(r9, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 36321683724248724(0x810a6100072694, double:3.0333172706713974E-306)
            boolean r19 = X.182.A06(r9, r3, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = 1082130432(0x40800000, float:4.0)
            if (r20 == 0) goto L_0x0344
            r6 = 1077936128(0x40400000, float:3.0)
            float r10 = r27 / r6
            goto L_0x0346
        L_0x0344:
            float r10 = r27 / r6
        L_0x0346:
            r9 = 0
            if (r11 == 0) goto L_0x034a
            goto L_0x034d
        L_0x034a:
            r18 = r9
            goto L_0x035c
        L_0x034d:
            X.1Xj r6 = r8.A0b     // Catch:{ Exception -> 0x04b0 }
            r6.getClass()     // Catch:{ Exception -> 0x04b0 }
            X.1Xy r6 = r6.A0C     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = r6.getDominantColor()     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r18 = X.0nH.A0D(r6)     // Catch:{ Exception -> 0x04b0 }
        L_0x035c:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x0488
            int r15 = r6.length()     // Catch:{ Exception -> 0x04b0 }
        L_0x0366:
            java.util.Iterator r17 = r13.iterator()     // Catch:{ Exception -> 0x04b0 }
            r8 = 0
        L_0x036b:
            boolean r6 = r17.hasNext()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x048b
            java.lang.Object r14 = r17.next()     // Catch:{ Exception -> 0x04b0 }
            X.DUi r14 = (X.C46305DUi) r14     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r13 = r14.C83()     // Catch:{ Exception -> 0x04b0 }
            r13.getClass()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            int r11 = r6.indexOf(r13, r8)     // Catch:{ Exception -> 0x04b0 }
            r6 = -1
            if (r11 != r6) goto L_0x03fc
            r7 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r14 = "STORY_AD_TEXT_UTIL_HIGHLIGHT_ERROR"
            r6 = r23
            X.0f9 r7 = r6.AEf(r14, r7)     // Catch:{ Exception -> 0x04b0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04b0 }
            r9.<init>()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "Ad id: "
            r9.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r9.append(r1)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; shortText: "
            r9.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r9.append(r2)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; keywordToken: "
            r9.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r9.append(r13)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "; shouldTruncateText: "
            r9.append(r6)     // Catch:{ Exception -> 0x04b0 }
            r9.append(r12)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = "message"
            r7.ABQ(r11, r6)     // Catch:{ Exception -> 0x04b0 }
            r7.report()     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r9 = X.AnonymousClass05K.A03     // Catch:{ Exception -> 0x04b0 }
            java.lang.Integer r7 = X.AnonymousClass05K.A0T     // Catch:{ Exception -> 0x04b0 }
            r6 = r22
            X.1Zp r7 = r6.A01(r9, r7, r4)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r6 = "FAILURE_REASON"
            r7.A03(r6, r14)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "Encountered -1 startIndex within StoryAdTextUtil.buildHighlightedText"
            r7.A03(r11, r9)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "ad_id"
            r7.A03(r9, r1)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "short_text"
            r7.A03(r9, r11)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "should_truncate_text"
            r7.A04(r9, r12)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "keyword_token"
            r7.A03(r9, r13)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r9 = "logview_group_by"
            r7.A03(r9, r6)     // Catch:{ Exception -> 0x04b0 }
            r7.A00()     // Catch:{ Exception -> 0x04b0 }
            r9 = r13
            goto L_0x036b
        L_0x03fc:
            int r8 = r13.length()     // Catch:{ Exception -> 0x04b0 }
            int r8 = r8 + r11
            if (r19 == 0) goto L_0x041b
            if (r8 >= r15) goto L_0x041b
            char r6 = r2.charAt(r8)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r7 = java.lang.Character.toString(r6)     // Catch:{ Exception -> 0x04b0 }
            java.util.regex.Pattern r6 = X.AnonymousClass6MG.A00     // Catch:{ Exception -> 0x04b0 }
            java.util.regex.Matcher r6 = r6.matcher(r7)     // Catch:{ Exception -> 0x04b0 }
            boolean r6 = r6.matches()     // Catch:{ Exception -> 0x04b0 }
            if (r6 == 0) goto L_0x041b
            int r8 = r8 + 1
        L_0x041b:
            java.lang.String r6 = r14.BKE()     // Catch:{ Exception -> 0x04b0 }
            r6.getClass()     // Catch:{ Exception -> 0x04b0 }
            int r7 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x04b0 }
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x04b0 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x04b0 }
            r7 = 33
            r0.setSpan(r6, r11, r8, r7)     // Catch:{ Exception -> 0x04b0 }
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r13 = r14.BKH()     // Catch:{ Exception -> 0x04b0 }
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r6 = com.instagram.api.schemas.StoryAdKeywordStyleEnum.BACKGROUND_CHANGE     // Catch:{ Exception -> 0x04b0 }
            if (r13 != r6) goto L_0x036b
            if (r18 == 0) goto L_0x043f
            int r6 = r18.intValue()     // Catch:{ Exception -> 0x04b0 }
            goto L_0x044a
        L_0x043f:
            java.lang.String r6 = r14.BKD()     // Catch:{ Exception -> 0x04b0 }
            r6.getClass()     // Catch:{ Exception -> 0x04b0 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x04b0 }
        L_0x044a:
            r13 = r21
            X.0qQ.A0B(r13, r4)     // Catch:{ Exception -> 0x04b0 }
            r16 = 1039516303(0x3df5c28f, float:0.12)
            r14 = 1045220557(0x3e4ccccd, float:0.2)
            r13 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            if (r20 != 0) goto L_0x0463
            r14 = 1028443341(0x3d4ccccd, float:0.05)
            r16 = 1034147594(0x3da3d70a, float:0.08)
            r13 = 1039516303(0x3df5c28f, float:0.12)
        L_0x0463:
            float r28 = r27 * r14
            float r29 = r27 * r16
            float r31 = r27 * r13
            r26 = r21
            r30 = r28
            r32 = r11
            r33 = r8
            java.util.ArrayList r14 = X.C18698Vww.A01(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ Exception -> 0x04b0 }
            X.6MO r13 = new X.6MO     // Catch:{ Exception -> 0x04b0 }
            r13.<init>(r14, r10, r6)     // Catch:{ Exception -> 0x04b0 }
            r6 = r25
            r13.A03 = r6     // Catch:{ Exception -> 0x04b0 }
            r6 = r34
            X.C306486Mi.A00(r6, r10, r4)     // Catch:{ Exception -> 0x04b0 }
            r0.setSpan(r13, r11, r8, r7)     // Catch:{ Exception -> 0x04b0 }
            goto L_0x036b
        L_0x0488:
            r15 = 0
            goto L_0x0366
        L_0x048b:
            if (r9 == 0) goto L_0x0499
            java.lang.String r0 = "Failed to highlight keyword: "
            java.lang.String r6 = X.002.A0R(r0, r9)     // Catch:{ Exception -> 0x04b0 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x04b0 }
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x0499:
            r2 = r0
            r5.A09 = r4     // Catch:{ Exception -> 0x04b0 }
            goto L_0x0539
        L_0x049e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04b0 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x04b0 }
        L_0x04a3:
            throw r0     // Catch:{ Exception -> 0x04b0 }
        L_0x04a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x04aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x04b0:
            r11 = move-exception
            r6 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r10 = "INVALID_CAPTION_HIGHLIGHTED_KEYPHRASE"
            r0 = r23
            X.0f9 r7 = r0.AEf(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Ad id: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "; shortText: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "; shouldTruncateText: "
            r6.append(r0)
            boolean r0 = r5.A0A
            r6.append(r0)
            java.lang.String r0 = "; message: "
            r6.append(r0)
            java.lang.String r0 = r11.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r9 = "message"
            r7.ABQ(r9, r0)
            r7.report()
            java.lang.Integer r7 = X.AnonymousClass05K.A03
            java.lang.Integer r6 = X.AnonymousClass05K.A0S
            r0 = r22
            X.1Zp r8 = r0.A01(r7, r6, r4)
            java.lang.String r7 = "FAILURE_REASON"
            r8.A03(r7, r10)
            java.lang.String r0 = "Exception caught while highlighting within the controller"
            r8.A03(r9, r0)
            java.lang.String r6 = r11.getMessage()
            if (r6 != 0) goto L_0x050f
            java.lang.String r6 = ""
        L_0x050f:
            r0 = 1312(0x520, float:1.839E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A03(r0, r6)
            java.lang.String r0 = "ad_id"
            r8.A03(r0, r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "short_text"
            r8.A03(r0, r1)
            boolean r1 = r5.A0A
            java.lang.String r0 = "should_truncate_text"
            r8.A04(r0, r1)
            java.lang.String r0 = "logview_group_by"
            r8.A03(r0, r7)
            r8.A00()
            r0 = r25
            r5.A09 = r0
        L_0x0539:
            boolean r0 = X.1P7.A02(r3)
            if (r0 == 0) goto L_0x0553
            java.util.List r1 = r5.A08
            if (r1 == 0) goto L_0x0553
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0553
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x058c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x058c
        L_0x0553:
            java.util.List r1 = r5.A08
            if (r1 == 0) goto L_0x057b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x057b
            java.util.Iterator r3 = r1.iterator()
        L_0x0561:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x057b
            java.lang.Object r0 = r3.next()
            X.DUi r0 = (X.C46305DUi) r0
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r1 = r0.BKH()
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r0 = com.instagram.api.schemas.StoryAdKeywordStyleEnum.BACKGROUND_CHANGE
            if (r1 != r0) goto L_0x0561
        L_0x0575:
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x057b
            r5.A01 = r4
        L_0x057b:
            int r3 = r5.A01
            r1 = r34
            r0 = r24
            X.AnonymousClass6MI.A08(r1, r0, r2, r3)
            X.3aa r1 = X.C244063aa.CAPTION
            r0 = r34
            X.C244083ac.A05(r0, r1)
            return
        L_0x058c:
            java.util.Iterator r3 = r1.iterator()
        L_0x0590:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0553
            java.lang.Object r0 = r3.next()
            X.DUi r0 = (X.C46305DUi) r0
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r1 = r0.BKH()
            com.instagram.api.schemas.StoryAdKeywordStyleEnum r0 = com.instagram.api.schemas.StoryAdKeywordStyleEnum.BACKGROUND_CHANGE
            if (r1 != r0) goto L_0x0590
            goto L_0x0575
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MF.A00(X.6MF):void");
    }

    public static final void A01(AnonymousClass6MF r5, int i) {
        String str = r5.A0P;
        0rN r3 = r5.A05;
        if (r3 == null) {
            0qQ.A0F("textLayoutParams");
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = r5.A00;
        int A012 = AnonymousClass6MI.A01(r3, str, i - i2);
        r5.A0E.setMaxLines(A012);
        int A022 = AnonymousClass6MI.A02(r3, str, A012);
        r5.A03 = A022;
        r5.A01 = A022 + i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ff, code lost:
        if (r8.A09 != false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass6MF r8, X.AnonymousClass6MH r9) {
        /*
            X.6MA r5 = r8.A0O
            boolean r2 = r9.A04
            r0 = r2 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_showed"
            r5.A01(r0, r1)
            if (r2 != 0) goto L_0x01a6
            int r1 = r9.A01
            java.lang.String r0 = "caption_width"
            r5.A00(r0, r1)
            int r1 = r9.A00
            java.lang.String r0 = "caption_height"
            r5.A00(r0, r1)
            int r1 = r9.A02
            java.lang.String r0 = "caption_position_start_x"
            r5.A00(r0, r1)
            int r1 = r9.A03
            java.lang.String r0 = "caption_position_start_y"
            r5.A00(r0, r1)
            com.instagram.common.ui.base.IgTextView r2 = r8.A0E
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "short_caption_text"
            r5.A01(r0, r7)
            boolean r0 = r8.A0A
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_caption_fully_displayed"
            r5.A01(r0, r1)
            java.util.ArrayList r0 = X.C253053q8.A03(r7)
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_num_hashtags_showed"
            r5.A01(r0, r1)
            r6 = 0
            r3 = 0
            java.util.ArrayList r0 = X.C253053q8.A05(r7, r6)
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_num_mentions_showed"
            r5.A01(r0, r1)
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r7 == 0) goto L_0x019c
            int r0 = r7.length()
        L_0x0075:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_num_char_showed"
            r5.A01(r0, r1)
            int r0 = r8.A07
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_num_lines_showed"
            r5.A01(r0, r1)
            X.3uh r0 = r8.A0H
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0199
            int r0 = r0.A0n()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0097:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "caption_num_char_total"
            r5.A01(r0, r1)
            int r0 = r8.A0C
            java.lang.String r1 = X.0nH.A0F(r0)
            java.lang.String r0 = "caption_text_color"
            r5.A01(r0, r1)
            int r0 = r8.A01
            java.lang.String r1 = X.0nH.A0F(r0)
            java.lang.String r0 = "caption_background_color"
            r5.A01(r0, r1)
            float r0 = r2.getTextSize()
            int r1 = (int) r0
            java.lang.String r0 = "caption_font_size"
            r5.A00(r0, r1)
            int r1 = r2.getLineHeight()
            java.lang.String r0 = "caption_line_height"
            r5.A00(r0, r1)
            java.lang.String r1 = "is_systematic_caption"
            java.lang.String r0 = "false"
            r5.A01(r1, r0)
            X.6LR r2 = r8.A0J
            X.0qQ.A0B(r2, r6)
            X.4fn r0 = r2.A01
            r4 = 0
            if (r0 == 0) goto L_0x0101
            java.util.List r1 = r0.BKJ()
            if (r1 == 0) goto L_0x0101
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0101
            java.lang.Object r0 = r1.get(r6)
            X.DUi r0 = (X.C46305DUi) r0
            java.lang.String r0 = r0.C83()
            if (r0 == 0) goto L_0x0101
            if (r7 == 0) goto L_0x0101
            int r1 = X.00l.A08(r7, r0, r6, r6)
            r0 = -1
            if (r1 == r0) goto L_0x0101
            r4 = 1
            boolean r1 = r8.A09
            r0 = 1
            if (r1 == 0) goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_highlighted_keyword_shown"
            r5.A01(r0, r1)
            X.4fn r0 = r2.A01
            if (r0 == 0) goto L_0x0113
            java.lang.String r3 = r0.BTi()
        L_0x0113:
            java.lang.String r7 = ""
            if (r3 != 0) goto L_0x0118
            r3 = r7
        L_0x0118:
            java.lang.String r0 = "caption_highlights_model_type"
            r5.A01(r0, r3)
            if (r4 == 0) goto L_0x01a6
            X.4fn r0 = r2.A01
            if (r0 == 0) goto L_0x0197
            java.util.List r0 = r0.BKJ()
            if (r0 == 0) goto L_0x0197
            int r3 = r0.size()
        L_0x012d:
            java.util.List r0 = r8.A08
            if (r0 == 0) goto L_0x0195
            int r2 = r0.size()
        L_0x0135:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "caption_num_highlights_showed"
            r5.A01(r0, r1)
            int r3 = r3 - r2
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "caption_num_highlights_dropped"
            r5.A01(r0, r1)
            java.util.List r1 = r8.A08
            if (r1 == 0) goto L_0x01a6
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x015b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r2 = r4.next()
            X.DUi r2 = (X.C46305DUi) r2
            java.lang.String r1 = r2.C83()
            if (r1 != 0) goto L_0x016e
            r1 = r7
        L_0x016e:
            java.lang.String r0 = "token"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            com.instagram.api.schemas.StoryAdKeywordTypeEnum r0 = r2.BKI()
            if (r0 == 0) goto L_0x0181
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L_0x0182
        L_0x0181:
            r2 = r7
        L_0x0182:
            java.lang.String r1 = "category"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r3, r0}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r6.add(r0)
            goto L_0x015b
        L_0x0195:
            r2 = 0
            goto L_0x0135
        L_0x0197:
            r3 = 0
            goto L_0x012d
        L_0x0199:
            r0 = r3
            goto L_0x0097
        L_0x019c:
            r0 = 0
            goto L_0x0075
        L_0x019f:
            java.lang.String r1 = "caption_highlights_showed"
            java.util.HashMap r0 = r5.A00
            r0.put(r1, r6)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MF.A02(X.6MF, X.6MH):void");
    }
}

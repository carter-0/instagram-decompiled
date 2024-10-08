package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mhf  reason: case insensitive filesystem */
public final class C67064Mhf {
    public static final C67064Mhf A00 = new Object();

    public static final void A01(TextView textView, TextView textView2, UserSession userSession, C66694Mb1 mb1) {
        TextView textView3 = textView;
        TextView textView4 = textView2;
        AnonymousClass7TG.A1O(textView, textView2);
        C66694Mb1 mb12 = mb1;
        if (mb1 == null) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        C66720MbR mbR = mb12.A08;
        C67064Mhf mhf = A00;
        int i = mb12.A04;
        int i2 = mb12.A03;
        UserSession userSession2 = userSession;
        mhf.A00(mb12.A06, textView3, mbR, mb12.A0A, userSession2, i, i2);
        mhf.A00((Drawable) null, textView4, mb12.A09, (C74541Pwa) null, userSession2, 0, 0);
        boolean z = mb12.A0D;
        Drawable drawable = mb12.A05;
        Drawable drawable2 = mb12.A07;
        if (z) {
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        } else {
            textView3.setCompoundDrawables(drawable, (Drawable) null, drawable2, (Drawable) null);
        }
        textView3.setCompoundDrawablePadding(mb12.A00);
        textView3.requestLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        r4 = (android.text.SpannableString) r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e2, code lost:
        r4 = (android.text.SpannableString) r3.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.graphics.drawable.Drawable r28, android.widget.TextView r29, X.C66720MbR r30, X.C74541Pwa r31, com.instagram.common.session.UserSession r32, int r33, int r34) {
        /*
            r27 = this;
            r2 = r29
            r3 = r30
            if (r30 == 0) goto L_0x0149
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            android.content.Context r13 = r2.getContext()
            boolean r0 = X.0mk.A02(r13)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "‏"
        L_0x0017:
            r5.append(r0)
            r0 = r28
            if (r28 == 0) goto L_0x003a
            java.lang.String r7 = " "
            r5.append(r7)
            X.46l r6 = new X.46l
            r6.<init>(r0)
            int r0 = r5.length()
            int r4 = r0 + -1
            int r1 = r5.length()
            r0 = 33
            r5.setSpan(r6, r4, r1, r0)
            r5.append(r7)
        L_0x003a:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324724560900386(0x810d2500043122, double:3.035240308014375E-306)
            r6 = r32
            boolean r0 = X.182.A06(r4, r6, r0)
            r1 = r31
            if (r0 == 0) goto L_0x00e0
            X.0qQ.A07(r13)
            r14 = 0
            r22 = 0
            r19 = 1
            r15 = -1
            X.Mhg r12 = new X.Mhg
            r16 = r15
            r17 = r15
            r18 = r15
            r20 = r15
            r21 = r19
            r23 = r22
            r24 = r19
            r25 = r22
            r26 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            if (r31 == 0) goto L_0x00da
            java.lang.Object r4 = r3.A02
            android.text.SpannableString r4 = (android.text.SpannableString) r4
            java.lang.String r0 = r1.ANc(r4)
            if (r0 == 0) goto L_0x00da
        L_0x0077:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.text.Editable r0 = r12.A00(r0)
        L_0x007d:
            r7 = r33
            if (r33 == 0) goto L_0x0114
            java.lang.CharSequence r1 = X.00l.A0B(r5)
            int r8 = r1.length()
            r10 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r1 = r13.getString(r7, r1)
            r5.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = r5.length()
            int r0 = r0 + -1
            int r7 = X.00l.A07(r5, r1, r0)
            X.0Tu r9 = X.0Tu.A06
            r0 = 36315511856172292(0x8104c400060d04, double:3.029414156447744E-306)
            boolean r0 = X.182.A06(r9, r6, r0)
            if (r0 == 0) goto L_0x00f9
            int r1 = r4.length()
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            java.lang.Object[] r12 = r4.getSpans(r10, r1, r0)
            X.0qQ.A07(r12)
            int r11 = r12.length
        L_0x00be:
            if (r10 >= r11) goto L_0x00f9
            r0 = r12[r10]
            android.text.style.CharacterStyle r0 = (android.text.style.CharacterStyle) r0
            android.text.style.CharacterStyle r9 = android.text.style.CharacterStyle.wrap(r0)
            int r6 = r4.getSpanStart(r0)
            int r6 = r6 + r7
            int r1 = r4.getSpanEnd(r0)
            int r1 = r1 + r7
            r0 = 33
            r5.setSpan(r9, r6, r1, r0)
            int r10 = r10 + 1
            goto L_0x00be
        L_0x00da:
            java.lang.Object r0 = r3.A02
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            r4 = r0
            goto L_0x0077
        L_0x00e0:
            if (r31 == 0) goto L_0x00ef
            java.lang.Object r4 = r3.A02
            android.text.SpannableString r4 = (android.text.SpannableString) r4
            java.lang.String r0 = r1.ANc(r4)
            if (r0 == 0) goto L_0x00ef
        L_0x00ec:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x007d
        L_0x00ef:
            java.lang.Object r0 = r3.A02
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            r4 = r0
            goto L_0x00ec
        L_0x00f5:
            java.lang.String r0 = "‎"
            goto L_0x0017
        L_0x00f9:
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r1 = r34
            r0.<init>(r1)
            r4 = 17
            r5.setSpan(r0, r8, r7, r4)
            int r0 = r3.A00
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r5.length()
            r5.setSpan(r1, r7, r0, r4)
            goto L_0x011c
        L_0x0114:
            r5.append(r0)
            int r0 = r3.A00
            r2.setTextColor(r0)
        L_0x011c:
            r2.setText(r5)
            r0 = 0
            r2.setVisibility(r0)
            boolean r0 = X.0oh.A08()
            if (r0 == 0) goto L_0x0142
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x013d
            android.graphics.Typeface r0 = X.0oh.A00(r13)
        L_0x0132:
            r2.setTypeface(r0, r1)
        L_0x0135:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x013c
            r2.setContentDescription(r0)
        L_0x013c:
            return
        L_0x013d:
            android.graphics.Typeface r0 = X.0oh.A02(r13)
            goto L_0x0132
        L_0x0142:
            r1 = 0
            int r0 = r3.A01
            r2.setTypeface(r1, r0)
            goto L_0x0135
        L_0x0149:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67064Mhf.A00(android.graphics.drawable.Drawable, android.widget.TextView, X.MbR, X.Pwa, com.instagram.common.session.UserSession, int, int):void");
    }
}

package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.StaticLayout;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* renamed from: X.8bj  reason: invalid class name and case insensitive filesystem */
public abstract class C358948bj {
    public static final C306576Mr A00(Spannable spannable, int i, int i2) {
        0qQ.A0B(spannable, 0);
        if (i >= i2) {
            i2 = spannable.length();
            i = 0;
        }
        AnonymousClass6MP[] r1 = (AnonymousClass6MP[]) spannable.getSpans(i, i2, AnonymousClass6MP.class);
        0qQ.A0A(r1);
        if (r1.length == 0) {
            return C306576Mr.DISABLED;
        }
        return r1[0].C57();
    }

    public static final void A02(Context context, C306576Mr r17, C360708f1 r18, C306386Ly r19) {
        C306386Ly r3 = r19;
        StaticLayout staticLayout = r3.A0G;
        if (staticLayout != null) {
            C360708f1 r9 = r18;
            if (r18 != null) {
                int length = r3.A0F.length();
                AnonymousClass9UN r1 = AnonymousClass9UV.A00;
                Layout.Alignment alignment = r3.A0E;
                0qQ.A07(alignment);
                Integer A00 = r1.A00(alignment);
                Object[] spans = r3.A0F.getSpans(0, length, r9.A01());
                Spannable spannable = r3.A0F;
                0qQ.A07(spannable);
                int i = 0;
                int i2 = length;
                int length2 = spans.length;
                int i3 = 0;
                if (length2 == 0) {
                    Integer valueOf = Integer.valueOf(i);
                    Integer valueOf2 = Integer.valueOf(i2);
                    Context context2 = context;
                    C306576Mr r4 = r17;
                } else {
                    do {
                        Object obj = spans[i3];
                        int spanStart = spannable.getSpanStart(obj);
                        int spanEnd = spannable.getSpanEnd(obj);
                        i = Math.min(spanStart, 0);
                        i2 = Math.max(spanEnd, length);
                        spannable.removeSpan(obj);
                        i3++;
                    } while (i3 < length2);
                }
                Integer valueOf3 = Integer.valueOf(i);
                Integer valueOf22 = Integer.valueOf(i2);
                Context context22 = context;
                C306576Mr r42 = r17;
                if (r42 == C306576Mr.INVERTED || r42 == C306576Mr.DEFAULT) {
                    int intValue = valueOf3.intValue();
                    int intValue2 = valueOf22.intValue();
                    AnonymousClass6MP A002 = r9.A00(context22, staticLayout, A00, r3.A0b.getTextSize(), intValue, intValue2);
                    A002.Eo9(r42);
                    r3.A0F.setSpan(A002, intValue, intValue2, 65554);
                    return;
                }
                int intValue3 = valueOf3.intValue();
                int intValue4 = valueOf22.intValue();
                if (intValue3 < 0) {
                    r3.A0F.setSpan(r9.A00(context22, staticLayout, A00, r3.A0b.getTextSize(), intValue3, 0), intValue3, 0, 65554);
                }
                if (intValue4 > length) {
                    r3.A0F.setSpan(r9.A00(context22, staticLayout, A00, r3.A0b.getTextSize(), length, intValue4), length, intValue4, 65554);
                }
            }
        }
    }

    public static final void A03(Editable editable) {
        0qQ.A0B(editable, 0);
        if (C263324Kh.A00(editable, AnonymousClass9UW.class) == null) {
            editable.setSpan(new Object(), 0, editable.length(), 65554);
        }
    }

    public static final boolean A05(Spannable spannable) {
        0qQ.A0B(spannable, 0);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        if (selectionStart < 0 || selectionStart == selectionEnd) {
            selectionEnd = spannable.length();
            selectionStart = 0;
        }
        return A07(spannable, AnonymousClass6MP.class, selectionStart, selectionEnd);
    }

    public static final boolean A06(Spannable spannable) {
        0qQ.A0B(spannable, 0);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        if (selectionStart < 0 || selectionStart == selectionEnd) {
            selectionEnd = spannable.length();
            selectionStart = 0;
        }
        return A07(spannable, AnonymousClass91R.class, selectionStart, selectionEnd);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36320704471376663L) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (r8 == X.C306576Mr.DEFAULT) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0127, code lost:
        if (r18 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        if (r8 == r1) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.widget.EditText r18, com.instagram.common.session.UserSession r19, X.C279284yO r20, X.C306576Mr r21, java.lang.Integer r22) {
        /*
            r1 = r21
            r12 = 0
            r11 = 3
            r7 = r18
            android.content.Context r5 = r7.getContext()
            android.text.Editable r2 = r7.getText()
            X.0qQ.A07(r2)
            java.lang.Class<X.8bb> r0 = X.C358868bb.class
            java.lang.Object r0 = X.C263324Kh.A00(r2, r0)
            X.8bb r0 = (X.C358868bb) r0
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "classic"
            X.8bb r0 = X.C358878bc.A01(r0, r12, r12, r12, r12)
        L_0x0021:
            X.0qQ.A0A(r5)
            X.8f1 r4 = r0.A04
            X.8bh r10 = r0.A05
            if (r4 == 0) goto L_0x010d
            android.text.Editable r2 = r7.getText()
            int r9 = android.text.Selection.getSelectionStart(r2)
            int r6 = android.text.Selection.getSelectionEnd(r2)
            if (r9 < 0) goto L_0x0040
            if (r9 == r6) goto L_0x0040
            boolean r0 = r4.A03()
            if (r0 != 0) goto L_0x0045
        L_0x0040:
            int r6 = r2.length()
            r9 = 0
        L_0x0045:
            r7.onPreDraw()
            android.view.ViewTreeObserver r3 = r7.getViewTreeObserver()
            X.0qQ.A07(r3)
            android.text.Editable r2 = r7.getText()
            boolean r18 = r4.A02()
            X.0qQ.A0A(r2)
            X.6Mr r8 = A00(r2, r9, r6)
            if (r21 != 0) goto L_0x00aa
            X.80N r0 = X.AnonymousClass80N.A00
            r14 = r20
            boolean r17 = X.0qQ.A0K(r14, r0)
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r14, r0)
            r16 = 1
            r13 = r19
            if (r0 == 0) goto L_0x0082
            X.0Tu r15 = X.0Tu.A05
            r0 = 36320704471376663(0x81097d00022317, double:3.032697987211971E-306)
            boolean r0 = X.182.A06(r15, r13, r0)
            r15 = 1
            if (r0 != 0) goto L_0x0083
        L_0x0082:
            r15 = 0
        L_0x0083:
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x013d
            X.0Tu r14 = X.0Tu.A05
            r0 = 36323113948425067(0x810bae00082b6b, double:3.034221750199567E-306)
            boolean r0 = X.182.A06(r14, r13, r0)
            if (r0 == 0) goto L_0x013d
        L_0x0098:
            if (r17 != 0) goto L_0x010e
            if (r15 != 0) goto L_0x010e
            if (r16 != 0) goto L_0x010e
            X.6Mr r1 = X.C306576Mr.DISABLED
            if (r18 == 0) goto L_0x012b
            if (r8 == r1) goto L_0x012d
            X.6Mr r0 = X.C306576Mr.DEFAULT
            if (r8 != r0) goto L_0x00aa
        L_0x00a8:
            X.6Mr r1 = X.C306576Mr.INVERTED
        L_0x00aa:
            X.6Mr r12 = X.C306576Mr.INVERTED
            r8 = 65554(0x10012, float:9.1861E-41)
            r15 = r22
            if (r1 == r12) goto L_0x0141
            X.6Mr r0 = X.C306576Mr.DEFAULT
            if (r1 == r0) goto L_0x0141
            X.6Mr r0 = X.C306576Mr.OUTLINED
            if (r1 == r0) goto L_0x0141
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            if (r1 == r0) goto L_0x0141
            X.0eP r1 = A01(r7, r4, r9, r6)
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            if (r10 >= r9) goto L_0x00f0
            float r16 = r7.getTextSize()
            android.text.Layout r14 = r7.getLayout()
            X.0qQ.A07(r14)
            r17 = r10
            r18 = r9
            r12 = r4
            r13 = r5
            X.6MP r0 = r12.A00(r13, r14, r15, r16, r17, r18)
            r3.addOnPreDrawListener(r0)
            r2.setSpan(r0, r10, r9, r8)
        L_0x00f0:
            if (r1 <= r6) goto L_0x010d
            float r16 = r7.getTextSize()
            android.text.Layout r14 = r7.getLayout()
            X.0qQ.A07(r14)
            r17 = r6
            r18 = r1
            r12 = r4
            r13 = r5
            X.6MP r0 = r12.A00(r13, r14, r15, r16, r17, r18)
            r3.addOnPreDrawListener(r0)
            r2.setSpan(r0, r6, r1, r8)
        L_0x010d:
            return
        L_0x010e:
            if (r8 == 0) goto L_0x0139
            int r1 = r8.ordinal()
            if (r1 == r12) goto L_0x0135
            if (r1 == r11) goto L_0x0131
            r0 = 4
            if (r1 == r0) goto L_0x012d
            r0 = 1
            if (r1 == r0) goto L_0x0127
            r0 = 2
            if (r1 == r0) goto L_0x0139
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0127:
            if (r18 == 0) goto L_0x0139
            goto L_0x00a8
        L_0x012b:
            if (r8 != r1) goto L_0x00aa
        L_0x012d:
            X.6Mr r1 = X.C306576Mr.DEFAULT
            goto L_0x00aa
        L_0x0131:
            X.6Mr r1 = X.C306576Mr.INVERTED_OUTLINED
            goto L_0x00aa
        L_0x0135:
            X.6Mr r1 = X.C306576Mr.OUTLINED
            goto L_0x00aa
        L_0x0139:
            X.6Mr r1 = X.C306576Mr.DISABLED
            goto L_0x00aa
        L_0x013d:
            r16 = 0
            goto L_0x0098
        L_0x0141:
            X.0eP r6 = A01(r7, r4, r9, r6)
            java.lang.Object r0 = r6.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.lang.Object r0 = r6.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            X.6Mr r0 = X.C306576Mr.DEFAULT
            if (r1 == r0) goto L_0x0176
            if (r1 == r12) goto L_0x0176
            r4 = 0
            android.text.Layout r0 = r7.getLayout()
            X.0qQ.A07(r0)
            float[][] r0 = X.A1T.A00(r0)
            X.91R r6 = new X.91R
            r6.<init>(r5, r10, r0, r4)
        L_0x016c:
            r6.Eo9(r1)
            r3.addOnPreDrawListener(r6)
            r2.setSpan(r6, r11, r9, r8)
            return
        L_0x0176:
            float r16 = r7.getTextSize()
            android.text.Layout r14 = r7.getLayout()
            X.0qQ.A07(r14)
            r17 = r11
            r18 = r9
            r12 = r4
            r13 = r5
            X.6MP r6 = r12.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358948bj.A04(android.widget.EditText, com.instagram.common.session.UserSession, X.4yO, X.6Mr, java.lang.Integer):void");
    }

    public static final 0eP A01(EditText editText, C360708f1 r12, int i, int i2) {
        ViewTreeObserver viewTreeObserver = editText.getViewTreeObserver();
        0qQ.A07(viewTreeObserver);
        Editable text = editText.getText();
        AnonymousClass6MP[] r11 = (AnonymousClass6MP[]) text.getSpans(i, i2, r12.A01());
        AnonymousClass91R[] r9 = (AnonymousClass91R[]) text.getSpans(i, i2, AnonymousClass91R.class);
        U2W[] u2wArr = (U2W[]) text.getSpans(i, i2, U2W.class);
        C380259Xg[] r6 = (C380259Xg[]) text.getSpans(i, i2, C380259Xg.class);
        int i3 = i;
        int i4 = i2;
        for (AnonymousClass6MP r2 : r11) {
            int spanStart = text.getSpanStart(r2);
            int spanEnd = text.getSpanEnd(r2);
            i3 = Math.min(spanStart, i);
            i4 = Math.max(spanEnd, i2);
            viewTreeObserver.removeOnPreDrawListener(r2);
            text.removeSpan(r2);
        }
        for (AnonymousClass91R r22 : r9) {
            int spanStart2 = text.getSpanStart(r22);
            int spanEnd2 = text.getSpanEnd(r22);
            i3 = Math.min(spanStart2, i);
            i4 = Math.max(spanEnd2, i2);
            viewTreeObserver.removeOnPreDrawListener(r22);
            text.removeSpan(r22);
        }
        for (U2W u2w : u2wArr) {
            int spanStart3 = text.getSpanStart(u2w);
            int spanEnd3 = text.getSpanEnd(u2w);
            i3 = Math.min(spanStart3, i);
            i4 = Math.max(spanEnd3, i2);
            text.removeSpan(u2w);
        }
        for (C380259Xg r23 : r6) {
            int spanStart4 = text.getSpanStart(r23);
            int spanEnd4 = text.getSpanEnd(r23);
            i3 = Math.min(spanStart4, i);
            i4 = Math.max(spanEnd4, i2);
            text.removeSpan(r23);
        }
        return new 0eP(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static final boolean A07(Spannable spannable, Class cls, int i, int i2) {
        Object[] spans = spannable.getSpans(i, i2, cls);
        0qQ.A0A(spans);
        if (spans.length == 0) {
            return false;
        }
        0sC r4 = new 0sC(spans);
        int i3 = 0;
        while (r4.hasNext()) {
            Object next = r4.next();
            i3 += Math.min(spannable.getSpanEnd(next), i2) - Math.max(spannable.getSpanStart(next), i);
        }
        if (i3 != i2 - i) {
            return false;
        }
        return true;
    }
}

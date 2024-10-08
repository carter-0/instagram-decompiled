package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.ViewGroup;

public final class U6K extends AnonymousClass3Tj implements X2Z {
    public static final ViewGroup.LayoutParams A0C = new ViewGroup.LayoutParams(0, 0);
    public int A00;
    public int A01;
    public Spannable A02;
    public TextUtils.TruncateAt A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public boolean A0B;

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setBorderRadius(float f) {
        C13988Tno.A13(this, C13992Tns.A0A(f), 0);
    }

    private void A00() {
        float f = this.A07;
        if (!Float.isNaN(f)) {
            setTextSize(0, f);
        }
        float f2 = this.A08;
        if (!Float.isNaN(f2)) {
            super.setLetterSpacing(f2);
        }
    }

    public Spannable getSpanned() {
        return this.A02;
    }

    public final void onDraw(Canvas canvas) {
        Spannable spannable;
        0fc.A01(8192, "ReactTextView.onDraw", 1653250206);
        try {
            if (this.A05 && (spannable = this.A02) != null && this.A0A) {
                this.A0A = false;
                float width = (float) getWidth();
                C245103cK r4 = C245103cK.EXACTLY;
                float height = (float) getHeight();
                double d = (double) this.A09;
                int i = this.A01;
                boolean includeFontPadding = getIncludeFontPadding();
                W3I.A04(Layout.Alignment.ALIGN_NORMAL, spannable, r4, r4, d, width, height, i, getBreakStrategy(), getHyphenationFrequency(), includeFontPadding);
                setText(this.A02);
            }
            if (this.A04 != AnonymousClass05K.A00) {
                W3s.A03(canvas, this);
            }
            super.onDraw(canvas);
            0fc.A00(8192, 341821114);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r19 <= r2) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        if (r2 != false) goto L_0x014a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0127 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r10 = r21
            int r18 = r10.getId()
            java.lang.CharSequence r0 = r10.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x01b3
            r0 = 2
            int r0 = r18 % r0
            if (r0 == 0) goto L_0x01b3
            android.content.Context r1 = r10.getContext()
            X.Q6H r1 = (X.Q6H) r1
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r0 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r8 = r1.A03(r0)
            X.0Sd.A00(r8)
            com.facebook.react.uimanager.UIManagerModule r8 = (com.facebook.react.uimanager.UIManagerModule) r8
            java.lang.CharSequence r7 = r10.getText()
            android.text.Spanned r7 = (android.text.Spanned) r7
            android.text.Layout r6 = r10.getLayout()
            if (r6 == 0) goto L_0x01b3
            int r2 = r7.length()
            java.lang.Class<X.U2c> r1 = X.C14702U2c.class
            r0 = 0
            java.lang.Object[] r5 = r7.getSpans(r0, r2, r1)
            X.U2c[] r5 = (X.C14702U2c[]) r5
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0177
            int r0 = r5.length
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L_0x0047:
            int r9 = r25 - r23
            int r19 = r26 - r24
            int r0 = r5.length
            r20 = r0
            r3 = 0
        L_0x004f:
            r0 = r20
            if (r3 >= r0) goto L_0x017a
            r1 = r5[r3]
            int r0 = r1.A01
            android.view.View r11 = r8.resolveView(r0)
            int r13 = r7.getSpanStart(r1)
            int r12 = r6.getLineForOffset(r13)
            int r0 = r6.getEllipsisCount(r12)
            if (r0 <= 0) goto L_0x0074
            int r2 = r6.getLineStart(r12)
            int r0 = r6.getEllipsisStart(r12)
            int r2 = r2 + r0
            if (r13 >= r2) goto L_0x0159
        L_0x0074:
            int r0 = r10.A01
            if (r12 >= r0) goto L_0x0159
            int r0 = r6.getLineEnd(r12)
            if (r13 >= r0) goto L_0x0159
            int r0 = r1.A02
            r17 = r0
            int r0 = r1.A00
            r16 = r0
            boolean r2 = r6.isRtlCharAt(r13)
            int r1 = r6.getParagraphDirection(r12)
            r0 = -1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r0)
            int r0 = r7.length()
            int r0 = r0 + -1
            if (r13 != r0) goto L_0x0137
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0131
            int r0 = r6.getLineEnd(r12)
            int r0 = r0 + -1
            char r14 = r7.charAt(r0)
            r0 = 10
            if (r14 != r0) goto L_0x0131
            float r0 = r6.getLineMax(r12)
        L_0x00b3:
            if (r1 == 0) goto L_0x012b
            int r0 = (int) r0
            int r0 = r9 - r0
        L_0x00b8:
            if (r2 == 0) goto L_0x0153
            int r1 = r10.getTotalPaddingRight()
        L_0x00be:
            int r0 = r0 + r1
            int r1 = r23 + r0
            int r2 = r10.getTotalPaddingTop()
            int r12 = r6.getLineBaseline(r12)
            int r2 = r2 + r12
            int r2 = r2 - r16
            int r15 = r24 + r2
            if (r9 <= r0) goto L_0x00d5
            r0 = 0
            r12 = r19
            if (r12 > r2) goto L_0x00d7
        L_0x00d5:
            r0 = 8
        L_0x00d7:
            int r17 = r1 + r17
            int r16 = r15 + r16
            r11.setVisibility(r0)
            r12 = r17
            r2 = r16
            r11.layout(r1, r15, r12, r2)
            boolean r2 = r10.A06
            if (r2 == 0) goto L_0x0127
            com.facebook.react.bridge.WritableNativeMap r2 = new com.facebook.react.bridge.WritableNativeMap
            r2.<init>()
            java.lang.String r12 = "index"
            java.lang.String r11 = "visibility"
            r14 = 8
            if (r0 == r14) goto L_0x016b
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "visible"
            r2.putString(r11, r0)
            r2.putInt(r12, r13)
            double r0 = X.Pxe.A01(r1)
            java.lang.String r11 = "left"
            r2.putDouble(r11, r0)
            double r0 = X.Pxe.A01(r15)
            java.lang.String r11 = "top"
            r2.putDouble(r11, r0)
            double r0 = X.Pxe.A01(r17)
            java.lang.String r11 = "right"
            r2.putDouble(r11, r0)
            double r0 = X.Pxe.A01(r16)
            java.lang.String r11 = "bottom"
            r2.putDouble(r11, r0)
        L_0x0124:
            r4.add(r2)
        L_0x0127:
            int r3 = r3 + 1
            goto L_0x004f
        L_0x012b:
            float r0 = r6.getLineRight(r12)
            int r0 = (int) r0
            goto L_0x014a
        L_0x0131:
            float r0 = r6.getLineWidth(r12)
            goto L_0x00b3
        L_0x0137:
            if (r1 != r2) goto L_0x014e
            float r0 = r6.getPrimaryHorizontal(r13)
        L_0x013d:
            int r0 = (int) r0
            if (r1 == 0) goto L_0x0148
            float r1 = r6.getLineRight(r12)
            int r1 = (int) r1
            int r1 = r1 - r0
            int r0 = r9 - r1
        L_0x0148:
            if (r2 == 0) goto L_0x0153
        L_0x014a:
            int r0 = r0 - r17
            goto L_0x00b8
        L_0x014e:
            float r0 = r6.getSecondaryHorizontal(r13)
            goto L_0x013d
        L_0x0153:
            int r1 = r10.getTotalPaddingLeft()
            goto L_0x00be
        L_0x0159:
            r0 = 8
            r11.setVisibility(r0)
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0127
            com.facebook.react.bridge.WritableNativeMap r2 = new com.facebook.react.bridge.WritableNativeMap
            r2.<init>()
            java.lang.String r12 = "index"
            java.lang.String r11 = "visibility"
        L_0x016b:
            java.lang.String r0 = "gone"
            goto L_0x0170
        L_0x016e:
            java.lang.String r0 = "unknown"
        L_0x0170:
            r2.putString(r11, r0)
            r2.putInt(r12, r13)
            goto L_0x0124
        L_0x0177:
            r4 = 0
            goto L_0x0047
        L_0x017a:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x01b3
            r1 = 5
            X.WqM r0 = new X.WqM
            r0.<init>((java.lang.Object) r10, (int) r1)
            java.util.Collections.sort(r4, r0)
            com.facebook.react.bridge.WritableNativeArray r3 = new com.facebook.react.bridge.WritableNativeArray
            r3.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0190:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r1.next()
            com.facebook.react.bridge.ReadableMap r0 = (com.facebook.react.bridge.ReadableMap) r0
            r3.pushMap(r0)
            goto L_0x0190
        L_0x01a0:
            com.facebook.react.bridge.WritableNativeMap r2 = new com.facebook.react.bridge.WritableNativeMap
            r2.<init>()
            java.lang.String r0 = "inlineViews"
            r2.putArray(r0, r3)
            if (r8 == 0) goto L_0x01b3
            java.lang.String r1 = "topInlineViewLayout"
            r0 = r18
            r8.receiveEvent(r0, r1, r2)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U6K.onLayout(boolean, int, int, int, int):void");
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.A05 = z;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.A03 = truncateAt;
    }

    public void setFontSize(float f) {
        this.A07 = (float) Math.ceil((double) W2U.A03(this.A05 ? 1 : 0, f));
        A00();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = 8388611;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = 48;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setLinkifyMask(int i) {
        this.A00 = i;
    }

    public void setMinimumFontSize(float f) {
        this.A09 = f;
        this.A0A = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.A06 = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.A01 = i;
        setMaxLines(i);
        this.A0A = true;
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C18105VlZ.A00(str)) == null) {
            num = AnonymousClass05K.A00;
        }
        this.A04 = num;
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.A02 = spannable;
        this.A0A = true;
    }

    public void setText(C17664Vbv vbv) {
        0fc.A01(8192, "ReactTextView.setText(ReactTextUpdate)", 1653250206);
        try {
            if (getLayoutParams() == null) {
                setLayoutParams(A0C);
            }
            Spannable spannable = vbv.A08;
            int i = this.A00;
            if (i > 0) {
                Linkify.addLinks(spannable, i);
                DbT.A1H(this);
            }
            setText(spannable);
            float f = vbv.A01;
            float f2 = vbv.A03;
            float f3 = vbv.A02;
            float f4 = vbv.A00;
            if (!(f == -1.0f || f2 == -1.0f || f3 == -1.0f || f4 == -1.0f)) {
                setPadding((int) Math.floor((double) f), (int) Math.floor((double) f2), (int) Math.floor((double) f3), (int) Math.floor((double) f4));
            }
            int i2 = vbv.A06;
            if (i2 != getGravityHorizontal()) {
                setGravityHorizontal(i2);
            }
            int breakStrategy = getBreakStrategy();
            int i3 = vbv.A07;
            if (breakStrategy != i3) {
                setBreakStrategy(i3);
            }
            int justificationMode = getJustificationMode();
            int i4 = vbv.A05;
            if (justificationMode != i4) {
                setJustificationMode(i4);
            }
            requestLayout();
            0fc.A00(8192, 341821114);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public void setTextIsSelectable(boolean z) {
        this.A0B = z;
        super.setTextIsSelectable(z);
    }

    public static void A02(U6K u6k) {
        u6k.A01 = Integer.MAX_VALUE;
        u6k.A05 = false;
        u6k.A00 = 0;
        u6k.A06 = false;
        u6k.A0B = false;
        u6k.A0A = false;
        u6k.A03 = TextUtils.TruncateAt.END;
        u6k.A07 = Float.NaN;
        u6k.A09 = Float.NaN;
        u6k.A08 = 0.0f;
        u6k.A04 = AnonymousClass05K.A00;
        u6k.A02 = null;
    }

    private Q6H getReactContext() {
        return (Q6H) getContext();
    }

    public final void A03() {
        TextUtils.TruncateAt truncateAt;
        A02(this);
        if (getBackground() instanceof C14681U1c) {
            Drawable background = getBackground();
            0qQ.A0C(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            setBackground(((C14681U1c) background).A02);
        }
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        setJustificationMode(0);
        setLayoutParams(A0C);
        super.setText((CharSequence) null);
        A00();
        setGravity(8388659);
        setNumberOfLines(this.A01);
        this.A05 = this.A05;
        this.A00 = this.A00;
        setTextIsSelectable(this.A0B);
        setIncludeFontPadding(true);
        setEnabled(true);
        this.A00 = 0;
        this.A03 = this.A03;
        setEnabled(true);
        setFocusable(16);
        setHyphenationFrequency(0);
        if (this.A01 == Integer.MAX_VALUE || this.A05) {
            truncateAt = null;
        } else {
            truncateAt = this.A03;
        }
        setEllipsize(truncateAt);
    }

    public final int E66(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i3);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i2);
                    WJc[] wJcArr = (WJc[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, WJc.class);
                    if (wJcArr != null) {
                        int length = text.length();
                        for (int i4 = 0; i4 < wJcArr.length; i4++) {
                            int spanStart = spanned.getSpanStart(wJcArr[i4]);
                            int spanEnd = spanned.getSpanEnd(wJcArr[i4]);
                            if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                                id = wJcArr[i4].A00;
                                length = i;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    0I1.A03("ReactNative", AnonymousClass7TF.A0m("Crash in HorizontalMeasurementProvider: ", e));
                }
            }
        }
        return id;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (03v.A00(this) != null) {
            2Vy A012 = 03v.A01(this);
            if (A012 instanceof 2Vy) {
                if (A012.A0o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1808876537);
        super.onAttachedToWindow();
        setTextIsSelectable(this.A0B);
        AnonymousClass0fD.A0D(29603842, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(425109165);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1565659421, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(-1108141289);
        0fc.A01(8192, "ReactTextView.onMeasure", 1653250206);
        try {
            super.onMeasure(i, i2);
            0fc.A00(8192, 341821114);
            AnonymousClass0fD.A0D(-1403801646, A062);
            return;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        AnonymousClass0fD.A0D(732660987, A062);
        throw th;
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    public void setBorderStyle(String str) {
        W3s.A0C(this, C13991Tnr.A0X(str));
    }

    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.A0A = true;
    }

    public void setHyphenationFrequency(int i) {
        super.setHyphenationFrequency(i);
        this.A0A = true;
    }

    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.A0A = true;
    }

    public void setLetterSpacing(float f) {
        if (!Float.isNaN(f)) {
            this.A08 = W2U.A01(f) / this.A07;
            A00();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        C13988Tno.A10(this, i);
    }
}

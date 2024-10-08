package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.instagram.android.R;
import java.util.ArrayList;
import org.webrtc.ScreenCapturerAndroid;

public final class U66 extends AnonymousClass3U5 {
    public static final KeyListener A0V = QwertyKeyListener.getInstanceForFullKeyboard();
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public int A03;
    public C20831X0g A04 = null;
    public C20877X2e A05;
    public C18063Vkp A06;
    public C20839X0o A07;
    public C20840X0p A08;
    public C20879X2g A09;
    public String A0A = null;
    public String A0B = null;
    public ArrayList A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public W7q A0J;
    public W7g A0K;
    public Integer A0L = AnonymousClass05K.A00;
    public String A0M = null;
    public String A0N;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q;
    public boolean A0R = false;
    public final InputMethodManager A0S;
    public final int A0T;
    public final int A0U;

    public U66(Context context) {
        super(context, (AttributeSet) null, R.attr.editTextStyle);
        setFocusableInTouchMode(false);
        Object systemService = context.getSystemService("input_method");
        0Sd.A00(systemService);
        this.A0S = (InputMethodManager) systemService;
        this.A0T = getGravity() & 8388615;
        this.A0U = getGravity() & 112;
        this.A02 = 0;
        this.A0G = false;
        this.A0Q = false;
        this.A0C = null;
        this.A0K = null;
        this.A03 = getInputType();
        if (this.A0J == null) {
            this.A0J = new W7q();
        }
        this.A08 = null;
        this.A06 = new C18063Vkp();
        A03();
        int i = C14750U7h.A05;
        03v.A0B(this, new USR(this, this, getImportantForAccessibility(), isFocusable()));
        C18853W7y w7y = new C18853W7y(this);
        setCustomSelectionActionModeCallback(w7y);
        setCustomInsertionActionModeCallback(w7y);
    }

    public static boolean A02(U66 u66) {
        u66.setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, (Rect) null);
        if (u66.getShowSoftInputOnFocus()) {
            u66.A0S.showSoftInput(u66, 0);
        }
        return requestFocus;
    }

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        this.A0S.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final boolean isLayoutRequested() {
        return false;
    }

    public void setBorderRadius(float f) {
        C13988Tno.A13(this, C13992Tns.A0A(f), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r0 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A0N
            r1 = 5
            if (r2 == 0) goto L_0x000c
            int r0 = r2.hashCode()
            switch(r0) {
                case -1273775369: goto L_0x0020;
                case -906336856: goto L_0x0028;
                case 3304: goto L_0x0030;
                case 3377907: goto L_0x0038;
                case 3387192: goto L_0x003f;
                case 3526536: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            r1 = 6
        L_0x000d:
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x0049
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r3.setImeOptions(r0)
            return
        L_0x0018:
            java.lang.String r0 = "send"
            boolean r0 = r2.equals(r0)
            r1 = 4
            goto L_0x0046
        L_0x0020:
            java.lang.String r0 = "previous"
            boolean r0 = r2.equals(r0)
            r1 = 7
            goto L_0x0046
        L_0x0028:
            java.lang.String r0 = "search"
            boolean r0 = r2.equals(r0)
            r1 = 3
            goto L_0x0046
        L_0x0030:
            java.lang.String r0 = "go"
            boolean r0 = r2.equals(r0)
            r1 = 2
            goto L_0x0046
        L_0x0038:
            java.lang.String r0 = "next"
            boolean r0 = r2.equals(r0)
            goto L_0x0046
        L_0x003f:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            r1 = 1
        L_0x0046:
            if (r0 != 0) goto L_0x000d
            goto L_0x000c
        L_0x0049:
            r3.setImeOptions(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U66.A00():void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.UTD, X.W0S] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.WJd) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.U66 r6) {
        /*
            X.X0o r4 = r6.A07
            if (r4 == 0) goto L_0x0066
            X.WJd r4 = (X.WJd) r4
            X.X2e r5 = r4.A03
            if (r5 == 0) goto L_0x0066
            X.U66 r3 = r4.A04
            int r2 = r3.getWidth()
            int r1 = r3.getHeight()
            android.text.Layout r0 = r3.getLayout()
            if (r0 == 0) goto L_0x003e
            int r2 = r3.getCompoundPaddingLeft()
            android.text.Layout r0 = r3.getLayout()
            int r0 = r0.getWidth()
            int r2 = r2 + r0
            int r0 = r3.getCompoundPaddingRight()
            int r2 = r2 + r0
            int r1 = r3.getCompoundPaddingTop()
            android.text.Layout r0 = r3.getLayout()
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            int r0 = r3.getCompoundPaddingBottom()
            int r1 = r1 + r0
        L_0x003e:
            int r0 = r4.A01
            if (r2 != r0) goto L_0x0046
            int r0 = r4.A00
            if (r1 == r0) goto L_0x0066
        L_0x0046:
            r4.A00 = r1
            r4.A01 = r2
            int r4 = r4.A02
            int r3 = r3.getId()
            float r0 = (float) r2
            float r2 = X.W2U.A00(r0)
            float r0 = (float) r1
            float r1 = X.W2U.A00(r0)
            X.UTD r0 = new X.UTD
            r0.<init>(r4, r3)
            r0.A01 = r2
            r0.A00 = r1
            r5.APe(r0)
        L_0x0066:
            X.Q6H r1 = com.facebook.react.uimanager.UIManagerHelper.A02(r6)
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x0086
            X.Vb7 r2 = new X.Vb7
            r2.<init>(r6)
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r0 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r1 = r1.A03(r0)
            com.facebook.react.uimanager.UIManagerModule r1 = (com.facebook.react.uimanager.UIManagerModule) r1
            if (r1 == 0) goto L_0x0086
            int r0 = r6.getId()
            r1.setViewLocalData(r0, r2)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U66.A01(X.U66):void");
    }

    private W7g getTextWatcherDelegator() {
        W7g w7g = this.A0K;
        if (w7g != null) {
            return w7g;
        }
        W7g w7g2 = new W7g(this);
        this.A0K = w7g2;
        return w7g2;
    }

    public final void A03() {
        C18063Vkp vkp = this.A06;
        setTextSize(0, (float) vkp.A02());
        float A002 = vkp.A00();
        if (!Float.isNaN(A002)) {
            setLetterSpacing(A002);
        }
    }

    public final void A04(int i, int i2, int i3) {
        int A0C2;
        int A0C3;
        if (i >= this.A02 && i2 != -1 && i3 != -1) {
            if (getText() == null) {
                A0C2 = 0;
            } else {
                A0C2 = C13988Tno.A0C(this);
            }
            int max = Math.max(0, Math.min(i2, A0C2));
            if (getText() == null) {
                A0C3 = 0;
            } else {
                A0C3 = C13988Tno.A0C(this);
            }
            setSelection(max, Math.max(0, Math.min(i3, A0C3)));
        }
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (this.A0C == null) {
            this.A0C = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.A0C.add(textWatcher);
    }

    public boolean getDisableFullscreenUI() {
        return this.A0Q;
    }

    public String getReturnKeyType() {
        return this.A0N;
    }

    public int getStagedInputType() {
        return this.A03;
    }

    public C20831X0g getStateWrapper() {
        return null;
    }

    public String getSubmitBehavior() {
        return this.A0B;
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0L != AnonymousClass05K.A00) {
            W3s.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || A06()) {
            return super.onKeyUp(i, keyEvent);
        }
        C13989Tnp.A1A(this, this.A0S);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.W0S] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollChanged(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r0 = r16
            super.onScrollChanged(r13, r14, r15, r0)
            X.X0p r10 = r12.A08
            if (r10 == 0) goto L_0x0056
            X.WJe r10 = (X.WJe) r10
            int r0 = r10.A00
            if (r0 != r13) goto L_0x0013
            int r0 = r10.A01
            if (r0 == r14) goto L_0x0056
        L_0x0013:
            int r11 = r10.A02
            X.U66 r0 = r10.A04
            int r9 = r0.getId()
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            float r7 = (float) r13
            float r6 = (float) r14
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            r3 = 0
            r2 = 0
            X.0l2 r0 = X.UTN.A09
            java.lang.Object r1 = r0.A7A()
            X.UTN r1 = (X.UTN) r1
            if (r1 != 0) goto L_0x0038
            X.UTN r1 = new X.UTN
            r1.<init>()
        L_0x0038:
            r1.A0A(r11, r9)
            r1.A08 = r8
            r1.A00 = r7
            r1.A01 = r6
            r1.A02 = r3
            r1.A03 = r3
            r1.A05 = r2
            r1.A04 = r2
            r1.A07 = r5
            r1.A06 = r4
            X.X2e r0 = r10.A03
            r0.APe(r1)
            r10.A00 = r13
            r10.A01 = r14
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U66.onScrollChanged(int, int, int, int):void");
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.A0C;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.A0C.isEmpty()) {
                this.A0C = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public void setAllowFontScaling(boolean z) {
        C18063Vkp vkp = this.A06;
        if (vkp.A06 != z) {
            vkp.A06 = z;
            A03();
        }
    }

    public void setAutoFocus(boolean z) {
        this.A0D = z;
    }

    public void setContentSizeWatcher(C20839X0o x0o) {
        this.A07 = x0o;
    }

    public void setContextMenuHidden(boolean z) {
        this.A0E = z;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.A0Q = z;
        A00();
    }

    public void setEventDispatcher(C20877X2e x2e) {
        this.A05 = x2e;
    }

    public void setFontFamily(String str) {
        this.A0A = str;
        this.A0I = true;
    }

    public void setFontSize(float f) {
        this.A06.A00 = f;
        A03();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.A0T;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.A0U;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setLetterSpacingPt(float f) {
        this.A06.A02 = f;
        A03();
    }

    public void setLineHeight(int i) {
        this.A06.A03 = (float) i;
    }

    public void setMaxFontSizeMultiplier(float f) {
        C18063Vkp vkp = this.A06;
        if (f != vkp.A04) {
            if (f != 0.0f && f < 1.0f) {
                0I1.A04("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
                f = Float.NaN;
            }
            vkp.A04 = f;
            A03();
        }
    }

    public void setOnKeyPress(boolean z) {
        this.A0H = z;
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C18105VlZ.A00(str)) == null) {
            num = AnonymousClass05K.A00;
        }
        this.A0L = num;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (!2Ob.A00(str, this.A0M)) {
            this.A0M = str;
            setHint(str);
        }
    }

    public void setReturnKeyType(String str) {
        this.A0N = str;
        A00();
    }

    public void setScrollWatcher(C20840X0p x0p) {
        this.A08 = x0p;
    }

    public void setSelectionWatcher(C20879X2g x2g) {
        this.A09 = x2g;
    }

    public void setStagedInputType(int i) {
        this.A03 = i;
    }

    public void setStateWrapper(C20831X0g x0g) {
        this.A04 = x0g;
    }

    public void setSubmitBehavior(String str) {
        this.A0B = str;
    }

    public final void A05(C17664Vbv vbv) {
        Integer num;
        C14681U1c u1c;
        U1B u1b;
        if (((getInputType() & 144) == 0 || !TextUtils.equals(getText(), vbv.A08)) && vbv.A04 >= this.A02) {
            Spannable spannable = vbv.A08;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            Object[] spans = getText().getSpans(0, length(), Object.class);
            for (Object obj : spans) {
                int spanFlags = getText().getSpanFlags(obj);
                boolean A1S = AnonymousClass7TF.A1S(spanFlags & 33, 33);
                if (obj instanceof C20838X0n) {
                    getText().removeSpan(obj);
                }
                if (A1S) {
                    int spanStart = getText().getSpanStart(obj);
                    int spanEnd = getText().getSpanEnd(obj);
                    getText().removeSpan(obj);
                    Editable text = getText();
                    int i = spanStart;
                    if (spanStart <= spannableStringBuilder.length() && spanEnd <= spannableStringBuilder.length()) {
                        while (true) {
                            if (i < spanEnd) {
                                if (text.charAt(i) != spannableStringBuilder.charAt(i)) {
                                    break;
                                }
                                i++;
                            } else {
                                spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                                break;
                            }
                        }
                    }
                }
            }
            for (Object obj2 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactAbsoluteSizeSpan.class)) {
                if (((AbsoluteSizeSpan) obj2).getSize() == this.A06.A02()) {
                    spannableStringBuilder.removeSpan(obj2);
                }
            }
            for (Object obj3 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactBackgroundColorSpan.class)) {
                Integer valueOf = Integer.valueOf(((BackgroundColorSpan) obj3).getBackgroundColor());
                Drawable background = getBackground();
                if (!(background instanceof C14681U1c) || (u1c = (C14681U1c) background) == null || (u1b = u1c.A03) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(u1b.A01);
                }
                if (2Ob.A00(valueOf, num)) {
                    spannableStringBuilder.removeSpan(obj3);
                }
            }
            for (Object obj4 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactForegroundColorSpan.class)) {
                if (((ForegroundColorSpan) obj4).getForegroundColor() == getCurrentTextColor()) {
                    spannableStringBuilder.removeSpan(obj4);
                }
            }
            for (Object obj5 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactStrikethroughSpan.class)) {
                if ((getPaintFlags() & 16) != 0) {
                    spannableStringBuilder.removeSpan(obj5);
                }
            }
            for (Object obj6 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactUnderlineSpan.class)) {
                if ((getPaintFlags() & 8) != 0) {
                    spannableStringBuilder.removeSpan(obj6);
                }
            }
            for (Object obj7 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), U2R.class)) {
                if (((U2R) obj7).A00 == this.A06.A00()) {
                    spannableStringBuilder.removeSpan(obj7);
                }
            }
            for (Object obj8 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), U2S.class)) {
                U2S u2s = (U2S) obj8;
                int i2 = u2s.A00;
                if (i2 == -1) {
                    i2 = 0;
                }
                if (i2 == this.A00 && 2Ob.A00(u2s.A03, this.A0A)) {
                    int i3 = u2s.A01;
                    if (i3 == -1) {
                        i3 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                    }
                    if (i3 == this.A01 && 2Ob.A00(u2s.A04, getFontFeatureSettings())) {
                        spannableStringBuilder.removeSpan(obj8);
                    }
                }
            }
            this.A0F = true;
            if (spannable.length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.A0F = false;
            int breakStrategy = getBreakStrategy();
            int i4 = vbv.A07;
            if (breakStrategy != i4) {
                setBreakStrategy(i4);
            }
        }
    }

    public final boolean A06() {
        return AnonymousClass7TF.A1P(getInputType() & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    }

    public final void finalize() {
        W3I.A01.remove(Integer.valueOf(getId()));
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1536873527);
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.A0D && !this.A0P) {
            A02(this);
        }
        this.A0P = true;
        AnonymousClass0fD.A0D(1112628646, A062);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.U42, android.view.inputmethod.InputConnectionWrapper] */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String str;
        UIManagerHelper.A02(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.A0H) {
            C20877X2e x2e = this.A05;
            ? inputConnectionWrapper = new InputConnectionWrapper(onCreateInputConnection, false);
            inputConnectionWrapper.A02 = null;
            inputConnectionWrapper.A00 = x2e;
            inputConnectionWrapper.A01 = this;
            onCreateInputConnection = inputConnectionWrapper;
        }
        if (A06()) {
            if ((str = this.A0B) != null ? !str.equals("blurAndSubmit") : A06()) {
                String str2 = this.A0B;
                if (str2 != null) {
                }
            }
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-722712408);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-776997778, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        C20879X2g x2g;
        int A062 = AnonymousClass0fD.A06(-1637399900);
        super.onFocusChanged(z, i, rect);
        if (z && (x2g = this.A09) != null) {
            x2g.Dip(getSelectionStart(), getSelectionEnd());
        }
        AnonymousClass0fD.A0D(1883698654, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A01(this);
        if (this.A0R && isFocused()) {
            selectAll();
            this.A0R = false;
        }
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.A09 != null && hasFocus()) {
            this.A09.Dip(i, i2);
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1309634459);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A0O = true;
            JTP.A15(this, true);
        } else if (action == 2 && this.A0O) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                JTP.A15(this, false);
            }
            this.A0O = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(456844790, A052);
        return onTouchEvent;
    }

    public final boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void setBorderStyle(String str) {
        W3s.A0C(this, C13991Tnr.A0X(str));
    }

    public void setFontFeatureSettings(String str) {
        if (!2Ob.A00(str, getFontFeatureSettings())) {
            super.setFontFeatureSettings(str);
            this.A0I = true;
        }
    }

    public void setFontStyle(String str) {
        int A002 = C18788W1q.A00(str);
        if (A002 != this.A00) {
            this.A00 = A002;
            this.A0I = true;
        }
    }

    public void setFontWeight(String str) {
        int A012 = C18788W1q.A01(str);
        if (A012 != this.A01) {
            this.A01 = A012;
            this.A0I = true;
        }
    }

    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.A03 = i;
        super.setTypeface(typeface);
        if (A06()) {
            setSingleLine(false);
        }
        W7q w7q = this.A0J;
        if (w7q == null) {
            w7q = new W7q();
            this.A0J = w7q;
        }
        w7q.A00 = i;
        setKeyListener(w7q);
    }

    public void setSelectTextOnFocus(boolean z) {
        super.setSelectAllOnFocus(z);
        this.A0R = z;
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

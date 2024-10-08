package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.NQj  reason: case insensitive filesystem */
public final class C68630NQj extends IgTextView implements C74220Pr7 {
    public int A00;
    public C307326Pr A01;
    public String A02 = "";
    public final View A03 = this;
    public final C58840Ae A04;
    public final AnonymousClass9I8 A05;
    public final AnonymousClass9JF A06;
    public final String A07;
    public final String A08;

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, android.view.View, X.NQj] */
    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        C68630NQj.super.onVisibilityChanged(view, i);
        CharSequence text = getText();
        int i2 = 0;
        if (i == 0) {
            if (text != null && text.length() != 0) {
                AnonymousClass6MO[] r3 = (AnonymousClass6MO[]) C263324Kh.A06(C66580MXl.A0D(getText()), AnonymousClass6MO.class);
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                int length = r3.length;
                while (i2 < length) {
                    viewTreeObserver.addOnPreDrawListener(r3[i2]);
                    i2++;
                }
            }
        } else if (text != null && text.length() != 0) {
            AnonymousClass6MO[] r32 = (AnonymousClass6MO[]) C263324Kh.A06(C66580MXl.A0D(getText()), AnonymousClass6MO.class);
            ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
            int length2 = r32.length;
            while (i2 < length2) {
                viewTreeObserver2.removeOnPreDrawListener(r32[i2]);
                i2++;
            }
        }
    }

    public void setOnTruncationClickListener(C307326Pr r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.TextView, X.NQj] */
    private final int A00(String str) {
        int measureText;
        if (this.A05.A02) {
            int i = 0;
            List A0R = 00l.A0R(str, new String[]{"\n"}, 0);
            int i2 = 0;
            for (Object next : A0R) {
                int i3 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                String str2 = (String) next;
                if (str2.length() > 0) {
                    if (i < DbT.A02(A0R, 1)) {
                        measureText = Math.max(getActualViewWidth(), (int) getPaint().measureText(str2));
                    } else {
                        measureText = (int) getPaint().measureText(str2);
                    }
                    i2 += measureText;
                }
                i = i3;
            }
            return i2;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        getPaint().getTextBounds(str, 0, C66581MXm.A04(str), A0W);
        return A0W.width();
    }

    public static final Integer A01(String str) {
        int i;
        String A0g = 00p.A0g(str, "#", "", false);
        int length = A0g.length();
        if (length < 6) {
            return null;
        }
        int parseInt = Integer.parseInt(C51967G9n.A0q(A0g, 0, 2), 16);
        int parseInt2 = Integer.parseInt(C51967G9n.A0q(A0g, 2, 4), 16);
        int parseInt3 = Integer.parseInt(C51967G9n.A0q(A0g, 4, 6), 16);
        if (length == 8) {
            i = Integer.parseInt(C51967G9n.A0q(A0g, 6, 8), 16);
        } else {
            i = 255;
        }
        return Integer.valueOf(Color.argb(i, parseInt, parseInt2, parseInt3));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, X.NQj] */
    private final int getActualViewWidth() {
        return (this.A00 - getPaddingStart()) - getPaddingEnd();
    }

    public AnonymousClass9JF getSpec() {
        return this.A06;
    }

    public View getView() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, android.view.View, X.NQj] */
    public C68630NQj(Context context, C58840Ae r7, AnonymousClass9I8 r8, AnonymousClass9JF r9, String str, String str2) {
        super(context);
        0qm r0;
        int i;
        this.A06 = r9;
        this.A05 = r8;
        this.A04 = r7;
        this.A07 = str;
        this.A08 = str2;
        0nA.A03(context, (float) ((C68155N2v) r9.A02).A00);
        int A012 = AnonymousClass1GB.A01(0nA.A00(context, 8.0f));
        int A013 = AnonymousClass1GB.A01(0nA.A00(context, 4.0f));
        setPadding(A012, A013, A012, A013);
        setTextSize((float) ((C68155N2v) this.A06.A02).A00);
        Integer num = ((C68155N2v) this.A06.A02).A03;
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
        int intValue = num.intValue();
        if (intValue == 4) {
            r0 = 0qm.A0X;
        } else if (intValue == 2 || intValue == 0) {
            r0 = 0qm.A0t;
        } else if (intValue == 3 || intValue == 1) {
            r0 = 0qm.A0u;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Typeface A022 = A002.A02(r0);
        if (A022 == null) {
            A022 = Typeface.DEFAULT;
            0qQ.A08(A022);
        }
        setTypeface(A022);
        Integer A014 = A01(((C68155N2v) this.A06.A02).A06);
        if (A014 != null) {
            i = A014.intValue();
        } else {
            i = -16777216;
        }
        setTextColor(i);
        int A032 = C51967G9n.A03(((C68155N2v) this.A06.A02).A02, 0);
        int i2 = 3;
        if (A032 == 0) {
            i2 = 2;
        } else if (A032 == 1) {
            i2 = 4;
        } else if (A032 != 2) {
            throw AnonymousClass7TE.A1K();
        }
        setTextAlignment(i2);
        Integer num2 = ((C68155N2v) this.A06.A02).A04;
        if (num2 != null) {
            setMaxLines(num2.intValue());
        }
        Float f = ((C68155N2v) this.A06.A02).A01;
        float f2 = 1.0f;
        if (f != null) {
            float floatValue = f.floatValue();
            if (floatValue != 0.0f) {
                f2 = floatValue;
            }
        }
        setLineSpacing(0.0f, f2);
        setText(this.A06.A04);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, X.NQj] */
    private final boolean A02() {
        Layout layout = getLayout();
        if (layout != null) {
            if (layout.getLineCount() <= getMaxLines()) {
                CharSequence text = getText();
                0qQ.A07(text);
                if (text.length() <= 0 || C66581MXm.A04(this.A06.A04) <= C66581MXm.A04(getText().toString())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.widget.TextView, android.view.View, java.lang.Object, X.NQj] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r10 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r2 = X.DbV.A12(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (A00(X.002.A0R(r2, r1)) <= r4) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if ((X.C66581MXm.A04(r2) - 1) > 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r12.A02 = r2;
        r4 = X.C66580MXl.A0D(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        r2 = X.C51967G9n.A0q(r2, 0, r2.length() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        r12.A02 = r2;
        r4 = X.C66580MXl.A0D(X.002.A0R(r2, r1));
        r7 = new android.text.style.UnderlineSpan();
        r6 = X.C66581MXm.A04(r2);
        r4.setSpan(r7, r6 + "…".length(), X.DbX.A05(r4.toString()), 33);
        r1 = new X.C60014JdN(r12, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0192, code lost:
        if (r8 == null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0199, code lost:
        if (r9.length() > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019b, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019c, code lost:
        r4.setSpan(r1, r6 + r11, X.DbX.A05(r4.toString()), 33);
        r0 = A01(((X.C68155N2v) r3.A02).A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        if (r0 == null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b4, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b8, code lost:
        r4.setSpan(X.C66580MXl.A0E(r0), 0, X.DbX.A05(r4.toString()), 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c9, code lost:
        r0 = -16777216;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        /*
            r12 = this;
            X.C68630NQj.super.onLayout(r13, r14, r15, r16, r17)
            if (r13 == 0) goto L_0x001b
            X.9JF r3 = r12.A06
            java.lang.Object r0 = r3.A00
            r7 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x001c
            r0 = 8
            r12.setVisibility(r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x01d2
            r12.setClickable(r7)
            android.text.Layout r0 = r12.getLayout()
            r5 = 0
            int r4 = r0.getLineStart(r5)
            android.text.Layout r2 = r12.getLayout()
            int r1 = r12.getLineCount()
            int r0 = r12.getMaxLines()
            int r0 = java.lang.Math.min(r1, r0)
            r11 = 1
            int r0 = r0 - r7
            int r0 = r2.getLineEnd(r0)
            java.lang.String r6 = r3.A04
            java.lang.String r2 = X.C51967G9n.A0q(r6, r4, r0)
            X.9I8 r0 = r12.A05
            boolean r10 = r0.A01
            if (r10 == 0) goto L_0x01cc
            int r1 = r12.A00
            int r0 = r12.A00(r2)
            int r4 = java.lang.Math.max(r1, r0)
        L_0x005a:
            r1 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r8 = r3.A05
            r0 = r8
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x0064
            r0 = r9
        L_0x0064:
            java.lang.String r1 = X.002.A0D(r0, r1)
            if (r10 == 0) goto L_0x006e
        L_0x006a:
            java.lang.String r2 = X.DbV.A12(r2)
        L_0x006e:
            java.lang.String r0 = X.002.A0R(r2, r1)
            int r0 = r12.A00(r0)
            if (r0 <= r4) goto L_0x0165
            int r0 = X.C66581MXm.A04(r2)
            int r0 = r0 - r7
            if (r0 > 0) goto L_0x015a
            r12.A02 = r2
            android.text.SpannableString r4 = X.C66580MXl.A0D(r6)
        L_0x0085:
            java.lang.Object r0 = r3.A02
            X.N2v r0 = (X.C68155N2v) r0
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0155
            java.lang.Integer r1 = A01(r0)
            if (r1 == 0) goto L_0x0155
            android.view.ViewTreeObserver r0 = r12.getViewTreeObserver()
            r0.dispatchOnGlobalLayout()
            int r6 = r1.intValue()
            r5 = 0
            java.lang.Object r0 = r3.A02
            X.N2v r0 = (X.C68155N2v) r0
            java.lang.Float r0 = r0.A01
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00b3
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            r2 = r1
        L_0x00b3:
            X.C306496Mj.A05(r4, r12, r2, r6, r5)
        L_0x00b6:
            X.0Ae r10 = r12.A04
            if (r10 == 0) goto L_0x001b
            java.lang.String r9 = r12.A07
            if (r9 == 0) goto L_0x001b
            java.lang.String r8 = r3.A04
            android.text.Layout r0 = r12.getLayout()
            if (r0 == 0) goto L_0x0152
            int r0 = r0.getLineCount()
        L_0x00ca:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = r12.A02
            boolean r0 = r12.A02()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r7 = r3.A03
            X.JVf r7 = (X.C59721JVf) r7
            r1 = 0
            if (r7 == 0) goto L_0x0150
            java.lang.Object r0 = r7.A01
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = X.DbY.A04(r0)
            java.lang.Object r0 = r7.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00f2
            long r1 = r0.longValue()
        L_0x00f2:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0150
            long r1 = r1 - r3
            int r0 = (int) r1
        L_0x00f8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r12.A08
            java.lang.String r0 = "ads_text_overlay_client_logging_video_client_rendering"
            X.0Aj r3 = X.C51969G9p.A0d(r10, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "ad_id"
            r3.AAJ(r0, r9)
            r0 = 3111(0xc27, float:4.36E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r8)
            r2 = 0
            if (r11 == 0) goto L_0x014e
            java.lang.Long r1 = X.C51969G9p.A0r(r11)
        L_0x011f:
            r0 = 3097(0xc19, float:4.34E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A9F(r0, r1)
            r0 = 1433(0x599, float:2.008E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r6)
            r0 = 2949(0xb85, float:4.132E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A7p(r0, r5)
            if (r7 == 0) goto L_0x0140
            java.lang.Long r2 = X.C51969G9p.A0r(r7)
        L_0x0140:
            java.lang.String r0 = "visibility_duration"
            r3.A9F(r0, r2)
            java.lang.String r0 = "imp_token"
            r3.AAJ(r0, r4)
            r3.Cgf()
            return
        L_0x014e:
            r1 = r2
            goto L_0x011f
        L_0x0150:
            r0 = -1
            goto L_0x00f8
        L_0x0152:
            r0 = 0
            goto L_0x00ca
        L_0x0155:
            r12.setText(r4)
            goto L_0x00b6
        L_0x015a:
            int r0 = r2.length()
            int r0 = r0 - r7
            java.lang.String r2 = X.C51967G9n.A0q(r2, r5, r0)
            goto L_0x006a
        L_0x0165:
            r12.A02 = r2
            java.lang.String r0 = X.002.A0R(r2, r1)
            android.text.SpannableString r4 = X.C66580MXl.A0D(r0)
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            int r6 = X.C66581MXm.A04(r2)
            java.lang.String r0 = "…"
            int r0 = r0.length()
            int r1 = r6 + r0
            java.lang.String r0 = r4.toString()
            int r0 = X.DbX.A05(r0)
            r2 = 33
            r4.setSpan(r7, r1, r0, r2)
            X.JdN r1 = new X.JdN
            r1.<init>(r12, r5)
            if (r8 == 0) goto L_0x0195
            r9 = r8
        L_0x0195:
            int r0 = r9.length()
            if (r0 > 0) goto L_0x019c
            r11 = 0
        L_0x019c:
            int r6 = r6 + r11
            java.lang.String r0 = r4.toString()
            int r0 = X.DbX.A05(r0)
            r4.setSpan(r1, r6, r0, r2)
            java.lang.Object r0 = r3.A02
            X.N2v r0 = (X.C68155N2v) r0
            java.lang.String r0 = r0.A06
            java.lang.Integer r0 = A01(r0)
            if (r0 == 0) goto L_0x01c9
            int r0 = r0.intValue()
        L_0x01b8:
            android.text.style.ForegroundColorSpan r1 = X.C66580MXl.A0E(r0)
            java.lang.String r0 = r4.toString()
            int r0 = X.DbX.A05(r0)
            r4.setSpan(r1, r5, r0, r2)
            goto L_0x0085
        L_0x01c9:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x01b8
        L_0x01cc:
            int r4 = r12.A00(r2)
            goto L_0x005a
        L_0x01d2:
            r0 = 0
            r12.setClickable(r0)
            java.lang.String r0 = r3.A04
            r12.A02 = r0
            android.text.SpannableString r4 = X.C66580MXl.A0D(r0)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68630NQj.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, X.NQj] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1418704241);
        C68630NQj.super.onSizeChanged(i, i2, i3, i4);
        this.A00 = i;
        AnonymousClass0fD.A0D(-1091672443, A062);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, android.view.View, X.NQj] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(797860231);
        if (!(getLayout() == null || motionEvent == null)) {
            int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
            if (getText() != null && (getText() instanceof Spanned)) {
                CharSequence text = getText();
                0qQ.A0C(text, C273654mx.A00(17));
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                0qQ.A0A(clickableSpanArr);
                if (clickableSpanArr.length != 0) {
                    if (motionEvent.getAction() == 0) {
                        AnonymousClass0fD.A0C(-134106313, A052);
                        return true;
                    } else if (motionEvent.getAction() == 1) {
                        clickableSpanArr[0].onClick(this);
                    } else {
                        i = -387725092;
                        AnonymousClass0fD.A0C(i, A052);
                        return false;
                    }
                }
            }
        }
        i = -1442312072;
        AnonymousClass0fD.A0C(i, A052);
        return false;
    }
}

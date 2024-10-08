package com.instagram.igds.components.button;

import X.0nA;
import X.0oh;
import X.0qQ;
import X.1QE;
import X.1QG;
import X.2eS;
import X.AnonymousClass05K;
import X.C273014lo;
import X.C273024lp;
import X.C273034lq;
import X.C273044lr;
import X.C273054lt;
import X.C273084lx;
import X.C54389HBe;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsButton extends FrameLayout {
    public int A00;
    public C273044lr A01;
    public C273024lp A02;
    public C273014lo A03;
    public String A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public 1QG A09;
    public final TextView A0A;
    public final 1QG A0B;
    public final SpinnerImageView A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = C273014lo.SECONDARY_LINK;
        1QG A0E = 1QE.A0E();
        this.A0B = A0E;
        C273024lp r1 = C273024lp.MEDIUM;
        this.A02 = r1;
        this.A01 = new C273034lq(r1, A0E);
        A00((AttributeSet) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.util.AttributeSet r7) {
        /*
            r6 = this;
            r2 = 1
            r6.setEnabled(r2)
            if (r7 == 0) goto L_0x006b
            android.content.Context r1 = r6.getContext()
            int[] r0 = X.C71382cm.A1P
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r7, r0)
            X.0qQ.A07(r3)
            r0 = 5
            java.lang.String r4 = X.C71622eP.A00(r1, r3, r0)
            if (r4 == 0) goto L_0x0026
            int r0 = r4.hashCode()
            switch(r0) {
                case -1170620443: goto L_0x008c;
                case -1114452969: goto L_0x0097;
                case -817598092: goto L_0x00a2;
                case -314765822: goto L_0x00ae;
                case 115229344: goto L_0x00ba;
                case 201619203: goto L_0x00c6;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.4lo r0 = X.C273014lo.UNKNOWN
        L_0x0023:
            r6.setStyle(r0)
        L_0x0026:
            r0 = 4
            java.lang.String r5 = X.C71622eP.A00(r1, r3, r0)
            if (r5 == 0) goto L_0x004c
            int r4 = r5.hashCode()
            r0 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            if (r4 == r0) goto L_0x007e
            r0 = 102742843(0x61fbb3b, float:3.0042132E-35)
            if (r4 == r0) goto L_0x0073
            r0 = 950483747(0x38a73b23, float:7.9741956E-5)
            if (r4 != r0) goto L_0x0089
            java.lang.String r0 = "compact"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0089
            X.4lp r0 = X.C273024lp.COMPACT
        L_0x004a:
            r6.A02 = r0
        L_0x004c:
            r0 = 3
            java.lang.String r0 = X.C71622eP.A00(r1, r3, r0)
            r6.A04 = r0
            r0 = 2
            r1 = 0
            int r0 = r3.getResourceId(r0, r1)
            r6.A00 = r0
            boolean r0 = r3.getBoolean(r2, r1)
            r6.A05 = r0
            boolean r0 = r3.getBoolean(r1, r2)
            r6.setEnabled(r0)
            r3.recycle()
        L_0x006b:
            boolean r0 = r6.isEnabled()
            r6.A03(r0)
            return
        L_0x0073:
            java.lang.String r0 = "large"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0089
            X.4lp r0 = X.C273024lp.LARGE
            goto L_0x004a
        L_0x007e:
            java.lang.String r0 = "medium"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0089
            X.4lp r0 = X.C273024lp.MEDIUM
            goto L_0x004a
        L_0x0089:
            X.4lp r0 = X.C273024lp.UNKNOWN
            goto L_0x004a
        L_0x008c:
            java.lang.String r0 = "secondary_link"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.SECONDARY_LINK
            goto L_0x0023
        L_0x0097:
            java.lang.String r0 = "primary_link"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.PRIMARY_LINK
            goto L_0x0023
        L_0x00a2:
            java.lang.String r0 = "secondary"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.SECONDARY
            goto L_0x0023
        L_0x00ae:
            java.lang.String r0 = "primary"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.PRIMARY
            goto L_0x0023
        L_0x00ba:
            java.lang.String r0 = "primary_on_color"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.PRIMARY_ON_COLOR
            goto L_0x0023
        L_0x00c6:
            java.lang.String r0 = "label_inverted_on_media"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.4lo r0 = X.C273014lo.LABEL_INVERTED_ON_MEDIA
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.A00(android.util.AttributeSet):void");
    }

    public final void A02(C273084lx r3, int i) {
        0qQ.A0B(r3, 1);
        if (i == 0) {
            this.A0A.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (r3 == C273084lx.END) {
            this.A0A.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        } else if (r3 == C273084lx.START) {
            this.A0A.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A01.A04(canvas);
    }

    public final void setIcon(Drawable drawable, C273084lx r4) {
        0qQ.A0B(r4, 1);
        if (drawable == null) {
            this.A0A.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (r4 == C273084lx.END) {
            this.A0A.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else if (r4 == C273084lx.START) {
            this.A0A.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1 != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r7 != r0) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSize(X.C273024lp r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r6.A02 = r7
            X.4lr r0 = r6.A01
            r0.A08(r7)
            r0.A01()
            X.4lp r5 = X.C273024lp.LARGE
            android.content.res.Resources r4 = r6.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r7 != r5) goto L_0x001b
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L_0x001b:
            int r0 = r4.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r6.A0C
            r0.setLayoutParams(r1)
            int r3 = r7.ordinal()
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x00a1
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            if (r3 == r2) goto L_0x003d
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L_0x003d:
            int r0 = r4.getDimensionPixelSize(r0)
            r6.A06 = r0
            if (r3 == r1) goto L_0x009d
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            if (r3 == r2) goto L_0x004c
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x004c:
            int r0 = r4.getDimensionPixelSize(r0)
            r6.A07 = r0
            X.0nA.A0h(r6, r0, r0)
            if (r7 != r5) goto L_0x008e
            X.1QG r0 = r6.A0B
            boolean r0 = r0.A00
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r0 != 0) goto L_0x0063
            r1 = 2131165228(0x7f07002c, float:1.7944667E38)
        L_0x0063:
            int r0 = r4.getDimensionPixelSize(r1)
            r6.A08 = r0
            X.4lp r0 = X.C273024lp.COMPACT
            if (r7 == r0) goto L_0x0088
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320442478240204(0x810940000021cc, double:3.032532301697513E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
        L_0x0088:
            int r0 = r6.A08
            X.0nA.A0i(r6, r0, r0)
            return
        L_0x008e:
            X.4lp r0 = X.C273024lp.MEDIUM
            if (r7 == r0) goto L_0x0099
            X.4lp r0 = X.C273024lp.COMPACT
            r1 = 2131165230(0x7f07002e, float:1.7944671E38)
            if (r7 == r0) goto L_0x0063
        L_0x0099:
            r1 = 2131165206(0x7f070016, float:1.7944623E38)
            goto L_0x0063
        L_0x009d:
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            goto L_0x004c
        L_0x00a1:
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            goto L_0x003d
        L_0x00a5:
            int r0 = r6.A08
            X.0nA.A0h(r6, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.setSize(X.4lp):void");
    }

    public final void setStyle(C273014lo r2) {
        0qQ.A0B(r2, 0);
        if (this.A03 != r2) {
            this.A03 = r2;
            A01();
        }
    }

    public static /* synthetic */ void setIcon$default(IgdsButton igdsButton, int i, C273084lx r3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                r3 = C273084lx.END;
            }
            igdsButton.A02(r3, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r4.A01 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            boolean r1 = r4 instanceof com.instagram.shopping.widget.pdp.cta.CustomCTAButton
            X.4lo r0 = r4.A03
            if (r1 == 0) goto L_0x0062
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0058
            r0 = 1
            if (r1 == r0) goto L_0x004e
            r0 = 2
            if (r1 == r0) goto L_0x0044
            r0 = 3
            if (r1 == r0) goto L_0x003a
            r0 = 5
            if (r1 != r0) goto L_0x0024
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.HBd r2 = new X.HBd
            r2.<init>(r0, r1)
        L_0x0022:
            r4.A01 = r2
        L_0x0024:
            X.4lr r2 = r4.A01
            android.widget.TextView r1 = r4.A0A
            android.content.res.Resources r0 = r4.getResources()
            X.0qQ.A07(r0)
            r2.A03(r0, r1)
        L_0x0032:
            X.4lr r1 = r4.A01
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0C
            r1.A09(r0)
            return
        L_0x003a:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lq r2 = new X.4lq
            r2.<init>(r0, r1)
            goto L_0x0022
        L_0x0044:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.52B r2 = new X.52B
            r2.<init>(r0, r1)
            goto L_0x0022
        L_0x004e:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lt r2 = new X.4lt
            r2.<init>(r0, r1)
            goto L_0x0022
        L_0x0058:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lu r2 = new X.4lu
            r2.<init>(r0, r1)
            goto L_0x0022
        L_0x0062:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0079;
                case 2: goto L_0x0083;
                case 3: goto L_0x008d;
                case 4: goto L_0x0097;
                case 5: goto L_0x00a1;
                case 6: goto L_0x00ac;
                default: goto L_0x0069;
            }
        L_0x0069:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x006f:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lu r2 = new X.4lu
            r2.<init>(r0, r1)
            goto L_0x00aa
        L_0x0079:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lt r2 = new X.4lt
            r2.<init>(r0, r1)
            goto L_0x00aa
        L_0x0083:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.52B r2 = new X.52B
            r2.<init>(r0, r1)
            goto L_0x00aa
        L_0x008d:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.4lq r2 = new X.4lq
            r2.<init>(r0, r1)
            goto L_0x00aa
        L_0x0097:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.HBf r2 = new X.HBf
            r2.<init>(r0, r1)
            goto L_0x00aa
        L_0x00a1:
            X.1QG r1 = r4.A0B
            X.4lp r0 = r4.A02
            X.HBd r2 = new X.HBd
            r2.<init>(r0, r1)
        L_0x00aa:
            r4.A01 = r2
        L_0x00ac:
            X.4lr r3 = r4.A01
            X.1QG r1 = r4.A09
            boolean r0 = r3 instanceof X.C273064lu
            if (r0 == 0) goto L_0x00b9
            r0 = r3
            X.4lu r0 = (X.C273064lu) r0
            r0.A05 = r1
        L_0x00b9:
            android.widget.TextView r2 = r4.A0A
            android.content.res.Resources r0 = r4.getResources()
            X.0qQ.A07(r0)
            r3.A03(r0, r2)
            X.4lr r1 = r4.A01
            boolean r0 = r4.A05
            r1.A06(r2, r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.A01():void");
    }

    public final void A03(boolean z) {
        if (this instanceof CountdownDurationToggle) {
            CountdownDurationToggle countdownDurationToggle = (CountdownDurationToggle) this;
            Resources resources = countdownDurationToggle.getResources();
            countdownDurationToggle.A02 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            countdownDurationToggle.A01();
            countdownDurationToggle.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            0nA.A0h(countdownDurationToggle, dimensionPixelSize, dimensionPixelSize);
            countdownDurationToggle.setWillNotDraw(false);
            countdownDurationToggle.setEnabled(z);
            countdownDurationToggle.setImportantForAccessibility(1);
            2eS.A04(countdownDurationToggle, AnonymousClass05K.A06);
            return;
        }
        TextView textView = this.A0A;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        textView.setLines(1);
        textView.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Integer num = AnonymousClass05K.A01;
        0oh.A07(getContext(), (Typeface) null, textView, num);
        setText(this.A04);
        A02(C273084lx.END, this.A00);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        SpinnerImageView spinnerImageView = this.A0C;
        spinnerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        spinnerImageView.setVisibility(8);
        addView(spinnerImageView, new FrameLayout.LayoutParams(-2, -2));
        setSize(this.A02);
        A01();
        setWillNotDraw(false);
        setEnabled(z);
        setImportantForAccessibility(1);
        2eS.A04(this, num);
    }

    public final void drawableStateChanged() {
        C273044lr r2 = this.A01;
        int[] drawableState = getDrawableState();
        0qQ.A07(drawableState);
        r2.A07(this.A0A, drawableState);
        super.drawableStateChanged();
    }

    public final boolean getElevated() {
        return this.A05;
    }

    public final int getIcon() {
        return this.A00;
    }

    public final 1QG getOverridePrismVariant() {
        return this.A09;
    }

    public final 1QG getPrismButtonVariant() {
        return this.A0B;
    }

    public final C273024lp getSize() {
        return this.A02;
    }

    public final C273014lo getStyle() {
        return this.A03;
    }

    public final CharSequence getText() {
        return this.A0A.getText();
    }

    public final TextView getTextView() {
        return this.A0A;
    }

    public final Layout getTextViewLayout() {
        Layout layout = this.A0A.getLayout();
        0qQ.A07(layout);
        return layout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0041, code lost:
        if (r1 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.widget.TextView r5 = r6.A0A
            r6.measureChild(r5, r7, r8)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A0C
            r6.measureChild(r1, r7, r8)
            int r2 = r5.getMeasuredWidth()
            int r0 = r6.A07
            int r0 = r0 * 2
            int r2 = r2 + r0
            int r1 = r1.getMeasuredWidth()
            int r0 = r6.A07
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r0 = r6.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = java.lang.Math.max(r2, r0)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0043
            com.instagram.common.session.UserSession r4 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320442478240204(0x810940000021cc, double:3.032532301697513E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0043
            if (r1 != 0) goto L_0x005c
        L_0x0043:
            X.1QG r0 = r6.A0B
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x005c
            int r0 = r6.A06
        L_0x004b:
            int r2 = android.view.View.resolveSize(r3, r7)
            int r1 = android.view.View.resolveSize(r0, r8)
            X.4lr r0 = r6.A01
            r0.A02(r2, r1)
            r6.setMeasuredDimension(r2, r1)
            return
        L_0x005c:
            int r2 = r6.A06
            int r1 = r5.getMeasuredHeight()
            int r0 = r6.A08
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r0 = r6.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r2, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.button.IgdsButton.onMeasure(int, int):void");
    }

    public final void setActive(boolean z) {
        C273044lr r1;
        if (this.A03 == C273014lo.SECONDARY) {
            setSelected(z);
            1QG r2 = this.A0B;
            C273024lp r0 = this.A02;
            if (z) {
                r1 = new C54389HBe(r0, r2);
            } else {
                r1 = new C273054lt(r0, r2);
            }
            this.A01 = r1;
            TextView textView = this.A0A;
            Resources resources = getResources();
            0qQ.A07(resources);
            r1.A03(resources, textView);
            this.A01.A09(this.A0C);
            setText(textView.getText().toString());
            invalidate();
        }
    }

    public final void setElevated(boolean z) {
        this.A05 = z;
        this.A01.A06(this.A0A, z);
    }

    public final void setIconPadding(int i) {
        this.A0A.setCompoundDrawablePadding(i);
    }

    public final void setLoading(boolean z) {
        this.A01.A05(this, this.A0C, this.A0A, z);
        setEnabled(!z);
    }

    public final void setOverridePrismVariant(1QG r2) {
        if (this.A09 != r2) {
            this.A09 = r2;
            A01();
        }
    }

    public final void setText(String str) {
        this.A04 = str;
        if (str != null) {
            this.A0A.setText(str);
            setContentDescription(str);
        }
    }

    public final void setTextColor(int i) {
        this.A0A.setTextColor(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A01.A0A(this, this.A0A, z);
    }

    public void setPressed(boolean z) {
        if (isPressed() != z) {
            this.A01.A0B(this, this.A0A, z);
        }
        super.setPressed(z);
    }

    @Deprecated(message = "Background is set by IGDSButton and should not be changed refer to the IGDS Button Spec to see the different variants available", replaceWith = @ReplaceWith(expression = "Unit", imports = {}))
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = C273014lo.SECONDARY_LINK;
        1QG A0E = 1QE.A0E();
        this.A0B = A0E;
        C273024lp r1 = C273024lp.MEDIUM;
        this.A02 = r1;
        this.A01 = new C273034lq(r1, A0E);
        A00(attributeSet);
    }

    public static /* synthetic */ void setIcon$default(IgdsButton igdsButton, Drawable drawable, C273084lx r3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r3 = C273084lx.END;
            }
            igdsButton.setIcon(drawable, r3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = C273014lo.SECONDARY_LINK;
        1QG A0E = 1QE.A0E();
        this.A0B = A0E;
        C273024lp r1 = C273024lp.MEDIUM;
        this.A02 = r1;
        this.A01 = new C273034lq(r1, A0E);
        A00(attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsButton(Context context, C273014lo r3, C273024lp r4, String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r3, r4, str, i, (i2 & 32) != 0 ? false : z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, C273014lo r5, C273024lp r6, String str, int i, boolean z) {
        super(context);
        0qQ.A0B(context, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r6, 3);
        Context context2 = getContext();
        this.A0A = new TextView(context2);
        this.A0C = new SpinnerImageView(context2);
        this.A03 = C273014lo.SECONDARY_LINK;
        1QG A0E = 1QE.A0E();
        this.A0B = A0E;
        C273024lp r1 = C273024lp.MEDIUM;
        this.A02 = r1;
        this.A01 = new C273034lq(r1, A0E);
        setStyle(r5);
        this.A02 = r6;
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        A03(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsButton(Context context, C273014lo r9, C273024lp r10, String str, int i) {
        this(context, r9, r10, str, i, false);
        0qQ.A0B(context, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r10, 3);
    }
}

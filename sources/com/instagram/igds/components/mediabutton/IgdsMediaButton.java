package com.instagram.igds.components.mediabutton;

import X.0nA;
import X.0oh;
import X.0qQ;
import X.2eS;
import X.AnonymousClass05K;
import X.AnonymousClass37O;
import X.C294775n1;
import X.C296235pj;
import X.C296245pk;
import X.C296255pl;
import X.C296265pm;
import X.C62567Khx;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsMediaButton extends FrameLayout {
    public TextView A00;
    public C296245pk A01;
    public C296265pm A02;
    public C294775n1 A03;
    public float A04;
    public int A05;
    public C296235pj A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A05() {
        this.A03 = null;
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
        A01(this);
    }

    public final void setButtonStyle(C296235pj r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
        A06();
        setBackground(A04());
    }

    public final void setEndAddOn(C62567Khx khx) {
        int i;
        Drawable mutate;
        0qQ.A0B(khx, 0);
        int i2 = khx.A00;
        if (i2 == 1) {
            i = R.drawable.instagram_chevron_right_pano_outline_12;
        } else if (i2 == 2) {
            i = R.drawable.instagram_arrow_right_outline_12;
        } else if (i2 == 3) {
            i = R.drawable.instagram_chevron_down_pano_outline_12;
        } else if (i2 != 4) {
            i = R.drawable.instagram_arrow_right_pano_filled_24;
            if (i2 != 5) {
                i = 0;
            }
        } else {
            i = R.drawable.instagram_camera_pano_filled_12;
        }
        Context context = getContext();
        Drawable drawable = context.getDrawable(i);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(this.A06.A01(context))));
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, drawable, (Drawable) null);
        int i3 = 17;
        if (i != 0) {
            i3 = 8388627;
        }
        textView.setGravity(i3);
        A01(this);
    }

    public final void setSegmentedButtonStyle(C296265pm r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
        setBackground(A04());
    }

    public final void setSize(C296245pk r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void setStartAddOn(C294775n1 r2, CharSequence charSequence) {
        0qQ.A0B(r2, 0);
        if (!(charSequence == null || charSequence.length() == 0)) {
            setContentDescription(charSequence);
        }
        int i = r2.A00;
        if (i != 0) {
            setStartIcon(i);
        } else {
            Drawable drawable = r2.A01;
            if (drawable != null) {
                setStartDrawable(drawable);
            }
        }
        this.A03 = r2;
        A01(this);
    }

    public final void setWidthMode(C296255pl r4) {
        0qQ.A0B(r4, 0);
        int i = -1;
        if (r4 == C296255pl.CONSTRAINED) {
            i = -2;
        }
        setLayoutParams(new ViewGroup.LayoutParams(i, -2));
    }

    private final void A00(C296245pk r6, C296235pj r7, C296255pl r8, C296265pm r9, float f, int i) {
        Integer num = AnonymousClass05K.A01;
        2eS.A04(this, num);
        TextView textView = this.A00;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_2);
        0oh.A07(textView.getContext(), (Typeface) null, textView, num);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        this.A01 = r6;
        setButtonStyle(r7);
        if (r9 != null) {
            setSegmentedButtonStyle(r9);
        }
        setWidthMode(r8);
        this.A05 = i;
        this.A04 = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.igds.components.mediabutton.IgdsMediaButton r11) {
        /*
            android.widget.TextView r5 = r11.A00
            android.graphics.drawable.Drawable[] r0 = r5.getCompoundDrawablesRelative()
            r8 = 0
            r0 = r0[r8]
            r7 = 1
            r10 = 0
            if (r0 == 0) goto L_0x000e
            r10 = 1
        L_0x000e:
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L_0x001b
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L_0x006a
            X.5pm r0 = r11.A02
            if (r0 == 0) goto L_0x0056
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0048
            boolean r0 = r11.A03()
            if (r0 != 0) goto L_0x0048
            X.5pk r1 = r11.A01
            android.content.Context r0 = r11.getContext()
            X.0qQ.A07(r0)
            float r0 = r1.A00(r0)
        L_0x003d:
            int r0 = (int) r0
            X.0nA.A0h(r11, r0, r0)
            X.0nA.A0i(r11, r0, r0)
            r5.setCompoundDrawablePadding(r8)
            return
        L_0x0048:
            X.5pk r1 = r11.A01
            android.content.Context r0 = r11.getContext()
            X.0qQ.A07(r0)
            float r0 = r1.A01(r0, r2)
            goto L_0x003d
        L_0x0056:
            X.5pk r2 = r11.A01
            android.content.Context r1 = r11.getContext()
            X.0qQ.A07(r1)
            android.graphics.drawable.Drawable[] r0 = r5.getCompoundDrawablesRelative()
            r0 = r0[r8]
            float r0 = r2.A01(r1, r0)
            goto L_0x003d
        L_0x006a:
            boolean r9 = r11.A02()
            if (r9 != 0) goto L_0x0103
            boolean r0 = r11.A03()
            if (r0 != 0) goto L_0x0103
            X.5pk r0 = r11.A01
            android.content.Context r6 = r11.getContext()
            X.0qQ.A07(r6)
            float r0 = r0.A00(r6)
        L_0x0083:
            int r0 = (int) r0
            X.0nA.A0i(r11, r0, r0)
            X.5pk r0 = r11.A01
            X.0qQ.A07(r6)
            int r1 = r0.A00
            if (r1 != r4) goto L_0x00fc
            r0 = 2
        L_0x0091:
            float r0 = X.0nA.A04(r6, r0)
            int r0 = (int) r0
            r5.setCompoundDrawablePadding(r0)
            float r1 = r11.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r8, r1, r0)
            r5.setTextSize(r0)
        L_0x00af:
            X.5pk r0 = r11.A01
            int r1 = r0.A00
            r0 = 12
            if (r1 != r4) goto L_0x00b8
            r0 = 6
        L_0x00b8:
            float r0 = X.0nA.A04(r6, r0)
            int r3 = (int) r0
            X.5pk r0 = r11.A01
            int r2 = r0.A00
            if (r2 != r4) goto L_0x00ed
            r0 = 6
        L_0x00c4:
            float r0 = X.0nA.A04(r6, r0)
        L_0x00c8:
            int r2 = (int) r0
            int r0 = r11.A05
            float r1 = (float) r0
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r7, r1, r0)
            float r0 = X.0nA.A00(r6, r0)
            int r0 = (int) r0
            int r2 = r2 + r0
            if (r10 == 0) goto L_0x0112
            if (r9 != 0) goto L_0x00e8
            boolean r0 = r11.A03()
            if (r0 == 0) goto L_0x00e9
        L_0x00e8:
            r3 = r2
        L_0x00e9:
            X.0nA.A0h(r11, r3, r2)
            return
        L_0x00ed:
            r1 = 12
            if (r2 == r8) goto L_0x00f7
            r0 = 4
            if (r2 == r0) goto L_0x00f7
            r0 = 16
            goto L_0x00c4
        L_0x00f7:
            float r0 = X.0nA.A04(r6, r1)
            goto L_0x00c8
        L_0x00fc:
            r0 = 4
            if (r1 == r8) goto L_0x0091
            if (r1 == r0) goto L_0x0091
            r0 = 6
            goto L_0x0091
        L_0x0103:
            X.5pk r0 = r11.A01
            android.content.Context r6 = r11.getContext()
            X.0qQ.A07(r6)
            float r0 = r0.A01(r6, r2)
            goto L_0x0083
        L_0x0112:
            android.graphics.drawable.Drawable[] r0 = r5.getCompoundDrawablesRelative()
            r0 = r0[r4]
            if (r0 == 0) goto L_0x011e
            X.0nA.A0h(r11, r2, r3)
            return
        L_0x011e:
            X.0nA.A0h(r11, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaButton.A01(com.instagram.igds.components.mediabutton.IgdsMediaButton):void");
    }

    private final boolean A02() {
        Drawable drawable = this.A00.getCompoundDrawablesRelative()[0];
        if (drawable == null || this.A01.A00 != 1) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Context context = getContext();
        0qQ.A07(context);
        int A042 = (int) 0nA.A04(context, 24);
        if (A042 == intrinsicHeight || A042 == intrinsicWidth) {
            return true;
        }
        return false;
    }

    private final boolean A03() {
        Drawable drawable = this.A00.getCompoundDrawablesRelative()[0];
        if (drawable == null || this.A01.A00 != 4) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Context context = getContext();
        0qQ.A07(context);
        int A042 = (int) 0nA.A04(context, 20);
        if (A042 == intrinsicHeight || A042 == intrinsicWidth) {
            return true;
        }
        return false;
    }

    private final void setStartDrawable(Drawable drawable) {
        int i;
        int i2;
        C296245pk r0 = this.A01;
        Context context = getContext();
        0qQ.A07(context);
        int i3 = r0.A00;
        if (i3 == 2) {
            i = 8;
        } else if (i3 == 0) {
            i = 16;
        } else if (i3 == 4) {
            i = 20;
        } else {
            i = 24;
            if (i3 == 3) {
                i = 38;
            }
        }
        int A042 = (int) 0nA.A04(context, i);
        int i4 = this.A01.A00;
        if (i4 == 2) {
            i2 = 8;
        } else if (i4 == 0) {
            i2 = 16;
        } else {
            i2 = 24;
            if (i4 == 4) {
                i2 = 20;
            }
        }
        int A043 = (int) 0nA.A04(context, i2);
        if (drawable != null) {
            drawable.setBounds(0, 0, A042, A043);
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelative(drawable, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
    }

    public final GradientDrawable A04() {
        float f;
        float[] fArr;
        C296265pm r2 = this.A02;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = getContext();
        C296235pj r0 = this.A06;
        0qQ.A07(context);
        gradientDrawable.setColor(context.getColor(r0.A00(context)));
        if (this.A06.A00 == 0) {
            f = 0nA.A04(context, 8);
        } else {
            f = 0.0f;
        }
        setElevation(f);
        if (r2 != null) {
            int ordinal = r2.ordinal();
            if (ordinal == 0) {
                fArr = new float[]{500.0f, 500.0f, 0.0f, 0.0f, 0.0f, 0.0f, 500.0f, 500.0f};
            } else if (ordinal == 1) {
                fArr = new float[]{0.0f, 0.0f, 500.0f, 500.0f, 500.0f, 500.0f, 0.0f, 0.0f};
            } else {
                throw new RuntimeException();
            }
            gradientDrawable.setCornerRadii(fArr);
            return gradientDrawable;
        }
        gradientDrawable.setCornerRadius(500.0f);
        return gradientDrawable;
    }

    public final int getCompoundDrawablePadding() {
        return this.A00.getCompoundDrawablePadding();
    }

    public final String getLabel() {
        return this.A00.getText().toString();
    }

    public final TextView getLabelView() {
        return this.A00;
    }

    public final float getLabelWidth() {
        TextView textView = this.A00;
        textView.measure(0, 0);
        return (float) textView.getMeasuredWidth();
    }

    public final C296245pk getMediaButtonSize() {
        return this.A01;
    }

    public final C296265pm getSegmentedButtonStyle() {
        return this.A02;
    }

    public final void setCompoundDrawablePadding(int i) {
        this.A00.setCompoundDrawablePadding(i);
    }

    public final void setLabel(CharSequence charSequence) {
        CharSequence contentDescription;
        this.A00.setText(charSequence);
        if (!(charSequence == null || charSequence.length() == 0 || ((contentDescription = getContentDescription()) != null && contentDescription.length() != 0))) {
            setContentDescription(charSequence);
        }
        A01(this);
    }

    public final void setLabelAlpha(float f) {
        this.A00.setAlpha(f);
    }

    private final void setStartIcon(int i) {
        Drawable mutate;
        Drawable drawable = getContext().getDrawable(i);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(AnonymousClass37O.A00(getLabelColor()));
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
    }

    public final void A06() {
        Drawable mutate;
        int labelColor = getLabelColor();
        TextView textView = this.A00;
        textView.setTextColor(labelColor);
        C294775n1 r0 = this.A03;
        if (!(r0 == null || r0.A00 == 0)) {
            textView.getCompoundDrawablesRelative()[0].mutate().setColorFilter(AnonymousClass37O.A00(labelColor));
        }
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(AnonymousClass37O.A00(labelColor));
        }
    }

    public int getLabelColor() {
        Context context = getContext();
        C296235pj r0 = this.A06;
        0qQ.A07(context);
        return context.getColor(r0.A01(context));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        C296235pj r1 = this.A06;
        if (r1 == C296235pj.CREATION_FLOW_DESTRUCTIVE || r1 == C296235pj.CREATION_FLOW_RED_LABEL || r1 == C296235pj.CREATION_FLOW || r1 == C296235pj.CREATION_FLOW_CHANGES_BLUE || r1 == C296235pj.CREATION_FLOW_CHANGES_YELLOW) {
            float f = 0.3f;
            if (z) {
                f = 1.0f;
            }
            setLabelAlpha(f);
        } else if (getBackground() != null) {
            Drawable background = getBackground();
            int i = 77;
            if (isEnabled()) {
                i = 255;
            }
            background.setAlpha(i);
        }
    }

    public void setPressed(boolean z) {
        int i;
        super.setPressed(z);
        if (isEnabled() && getBackground() != null) {
            Drawable background = getBackground();
            if (z) {
                i = 179;
            } else {
                i = 77;
                if (isEnabled()) {
                    i = 255;
                }
            }
            background.setAlpha(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r6 == 12) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        if (r6 == 5) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r6 == 1) goto L_0x00b9;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsMediaButton(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r5 = 1
            r2 = r20
            X.0qQ.A0B(r2, r5)
            r9 = r19
            r1 = r21
            r0 = r22
            r9.<init>(r2, r1, r0)
            X.5pj r11 = X.C296235pj.PRIMARY
            r9.A06 = r11
            X.5pk r10 = X.C296245pk.SMALL
            r9.A01 = r10
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.A04 = r4
            android.content.Context r3 = r9.getContext()
            X.0qQ.A07(r3)
            com.instagram.common.ui.base.IgTextView r0 = new com.instagram.common.ui.base.IgTextView
            r0.<init>(r3)
            r9.A00 = r0
            if (r21 != 0) goto L_0x0034
            X.5pl r12 = X.C296255pl.CONSTRAINED
            r13 = 0
            r15 = 0
            r14 = 0
            r9.A00(r10, r11, r12, r13, r14, r15)
            return
        L_0x0034:
            r2 = 0
            int[] r0 = X.C71382cm.A1W
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r1)
            r7 = 6
            int r6 = r1.getInt(r7, r2)
            if (r6 == r2) goto L_0x007f
            X.5pj r8 = X.C296235pj.SECONDARY
            if (r6 == r5) goto L_0x007e
            X.5pj r8 = X.C296235pj.DEFAULT_ON_BLACK
            r0 = 2
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW
            r0 = 3
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_RED_LABEL
            r0 = 4
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_DESTRUCTIVE
            r0 = 7
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_BLUE
            r0 = 8
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE
            r0 = 13
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_NO_BG
            r0 = 9
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.SECONDARY_ON_BLACK
            r0 = 5
            if (r6 == r0) goto L_0x007e
            X.5pj r8 = X.C296235pj.PRIMARY_DESTRUCTIVE
            if (r6 == r7) goto L_0x007e
            X.5pj r8 = X.C296235pj.CREATION_FLOW_FEED_PRIMARY
            r0 = 12
            if (r6 != r0) goto L_0x007f
        L_0x007e:
            r11 = r8
        L_0x007f:
            r7 = 5
            int r6 = r1.getInt(r7, r2)
            X.5pk r13 = X.C296245pk.LARGE
            if (r6 == r5) goto L_0x009d
            X.5pk r13 = X.C296245pk.HORIZONTAL_LARGE
            r0 = 3
            if (r6 == r0) goto L_0x009d
            if (r6 == r2) goto L_0x0114
            X.5pk r13 = X.C296245pk.X_SMALL
            r0 = 2
            if (r6 == r0) goto L_0x009d
            X.5pk r13 = X.C296245pk.MEDIUM
            r0 = 4
            if (r6 == r0) goto L_0x009d
            X.5pk r13 = X.C296245pk.MEDIUM_LARGE
            if (r6 != r7) goto L_0x0114
        L_0x009d:
            r0 = 7
            int r0 = r1.getInt(r0, r2)
            X.5pl r15 = X.C296255pl.FLEXIBLE
            if (r0 == r5) goto L_0x00a8
            X.5pl r15 = X.C296255pl.CONSTRAINED
        L_0x00a8:
            r6 = 8
            r0 = -1
            int r6 = r1.getInt(r6, r0)
            X.5pm r0 = X.C296265pm.START_SEGMENT
            if (r6 == r2) goto L_0x00b9
            X.5pm r0 = X.C296265pm.END_SEGMENT
            r16 = 0
            if (r6 != r5) goto L_0x00bb
        L_0x00b9:
            r16 = r0
        L_0x00bb:
            int r18 = r1.getInt(r2, r2)
            float r17 = r1.getFloat(r5, r4)
            r12 = r9
            r14 = r11
            r12.A00(r13, r14, r15, r16, r17, r18)
            android.widget.TextView r5 = r9.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r0 = 0
            X.0oh.A07(r3, r0, r5, r4)
            r0 = 3
            java.lang.String r4 = X.C71622eP.A00(r3, r1, r0)
            r5.setText(r4)
            r3 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r1.getInt(r3, r0)
            r5.setMaxLines(r0)
            if (r4 == 0) goto L_0x00fa
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00fa
            java.lang.CharSequence r0 = r9.getContentDescription()
            if (r0 == 0) goto L_0x00f7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00fa
        L_0x00f7:
            r9.setContentDescription(r4)
        L_0x00fa:
            r0 = 2
            int r2 = r1.getResourceId(r0, r2)
            if (r2 == 0) goto L_0x010d
            r9.setStartIcon(r2)
            X.5n1 r0 = new X.5n1
            r0.<init>()
            r0.A00 = r2
            r9.A03 = r0
        L_0x010d:
            r1.recycle()
            A01(r9)
            return
        L_0x0114:
            r13 = r10
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, C296235pj r8, C296245pk r9, C296255pl r10) {
        this(context, r8, r9, r10, (C296265pm) null);
        0qQ.A0B(context, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r9, 3);
        0qQ.A0B(r10, 4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsMediaButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, C296235pj r11, C296245pk r12, C296255pl r13, C296265pm r14) {
        super(context);
        0qQ.A0B(context, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r12, 3);
        0qQ.A0B(r13, 4);
        this.A06 = C296235pj.PRIMARY;
        this.A01 = C296245pk.SMALL;
        this.A04 = -1.0f;
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A00 = new IgTextView(context2);
        A00(r12, r11, r13, r14, 0.0f, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsMediaButton(Context context, C296235pj r3, C296245pk r4, C296255pl r5, C296265pm r6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r3, r4, r5, (i & 16) != 0 ? null : r6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

package com.google.android.material.textfield;

import X.002;
import X.03v;
import X.2eL;
import X.AnonymousClass0fD;
import X.AnonymousClass2X7;
import X.AnonymousClass3Tj;
import X.AnonymousClass6Y2;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14129TqO;
import X.C14161Tqz;
import X.C15223UWa;
import X.C15224UWb;
import X.C18786W1o;
import X.C18887WAz;
import X.C19971Wii;
import X.C19972Wij;
import X.C245253cZ;
import X.C249703kE;
import X.C273654mx;
import X.C297875sV;
import X.C297895sX;
import X.C297935sb;
import X.C298035sl;
import X.C304216Cp;
import X.C309286Xr;
import X.C323656xt;
import X.C51968G9o;
import X.C51970G9q;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.JTT;
import X.Pxf;
import X.Pxg;
import X.U0N;
import X.U7E;
import X.UWT;
import X.UWX;
import X.UWY;
import X.UWZ;
import X.VV7;
import X.W4Q;
import X.W7b;
import X.X35;
import X.X36;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.instagram.android.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ValueAnimator A09;
    public ColorStateList A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public EditText A0F;
    public TextView A0G;
    public TextView A0H;
    public C297875sV A0I;
    public C297875sV A0J;
    public C297895sX A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public ColorStateList A0m;
    public ColorStateList A0n;
    public ColorStateList A0o;
    public PorterDuff.Mode A0p;
    public PorterDuff.Mode A0q;
    public Typeface A0r;
    public Drawable A0s;
    public Drawable A0t;
    public Drawable A0u;
    public View.OnLongClickListener A0v;
    public View.OnLongClickListener A0w;
    public View.OnLongClickListener A0x;
    public CharSequence A0y;
    public CharSequence A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public final int A17;
    public final Rect A18;
    public final FrameLayout A19;
    public final LinearLayout A1A;
    public final LinearLayout A1B;
    public final TextView A1C;
    public final CheckableImageButton A1D;
    public final CheckableImageButton A1E;
    public final CheckableImageButton A1F;
    public final C14129TqO A1G;
    public final C18786W1o A1H;
    public final LinkedHashSet A1I;
    public final LinkedHashSet A1J;
    public final Rect A1K;
    public final RectF A1L;
    public final SparseArray A1M;
    public final FrameLayout A1N;
    public final TextView A1O;

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(11);
        public CharSequence A00;
        public CharSequence A01;
        public CharSequence A02;
        public CharSequence A03;
        public boolean A04;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.A00);
            sb.append(" hint=");
            sb.append(this.A02);
            sb.append(" helperText=");
            sb.append(this.A01);
            sb.append(" placeholderText=");
            sb.append(this.A03);
            return AnonymousClass7TF.A0l("}", sb);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.A00 = (CharSequence) creator.createFromParcel(parcel);
            this.A04 = Pxg.A1U(parcel);
            this.A02 = (CharSequence) creator.createFromParcel(parcel);
            this.A01 = (CharSequence) creator.createFromParcel(parcel);
            this.A03 = (CharSequence) creator.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            TextInputLayout.super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeInt(this.A04 ? 1 : 0);
            TextUtils.writeToParcel(this.A02, parcel, i);
            TextUtils.writeToParcel(this.A01, parcel, i);
            TextUtils.writeToParcel(this.A03, parcel, i);
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0U = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0U = false;
    }

    private int A07() {
        float A052;
        if (!this.A0Q) {
            return 0;
        }
        int i = this.A01;
        if (i == 0 || i == 1) {
            A052 = this.A1G.A05();
        } else if (i != 2) {
            return 0;
        } else {
            A052 = this.A1G.A05() / 2.0f;
        }
        return (int) A052;
    }

    private void A08() {
        int i;
        int i2;
        int i3;
        int i4;
        C297875sV r1 = this.A0I;
        if (r1 != null) {
            r1.setShapeAppearanceModel(this.A0K);
            if (this.A01 == 2 && (i3 = this.A06) > -1 && (i4 = this.A04) != 0) {
                C297875sV r2 = this.A0I;
                r2.A00.A04 = (float) i3;
                r2.invalidateSelf();
                r2.A0G(ColorStateList.valueOf(i4));
            }
            int i5 = this.A00;
            if (this.A01 == 1) {
                TypedValue A022 = C298035sl.A02(getContext(), R.attr.colorSurface);
                if (A022 != null) {
                    i2 = A022.data;
                } else {
                    i2 = 0;
                }
                i5 = 2eL.A05(this.A00, i2);
            }
            this.A00 = i5;
            this.A0I.A0F(ColorStateList.valueOf(i5));
            if (this.A08 == 3) {
                this.A0F.getBackground().invalidateSelf();
            }
            C297875sV r22 = this.A0J;
            if (r22 != null) {
                if (this.A06 > -1 && (i = this.A04) != 0) {
                    r22.A0F(ColorStateList.valueOf(i));
                }
                invalidate();
            }
            invalidate();
        }
    }

    private void A09() {
        CheckableImageButton checkableImageButton = this.A1D;
        boolean z = this.A12;
        ColorStateList colorStateList = this.A0A;
        boolean z2 = this.A13;
        PorterDuff.Mode mode = this.A0p;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void A0A() {
        CheckableImageButton checkableImageButton = this.A1F;
        boolean z = this.A14;
        ColorStateList colorStateList = this.A0D;
        boolean z2 = this.A15;
        PorterDuff.Mode mode = this.A0q;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void A0B() {
        EditText editText;
        int paddingStart;
        Resources resources;
        int dimensionPixelSize;
        int paddingEnd;
        int i;
        Resources resources2;
        int i2;
        C297875sV r1;
        int i3 = this.A01;
        if (i3 == 0) {
            this.A0I = null;
            this.A0J = null;
        } else if (i3 == 1) {
            this.A0I = new C297875sV(this.A0K);
            this.A0J = new C297875sV();
        } else if (i3 == 2) {
            if (!this.A0Q || (this.A0I instanceof UWT)) {
                r1 = new C297875sV(this.A0K);
            } else {
                r1 = new UWT(this.A0K);
            }
            this.A0I = r1;
            this.A0J = null;
        } else {
            throw new IllegalArgumentException(002.A03(i3, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText2 = this.A0F;
        if (!(editText2 == null || this.A0I == null || editText2.getBackground() != null || this.A01 == 0)) {
            this.A0F.setBackground(this.A0I);
        }
        A0P();
        if (this.A01 == 1) {
            Context context = getContext();
            if (Pxf.A0G(context).fontScale >= 2.0f) {
                resources2 = getResources();
                i2 = R.dimen.abc_button_padding_horizontal_material;
            } else if (C309286Xr.A04(context)) {
                resources2 = getResources();
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            this.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (this.A0F != null && this.A01 == 1) {
            Context context2 = getContext();
            if (Pxf.A0G(context2).fontScale >= 2.0f) {
                editText = this.A0F;
                paddingStart = editText.getPaddingStart();
                resources = getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                paddingEnd = this.A0F.getPaddingEnd();
                i = R.dimen.abc_button_padding_horizontal_material;
            } else if (C309286Xr.A04(context2)) {
                editText = this.A0F;
                paddingStart = editText.getPaddingStart();
                resources = getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
                paddingEnd = this.A0F.getPaddingEnd();
                i = R.dimen.account_discovery_bottom_gap;
            }
            editText.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, resources.getDimensionPixelSize(i));
        }
        if (this.A01 != 0) {
            A0E();
        }
    }

    private void A0D() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A0G;
        if (textView != null) {
            if (this.A10) {
                i = this.A0W;
            } else {
                i = this.A0X;
            }
            A0S(textView, i);
            if (!this.A10 && (colorStateList2 = this.A0m) != null) {
                this.A0G.setTextColor(colorStateList2);
            }
            if (this.A10 && (colorStateList = this.A0l) != null) {
                this.A0G.setTextColor(colorStateList);
            }
        }
    }

    private void A0E() {
        if (this.A01 != 1) {
            FrameLayout frameLayout = this.A19;
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(frameLayout);
            int A072 = A07();
            if (A072 != A0D2.topMargin) {
                A0D2.topMargin = A072;
                frameLayout.requestLayout();
            }
        }
    }

    private void A0F() {
        int paddingStart;
        if (this.A0F != null) {
            if (this.A1F.getVisibility() == 0) {
                paddingStart = 0;
            } else {
                paddingStart = this.A0F.getPaddingStart();
            }
            this.A1C.setPaddingRelative(paddingStart, this.A0F.getCompoundPaddingTop(), AnonymousClass7TG.A04(getContext()), this.A0F.getCompoundPaddingBottom());
        }
    }

    private void A0G() {
        int i;
        if (this.A0F != null) {
            if (A0T() || this.A1E.getVisibility() == 0) {
                i = 0;
            } else {
                i = this.A0F.getPaddingEnd();
            }
            this.A1O.setPaddingRelative(AnonymousClass7TG.A04(getContext()), this.A0F.getPaddingTop(), i, this.A0F.getPaddingBottom());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.A0R != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H() {
        /*
            r5 = this;
            android.widget.TextView r4 = r5.A1O
            int r3 = r4.getVisibility()
            java.lang.CharSequence r0 = r5.A0N
            r1 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A0R
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r2 = 0
            r1 = 8
        L_0x0013:
            r4.setVisibility(r1)
            int r0 = r4.getVisibility()
            if (r3 == r0) goto L_0x002f
            X.VV7 r1 = r5.getEndIconDelegate()
            boolean r0 = r1 instanceof X.C15223UWa
            if (r0 == 0) goto L_0x002f
            X.UWa r1 = (X.C15223UWa) r1
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            java.lang.CharSequence r0 = r0.A0N
            if (r0 == 0) goto L_0x002f
            X.C15223UWa.A00(r1, r2)
        L_0x002f:
            r5.A0N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0H():void");
    }

    public static void A0K(TextInputLayout textInputLayout, int i) {
        if (i != 0 || textInputLayout.A0R) {
            TextView textView = textInputLayout.A0H;
            if (textView != null && textInputLayout.A0T) {
                textView.setText((CharSequence) null);
                textInputLayout.A0H.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = textInputLayout.A0H;
        if (textView2 != null && textInputLayout.A0T) {
            textView2.setText(textInputLayout.A0L);
            textInputLayout.A0H.setVisibility(0);
            textInputLayout.A0H.bringToFront();
        }
    }

    private boolean A0M() {
        if (!this.A0Q || TextUtils.isEmpty(this.A0y) || !(this.A0I instanceof UWT)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r11.A1B.getMeasuredWidth() <= 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0N() {
        /*
            r11 = this;
            android.widget.EditText r0 = r11.A0F
            r8 = 0
            if (r0 != 0) goto L_0x0006
            return r8
        L_0x0006:
            com.google.android.material.internal.CheckableImageButton r0 = r11.A1F
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 != 0) goto L_0x0012
            java.lang.CharSequence r0 = r11.A0M
            if (r0 == 0) goto L_0x001b
        L_0x0012:
            android.widget.LinearLayout r0 = r11.A1B
            int r1 = r0.getMeasuredWidth()
            r0 = 1
            if (r1 > 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r6 = 0
            r10 = 2
            r9 = 3
            r5 = 1
            if (r0 == 0) goto L_0x00d6
            android.widget.LinearLayout r0 = r11.A1B
            int r1 = r0.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0F
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            android.graphics.drawable.Drawable r0 = r11.A0u
            if (r0 == 0) goto L_0x0037
            int r0 = r11.A0k
            if (r0 == r1) goto L_0x0043
        L_0x0037:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0u = r0
            r11.A0k = r1
            r0.setBounds(r8, r8, r1, r5)
        L_0x0043:
            android.widget.EditText r0 = r11.A0F
            android.graphics.drawable.Drawable[] r7 = r0.getCompoundDrawablesRelative()
            r0 = r7[r8]
            android.graphics.drawable.Drawable r4 = r11.A0u
            if (r0 == r4) goto L_0x00ef
            android.widget.EditText r3 = r11.A0F
            r2 = r7[r5]
            r1 = r7[r10]
            r0 = r7[r9]
            r3.setCompoundDrawablesRelative(r4, r2, r1, r0)
        L_0x005a:
            r3 = 1
        L_0x005b:
            com.google.android.material.internal.CheckableImageButton r0 = r11.A1E
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0071
            int r0 = r11.A08
            if (r0 == 0) goto L_0x006d
            boolean r0 = r11.A0T()
            if (r0 != 0) goto L_0x0071
        L_0x006d:
            java.lang.CharSequence r0 = r11.A0N
            if (r0 == 0) goto L_0x00f3
        L_0x0071:
            android.widget.LinearLayout r0 = r11.A1A
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x00f3
            android.widget.TextView r0 = r11.A1O
            int r2 = r0.getMeasuredWidth()
            android.widget.EditText r0 = r11.A0F
            int r0 = r0.getPaddingRight()
            int r2 = r2 - r0
            com.google.android.material.internal.CheckableImageButton r1 = r11.getEndIconToUpdateDummyDrawable()
            if (r1 == 0) goto L_0x009a
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r1)
            int r0 = r0.getMarginStart()
            int r2 = r2 + r0
        L_0x009a:
            android.widget.EditText r0 = r11.A0F
            android.graphics.drawable.Drawable[] r6 = r0.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r1 = r11.A0s
            if (r1 == 0) goto L_0x00bb
            int r0 = r11.A0c
            if (r0 == r2) goto L_0x00c7
            r11.A0c = r2
            r1.setBounds(r8, r8, r2, r5)
            android.widget.EditText r4 = r11.A0F
            r3 = r6[r8]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r1 = r11.A0s
        L_0x00b5:
            r0 = r6[r9]
            r4.setCompoundDrawablesRelative(r3, r2, r1, r0)
            return r5
        L_0x00bb:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r11.A0s = r0
            r11.A0c = r2
            r0.setBounds(r8, r8, r2, r5)
        L_0x00c7:
            r0 = r6[r10]
            android.graphics.drawable.Drawable r1 = r11.A0s
            if (r0 == r1) goto L_0x00f2
            r11.A0t = r0
            android.widget.EditText r4 = r11.A0F
            r3 = r6[r8]
            r2 = r6[r5]
            goto L_0x00b5
        L_0x00d6:
            android.graphics.drawable.Drawable r0 = r11.A0u
            if (r0 == 0) goto L_0x00ef
            android.widget.EditText r0 = r11.A0F
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r3 = r11.A0F
            r2 = r0[r5]
            r1 = r0[r10]
            r0 = r0[r9]
            r3.setCompoundDrawablesRelative(r6, r2, r1, r0)
            r11.A0u = r6
            goto L_0x005a
        L_0x00ef:
            r3 = 0
            goto L_0x005b
        L_0x00f2:
            return r3
        L_0x00f3:
            android.graphics.drawable.Drawable r0 = r11.A0s
            if (r0 == 0) goto L_0x0115
            android.widget.EditText r0 = r11.A0F
            android.graphics.drawable.Drawable[] r7 = r0.getCompoundDrawablesRelative()
            r1 = r7[r10]
            android.graphics.drawable.Drawable r0 = r11.A0s
            if (r1 != r0) goto L_0x0113
            android.widget.EditText r4 = r11.A0F
            r3 = r7[r8]
            r2 = r7[r5]
            android.graphics.drawable.Drawable r1 = r11.A0t
            r0 = r7[r9]
            r4.setCompoundDrawablesRelative(r3, r2, r1, r0)
        L_0x0110:
            r11.A0s = r6
            return r5
        L_0x0113:
            r5 = r3
            goto L_0x0110
        L_0x0115:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0N():boolean");
    }

    private VV7 getEndIconDelegate() {
        SparseArray sparseArray = this.A1M;
        VV7 vv7 = (VV7) sparseArray.get(this.A08);
        if (vv7 == null) {
            return (VV7) sparseArray.get(0);
        }
        return vv7;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.A1E;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.A08 == 0 || !A0T()) {
            return null;
        }
        return this.A1D;
    }

    private void setEditText(EditText editText) {
        if (this.A0F == null) {
            this.A0F = editText;
            setMinWidth(this.A0i);
            setMaxWidth(this.A0h);
            A0B();
            setTextInputAccessibilityDelegate(new U7E(this));
            C14129TqO tqO = this.A1G;
            tqO.A0F(this.A0F.getTypeface());
            float textSize = this.A0F.getTextSize();
            if (tqO.A0K != textSize) {
                tqO.A0K = textSize;
                tqO.A0G(false);
            }
            int gravity = this.A0F.getGravity();
            tqO.A09((gravity & -113) | 48);
            if (tqO.A0R != gravity) {
                tqO.A0R = gravity;
                tqO.A0G(false);
            }
            this.A0F.addTextChangedListener(new W7b(this, 2));
            if (this.A0n == null) {
                this.A0n = this.A0F.getHintTextColors();
            }
            if (this.A0Q) {
                if (TextUtils.isEmpty(this.A0y)) {
                    CharSequence hint = this.A0F.getHint();
                    this.A0z = hint;
                    setHint(hint);
                    this.A0F.setHint((CharSequence) null);
                }
                this.A0S = true;
            }
            if (this.A0G != null) {
                A0R(C13988Tno.A0C(this.A0F));
            }
            A0O();
            this.A1H.A03();
            this.A1B.bringToFront();
            this.A1A.bringToFront();
            this.A1N.bringToFront();
            this.A1E.bringToFront();
            Iterator it = this.A1I.iterator();
            while (it.hasNext()) {
                ((X35) it.next()).DBN(this);
            }
            A0F();
            A0G();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A0L(this, false, true);
            return;
        }
        throw new IllegalArgumentException(C273654mx.A00(1418));
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.A1E.setVisibility(DbW.A01(z ? 1 : 0));
        FrameLayout frameLayout = this.A1N;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        A0G();
        if (this.A08 == 0) {
            A0N();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0y)) {
            this.A0y = charSequence;
            C14129TqO tqO = this.A1G;
            if (charSequence == null || !TextUtils.equals(tqO.A0f, charSequence)) {
                tqO.A0f = charSequence;
                tqO.A0g = null;
                tqO.A0G(false);
            }
            if (!this.A0R) {
                A0C();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.A0T != z) {
            if (z) {
                AnonymousClass3Tj r1 = new AnonymousClass3Tj(getContext(), (AttributeSet) null);
                this.A0H = r1;
                r1.setId(R.id.textinput_placeholder);
                this.A0H.setAccessibilityLiveRegion(1);
                setPlaceholderTextAppearance(this.A0j);
                setPlaceholderTextColor(this.A0o);
                TextView textView = this.A0H;
                if (textView != null) {
                    this.A19.addView(textView);
                    this.A0H.setVisibility(0);
                }
            } else {
                AnonymousClass7TH.A0R(this.A0H);
                this.A0H = null;
            }
            this.A0T = z;
        }
    }

    public final void A0O() {
        Drawable background;
        int currentTextColor;
        EditText editText = this.A0F;
        if (editText != null && this.A01 == 0 && (background = editText.getBackground()) != null) {
            Drawable mutate = background.mutate();
            C18786W1o w1o = this.A1H;
            if (w1o.A07()) {
                TextView textView = w1o.A09;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A10 || (textView = this.A0G) == null) {
                    mutate.clearColorFilter();
                    this.A0F.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            mutate.setColorFilter(AnonymousClass2X7.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0106, code lost:
        if (r1 != null) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P() {
        /*
            r9 = this;
            X.5sV r0 = r9.A0I
            if (r0 == 0) goto L_0x00d0
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r9.isFocused()
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001a
            android.widget.EditText r0 = r9.A0F
            if (r0 == 0) goto L_0x0148
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0148
        L_0x001a:
            r8 = 1
        L_0x001b:
            boolean r0 = r9.isHovered()
            if (r0 != 0) goto L_0x002b
            android.widget.EditText r0 = r9.A0F
            if (r0 == 0) goto L_0x0145
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L_0x0145
        L_0x002b:
            r7 = 1
        L_0x002c:
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00e9
            int r0 = r9.A0a
        L_0x0034:
            r9.A04 = r0
        L_0x0036:
            com.google.android.material.internal.CheckableImageButton r2 = r9.A1E
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L_0x004b
            X.W1o r1 = r9.A1H
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x004b
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x004b
            r6 = 1
        L_0x004b:
            r9.setErrorIconVisible(r6)
            android.content.res.ColorStateList r0 = r9.A0B
            A0I(r0, r2, r9)
            com.google.android.material.internal.CheckableImageButton r1 = r9.A1F
            android.content.res.ColorStateList r0 = r9.A0D
            A0I(r0, r1, r9)
            com.google.android.material.internal.CheckableImageButton r3 = r9.A1D
            android.content.res.ColorStateList r0 = r9.A0A
            A0I(r0, r3, r9)
            X.VV7 r0 = r9.getEndIconDelegate()
            boolean r0 = r0 instanceof X.C15224UWb
            if (r0 == 0) goto L_0x008d
            X.W1o r2 = r9.A1H
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x00e5
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            if (r0 == 0) goto L_0x00e5
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            android.graphics.drawable.Drawable r1 = r0.mutate()
            android.widget.TextView r0 = r2.A09
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.getCurrentTextColor()
        L_0x0087:
            r1.setTint(r0)
            r3.setImageDrawable(r1)
        L_0x008d:
            if (r8 == 0) goto L_0x00e0
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00e0
            int r0 = r9.A05
        L_0x0097:
            r9.A06 = r0
            int r1 = r9.A01
            r0 = 2
            if (r1 != r0) goto L_0x00bf
            boolean r0 = r9.A0M()
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x00bf
            int r1 = r9.A03
            int r0 = r9.A06
            if (r1 == r0) goto L_0x00bf
            boolean r0 = r9.A0M()
            if (r0 == 0) goto L_0x00bc
            X.5sV r1 = r9.A0I
            X.UWT r1 = (X.UWT) r1
            r0 = 0
            r1.A0J(r0, r0, r0, r0)
        L_0x00bc:
            r9.A0C()
        L_0x00bf:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x00cd
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00d1
            int r0 = r9.A0b
        L_0x00cb:
            r9.A00 = r0
        L_0x00cd:
            r9.A08()
        L_0x00d0:
            return
        L_0x00d1:
            if (r7 == 0) goto L_0x00d8
            if (r8 != 0) goto L_0x00dd
            int r0 = r9.A0f
            goto L_0x00cb
        L_0x00d8:
            if (r8 != 0) goto L_0x00dd
            int r0 = r9.A0Y
            goto L_0x00cb
        L_0x00dd:
            int r0 = r9.A0d
            goto L_0x00cb
        L_0x00e0:
            int r0 = r9.A0V
            goto L_0x0097
        L_0x00e3:
            r0 = -1
            goto L_0x0087
        L_0x00e5:
            r9.A09()
            goto L_0x008d
        L_0x00e9:
            X.W1o r2 = r9.A1H
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x00fc
            android.content.res.ColorStateList r1 = r9.A0E
            if (r1 != 0) goto L_0x0108
            android.widget.TextView r0 = r2.A09
            if (r0 != 0) goto L_0x012f
            r0 = -1
            goto L_0x0034
        L_0x00fc:
            boolean r0 = r9.A10
            if (r0 == 0) goto L_0x0135
            android.widget.TextView r0 = r9.A0G
            if (r0 == 0) goto L_0x0135
            android.content.res.ColorStateList r1 = r9.A0E
            if (r1 == 0) goto L_0x012f
        L_0x0108:
            int r0 = r1.getDefaultColor()
            android.content.res.ColorStateList r2 = r9.A0E
            r4 = 2
            int[] r1 = new int[r4]
            r1 = {16843623, 16842910} // fill-array
            int r3 = r2.getColorForState(r1, r0)
            android.content.res.ColorStateList r2 = r9.A0E
            int[] r1 = new int[r4]
            r1 = {16843518, 16842910} // fill-array
            int r1 = r2.getColorForState(r1, r0)
            if (r8 == 0) goto L_0x0129
            r9.A04 = r1
            goto L_0x0036
        L_0x0129:
            if (r7 == 0) goto L_0x0034
            r9.A04 = r3
            goto L_0x0036
        L_0x012f:
            int r0 = r0.getCurrentTextColor()
            goto L_0x0034
        L_0x0135:
            if (r8 == 0) goto L_0x013b
            int r0 = r9.A0e
            goto L_0x0034
        L_0x013b:
            if (r7 == 0) goto L_0x0141
            int r0 = r9.A0g
            goto L_0x0034
        L_0x0141:
            int r0 = r9.A0Z
            goto L_0x0034
        L_0x0145:
            r7 = 0
            goto L_0x002c
        L_0x0148:
            r8 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0P():void");
    }

    public final void A0Q(float f) {
        C14129TqO tqO = this.A1G;
        if (tqO.A0E != f) {
            if (this.A09 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A09 = valueAnimator;
                valueAnimator.setInterpolator(AnonymousClass6Y2.A02);
                this.A09.setDuration(167);
                W4Q.A00(this.A09, this, 9);
            }
            this.A09.setFloatValues(new float[]{tqO.A0E, f});
            this.A09.start();
        }
    }

    public final void A0R(int i) {
        String obj;
        boolean z = this.A10;
        int i2 = this.A07;
        if (i2 == -1) {
            C13988Tno.A15(this.A0G, i);
            this.A0G.setContentDescription((CharSequence) null);
            this.A10 = false;
        } else {
            boolean A1W = C51970G9q.A1W(i, i2);
            this.A10 = A1W;
            Context context = getContext();
            TextView textView = this.A0G;
            int i3 = 2131955058;
            if (A1W) {
                i3 = 2131955059;
            }
            Integer valueOf = Integer.valueOf(i);
            textView.setContentDescription(context.getString(i3, C51968G9o.A1Z(valueOf, i2)));
            if (z != this.A10) {
                A0D();
            }
            C304216Cp A022 = C304216Cp.A02();
            TextView textView2 = this.A0G;
            String string = context.getString(2131955060, C51968G9o.A1Z(valueOf, this.A07));
            C245253cZ r0 = A022.A00;
            if (string == null) {
                obj = null;
            } else {
                obj = A022.A03(r0, string).toString();
            }
            textView2.setText(obj);
        }
        if (this.A0F != null && z != this.A10) {
            A0L(this, false, false);
            A0P();
            A0O();
        }
    }

    public final boolean A0T() {
        if (this.A1N.getVisibility() == 0 && this.A1D.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A19;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A0E();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0F;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0z != null) {
            boolean z = this.A0S;
            this.A0S = false;
            CharSequence hint = editText.getHint();
            this.A0F.setHint(this.A0z);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.A0F.setHint(hint);
                this.A0S = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.A19;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.A0F) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A16
            if (r0 != 0) goto L_0x004d
            r3 = 1
            r4.A16 = r3
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            X.TqO r1 = r4.A1G
            r2 = 0
            if (r1 == 0) goto L_0x0050
            r1.A0l = r0
            android.content.res.ColorStateList r0 = r1.A0X
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0029
        L_0x001f:
            android.content.res.ColorStateList r0 = r1.A0Z
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0050
        L_0x0029:
            r1.A0G(r2)
            r1 = 1
        L_0x002d:
            android.widget.EditText r0 = r4.A0F
            if (r0 == 0) goto L_0x0040
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x004e
        L_0x003d:
            A0L(r4, r3, r2)
        L_0x0040:
            r4.A0O()
            r4.A0P()
            if (r1 == 0) goto L_0x004b
            r4.invalidate()
        L_0x004b:
            r4.A16 = r2
        L_0x004d:
            return
        L_0x004e:
            r3 = 0
            goto L_0x003d
        L_0x0050:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public int getBaseline() {
        EditText editText = this.A0F;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + A07();
        }
        return super.getBaseline();
    }

    public C297875sV getBoxBackground() {
        int i = this.A01;
        if (i == 1 || i == 2) {
            return this.A0I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.A00;
    }

    public int getBoxBackgroundMode() {
        return this.A01;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C297875sV r2 = this.A0I;
        C297935sb r1 = r2.A00.A0K.A00;
        RectF rectF = r2.A0C;
        C13988Tno.A0v(rectF, r2);
        return r1.ArV(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        C297875sV r2 = this.A0I;
        C297935sb r1 = r2.A00.A0K.A01;
        RectF rectF = r2.A0C;
        C13988Tno.A0v(rectF, r2);
        return r1.ArV(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        C297875sV r2 = this.A0I;
        C297935sb r1 = r2.A00.A0K.A03;
        RectF rectF = r2.A0C;
        C13988Tno.A0v(rectF, r2);
        return r1.ArV(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A0I.A07();
    }

    public int getBoxStrokeColor() {
        return this.A0e;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0E;
    }

    public int getBoxStrokeWidth() {
        return this.A0V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A05;
    }

    public int getCounterMaxLength() {
        return this.A07;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0O || !this.A10 || (textView = this.A0G) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A0m;
    }

    public ColorStateList getCounterTextColor() {
        return this.A0m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0n;
    }

    public EditText getEditText() {
        return this.A0F;
    }

    public CharSequence getEndIconContentDescription() {
        return this.A1D.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.A1D.getDrawable();
    }

    public int getEndIconMode() {
        return this.A08;
    }

    public CheckableImageButton getEndIconView() {
        return this.A1D;
    }

    public CharSequence getError() {
        C18786W1o w1o = this.A1H;
        if (w1o.A0E) {
            return w1o.A0B;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.A1H.A0C;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A1H.A09;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.A1E.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A1H.A09;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C18786W1o w1o = this.A1H;
        if (w1o.A0F) {
            return w1o.A0D;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A1H.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0Q) {
            return this.A0y;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A1G.A05();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C14129TqO tqO = this.A1G;
        return C14129TqO.A01(tqO.A0X, tqO);
    }

    public ColorStateList getHintTextColor() {
        return this.A0C;
    }

    public int getMaxWidth() {
        return this.A0h;
    }

    public int getMinWidth() {
        return this.A0i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A1D.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A1D.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A0T) {
            return this.A0L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A0j;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0o;
    }

    public CharSequence getPrefixText() {
        return this.A0M;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A1C.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A1C;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A1F.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A1F.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A0N;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A1O.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A1O;
    }

    public Typeface getTypeface() {
        return this.A0r;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        setError(savedState.A00);
        if (savedState.A04) {
            this.A1D.post(new C19971Wii(this));
        }
        setHint(savedState.A02);
        setHelperText(savedState.A01);
        setPlaceholderText(savedState.A03);
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0Y = i;
            this.A0d = i;
            this.A0f = i;
            A08();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (this.A0F != null) {
                A0B();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0e != i) {
            this.A0e = i;
            A0P();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            A0P();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.A0V = i;
        A0P();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.A05 = i;
        A0P();
    }

    public void setCounterEnabled(boolean z) {
        int A0C2;
        if (this.A0O != z) {
            if (z) {
                AnonymousClass3Tj r1 = new AnonymousClass3Tj(getContext(), (AttributeSet) null);
                this.A0G = r1;
                r1.setId(R.id.textinput_counter);
                Typeface typeface = this.A0r;
                if (typeface != null) {
                    this.A0G.setTypeface(typeface);
                }
                this.A0G.setMaxLines(1);
                this.A1H.A05(this.A0G, 2);
                DbS.A0D(this.A0G).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                A0D();
                if (this.A0G != null) {
                    EditText editText = this.A0F;
                    if (editText == null) {
                        A0C2 = 0;
                    } else {
                        A0C2 = C13988Tno.A0C(editText);
                    }
                    A0R(A0C2);
                }
            } else {
                this.A1H.A06(this.A0G, 2);
                this.A0G = null;
            }
            this.A0O = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int A0C2;
        if (this.A07 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A07 = i;
            if (this.A0O && this.A0G != null) {
                EditText editText = this.A0F;
                if (editText == null) {
                    A0C2 = 0;
                } else {
                    A0C2 = C13988Tno.A0C(editText);
                }
                A0R(A0C2);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A0W != i) {
            this.A0W = i;
            A0D();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            A0D();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A0X != i) {
            this.A0X = i;
            A0D();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A0m != colorStateList) {
            this.A0m = colorStateList;
            A0D();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0n = colorStateList;
        this.A0C = colorStateList;
        if (this.A0F != null) {
            A0L(this, false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.A1D.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A1D.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setEndIconDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.A08;
        this.A08 = i;
        Iterator it = this.A1J.iterator();
        while (it.hasNext()) {
            ((X36) it.next()).DC9(this, i2);
        }
        setEndIconVisible(AnonymousClass7TF.A1P(i));
        VV7 endIconDelegate = getEndIconDelegate();
        int i3 = this.A01;
        if (!(endIconDelegate instanceof C15224UWb) || AnonymousClass7TF.A1P(i3)) {
            VV7 endIconDelegate2 = getEndIconDelegate();
            if (endIconDelegate2 instanceof UWZ) {
                UWZ uwz = (UWZ) endIconDelegate2;
                TextInputLayout textInputLayout = uwz.A02;
                textInputLayout.setEndIconDrawable(C323656xt.A00(uwz.A00, R.drawable.design_password_eye));
                textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131969201));
                textInputLayout.setEndIconOnClickListener(new C18887WAz(uwz, 10));
                X35 x35 = uwz.A01;
                textInputLayout.A1I.add(x35);
                if (textInputLayout.A0F != null) {
                    x35.DBN(textInputLayout);
                }
                textInputLayout.A1J.add(uwz.A02);
                EditText editText = textInputLayout.A0F;
                if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            } else if (endIconDelegate2 instanceof UWY) {
                TextInputLayout textInputLayout2 = endIconDelegate2.A02;
                textInputLayout2.setEndIconOnClickListener((View.OnClickListener) null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
            } else if (endIconDelegate2 instanceof C15224UWb) {
                C15224UWb uWb = (C15224UWb) endIconDelegate2;
                Context context = uWb.A00;
                float dimensionPixelOffset = (float) context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                float dimensionPixelOffset2 = (float) context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
                int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
                C297875sV A002 = C15224UWb.A00(uWb, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
                C297875sV A003 = C15224UWb.A00(uWb, 0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
                uWb.A05 = A002;
                StateListDrawable stateListDrawable = new StateListDrawable();
                uWb.A03 = stateListDrawable;
                stateListDrawable.addState(new int[]{16842922}, A002);
                uWb.A03.addState(new int[0], A003);
                TextInputLayout textInputLayout3 = uWb.A02;
                textInputLayout3.setEndIconDrawable(C323656xt.A00(context, R.drawable.mtrl_dropdown_arrow));
                textInputLayout3.setEndIconContentDescription(textInputLayout3.getResources().getText(2131961881));
                textInputLayout3.setEndIconOnClickListener(new C18887WAz(uWb, 9));
                X35 x352 = uWb.A0B;
                textInputLayout3.A1I.add(x352);
                if (textInputLayout3.A0F != null) {
                    x352.DBN(textInputLayout3);
                }
                textInputLayout3.A1J.add(uWb.A0C);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                TimeInterpolator timeInterpolator = AnonymousClass6Y2.A03;
                ofFloat.setInterpolator(timeInterpolator);
                ofFloat.setDuration(67);
                W4Q.A00(ofFloat, uWb, 8);
                uWb.A01 = ofFloat;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat2.setInterpolator(timeInterpolator);
                ofFloat2.setDuration(50);
                W4Q.A00(ofFloat2, uWb, 8);
                uWb.A02 = ofFloat2;
                U0N.A00(ofFloat2, uWb, 13);
                uWb.A04 = (AccessibilityManager) context.getSystemService("accessibility");
            } else if (endIconDelegate2 instanceof UWX) {
                TextInputLayout textInputLayout4 = endIconDelegate2.A02;
                textInputLayout4.setEndIconOnClickListener((View.OnClickListener) null);
                textInputLayout4.setEndIconOnLongClickListener((View.OnLongClickListener) null);
            } else {
                C15223UWa uWa = (C15223UWa) endIconDelegate2;
                TextInputLayout textInputLayout5 = uWa.A02;
                textInputLayout5.setEndIconDrawable(C323656xt.A00(uWa.A00, R.drawable.mtrl_ic_cancel));
                textInputLayout5.setEndIconContentDescription(textInputLayout5.getResources().getText(2131955151));
                textInputLayout5.setEndIconOnClickListener(new C18887WAz(uWa, 8));
                X35 x353 = uWa.A04;
                textInputLayout5.A1I.add(x353);
                if (textInputLayout5.A0F != null) {
                    x353.DBN(textInputLayout5);
                }
                textInputLayout5.A1J.add(uWa.A05);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat3.setInterpolator(AnonymousClass6Y2.A04);
                ofFloat3.setDuration(150);
                W4Q.A00(ofFloat3, uWa, 7);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                TimeInterpolator timeInterpolator2 = AnonymousClass6Y2.A03;
                ofFloat4.setInterpolator(timeInterpolator2);
                ofFloat4.setDuration(100);
                W4Q.A00(ofFloat4, uWa, 6);
                AnimatorSet animatorSet = new AnimatorSet();
                uWa.A00 = animatorSet;
                animatorSet.playTogether(new Animator[]{ofFloat3, ofFloat4});
                U0N.A00(uWa.A00, uWa, 11);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat5.setInterpolator(timeInterpolator2);
                ofFloat5.setDuration(100);
                W4Q.A00(ofFloat5, uWa, 6);
                uWa.A01 = ofFloat5;
                U0N.A00(ofFloat5, uWa, 12);
            }
            A09();
            return;
        }
        throw new IllegalStateException(002.A02(i3, i, "The current box background mode ", " is not supported by the end icon mode "));
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1D, onClickListener, this.A0v);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0v = onLongClickListener;
        setIconOnLongClickListener(this.A1D, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            this.A12 = true;
            A09();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.A0p != mode) {
            this.A0p = mode;
            this.A13 = true;
            A09();
        }
    }

    public void setError(CharSequence charSequence) {
        C18786W1o w1o = this.A1H;
        if (!w1o.A0E) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = w1o.A04;
            if (animator != null) {
                animator.cancel();
            }
            w1o.A0B = charSequence;
            w1o.A09.setText(charSequence);
            int i = w1o.A00;
            if (i != 1) {
                w1o.A01 = 1;
            }
            C18786W1o.A01(w1o, i, w1o.A01, C18786W1o.A02(w1o.A09, w1o, charSequence));
            return;
        }
        w1o.A04();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C18786W1o w1o = this.A1H;
        w1o.A0C = charSequence;
        TextView textView = w1o.A09;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C18786W1o w1o = this.A1H;
        if (w1o.A0E != z) {
            Animator animator = w1o.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass3Tj r1 = new AnonymousClass3Tj(w1o.A0J, (AttributeSet) null);
                w1o.A09 = r1;
                r1.setId(R.id.textinput_error);
                w1o.A09.setTextAlignment(5);
                Typeface typeface = w1o.A07;
                if (typeface != null) {
                    w1o.A09.setTypeface(typeface);
                }
                int i = w1o.A02;
                w1o.A02 = i;
                TextView textView = w1o.A09;
                if (textView != null) {
                    w1o.A0K.A0S(textView, i);
                }
                ColorStateList colorStateList = w1o.A05;
                w1o.A05 = colorStateList;
                TextView textView2 = w1o.A09;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = w1o.A0C;
                w1o.A0C = charSequence;
                TextView textView3 = w1o.A09;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                w1o.A09.setVisibility(4);
                w1o.A09.setAccessibilityLiveRegion(1);
                w1o.A05(w1o.A09, 0);
            } else {
                w1o.A04();
                w1o.A06(w1o.A09, 0);
                w1o.A09 = null;
                TextInputLayout textInputLayout = w1o.A0K;
                textInputLayout.A0O();
                textInputLayout.A0P();
            }
            w1o.A0E = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setErrorIconDrawable(drawable);
        A0I(this.A0B, this.A1E, this);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1E, onClickListener, this.A0w);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0w = onLongClickListener;
        setIconOnLongClickListener(this.A1E, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        CheckableImageButton checkableImageButton = this.A1E;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.A1E;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C18786W1o w1o = this.A1H;
        w1o.A02 = i;
        TextView textView = w1o.A09;
        if (textView != null) {
            w1o.A0K.A0S(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C18786W1o w1o = this.A1H;
        w1o.A05 = colorStateList;
        TextView textView = w1o.A09;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.A11 != z) {
            this.A11 = z;
            A0L(this, false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C18786W1o w1o = this.A1H;
        w1o.A06 = colorStateList;
        TextView textView = w1o.A0A;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C18786W1o w1o = this.A1H;
        if (w1o.A0F != z) {
            Animator animator = w1o.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass3Tj r1 = new AnonymousClass3Tj(w1o.A0J, (AttributeSet) null);
                w1o.A0A = r1;
                r1.setId(R.id.textinput_helper_text);
                w1o.A0A.setTextAlignment(5);
                Typeface typeface = w1o.A07;
                if (typeface != null) {
                    w1o.A0A.setTypeface(typeface);
                }
                w1o.A0A.setVisibility(4);
                w1o.A0A.setAccessibilityLiveRegion(1);
                int i = w1o.A03;
                w1o.A03 = i;
                TextView textView = w1o.A0A;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = w1o.A06;
                w1o.A06 = colorStateList;
                TextView textView2 = w1o.A0A;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                w1o.A05(w1o.A0A, 1);
            } else {
                Animator animator2 = w1o.A04;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = w1o.A00;
                if (i2 == 2) {
                    w1o.A01 = 0;
                }
                C18786W1o.A01(w1o, i2, w1o.A01, C18786W1o.A02(w1o.A0A, w1o, (CharSequence) null));
                w1o.A06(w1o.A0A, 1);
                w1o.A0A = null;
                TextInputLayout textInputLayout = w1o.A0K;
                textInputLayout.A0O();
                textInputLayout.A0P();
            }
            w1o.A0F = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C18786W1o w1o = this.A1H;
        w1o.A03 = i;
        TextView textView = w1o.A0A;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0P = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0Q) {
            this.A0Q = z;
            if (!z) {
                this.A0S = false;
                if (!TextUtils.isEmpty(this.A0y) && TextUtils.isEmpty(this.A0F.getHint())) {
                    this.A0F.setHint(this.A0y);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A0F.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0y)) {
                        setHint(hint);
                    }
                    this.A0F.setHint((CharSequence) null);
                }
                this.A0S = true;
            }
            if (this.A0F != null) {
                A0E();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C14129TqO tqO = this.A1G;
        tqO.A08(i);
        this.A0C = tqO.A0X;
        if (this.A0F != null) {
            A0L(this, false, false);
            A0E();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0C != colorStateList) {
            if (this.A0n == null) {
                this.A1G.A0D(colorStateList);
            }
            this.A0C = colorStateList;
            if (this.A0F != null) {
                A0L(this, false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.A0h = i;
        EditText editText = this.A0F;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMinWidth(int i) {
        this.A0i = i;
        EditText editText = this.A0F;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i;
        if (z) {
            i = 1;
            if (this.A08 == 1) {
                return;
            }
        } else {
            i = 0;
        }
        setEndIconMode(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0A = colorStateList;
        this.A12 = true;
        A09();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0p = mode;
        this.A13 = true;
        A09();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int A0C2;
        if (!this.A0T || !TextUtils.isEmpty(charSequence)) {
            if (!this.A0T) {
                setPlaceholderTextEnabled(true);
            }
            this.A0L = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.A0F;
        if (editText == null) {
            A0C2 = 0;
        } else {
            A0C2 = C13988Tno.A0C(editText);
        }
        A0K(this, A0C2);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A0j = i;
        TextView textView = this.A0H;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0o != colorStateList) {
            this.A0o = colorStateList;
            TextView textView = this.A0H;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixTextAppearance(int i) {
        this.A1C.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A1C.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.A1F.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A1F;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            A0I(this.A0D, checkableImageButton, this);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1F, onClickListener, this.A0x);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0x = onLongClickListener;
        setIconOnLongClickListener(this.A1F, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.A0D != colorStateList) {
            this.A0D = colorStateList;
            this.A14 = true;
            A0A();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.A0q != mode) {
            this.A0q = mode;
            this.A15 = true;
            A0A();
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.A1F;
        if (AnonymousClass7TF.A1Q(checkableImageButton.getVisibility()) != z) {
            checkableImageButton.setVisibility(DbW.A01(z ? 1 : 0));
            A0F();
            A0N();
        }
    }

    public void setSuffixTextAppearance(int i) {
        this.A1O.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A1O.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(U7E u7e) {
        EditText editText = this.A0F;
        if (editText != null) {
            03v.A0B(editText, u7e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0r) {
            this.A0r = typeface;
            this.A1G.A0F(typeface);
            C18786W1o w1o = this.A1H;
            if (typeface != w1o.A07) {
                w1o.A07 = typeface;
                TextView textView = w1o.A09;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = w1o.A0A;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0G;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r37, android.util.AttributeSet r38, int r39) {
        /*
            r36 = this;
            r1 = 2132018494(0x7f14053e, float:1.9675296E38)
            r0 = r37
            r14 = r38
            r2 = r39
            android.content.Context r0 = X.C297835sR.A00(r0, r14, r2, r1)
            r12 = r36
            r12.<init>(r0, r14, r2)
            r13 = -1
            r12.A0i = r13
            r12.A0h = r13
            X.W1o r0 = new X.W1o
            r0.<init>(r12)
            r12.A1H = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A1K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A18 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.A1L = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r12.A1I = r0
            r11 = 0
            r12.A08 = r11
            android.util.SparseArray r35 = new android.util.SparseArray
            r35.<init>()
            r0 = r35
            r12.A1M = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r12.A1J = r0
            X.TqO r3 = new X.TqO
            r3.<init>(r12)
            r12.A1G = r3
            android.content.Context r10 = r12.getContext()
            r9 = 1
            r12.setOrientation(r9)
            r12.setWillNotDraw(r11)
            r12.setAddStatesFromChildren(r9)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r10)
            r12.A19 = r5
            r5.setAddStatesFromChildren(r9)
            r12.addView(r5)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r10)
            r12.A1B = r8
            r8.setOrientation(r11)
            r34 = -2
            r6 = 8388611(0x800003, float:1.1754948E-38)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r0 = r34
            r4.<init>(r0, r13, r6)
            r8.setLayoutParams(r4)
            r5.addView(r8)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r10)
            r12.A1A = r7
            r7.setOrientation(r11)
            r6 = 8388613(0x800005, float:1.175495E-38)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r0, r13, r6)
            r7.setLayoutParams(r4)
            r5.addView(r7)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r10)
            r12.A1N = r6
            X.JTQ.A0w(r6, r0, r13)
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A03
            r3.A0V = r0
            r3.A0G(r11)
            r3.A0U = r0
            r3.A0G(r11)
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r3.A09(r0)
            int[] r17 = X.C297865sU.A0d
            r22 = 5
            r33 = 20
            r32 = 18
            r21 = 33
            r20 = 38
            r15 = 42
            r16 = 4
            r19 = 42
            r5 = r33
            r4 = r32
            r3 = r21
            r0 = r20
            int[] r26 = new int[]{r5, r4, r3, r0, r15}
            X.C297855sT.A01(r10, r14, r2, r1)
            r23 = r10
            r24 = r14
            r25 = r17
            r27 = r2
            r28 = r1
            X.C297855sT.A02(r23, r24, r25, r26, r27, r28)
            r0 = r17
            X.2Yi r5 = X.2Yi.A00(r10, r14, r0, r2, r1)
            r0 = 41
            android.content.res.TypedArray r4 = r5.A02
            boolean r0 = r4.getBoolean(r0, r9)
            r12.A0Q = r0
            r0 = r16
            java.lang.CharSequence r0 = r4.getText(r0)
            r12.setHint((java.lang.CharSequence) r0)
            r0 = 40
            boolean r0 = r4.getBoolean(r0, r9)
            r12.A0P = r0
            r0 = 35
            boolean r0 = r4.getBoolean(r0, r9)
            r12.A11 = r0
            r31 = 3
            r0 = r31
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x0129
            r0 = r31
            int r0 = r4.getDimensionPixelSize(r0, r13)
            r12.setMinWidth(r0)
        L_0x0129:
            r3 = 2
            boolean r0 = r4.hasValue(r3)
            if (r0 == 0) goto L_0x0137
            int r0 = r4.getDimensionPixelSize(r3, r13)
            r12.setMaxWidth(r0)
        L_0x0137:
            X.6yg r1 = X.C297895sX.A01(r10, r14, r2, r1)
            X.5sX r0 = new X.5sX
            r0.<init>(r1)
            r12.A0K = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r12.A17 = r0
            r0 = 7
            int r0 = r4.getDimensionPixelOffset(r0, r11)
            r12.A02 = r0
            int r1 = X.JTR.A08(r10)
            r0 = 14
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r12.A0V = r0
            int r1 = X.AnonymousClass7TG.A04(r10)
            r0 = 15
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r12.A05 = r0
            int r0 = r12.A0V
            r12.A06 = r0
            r0 = 11
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r18 = r4.getDimension(r0, r1)
            r0 = 10
            float r17 = r4.getDimension(r0, r1)
            r0 = 8
            float r14 = r4.getDimension(r0, r1)
            r0 = 9
            float r2 = r4.getDimension(r0, r1)
            X.5sX r0 = r12.A0K
            X.6yg r1 = new X.6yg
            r1.<init>(r0)
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01a2
            X.5sa r15 = new X.5sa
            r0 = r18
            r15.<init>(r0)
            r1.A02 = r15
        L_0x01a2:
            int r0 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01af
            X.5sa r15 = new X.5sa
            r0 = r17
            r15.<init>(r0)
            r1.A03 = r15
        L_0x01af:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01ba
            X.5sa r0 = new X.5sa
            r0.<init>(r14)
            r1.A01 = r0
        L_0x01ba:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01c5
            X.5sa r0 = new X.5sa
            r0.<init>(r2)
            r1.A00 = r0
        L_0x01c5:
            X.5sX r0 = new X.5sX
            r0.<init>(r1)
            r12.A0K = r0
            r0 = r22
            android.content.res.ColorStateList r1 = X.C309286Xr.A02(r10, r5, r0)
            if (r1 == 0) goto L_0x05dd
            int r0 = r1.getDefaultColor()
            r12.A0Y = r0
            r12.A00 = r0
            boolean r0 = r1.isStateful()
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r0 == 0) goto L_0x05bf
            int[] r0 = new int[]{r2}
            int r0 = r1.getColorForState(r0, r13)
            r12.A0b = r0
            int[] r0 = new int[r3]
            r0 = {16842908, 16842910} // fill-array
            int r0 = r1.getColorForState(r0, r13)
            r12.A0d = r0
            int[] r0 = new int[r3]
            r0 = {16843623, 16842910} // fill-array
        L_0x01ff:
            int r0 = r1.getColorForState(r0, r13)
            r12.A0f = r0
        L_0x0205:
            boolean r0 = r4.hasValue(r9)
            if (r0 == 0) goto L_0x0213
            android.content.res.ColorStateList r0 = r5.A01(r9)
            r12.A0C = r0
            r12.A0n = r0
        L_0x0213:
            r0 = 12
            android.content.res.ColorStateList r1 = X.C309286Xr.A02(r10, r5, r0)
            int r0 = r4.getColor(r0, r11)
            r12.A0e = r0
            r0 = 2131100616(0x7f0603c8, float:1.7813618E38)
            int r0 = r10.getColor(r0)
            r12.A0Z = r0
            r0 = 2131099780(0x7f060084, float:1.7811923E38)
            int r0 = r10.getColor(r0)
            r12.A0a = r0
            r0 = 2131100617(0x7f0603c9, float:1.781362E38)
            int r0 = r10.getColor(r0)
            r12.A0g = r0
            if (r1 == 0) goto L_0x023f
            r12.setBoxStrokeColorStateList(r1)
        L_0x023f:
            r1 = 13
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x024e
            android.content.res.ColorStateList r0 = X.C309286Xr.A02(r10, r5, r1)
            r12.setBoxStrokeErrorColor(r0)
        L_0x024e:
            r0 = r19
            int r0 = r4.getResourceId(r0, r13)
            if (r0 == r13) goto L_0x025f
            r0 = r19
            int r0 = r4.getResourceId(r0, r11)
            r12.setHintTextAppearance(r0)
        L_0x025f:
            r0 = r21
            int r30 = r4.getResourceId(r0, r11)
            r0 = 28
            java.lang.CharSequence r29 = r4.getText(r0)
            r0 = 29
            boolean r28 = r4.getBoolean(r0, r11)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r10)
            r0 = 2131624808(0x7f0e0368, float:1.8876806E38)
            r27 = 2131624808(0x7f0e0368, float:1.8876806E38)
            android.view.View r2 = r1.inflate(r0, r7, r11)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r12.A1E = r2
            r0 = 2131442609(0x7f0b3bb1, float:1.8507263E38)
            r2.setId(r0)
            r14 = 8
            r2.setVisibility(r14)
            boolean r0 = X.C309286Xr.A04(r10)
            if (r0 == 0) goto L_0x029b
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r2)
            r0.setMarginStart(r11)
        L_0x029b:
            r1 = 30
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r5.A02(r1)
            r12.setErrorIconDrawable((android.graphics.drawable.Drawable) r0)
        L_0x02aa:
            r1 = 31
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x02b9
            android.content.res.ColorStateList r0 = X.C309286Xr.A02(r10, r5, r1)
            r12.setErrorIconTintList(r0)
        L_0x02b9:
            r15 = 32
            boolean r0 = r4.hasValue(r15)
            r1 = 0
            if (r0 == 0) goto L_0x02cd
            int r0 = r4.getInt(r15, r13)
            android.graphics.PorterDuff$Mode r0 = X.C295305nv.A01(r1, r0)
            r12.setErrorIconTintMode(r0)
        L_0x02cd:
            android.content.res.Resources r15 = r12.getResources()
            r0 = 2131961748(0x7f132794, float:1.9560202E38)
            java.lang.CharSequence r0 = r15.getText(r0)
            r2.setContentDescription(r0)
            r2.setImportantForAccessibility(r3)
            r2.setClickable(r11)
            r2.A01 = r11
            r2.setFocusable(r11)
            r0 = r20
            int r26 = r4.getResourceId(r0, r11)
            r0 = 37
            boolean r25 = r4.getBoolean(r0, r11)
            r0 = 36
            java.lang.CharSequence r24 = r4.getText(r0)
            r0 = 50
            int r23 = r4.getResourceId(r0, r11)
            r0 = 49
            java.lang.CharSequence r22 = r4.getText(r0)
            r0 = 53
            int r21 = r4.getResourceId(r0, r11)
            r0 = 52
            java.lang.CharSequence r20 = r4.getText(r0)
            r0 = 63
            int r19 = r4.getResourceId(r0, r11)
            r0 = 62
            java.lang.CharSequence r18 = r4.getText(r0)
            r0 = 16
            boolean r17 = r4.getBoolean(r0, r11)
            r0 = 17
            int r0 = r4.getInt(r0, r13)
            r12.setCounterMaxLength(r0)
            r0 = r33
            int r0 = r4.getResourceId(r0, r11)
            r12.A0X = r0
            r0 = r32
            int r0 = r4.getResourceId(r0, r11)
            r12.A0W = r0
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r10)
            r0 = 2131624809(0x7f0e0369, float:1.8876808E38)
            android.view.View r16 = r15.inflate(r0, r8, r11)
            r0 = r16
            com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) r0
            r16 = r0
            r12.A1F = r0
            r0.setVisibility(r14)
            boolean r0 = X.C309286Xr.A04(r10)
            if (r0 == 0) goto L_0x035e
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r16)
            r0.setMarginEnd(r11)
        L_0x035e:
            r12.setStartIconOnClickListener(r1)
            r12.setStartIconOnLongClickListener(r1)
            r15 = 59
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L_0x038b
            android.graphics.drawable.Drawable r0 = r5.A02(r15)
            r12.setStartIconDrawable((android.graphics.drawable.Drawable) r0)
            r15 = 58
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L_0x0382
            java.lang.CharSequence r0 = r4.getText(r15)
            r12.setStartIconContentDescription((java.lang.CharSequence) r0)
        L_0x0382:
            r0 = 57
            boolean r0 = r4.getBoolean(r0, r9)
            r12.setStartIconCheckable(r0)
        L_0x038b:
            r15 = 60
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L_0x039a
            android.content.res.ColorStateList r0 = X.C309286Xr.A02(r10, r5, r15)
            r12.setStartIconTintList(r0)
        L_0x039a:
            r15 = 61
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L_0x03ad
            int r0 = r4.getInt(r15, r13)
            android.graphics.PorterDuff$Mode r0 = X.C295305nv.A01(r1, r0)
            r12.setStartIconTintMode(r0)
        L_0x03ad:
            r0 = 6
            int r0 = r4.getInt(r0, r11)
            r12.setBoxBackgroundMode(r0)
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r10)
            r0 = r27
            android.view.View r15 = r15.inflate(r0, r6, r11)
            com.google.android.material.internal.CheckableImageButton r15 = (com.google.android.material.internal.CheckableImageButton) r15
            r12.A1D = r15
            r6.addView(r15)
            r15.setVisibility(r14)
            boolean r0 = X.C309286Xr.A04(r10)
            if (r0 == 0) goto L_0x03d6
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r15)
            r0.setMarginStart(r11)
        L_0x03d6:
            X.UWX r14 = new X.UWX
            r14.<init>(r12)
            r0 = r35
            r0.append(r13, r14)
            X.UWY r14 = new X.UWY
            r14.<init>(r12)
            r0.append(r11, r14)
            X.UWZ r14 = new X.UWZ
            r14.<init>(r12)
            r0.append(r9, r14)
            X.UWa r14 = new X.UWa
            r14.<init>(r12)
            r0.append(r3, r14)
            X.UWb r0 = new X.UWb
            r0.<init>(r12)
            r15 = r35
            r14 = r31
            r15.append(r14, r0)
            r14 = 25
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x057a
            int r0 = r4.getInt(r14, r11)
            r12.setEndIconMode(r0)
            r14 = 24
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x0422
            android.graphics.drawable.Drawable r0 = r5.A02(r14)
            r12.setEndIconDrawable((android.graphics.drawable.Drawable) r0)
        L_0x0422:
            r14 = 23
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x0431
            java.lang.CharSequence r0 = r4.getText(r14)
            r12.setEndIconContentDescription((java.lang.CharSequence) r0)
        L_0x0431:
            r0 = 22
            boolean r0 = r4.getBoolean(r0, r9)
            r12.setEndIconCheckable(r0)
        L_0x043a:
            r0 = 46
            boolean r0 = r4.hasValue(r0)
            if (r0 != 0) goto L_0x0464
            r14 = 26
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x0451
            android.content.res.ColorStateList r0 = X.C309286Xr.A02(r10, r5, r14)
            r12.setEndIconTintList(r0)
        L_0x0451:
            r14 = 27
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x0464
            int r0 = r4.getInt(r14, r13)
            android.graphics.PorterDuff$Mode r0 = X.C295305nv.A01(r1, r0)
            r12.setEndIconTintMode(r0)
        L_0x0464:
            X.3Tj r13 = new X.3Tj
            r13.<init>(r10, r1)
            r12.A1C = r13
            r0 = 2131442666(0x7f0b3bea, float:1.8507378E38)
            r13.setId(r0)
            r0 = r34
            X.C66581MXm.A1A(r13, r0)
            r13.setAccessibilityLiveRegion(r9)
            r0 = r16
            r8.addView(r0)
            r8.addView(r13)
            X.3Tj r13 = new X.3Tj
            r13.<init>(r10, r1)
            r12.A1O = r13
            r0 = 2131442667(0x7f0b3beb, float:1.850738E38)
            r13.setId(r0)
            r10 = 80
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r1 = r34
            r8.<init>(r1, r1, r10)
            r13.setLayoutParams(r8)
            r13.setAccessibilityLiveRegion(r9)
            r7.addView(r13)
            r7.addView(r2)
            r7.addView(r6)
            r0 = r25
            r12.setHelperTextEnabled(r0)
            r0 = r24
            r12.setHelperText(r0)
            r0 = r26
            r12.setHelperTextTextAppearance(r0)
            r0 = r28
            r12.setErrorEnabled(r0)
            r0 = r30
            r12.setErrorTextAppearance(r0)
            r0 = r29
            r12.setErrorContentDescription(r0)
            int r0 = r12.A0X
            r12.setCounterTextAppearance(r0)
            int r0 = r12.A0W
            r12.setCounterOverflowTextAppearance(r0)
            r0 = r22
            r12.setPlaceholderText(r0)
            r0 = r23
            r12.setPlaceholderTextAppearance(r0)
            r0 = r20
            r12.setPrefixText(r0)
            r0 = r21
            r12.setPrefixTextAppearance(r0)
            r0 = r18
            r12.setSuffixText(r0)
            r0 = r19
            r12.setSuffixTextAppearance(r0)
            r1 = 34
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x04fb
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setErrorTextColor(r0)
        L_0x04fb:
            r1 = 39
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x050a
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setHelperTextColor(r0)
        L_0x050a:
            r1 = 43
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0519
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setHintTextColor(r0)
        L_0x0519:
            r1 = 21
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0528
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setCounterTextColor(r0)
        L_0x0528:
            r1 = 19
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0537
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setCounterOverflowTextColor(r0)
        L_0x0537:
            r1 = 51
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0546
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setPlaceholderTextColor(r0)
        L_0x0546:
            r1 = 54
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0555
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setPrefixTextColor(r0)
        L_0x0555:
            r1 = 64
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x0564
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r12.setSuffixTextColor(r0)
        L_0x0564:
            r0 = r17
            r12.setCounterEnabled(r0)
            boolean r0 = r4.getBoolean(r11, r9)
            r12.setEnabled(r0)
            r4.recycle()
            r12.setImportantForAccessibility(r3)
            r12.setImportantForAutofill(r9)
            return
        L_0x057a:
            r14 = 46
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x043a
            boolean r0 = r4.getBoolean(r14, r11)
            r12.setEndIconMode(r0)
            r0 = 45
            android.graphics.drawable.Drawable r0 = r5.A02(r0)
            r12.setEndIconDrawable((android.graphics.drawable.Drawable) r0)
            r0 = 44
            java.lang.CharSequence r0 = r4.getText(r0)
            r12.setEndIconContentDescription((java.lang.CharSequence) r0)
            r14 = 47
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x05aa
            android.content.res.ColorStateList r0 = X.C309286Xr.A02(r10, r5, r14)
            r12.setEndIconTintList(r0)
        L_0x05aa:
            r14 = 48
            boolean r0 = r4.hasValue(r14)
            if (r0 == 0) goto L_0x043a
            int r0 = r4.getInt(r14, r13)
            android.graphics.PorterDuff$Mode r0 = X.C295305nv.A01(r1, r0)
            r12.setEndIconTintMode(r0)
            goto L_0x043a
        L_0x05bf:
            int r0 = r12.A0Y
            r12.A0d = r0
            r0 = 2131100599(0x7f0603b7, float:1.7813584E38)
            android.content.res.ColorStateList r1 = X.02K.A02(r10, r0)
            int[] r0 = new int[]{r2}
            int r0 = r1.getColorForState(r0, r13)
            r12.A0b = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            int[] r0 = new int[]{r0}
            goto L_0x01ff
        L_0x05dd:
            r12.A00 = r11
            r12.A0Y = r11
            r12.A0b = r11
            r12.A0d = r11
            r12.A0f = r11
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C() {
        /*
            r8 = this;
            boolean r0 = r8.A0M()
            if (r0 == 0) goto L_0x00b6
            android.graphics.RectF r3 = r8.A1L
            X.TqO r2 = r8.A1G
            android.widget.EditText r0 = r8.A0F
            int r7 = r0.getWidth()
            android.widget.EditText r0 = r8.A0F
            int r4 = r0.getGravity()
            java.lang.CharSequence r6 = r2.A0f
            android.view.View r0 = r2.A0v
            int r0 = r0.getLayoutDirection()
            boolean r5 = X.C66581MXm.A1V(r0)
            boolean r0 = r2.A0k
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x00de
            X.3cZ r5 = X.C245223cW.A02
        L_0x002a:
            r1 = 0
            int r0 = r6.length()
            boolean r5 = r5.Cb2(r6, r1, r0)
        L_0x0033:
            r2.A0j = r5
            r0 = 17
            if (r4 == r0) goto L_0x00d3
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00d3
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00cb
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00cb
            if (r5 == 0) goto L_0x00cd
        L_0x004c:
            android.graphics.Rect r0 = r2.A0q
            int r0 = r0.right
            float r6 = (float) r0
            float r0 = r2.A04()
        L_0x0055:
            float r6 = r6 - r0
        L_0x0056:
            r3.left = r6
            android.graphics.Rect r5 = r2.A0q
            int r0 = r5.top
            float r0 = (float) r0
            r3.top = r0
            r0 = 17
            if (r4 == r0) goto L_0x00b7
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00b7
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00c1
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00c1
            boolean r0 = r2.A0j
            if (r0 == 0) goto L_0x00c5
        L_0x0078:
            int r0 = r5.right
            float r6 = (float) r0
        L_0x007b:
            r3.right = r6
            int r0 = r5.top
            float r1 = (float) r0
            float r0 = r2.A05()
            float r1 = r1 + r0
            r3.bottom = r1
            float r2 = r3.left
            int r0 = r8.A17
            float r1 = (float) r0
            float r2 = r2 - r1
            r3.left = r2
            float r0 = r3.right
            float r0 = r0 + r1
            r3.right = r0
            int r0 = r8.A06
            r8.A03 = r0
            r1 = 0
            r3.top = r1
            float r0 = (float) r0
            r3.bottom = r0
            int r0 = r8.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            r3.offset(r0, r1)
            X.5sV r5 = r8.A0I
            X.UWT r5 = (X.UWT) r5
            float r4 = r3.left
            float r2 = r3.top
            float r1 = r3.right
            float r0 = r3.bottom
            r5.A0J(r4, r2, r1, r0)
        L_0x00b6:
            return
        L_0x00b7:
            float r6 = (float) r7
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            float r0 = r2.A04()
            float r0 = r0 / r1
            goto L_0x00c9
        L_0x00c1:
            boolean r0 = r2.A0j
            if (r0 == 0) goto L_0x0078
        L_0x00c5:
            float r0 = r2.A04()
        L_0x00c9:
            float r6 = r6 + r0
            goto L_0x007b
        L_0x00cb:
            if (r5 == 0) goto L_0x004c
        L_0x00cd:
            android.graphics.Rect r0 = r2.A0q
            int r0 = r0.left
            float r6 = (float) r0
            goto L_0x0056
        L_0x00d3:
            float r6 = (float) r7
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            float r0 = r2.A04()
            float r0 = r0 / r1
            goto L_0x0055
        L_0x00de:
            X.3cZ r5 = X.C245223cW.A01
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0C():void");
    }

    public static void A0I(ColorStateList colorStateList, CheckableImageButton checkableImageButton, TextInputLayout textInputLayout) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int length2 = drawableState2.length;
            int[] copyOf = Arrays.copyOf(drawableState, length + length2);
            System.arraycopy(drawableState2, 0, copyOf, length, length2);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void A0J(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A0J((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r10.A0R != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.hasFocus() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0L(com.google.android.material.textfield.TextInputLayout r10, boolean r11, boolean r12) {
        /*
            boolean r9 = r10.isEnabled()
            android.widget.EditText r0 = r10.A0F
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r8 = 0
        L_0x0016:
            android.widget.EditText r0 = r10.A0F
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.hasFocus()
            r7 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            X.W1o r6 = r10.A1H
            boolean r5 = r6.A07()
            android.content.res.ColorStateList r0 = r10.A0n
            if (r0 == 0) goto L_0x003c
            X.TqO r4 = r10.A1G
            r4.A0D(r0)
            android.content.res.ColorStateList r1 = r10.A0n
            android.content.res.ColorStateList r0 = r4.A0Z
            if (r0 == r1) goto L_0x003c
            r4.A0Z = r1
            r4.A0G(r3)
        L_0x003c:
            if (r9 != 0) goto L_0x0127
            android.content.res.ColorStateList r4 = r10.A0n
            if (r4 == 0) goto L_0x0123
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r1 = new int[]{r0}
            int r0 = r10.A0a
            int r1 = r4.getColorForState(r1, r0)
        L_0x004f:
            X.TqO r4 = r10.A1G
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r4.A0D(r0)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            android.content.res.ColorStateList r0 = r4.A0Z
            if (r0 == r1) goto L_0x0065
            r4.A0Z = r1
            r4.A0G(r3)
        L_0x0065:
            if (r8 != 0) goto L_0x0073
            boolean r0 = r10.A11
            if (r0 == 0) goto L_0x0073
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00c8
            if (r7 == 0) goto L_0x00c8
        L_0x0073:
            if (r12 != 0) goto L_0x0079
            boolean r0 = r10.A0R
            if (r0 == 0) goto L_0x00bc
        L_0x0079:
            android.animation.ValueAnimator r0 = r10.A09
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0088
            android.animation.ValueAnimator r0 = r10.A09
            r0.cancel()
        L_0x0088:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x00c2
            boolean r0 = r10.A0P
            if (r0 == 0) goto L_0x00c2
            r10.A0Q(r1)
        L_0x0093:
            r10.A0R = r3
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x009e
            r10.A0C()
        L_0x009e:
            android.widget.EditText r0 = r10.A0F
            if (r0 != 0) goto L_0x00bd
            r0 = 0
        L_0x00a3:
            A0K(r10, r0)
        L_0x00a6:
            android.widget.TextView r2 = r10.A1C
            java.lang.CharSequence r0 = r10.A0M
            if (r0 == 0) goto L_0x00b1
            boolean r1 = r10.A0R
            r0 = 0
            if (r1 == 0) goto L_0x00b3
        L_0x00b1:
            r0 = 8
        L_0x00b3:
            r2.setVisibility(r0)
            r10.A0N()
            r10.A0H()
        L_0x00bc:
            return
        L_0x00bd:
            int r0 = X.C13988Tno.A0C(r0)
            goto L_0x00a3
        L_0x00c2:
            X.TqO r0 = r10.A1G
            r0.A07(r1)
            goto L_0x0093
        L_0x00c8:
            if (r12 != 0) goto L_0x00ce
            boolean r0 = r10.A0R
            if (r0 != 0) goto L_0x00bc
        L_0x00ce:
            android.animation.ValueAnimator r0 = r10.A09
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00dd
            android.animation.ValueAnimator r0 = r10.A09
            r0.cancel()
        L_0x00dd:
            r1 = 0
            if (r11 == 0) goto L_0x011d
            boolean r0 = r10.A0P
            if (r0 == 0) goto L_0x011d
            r10.A0Q(r1)
        L_0x00e7:
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x0108
            X.5sV r0 = r10.A0I
            X.UWT r0 = (X.UWT) r0
            android.graphics.RectF r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0108
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x0108
            X.5sV r0 = r10.A0I
            X.UWT r0 = (X.UWT) r0
            r0.A0J(r1, r1, r1, r1)
        L_0x0108:
            r10.A0R = r2
            android.widget.TextView r1 = r10.A0H
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x00a6
            r0 = 0
            r1.setText(r0)
            android.widget.TextView r1 = r10.A0H
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x00a6
        L_0x011d:
            X.TqO r0 = r10.A1G
            r0.A07(r1)
            goto L_0x00e7
        L_0x0123:
            int r1 = r10.A0a
            goto L_0x004f
        L_0x0127:
            if (r5 == 0) goto L_0x0135
            X.TqO r1 = r10.A1G
            android.widget.TextView r0 = r6.A09
            if (r0 != 0) goto L_0x013f
            r0 = 0
        L_0x0130:
            r1.A0D(r0)
            goto L_0x0065
        L_0x0135:
            boolean r0 = r10.A10
            if (r0 == 0) goto L_0x0144
            android.widget.TextView r0 = r10.A0G
            if (r0 == 0) goto L_0x0144
            X.TqO r1 = r10.A1G
        L_0x013f:
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x0130
        L_0x0144:
            if (r7 == 0) goto L_0x0065
            android.content.res.ColorStateList r0 = r10.A0C
            if (r0 == 0) goto L_0x0065
            X.TqO r1 = r10.A1G
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0L(com.google.android.material.textfield.TextInputLayout, boolean, boolean):void");
    }

    public static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean A1V = AnonymousClass7TF.A1V(onLongClickListener);
        if (hasOnClickListeners || A1V) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.A01 = hasOnClickListeners;
        checkableImageButton.setLongClickable(A1V);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public final void A0S(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132018228);
        DbT.A17(getContext(), textView, R.color.design_error);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(346138808);
        super.draw(canvas);
        if (this.A0Q) {
            this.A1G.A0E(canvas);
        }
        C297875sV r0 = this.A0J;
        if (r0 != null) {
            Rect bounds = r0.getBounds();
            bounds.top = bounds.bottom - this.A06;
            this.A0J.draw(canvas);
        }
        AnonymousClass0fD.A0A(1235617595, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            super.onLayout(r9, r10, r11, r12, r13)
            android.widget.EditText r0 = r8.A0F
            if (r0 == 0) goto L_0x0126
            android.graphics.Rect r5 = r8.A1K
            X.C18717Vyn.A01(r5, r0, r8)
            X.5sV r4 = r8.A0J
            if (r4 == 0) goto L_0x001d
            int r3 = r5.bottom
            int r0 = r8.A05
            int r2 = r3 - r0
            int r1 = r5.left
            int r0 = r5.right
            r4.setBounds(r1, r2, r0, r3)
        L_0x001d:
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x0126
            X.TqO r4 = r8.A1G
            android.widget.EditText r0 = r8.A0F
            float r1 = r0.getTextSize()
            float r0 = r4.A0K
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            r4.A0K = r1
            r0 = 0
            r4.A0G(r0)
        L_0x0035:
            android.widget.EditText r0 = r8.A0F
            int r1 = r0.getGravity()
            r0 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r0 = r0 | 48
            r4.A09(r0)
            int r0 = r4.A0R
            if (r0 == r1) goto L_0x004c
            r4.A0R = r1
            r0 = 0
            r4.A0G(r0)
        L_0x004c:
            android.widget.EditText r0 = r8.A0F
            if (r0 == 0) goto L_0x0182
            android.graphics.Rect r3 = r8.A18
            int r0 = r8.getLayoutDirection()
            r2 = 1
            boolean r7 = X.AnonymousClass7TF.A1S(r0, r2)
            int r0 = r5.bottom
            r3.bottom = r0
            int r1 = r8.A01
            if (r1 == r2) goto L_0x0158
            r0 = 2
            int r2 = r5.left
            if (r1 == r0) goto L_0x013b
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r8.A0M
            if (r0 == 0) goto L_0x0081
            if (r7 != 0) goto L_0x0081
            android.widget.TextView r1 = r8.A1C
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x0081:
            r3.left = r2
            int r1 = r8.getPaddingTop()
        L_0x0087:
            r3.top = r1
            int r6 = r5.right
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingRight()
            int r6 = r6 - r0
            java.lang.CharSequence r0 = r8.A0M
            if (r0 == 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00a4
            android.widget.TextView r0 = r8.A1C
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            int r6 = r6 + r1
        L_0x00a4:
            r3.right = r6
            int r2 = r3.left
            int r1 = r3.top
            int r0 = r3.bottom
            r4.A0B(r2, r1, r6, r0)
            android.widget.EditText r0 = r8.A0F
            if (r0 == 0) goto L_0x017c
            android.text.TextPaint r1 = r4.A0u
            float r0 = r4.A0K
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r4.A0b
            r1.setTypeface(r0)
            float r0 = r4.A0F
            r1.setLetterSpacing(r0)
            float r0 = r1.ascent()
            float r2 = -r0
            int r1 = r5.left
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r0 = r8.A01
            r6 = 1
            if (r0 != r6) goto L_0x0131
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getMinLines()
            if (r0 > r6) goto L_0x0131
            int r0 = r5.centerY()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r1 = (int) r1
        L_0x00ec:
            r3.top = r1
            int r1 = r5.right
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingRight()
            int r1 = r1 - r0
            r3.right = r1
            int r0 = r8.A01
            if (r0 != r6) goto L_0x0127
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getMinLines()
            if (r0 > r6) goto L_0x0127
            int r0 = r3.top
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
        L_0x010a:
            r3.bottom = r1
            int r5 = r3.left
            int r2 = r3.top
            int r0 = r3.right
            r4.A0C(r5, r2, r0, r1)
            r0 = 0
            r4.A0G(r0)
            boolean r0 = r8.A0M()
            if (r0 == 0) goto L_0x0126
            boolean r0 = r8.A0R
            if (r0 != 0) goto L_0x0126
            r8.A0C()
        L_0x0126:
            return
        L_0x0127:
            int r1 = r5.bottom
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingBottom()
            int r1 = r1 - r0
            goto L_0x010a
        L_0x0131:
            int r1 = r5.top
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingTop()
            int r1 = r1 + r0
            goto L_0x00ec
        L_0x013b:
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getPaddingLeft()
            int r2 = r2 + r0
            r3.left = r2
            int r1 = r5.top
            int r0 = r8.A07()
            int r1 = r1 - r0
            r3.top = r1
            int r6 = r5.right
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getPaddingRight()
            int r6 = r6 - r0
            goto L_0x00a4
        L_0x0158:
            int r2 = r5.left
            android.widget.EditText r0 = r8.A0F
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r8.A0M
            if (r0 == 0) goto L_0x0173
            if (r7 != 0) goto L_0x0173
            android.widget.TextView r1 = r8.A1C
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x0173:
            r3.left = r2
            int r1 = r5.top
            int r0 = r8.A02
            int r1 = r1 + r0
            goto L_0x0087
        L_0x017c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.A0F != null && this.A0F.getMeasuredHeight() < (max = Math.max(this.A1A.getMeasuredHeight(), this.A1B.getMeasuredHeight()))) {
            this.A0F.setMinimumHeight(max);
            z = true;
        }
        boolean A0N2 = A0N();
        if (z || A0N2) {
            this.A0F.post(new C19972Wij(this));
        }
        if (!(this.A0H == null || (editText = this.A0F) == null)) {
            this.A0H.setGravity(editText.getGravity());
            this.A0H.setPadding(this.A0F.getCompoundPaddingLeft(), this.A0F.getCompoundPaddingTop(), this.A0F.getCompoundPaddingRight(), this.A0F.getCompoundPaddingBottom());
        }
        A0F();
        A0G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r3.A1D.isChecked() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.textfield.TextInputLayout$SavedState r2 = new com.google.android.material.textfield.TextInputLayout$SavedState
            r2.<init>(r0)
            X.W1o r0 = r3.A1H
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r3.getError()
            r2.A00 = r0
        L_0x0017:
            int r0 = r3.A08
            if (r0 == 0) goto L_0x0024
            com.google.android.material.internal.CheckableImageButton r0 = r3.A1D
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r2.A04 = r0
            java.lang.CharSequence r0 = r3.getHint()
            r2.A02 = r0
            java.lang.CharSequence r0 = r3.getHelperText()
            r2.A01 = r0
            java.lang.CharSequence r0 = r3.getPlaceholderText()
            r2.A03 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0Y = defaultColor;
        this.A00 = defaultColor;
        this.A0b = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0d = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0f = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        A08();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.A0Z = colorStateList.getDefaultColor();
            this.A0a = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A0g = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.A0e != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0P();
        }
        this.A0e = defaultColor;
        A0P();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(JTT.A05(this, i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(JTT.A05(this, i));
    }

    public void setEnabled(boolean z) {
        A0J(this, z);
        super.setEnabled(z);
    }

    public void setEndIconVisible(boolean z) {
        if (A0T() != z) {
            this.A1D.setVisibility(DbW.A01(z ? 1 : 0));
            A0G();
            A0N();
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C18786W1o w1o = this.A1H;
            if (!w1o.A0F) {
                setHelperTextEnabled(true);
            }
            Animator animator = w1o.A04;
            if (animator != null) {
                animator.cancel();
            }
            w1o.A0D = charSequence;
            w1o.A0A.setText(charSequence);
            int i = w1o.A00;
            if (i != 2) {
                w1o.A01 = 2;
            }
            C18786W1o.A01(w1o, i, w1o.A01, C18786W1o.A02(w1o.A0A, w1o, charSequence));
        } else if (this.A1H.A0F) {
            setHelperTextEnabled(false);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(DbU.A05(this).getDimensionPixelSize(i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(DbU.A05(this).getDimensionPixelSize(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r3.A0R != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrefixText(java.lang.CharSequence r4) {
        /*
            r3 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r0 = r4
            if (r1 == 0) goto L_0x0008
            r0 = 0
        L_0x0008:
            r3.A0M = r0
            android.widget.TextView r2 = r3.A1C
            r2.setText(r4)
            java.lang.CharSequence r0 = r3.A0M
            if (r0 == 0) goto L_0x0018
            boolean r1 = r3.A0R
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r0 = 8
        L_0x001a:
            r2.setVisibility(r0)
            r3.A0N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setPrefixText(java.lang.CharSequence):void");
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        this.A0N = charSequence2;
        this.A1O.setText(charSequence);
        A0H();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A1D;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A1D;
        checkableImageButton.setImageDrawable(drawable);
        A0I(this.A0A, checkableImageButton, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2.A1H.A0E == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setErrorIconDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.A1E
            r0.setImageDrawable(r3)
            if (r3 == 0) goto L_0x000e
            X.W1o r0 = r2.A1H
            boolean r1 = r0.A0E
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2.setErrorIconVisible(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setErrorIconDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0Q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(C249703kE.FLAG_MOVED);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A1D.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A1D.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A1F;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C13990Tnq.A0E(this, i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}

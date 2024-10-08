package com.google.android.material.appbar;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C13988Tno;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import X.C297875sV;
import X.C323946yM;
import X.Pxf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;

public class MaterialToolbar extends Toolbar {
    public Integer A00;
    public boolean A01;
    public boolean A02;

    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.A00) == null)) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setSubtitleCentered(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018575), attributeSet, i);
        int i2;
        Context context2 = getContext();
        TypedArray A002 = C297855sT.A00(context2, attributeSet, C297865sU.A0T, new int[0], i, 2132018575);
        if (A002.hasValue(0)) {
            setNavigationIconTint(A002.getColor(0, -1));
        }
        this.A02 = A002.getBoolean(2, false);
        this.A01 = A002.getBoolean(1, false);
        A002.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C297875sV r1 = new C297875sV();
            if (background != null) {
                i2 = ((ColorDrawable) background).getColor();
            } else {
                i2 = 0;
            }
            r1.A0F(ColorStateList.valueOf(i2));
            r1.A0E(context2);
            r1.A0A(getElevation());
            setBackground(r1);
        }
    }

    private void A00(Pair pair, View view) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(AnonymousClass7TE.A0M(pair.first) - i, 0), Math.max(i2 - AnonymousClass7TE.A0M(pair.second), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(C13988Tno.A04(i2 - i), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-866186139);
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            C323946yM.A00(this, (C297875sV) background);
        }
        AnonymousClass0fD.A0D(-1079993379, A06);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A02 || this.A01) {
            CharSequence charSequence = this.A0J;
            int i5 = 0;
            while (true) {
                if (i5 >= getChildCount()) {
                    textView = null;
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), charSequence)) {
                        break;
                    }
                }
                i5++;
            }
            CharSequence charSequence2 = this.A0I;
            int i6 = 0;
            while (true) {
                if (i6 >= getChildCount()) {
                    textView2 = null;
                    break;
                }
                View childAt2 = getChildAt(i6);
                if (childAt2 instanceof TextView) {
                    textView2 = (TextView) childAt2;
                    if (TextUtils.equals(textView2.getText(), charSequence2)) {
                        break;
                    }
                }
                i6++;
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt3 = getChildAt(i8);
                    if (!(childAt3.getVisibility() == 8 || childAt3 == textView || childAt3 == textView2)) {
                        if (childAt3.getRight() < i7 && childAt3.getRight() > paddingLeft) {
                            paddingLeft = childAt3.getRight();
                        }
                        if (childAt3.getLeft() > i7 && childAt3.getLeft() < paddingRight) {
                            paddingRight = childAt3.getLeft();
                        }
                    }
                }
                Pair A0K = Pxf.A0K(Integer.valueOf(paddingLeft), paddingRight);
                if (this.A02 && textView != null) {
                    A00(A0K, textView);
                }
                if (this.A01 && textView2 != null) {
                    A00(A0K, textView2);
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C297875sV) {
            ((C297875sV) background).A0A(f);
        }
    }

    public void setNavigationIconTint(int i) {
        this.A00 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }
}

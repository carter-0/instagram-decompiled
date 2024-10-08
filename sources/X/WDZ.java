package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;

public final class WDZ implements C20939X5h {
    public int A00 = 0;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public WDU A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;

    public static void A00(WDZ wdz) {
        Drawable drawable;
        int i = wdz.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = wdz.A04) == null) {
            drawable = wdz.A03;
        }
        wdz.A09.setLogo(drawable);
    }

    public final void EUP(int i) {
        View view;
        CharSequence charSequence;
        Drawable drawable;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    CharSequence charSequence2 = this.A0A;
                    boolean isEmpty = TextUtils.isEmpty(charSequence2);
                    Toolbar toolbar = this.A09;
                    if (isEmpty) {
                        toolbar.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar.setNavigationContentDescription(charSequence2);
                    }
                }
                int i3 = this.A01 & 4;
                Toolbar toolbar2 = this.A09;
                if (i3 != 0) {
                    drawable = this.A05;
                    if (drawable == null) {
                        drawable = this.A02;
                    }
                } else {
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                A00(this);
            }
            if ((i2 & 8) != 0) {
                int i4 = i & 8;
                Toolbar toolbar3 = this.A09;
                if (i4 != 0) {
                    toolbar3.setTitle(this.A0C);
                    charSequence = this.A0B;
                } else {
                    charSequence = null;
                    toolbar3.setTitle((CharSequence) null);
                }
                toolbar3.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.A06) != null) {
                int i5 = i & 16;
                Toolbar toolbar4 = this.A09;
                if (i5 != 0) {
                    toolbar4.addView(view);
                } else {
                    toolbar4.removeView(view);
                }
            }
        }
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.A0E) {
            this.A0C = charSequence;
            if ((this.A01 & 8) != 0) {
                this.A09.setTitle(charSequence);
            }
        }
    }

    public WDZ(Toolbar toolbar, boolean z) {
        String string;
        Drawable drawable;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0J;
        this.A0C = charSequence;
        this.A0B = toolbar.A0I;
        this.A0E = AnonymousClass7TF.A1V(charSequence);
        this.A05 = toolbar.getNavigationIcon();
        2Yi A002 = 2Yi.A00(toolbar.getContext(), (AttributeSet) null, AnonymousClass2Z3.A00, R.attr.actionBarStyle, 0);
        this.A02 = A002.A02(15);
        if (z) {
            TypedArray typedArray = A002.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.A0E = true;
                this.A0C = text;
                if ((this.A01 & 8) != 0) {
                    Toolbar toolbar2 = this.A09;
                    toolbar2.setTitle(text);
                    if (this.A0E) {
                        03v.A0F(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.A0B = text2;
                if ((this.A01 & 8) != 0) {
                    this.A09.setSubtitle(text2);
                }
            }
            Drawable A022 = A002.A02(20);
            if (A022 != null) {
                this.A04 = A022;
                A00(this);
            }
            Drawable A023 = A002.A02(17);
            if (A023 != null) {
                this.A03 = A023;
                A00(this);
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                this.A05 = drawable;
                this.A09.setNavigationIcon((this.A01 & 4) != 0 ? drawable : null);
            }
            EUP(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = DbV.A0D(this.A09).inflate(resourceId, this.A09, false);
                View view = this.A06;
                if (!(view == null || (this.A01 & 16) == 0)) {
                    this.A09.removeView(view);
                }
                this.A06 = inflate;
                if (!(inflate == null || (this.A01 & 16) == 0)) {
                    this.A09.addView(inflate);
                }
                EUP(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                Toolbar toolbar3 = this.A09;
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                C17914Vi5 vi5 = toolbar3.A0F;
                if (vi5 == null) {
                    vi5 = new C17914Vi5();
                    toolbar3.A0F = vi5;
                }
                vi5.A00(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar4 = this.A09;
                Context context = toolbar4.getContext();
                toolbar4.A07 = resourceId2;
                TextView textView = toolbar4.A0C;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar5 = this.A09;
                Context context2 = toolbar5.getContext();
                toolbar5.A02 = resourceId3;
                TextView textView2 = toolbar5.A0B;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            Toolbar toolbar6 = this.A09;
            int i = 11;
            if (toolbar6.getNavigationIcon() != null) {
                i = 15;
                this.A02 = toolbar6.getNavigationIcon();
            }
            this.A01 = i;
        }
        A002.A02.recycle();
        if (2131951961 != this.A00) {
            this.A00 = 2131951961;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                int i2 = this.A00;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = this.A09.getContext().getString(i2);
                }
                this.A0A = string;
                if ((this.A01 & 4) != 0) {
                    boolean isEmpty = TextUtils.isEmpty(string);
                    Toolbar toolbar7 = this.A09;
                    if (isEmpty) {
                        toolbar7.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar7.setNavigationContentDescription(this.A0A);
                    }
                }
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new WBH(this));
    }
}

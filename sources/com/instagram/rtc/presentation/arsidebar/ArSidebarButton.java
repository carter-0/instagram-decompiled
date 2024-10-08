package com.instagram.rtc.presentation.arsidebar;

import X.0qQ;
import X.AnonymousClass00P;
import X.C70904OQw;
import X.C71382cm;
import X.C71622eP;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ArSidebarButton extends IgLinearLayout {
    public Drawable A00;
    public Drawable A01;
    public IgTextView A02;
    public IgImageView A03;
    public boolean A04;
    public IgTextView A05;
    public Integer A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(boolean z) {
        Drawable drawable;
        int i;
        if (z) {
            drawable = this.A00;
            i = 255;
        } else {
            drawable = this.A01;
            i = 0;
        }
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            IgImageView igImageView = this.A03;
            if (z) {
                if (igImageView != null) {
                    igImageView.clearColorFilter();
                }
                0qQ.A0F("iconView");
                throw AnonymousClass00P.createAndThrow();
            }
            if (igImageView != null) {
                igImageView.setColorFilter(intValue);
            }
            0qQ.A0F("iconView");
            throw AnonymousClass00P.createAndThrow();
        }
        IgImageView igImageView2 = this.A03;
        if (igImageView2 != null) {
            igImageView2.setImageDrawable(drawable);
            igImageView2.getBackground().setAlpha(i);
            return;
        }
        0qQ.A0F("iconView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            if (igTextView != null) {
                C70904OQw.A00(igTextView, true);
                if (this.A04) {
                    IgTextView igTextView2 = this.A05;
                    if (igTextView2 != null) {
                        C70904OQw.A00(igTextView2, true);
                        return;
                    }
                    0qQ.A0F("newTagView");
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
        } else if (igTextView != null) {
            C70904OQw.A01(igTextView, true);
            IgTextView igTextView3 = this.A05;
            if (igTextView3 != null) {
                C70904OQw.A01(igTextView3, true);
                return;
            }
            0qQ.A0F("newTagView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("labelView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean getCanShowNewTag() {
        return this.A04;
    }

    public final void setCanShowNewTag(boolean z) {
        this.A04 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A29, i, 0);
        0qQ.A07(obtainStyledAttributes);
        LayoutInflater.from(context).inflate(R.layout.sidebar_button, this, true);
        this.A03 = JTO.A0Y(this, R.id.sidebar_icon);
        IgTextView A0X = JTO.A0X(this, R.id.sidebar_label);
        this.A02 = A0X;
        if (A0X == null) {
            str = "labelView";
        } else {
            A0X.setText(C71622eP.A00(context, obtainStyledAttributes, 2));
            this.A05 = JTO.A0X(this, R.id.sidebar_new_tag);
            this.A06 = Integer.valueOf(obtainStyledAttributes.getColor(0, 0));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            IgImageView igImageView = this.A03;
            if (igImageView == null) {
                str = "iconView";
            } else {
                igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public /* synthetic */ ArSidebarButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArSidebarButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

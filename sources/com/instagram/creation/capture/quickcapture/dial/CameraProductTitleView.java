package com.instagram.creation.capture.quickcapture.dial;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C324476zN;
import X.C71382cm;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.user.model.Product;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CameraProductTitleView extends LinearLayout {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public TextView A03;
    public TextView A04;
    public Integer A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void setPriceVisibility(boolean z) {
        this.A01 = z;
    }

    public final void setProduct(Product product) {
        TextView textView;
        String str;
        int i = 8;
        if (product != null) {
            TextView textView2 = this.A04;
            String str2 = product.A0J;
            if (str2 != null) {
                str = AnonymousClass7TF.A0k(str2);
            } else {
                str = null;
            }
            textView2.setText(str);
            if (this.A01) {
                this.A03.setText(TextUtils.concat(new CharSequence[]{" · ", C324476zN.A08(getContext(), product, this.A05, (Integer) null)}));
            }
            textView = this.A03;
            if (this.A02) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView2.setGravity(8388611);
            if (this.A01) {
                i = 0;
            }
        } else {
            TextView textView3 = this.A04;
            textView3.setText(2131975842);
            textView = this.A03;
            if (this.A02) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView3.setGravity(17);
        }
        textView.setVisibility(i);
    }

    public /* synthetic */ CameraProductTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A01 = true;
        LayoutInflater.from(context).inflate(R.layout.camera_product_title_view, this);
        this.A04 = AnonymousClass7TE.A0d(this, R.id.title);
        this.A03 = DbU.A0G(this, R.id.price);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0C);
            0qQ.A07(obtainStyledAttributes);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = z;
            if (z) {
                this.A00 = context.getDrawable(R.drawable.dial_element_title_chevron);
                this.A03.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, R.style.TextViewStyle);
                Integer valueOf = Integer.valueOf(resourceId);
                this.A05 = valueOf;
                if (valueOf != null) {
                    this.A04.setTextAppearance(resourceId);
                }
                Integer num = this.A05;
                if (num != null) {
                    this.A03.setTextAppearance(num.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}

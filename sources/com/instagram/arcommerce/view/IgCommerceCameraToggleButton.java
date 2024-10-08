package com.instagram.arcommerce.view;

import X.0qQ;
import X.DbU;
import X.JTT;
import X.X2I;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgCommerceCameraToggleButton extends FrameLayout implements X2I {
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public ImageView A03;
    public View A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.camera_toggle_layout, this);
        this.A04 = inflate;
        if (inflate != null) {
            this.A03 = DbU.A0F(inflate, R.id.toggle_button_icon);
            this.A02 = inflate.requireViewById(R.id.toggle_selected_background);
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        setOnClickListener(onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

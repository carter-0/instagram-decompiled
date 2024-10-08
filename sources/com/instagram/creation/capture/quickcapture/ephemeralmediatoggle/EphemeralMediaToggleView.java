package com.instagram.creation.capture.quickcapture.ephemeralmediatoggle;

import X.0qQ;
import X.AJK;
import X.AnonymousClass9J1;
import X.C366808pi;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EphemeralMediaToggleView extends LinearLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(AnonymousClass9J1 r5) {
        ImageView imageView;
        this.A02.setText(r5.A04);
        ImageView imageView2 = this.A01;
        Drawable drawable = (Drawable) r5.A02;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof C366808pi) {
            ((C366808pi) drawable).start();
            int intValue = ((Number) r5.A01).intValue();
            if (intValue == 0) {
                imageView = this.A00;
                if (imageView.getRotation() != 0.0f) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ROTATION, new float[]{-90.0f, 0.0f});
                    ofFloat.setDuration(250);
                    ofFloat.start();
                    ofFloat.addListener(new AJK(r5, this));
                    return;
                }
            } else if (intValue == 2 || intValue == 1) {
                ImageView imageView3 = this.A00;
                if (imageView3.getRotation() == 0.0f) {
                    imageView3.setImageDrawable((Drawable) r5.A03);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, View.ROTATION, new float[]{0.0f, -90.0f});
                    ofFloat2.setDuration(250);
                    ofFloat2.setInterpolator(new OvershootInterpolator(1.0f));
                    ofFloat2.start();
                    return;
                }
                return;
            } else {
                throw new RuntimeException();
            }
        } else {
            imageView = this.A00;
        }
        imageView.setImageDrawable((Drawable) r5.A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.igd_ephemeral_toggle_view, this, true);
        this.A02 = (TextView) inflate.findViewById(R.id.label);
        this.A01 = (ImageView) inflate.findViewById(R.id.icon);
        this.A00 = (ImageView) inflate.findViewById(R.id.outline);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EphemeralMediaToggleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

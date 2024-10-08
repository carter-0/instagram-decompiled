package com.instagram.creation.capture.quickcapture.direct.view;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C56673I7c;
import X.DbX;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReshareTogglePickerView extends LinearLayout {
    public ObjectAnimator A00;
    public final ImageView A01;
    public final TextView A02;
    public final long A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(Integer num) {
        int i;
        0qQ.A0B(num, 0);
        Context A0S = AnonymousClass7TE.A0S(this);
        if (num.intValue() != 0) {
            i = R.drawable.instagram_reshare_off_pano_outline_24;
        } else {
            i = R.drawable.instagram_reshare_pano_outline_24;
        }
        Drawable drawable = A0S.getDrawable(i);
        if (drawable != null) {
            DbX.A11(A0S, drawable, 2Yu.A0H(A0S, R.attr.igds_color_primary_button_on_media));
        }
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.A01;
        Property property = View.ROTATION;
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = -1028390912;
        A1b[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, A1b);
        ofFloat.setDuration(this.A03);
        this.A00 = ofFloat;
        ofFloat.start();
        ObjectAnimator objectAnimator2 = this.A00;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new C56673I7c(1, this, drawable, num));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = 100;
        View inflate = LayoutInflater.from(context).inflate(R.layout.igd_ephemeral_toggle_view, this, true);
        this.A02 = AnonymousClass7TE.A0d(inflate, R.id.label);
        this.A01 = (ImageView) inflate.findViewById(R.id.icon);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

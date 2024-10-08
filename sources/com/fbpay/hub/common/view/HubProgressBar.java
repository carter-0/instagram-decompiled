package com.fbpay.hub.common.view;

import X.0qQ;
import X.AnonymousClass2E0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HubProgressBar extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HubProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        AnonymousClass2E0.A0E();
        View.inflate(context, R.layout.hub_spinner, this);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (getChildCount() > 0) {
            getChildAt(0).setBackground(drawable);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HubProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HubProgressBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HubProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

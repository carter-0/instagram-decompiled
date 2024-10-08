package com.instagram.ui.simplevideolayout;

import X.0qQ;
import X.C242423Ua;
import X.C67961ye;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class SimpleVideoLayout extends C67961ye implements C242423Ua {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(view, 0);
        0qQ.A0B(layoutParams, 2);
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        0qQ.A0B(view, 0);
        super.detachViewFromParent(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleVideoLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

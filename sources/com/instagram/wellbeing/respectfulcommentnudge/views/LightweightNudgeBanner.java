package com.instagram.wellbeing.respectfulcommentnudge.views;

import X.0qQ;
import X.AnonymousClass7TE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LightweightNudgeBanner extends IgLinearLayout {
    public final TextView A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setBody(String str) {
        0qQ.A0B(str, 0);
        this.A00.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.layout_lightweight_nudge, this).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.A00 = AnonymousClass7TE.A0d(this, R.id.banner_body);
        setOrientation(1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

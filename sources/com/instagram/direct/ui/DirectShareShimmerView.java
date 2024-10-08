package com.instagram.direct.ui;

import X.0qQ;
import X.C3021161q;
import X.C3021361s;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

public final class DirectShareShimmerView extends C3021161q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        Resources resources = getResources();
        0qQ.A07(resources);
        setImageDrawable(new C3021361s(resources, this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Resources resources = getResources();
        0qQ.A07(resources);
        setImageDrawable(new C3021361s(resources, this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        Resources resources = getResources();
        0qQ.A07(resources);
        setImageDrawable(new C3021361s(resources, this));
    }
}

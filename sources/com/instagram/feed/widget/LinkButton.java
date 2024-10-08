package com.instagram.feed.widget;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DbT;
import X.DbV;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LinkButton extends ImageWithTitleTextView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LinkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    private final int getColor() {
        if (!isEnabled()) {
            return R.color.badge_color;
        }
        if (isSelected() || isPressed()) {
            return R.color.blue_6;
        }
        return R.color.badge_color;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int color = getColor();
        Context context = getContext();
        ColorFilter A06 = DbV.A06(context, color);
        Drawable background = getBackground();
        if (background != null) {
            AnonymousClass7TG.A10(A06, background);
            DbT.A17(context, this, color);
            Drawable drawable = this.A01;
            if (drawable != null) {
                AnonymousClass7TG.A10(A06, drawable);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

package com.instagram.fbpay.hub.view;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C71382cm;
import X.DbX;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BrandingRowItem extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.branding_row_item, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A06);
        0qQ.A07(obtainStyledAttributes);
        ImageView A0J = DbX.A0J(inflate, R.id.icon);
        TextView A0F = C66582MXn.A0F(inflate);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.subtitle);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            A0J.setImageResource(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            A0F.setText(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId3 != 0) {
            A0R.setText(resourceId3);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ BrandingRowItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

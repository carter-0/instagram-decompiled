package com.instagram.creation.capture.gallery.ui;

import X.03v;
import X.0qQ;
import X.2Yu;
import X.2eS;
import X.AnonymousClass05K;
import X.AnonymousClass514;
import X.C9162RRn;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class CropTypeToggleButton extends IgSimpleImageView {
    public AnonymousClass514 A00 = AnonymousClass514.SQUARE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        2eS.A04(this, AnonymousClass05K.A06);
    }

    public final void setCropType(AnonymousClass514 r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass514 r2 = this.A00;
        AnonymousClass514 r1 = AnonymousClass514.ORIGINAL;
        int i = R.drawable.instagram_fit_pano_outline_24;
        if (r2 == r1) {
            i = R.drawable.instagram_fill_pano_outline_24;
        }
        Context context = getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A0j, context.getColor(2Yu.A0E(context))));
        } else {
            drawable = null;
        }
        setImageDrawable(drawable);
        03v.A0G(this, getResources().getString(r4.A02));
        this.A00 = r4;
    }

    public final AnonymousClass514 getCropType() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        2eS.A04(this, AnonymousClass05K.A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        2eS.A04(this, AnonymousClass05K.A06);
    }
}

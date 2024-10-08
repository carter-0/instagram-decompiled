package com.instagram.music.common.ui;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass8ZG;
import X.AnonymousClass8ZI;
import X.AnonymousClass8ZJ;
import X.C71382cm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MusicPreviewButton extends IgSimpleImageView {
    public AnonymousClass8ZI A00;
    public boolean A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }

    public final void setProgress(float f) {
        this.A00.A00(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass8ZG A012;
        0qQ.A0B(context, 1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1k);
            0qQ.A07(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getBoolean(1, false);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (this.A02) {
            boolean z = this.A01;
            AnonymousClass8ZJ r0 = AnonymousClass8ZI.A0V;
            if (z) {
                A012 = r0.A02(context);
            } else {
                A012 = new AnonymousClass8ZG(context);
                Resources resources = getResources();
                A012.A0B = Integer.valueOf(resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
                A012.A0A = 0;
                A012.A02(AnonymousClass7TE.A0E(resources));
                A012.A06 = 0;
                A012.A00 = context.getDrawable(R.drawable.instagram_play_filled_16);
                A012.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
            }
        } else {
            A012 = AnonymousClass8ZI.A0V.A01(context);
        }
        AnonymousClass8ZI A002 = A012.A00();
        this.A00 = A002;
        setImageDrawable(A002);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPreviewButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }
}

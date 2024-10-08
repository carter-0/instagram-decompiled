package com.instagram.creation.album;

import X.0qQ;
import X.0sP;
import X.LMI;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class AlbumPostCapCropToggleButton extends IgSimpleImageView {
    public LMI A00 = LMI.A02;
    public 0sP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void setUiState(LMI lmi) {
        0qQ.A0B(lmi, 0);
        this.A00 = lmi;
    }

    public final LMI getUiState() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

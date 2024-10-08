package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public final class ArEffectPickerRecyclerView extends RecyclerView {
    public String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final boolean A1F(int i, int i2) {
        if ("video_call".equals(this.A00)) {
            i = (int) (((double) i) * 0.35d);
        }
        return super.A1F(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}

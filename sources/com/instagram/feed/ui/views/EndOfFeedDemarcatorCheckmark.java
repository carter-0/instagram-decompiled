package com.instagram.feed.ui.views;

import X.0qQ;
import X.AnonymousClass528;
import X.AnonymousClass529;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EndOfFeedDemarcatorCheckmark extends AnonymousClass528 implements AnonymousClass529 {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0W, 0, i);
            this.A03 = typedArray.getInteger(3, this.A03);
            this.A01 = typedArray.getFloat(1, this.A01);
            this.A00 = typedArray.getFloat(0, this.A00);
            this.A02 = typedArray.getFloat(2, this.A02);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

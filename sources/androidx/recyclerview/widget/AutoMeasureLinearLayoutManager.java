package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

public class AutoMeasureLinearLayoutManager extends LinearLayoutManager {
    public boolean A00 = true;

    public final void A0v(boolean z) {
        this.A00 = true;
    }

    public final boolean A1H() {
        return this.A00;
    }

    public AutoMeasureLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

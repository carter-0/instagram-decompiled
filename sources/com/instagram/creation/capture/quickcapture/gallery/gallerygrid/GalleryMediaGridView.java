package com.instagram.creation.capture.quickcapture.gallery.gallerygrid;

import X.0qQ;
import X.C59920Jbj;
import X.C60467Jlz;
import X.C71382cm;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Deprecated(message = "This is a very old custom View that assumes the Adapter that powers it (which is incorrect most of the time). New cases should use a standard View without inheritance (eg. RecyclerView)")
public final class GalleryMediaGridView extends RecyclerView {
    public final int A00;
    public final GridLayoutManager A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final GridLayoutManager getGridLayoutManager() {
        return this.A01;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) + this.A00, SN3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0r, i, 0);
        0qQ.A07(obtainStyledAttributes);
        int i2 = obtainStyledAttributes.getInt(1, 4);
        this.A00 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i2);
        this.A01 = gridLayoutManager;
        C59920Jbj jbj = new C59920Jbj(this, i2, 1);
        gridLayoutManager.A01 = jbj;
        jbj.A00 = true;
        setLayoutManager(gridLayoutManager);
        if (!z) {
            A11(new C60467Jlz(this, 9));
        }
        setOverScrollMode(2);
        setClipToPadding(false);
    }

    public /* synthetic */ GalleryMediaGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryMediaGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

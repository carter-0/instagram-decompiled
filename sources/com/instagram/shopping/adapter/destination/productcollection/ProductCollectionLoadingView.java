package com.instagram.shopping.adapter.destination.productcollection;

import X.0qQ;
import X.C15471UdM;
import X.C71382cm;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProductCollectionLoadingView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A1o);
        0qQ.A07(obtainStyledAttributes);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setAdapter(new C15471UdM(context, z, z2, z3));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

package com.facebookpay.widget.pricetable;

import X.0qQ;
import X.0s0;
import X.AnonymousClass0YZ;
import X.AnonymousClass2E0;
import X.C11409SSh;
import X.C13406TYq;
import X.C71382cm;
import X.DbS;
import X.Pxe;
import X.Pxh;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TableLayout;
import com.instagram.android.R;
import java.util.List;

public final class PriceTable extends TableLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A06 = {Pxh.A0y(PriceTable.class, "priceTableRowDataList", "getPriceTableRowDataList()Ljava/util/List;")};
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final 0s0 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A01 = true;
        this.A05 = new C13406TYq(this, 5);
        AnonymousClass2E0.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUIPriceTable, C71382cm.A0h);
        this.A03 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        obtainStyledAttributes.recycle();
        setColumnShrinkable(1, true);
        setColumnStretchable(2, true);
        C11409SSh.A01(this, 2);
        setImportantForAccessibility(2);
    }

    public final List getPriceTableRowDataList() {
        return (List) Pxe.A0s(this, this.A05, A06, 0);
    }

    public final void setPriceTableRowDataList(List list) {
        DbS.A1a(this, list, this.A05, A06, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}

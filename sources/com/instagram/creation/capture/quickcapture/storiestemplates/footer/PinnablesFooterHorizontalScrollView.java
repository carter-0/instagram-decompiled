package com.instagram.creation.capture.quickcapture.storiestemplates.footer;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51966G9m;
import X.C63813L7t;
import X.JTT;
import X.KHR;
import X.LYA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PinnablesFooterHorizontalScrollView extends HorizontalScrollView {
    public final IgLinearLayout A00;
    public final Map A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setButtons(List list) {
        0qQ.A0B(list, 0);
        IgLinearLayout igLinearLayout = this.A00;
        igLinearLayout.removeAllViews();
        Map map = this.A01;
        map.clear();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C63813L7t l7t = (C63813L7t) it.next();
            KHR khr = new KHR(AnonymousClass7TE.A0S(this));
            khr.setId(i);
            khr.setLabel(l7t.A01);
            khr.setIcon(l7t.A00);
            khr.setOnClickListener(LYA.A00(khr, l7t, this, 17));
            igLinearLayout.addView(khr);
            map.put(l7t.A02, Integer.valueOf(i));
            i++;
        }
    }

    public final void A00(String str, int i) {
        Number A14 = C51966G9m.A14(str, this.A01);
        if (A14 != null) {
            this.A00.getChildAt(A14.intValue()).setVisibility(i);
        }
    }

    public final void A01(String str, boolean z) {
        Number A14 = C51966G9m.A14(str, this.A01);
        if (A14 != null) {
            this.A00.getChildAt(A14.intValue()).setSelected(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A01 = AnonymousClass7TE.A1H();
        LayoutInflater.from(context).inflate(R.layout.pinnables_footer_horizontal_scroll_view, this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.pinnables_footer_linear_layout);
    }

    public /* synthetic */ PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

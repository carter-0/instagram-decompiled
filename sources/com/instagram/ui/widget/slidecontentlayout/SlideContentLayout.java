package com.instagram.ui.widget.slidecontentlayout;

import X.2cp;
import X.2cs;
import X.AnonymousClass972;
import X.C13988Tno;
import X.C61340me;
import X.DbS;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

public class SlideContentLayout extends FrameLayout {
    public final 2cp A00;
    public final Map A01;

    public static int A00(View view, SlideContentLayout slideContentLayout) {
        View view2 = view;
        SlideContentLayout slideContentLayout2 = slideContentLayout;
        if (view.getMeasuredHeight() == 0) {
            slideContentLayout2.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(slideContentLayout.getWidth(), AnonymousClass972.MUTABLE_FLAG_MASK), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        }
        return C13988Tno.A0B(DbS.A0D(view2), view2.getMeasuredHeight()) + slideContentLayout2.getPaddingTop() + slideContentLayout2.getPaddingBottom();
    }

    public static void A01(2cs r4, SlideContentLayout slideContentLayout, int i) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            2cs r1 = (2cs) map.get(valueOf);
            r1.A0D.clear();
            r1.A01();
        }
        map.put(valueOf, r4);
    }

    public static void A02(SlideContentLayout slideContentLayout, int i) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            2cs r5 = (2cs) map.get(valueOf);
            if (r5.A09.A00 != r5.A01) {
                r5.A08(1.0d, true);
            }
        }
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C61340me.A00();
        this.A01 = new HashMap(4);
        setElevation(getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}

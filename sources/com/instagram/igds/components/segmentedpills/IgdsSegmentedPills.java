package com.instagram.igds.components.segmentedpills;

import X.0qQ;
import X.0sP;
import X.0wb;
import X.BBV;
import X.GW3;
import X.IC9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsSegmentedPills extends HorizontalScrollView {
    public final IgLinearLayout A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setPills(List list, int i, 0sP r15) {
        String str;
        0qQ.A0B(list, 0);
        if (list.size() < 3) {
            str = "Number of pills is below minimum requirement";
        } else {
            IgLinearLayout igLinearLayout = this.A00;
            igLinearLayout.removeAllViews();
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                BBV bbv = (BBV) it.next();
                if (i2 >= 8) {
                    str = "Number of pills exceeds max requirement";
                } else {
                    Context context = getContext();
                    0qQ.A07(context);
                    GW3 gw3 = new GW3(context);
                    gw3.setId(i2);
                    gw3.setLabel(bbv.A00);
                    gw3.setOnClickListener(new IC9(i2, 1, gw3, this, r15));
                    if (i2 == i) {
                        gw3.setSelected(true);
                    }
                    igLinearLayout.addView(gw3, i2);
                    i2 = i3;
                }
            }
            return;
        }
        0wb.A03("IgdsSegmentedPills", str);
    }

    public static /* synthetic */ void setPills$default(IgdsSegmentedPills igdsSegmentedPills, List list, int i, 0sP r4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            r4 = null;
        }
        igdsSegmentedPills.setPills(list, i, r4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.igds_segmented_pills, this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.igds_segmented_pills_linear_layout);
    }

    public final void setPills(List list) {
        0qQ.A0B(list, 0);
        setPills(list, 0, (0sP) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsSegmentedPills(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

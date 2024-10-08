package com.instagram.direct.fragment.writewithai;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TE;
import X.DbY;
import X.JTT;
import X.KHM;
import X.LXI;
import X.N4G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PromptPills extends HorizontalScrollView {
    public final IgLinearLayout A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void setPills$default(PromptPills promptPills, List list, int i, 0sP r4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        promptPills.setPills(list, i, r4);
    }

    public final void setPills(List list, int i, 0sP r9) {
        DbY.A1S(list, r9);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            N4G n4g = (N4G) it.next();
            KHM khm = new KHM(AnonymousClass7TE.A0S(this));
            khm.setId(i2);
            khm.setText(n4g.A01);
            khm.setImage(n4g.A00);
            khm.setOnClickListener(new LXI(i2, 1, r9));
            this.A00.addView(khm, i2);
            i2++;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.write_with_ai_prompt_pills, this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.write_with_ai_prompt_pills_linear_layout);
    }

    public /* synthetic */ PromptPills(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

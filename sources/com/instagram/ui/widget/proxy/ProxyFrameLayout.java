package com.instagram.ui.widget.proxy;

import X.0qQ;
import X.C226182fp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

public class ProxyFrameLayout extends FrameLayout {
    public View.OnClickListener A00;
    public boolean A01 = true;
    public final List A02 = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        super.setOnClickListener(new C226182fp(this));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public final void setProxyToOnClickListener(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        super.setOnClickListener(new C226182fp(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        super.setOnClickListener(new C226182fp(this));
    }
}

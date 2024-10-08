package com.instagram.arlink.ui;

import X.AnonymousClass0fD;
import X.AnonymousClass61R;
import X.AnonymousClass9WY;
import X.C293755lI;
import X.C303756Aq;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;

public class NametagCardHintView extends FrameLayout {
    public AnonymousClass61R A00;
    public Drawable A01;

    public NametagCardHintView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        AnonymousClass61R A002 = C303756Aq.A00(getContext(), R.raw.scanmarks);
        this.A00 = A002;
        if (A002 == null) {
            this.A01 = new AnonymousClass9WY();
        } else {
            C293755lI.A00("scanmarks");
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Drawable drawable;
        int A06 = AnonymousClass0fD.A06(438397667);
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass61R r1 = this.A00;
        if (r1 != null) {
            r1.setBounds(0, 0, i, i2);
            drawable = this.A00;
        } else {
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                drawable2.mutate().setAlpha(128);
                drawable = this.A01;
            }
            AnonymousClass0fD.A0D(-854731255, A06);
        }
        setBackground(drawable);
        AnonymousClass0fD.A0D(-854731255, A06);
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}

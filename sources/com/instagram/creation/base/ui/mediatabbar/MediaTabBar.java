package com.instagram.creation.base.ui.mediatabbar;

import X.0mk;
import X.0qQ;
import X.0sr;
import X.2Yu;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass2gY;
import X.AnonymousClass7TE;
import X.JTO;
import X.JTP;
import X.JTT;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MediaTabBar extends LinearLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final ArgbEvaluator A05;
    public final Paint A06;
    public final List A07;

    public MediaTabBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        List list = this.A07;
        float A022 = (this.A00 * AnonymousClass7TE.A02(this)) / ((float) list.size());
        float A032 = AnonymousClass7TE.A03(this);
        Paint paint = this.A06;
        float strokeWidth = A032 - (paint.getStrokeWidth() / 2.0f);
        canvas.drawLine(A022, strokeWidth, A022 + ((float) (getWidth() / list.size())), strokeWidth, paint);
    }

    public final void setTabs(List list, View.OnClickListener onClickListener) {
        Iterator A0x = JTP.A0x(list);
        while (A0x.hasNext()) {
            Tab tab = (Tab) A0x.next();
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.media_tab_bar_tab, this, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTag(tab);
            textView.setText(getResources().getString(tab.A01));
            textView.setOnClickListener(onClickListener);
            2eS.A04(textView, AnonymousClass05K.A01);
            addView(textView);
            this.A07.add(textView);
        }
        List list2 = this.A07;
        Iterator A0x2 = JTP.A0x(list2);
        int i = 0;
        while (A0x2.hasNext()) {
            Object next = A0x2.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            View view = (View) next;
            int size = list2.size();
            0qQ.A0B(view, 0);
            AnonymousClass2gY.A00(view, i2, size, false);
            i = i2;
        }
    }

    public MediaTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = AnonymousClass7TE.A1C();
        this.A03 = -1;
        setOrientation(0);
        Resources resources = getResources();
        this.A04 = 0mk.A02(getContext());
        this.A05 = new ArgbEvaluator();
        this.A02 = 2Yu.A0F(context, R.attr.mediaTabTextColor);
        this.A01 = 2Yu.A0F(context, R.attr.mediaTabTextColorSelected);
        int A042 = JTP.A04(resources);
        Paint A0C = JTO.A0C();
        this.A06 = A0C;
        JTO.A1N(A0C);
        A0C.setStrokeWidth((float) A042);
        A0C.setColor(this.A01);
        setWillNotDraw(false);
        2eS.A04(this, AnonymousClass05K.A05);
    }

    public /* synthetic */ MediaTabBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    public MediaTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

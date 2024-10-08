package com.instagram.feed.ui.rows.mediaheader.layout;

import X.002;
import X.0qQ;
import X.0sr;
import X.0wb;
import X.AnonymousClass00P;
import X.AnonymousClass044;
import X.AnonymousClass7TF;
import X.C242173Sx;
import X.C66999MgX;
import X.C67617Mqp;
import X.C73324Paj;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CyclicSubtitleLayout extends FrameLayout {
    public int A00;
    public long A01;
    public View.OnAttachStateChangeListener A02;
    public Timer A03;
    public boolean A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* access modifiers changed from: private */
    public final void setAnimating(boolean z) {
        Timer timer;
        if (this.A04 != z) {
            this.A04 = z;
            if (z) {
                String A0M = 002.A0M("CyclicSubtitleLayout_", Math.random());
                long j = this.A01;
                if (A0M != null) {
                    timer = new Timer(A0M, true);
                }
                timer.scheduleAtFixedRate(new C67617Mqp(this), j, j);
            } else {
                Timer timer2 = this.A03;
                if (timer2 != null) {
                    timer2.cancel();
                }
                timer = null;
            }
            this.A03 = timer;
        }
    }

    public final long getAnimationDelay() {
        return this.A01;
    }

    public final int getVisibleIndex() {
        return this.A00;
    }

    public final void setVisibleIndex(int i) {
        int i2;
        List A07 = C242173Sx.A07(C242173Sx.A09(C66999MgX.A00, new AnonymousClass044(this)));
        int size = A07.size();
        int i3 = this.A00;
        int i4 = 0;
        try {
            i2 = i % size;
        } catch (ArithmeticException e) {
            0wb.A01.Ew2("CyclicSubtitleLayout", "CyclicSubtitleLayout received arithmetic exception", e);
            i2 = 0;
        }
        this.A00 = i2;
        if (!this.A04 || i3 == i2 || i3 < 0 || i3 >= size) {
            for (Object next : A07) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                View view = (View) next;
                float f = 0.0f;
                if (i4 == this.A00) {
                    f = 1.0f;
                }
                view.setAlpha(f);
                view.setTranslationY(0.0f);
                i4 = i5;
            }
            return;
        }
        AnonymousClass7TF.A0D().post(new C73324Paj((View) A07.get(i3), (View) A07.get(i2), ((float) getMeasuredHeight()) / 2.0f));
    }

    public final void setAnimationDelay(long j) {
        this.A01 = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A01 = 4000;
    }

    public /* synthetic */ CyclicSubtitleLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

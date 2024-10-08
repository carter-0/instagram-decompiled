package com.facebook.rtc.views.omnigrid;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C15048ULb;
import X.C252553pI;
import X.DbX;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class OmniGridRecyclerView extends RecyclerView {
    public GestureDetector A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<C15048ULb> list;
        int i;
        int i2;
        0qQ.A0B(motionEvent, 0);
        C252553pI r1 = this.A0D;
        if ((r1 instanceof OmniGridLayoutManager) && motionEvent.getAction() == 0 && (list = ((OmniGridLayoutManager) r1).A07.A01) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (C15048ULb uLb : list) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i3 = uLb.A01;
                int i4 = uLb.A02;
                if (i3 < i4 && (i = uLb.A03) < (i2 = uLb.A00) && x >= i3 && x < i4 && y >= i && y < i2) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C252553pI r2 = this.A0D;
        if (!(r2 instanceof OmniGridLayoutManager)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) r2;
        omniGridLayoutManager.A04 = motionEvent;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        omniGridLayoutManager.A04 = null;
        return onInterceptTouchEvent;
    }

    public final GestureDetector getGestureDetector() {
        return this.A00;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A03 = DbX.A03(motionEvent, 2114564044);
        C252553pI r2 = this.A0D;
        if (r2 instanceof OmniGridLayoutManager) {
            OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) r2;
            omniGridLayoutManager.A04 = motionEvent;
            onTouchEvent = super.onTouchEvent(motionEvent);
            omniGridLayoutManager.A04 = null;
            GestureDetector gestureDetector = this.A00;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        AnonymousClass0fD.A0C(2064603857, A03);
        return onTouchEvent;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}

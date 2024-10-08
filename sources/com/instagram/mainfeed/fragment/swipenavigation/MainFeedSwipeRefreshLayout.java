package com.instagram.mainfeed.fragment.swipenavigation;

import X.0nA;
import X.0qQ;
import X.AnonymousClass2xN;
import X.AnonymousClass3D4;
import X.C238133Ar;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.ui.widget.refresh.IgSwipeRefreshWithHScrollLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MainFeedSwipeRefreshLayout extends IgSwipeRefreshWithHScrollLayout {
    public AnonymousClass2xN A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MainFeedSwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        WeakReference weakReference;
        C238133Ar r0;
        0qQ.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked == 0) {
            AnonymousClass2xN r1 = this.A00;
            if (r1 != null) {
                if (!r1.A00(motionEvent) || (weakReference = r1.A01) == null || (r0 = (C238133Ar) weakReference.get()) == null || !r0.COw()) {
                    z = false;
                }
                this.A01 = z;
            }
        } else if (actionMasked == 1) {
            this.A01 = false;
        } else if (actionMasked == 2 && !this.A01) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setMainFeedScrollAwayNavigatorState(AnonymousClass2xN r1) {
        this.A00 = r1;
    }

    public /* synthetic */ MainFeedSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainFeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A01 = true;
        int A002 = AnonymousClass3D4.A00(context);
        A08((A002 / 3) + A002, A002 * 3);
        setDistanceToTriggerSync((int) 0nA.A01(context, (float) A002));
        this.A03 = A002 * 2;
    }
}

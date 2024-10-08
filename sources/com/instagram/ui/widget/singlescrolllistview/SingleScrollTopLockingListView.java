package com.instagram.ui.widget.singlescrolllistview;

import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C14706U2q;
import X.C252243on;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;

public class SingleScrollTopLockingListView extends RefreshableListView implements C252243on, AbsListView.OnScrollListener {
    public GestureDetector A00;
    public Map A01;
    public final float A02;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
        this.A01 = null;
    }

    public final void onDestroyView() {
        this.A00 = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    private View getCurrentMediaFooterView() {
        throw new NullPointerException("getCurrentMediaFooterPosition");
    }

    private int getCurrentViewHeight() {
        throw new NullPointerException("getCurrentMediaHeaderPosition");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A00 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        throw new NullPointerException("getCurrentMediaId");
    }

    public void setScrollOffset(int i) {
    }

    public void setTopOffset(int i) {
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = new HashMap();
        Resources resources = getResources();
        this.A02 = TypedValue.applyDimension(1, (float) resources.getDimensionPixelSize(R.dimen.fling_velocity_threshold_dp), resources.getDisplayMetrics());
        this.A00 = new GestureDetector(context, new C14706U2q(this));
    }

    public final void A00() {
        getCurrentMediaFooterView();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return AnonymousClass7TF.A1P(super.onInterceptTouchEvent(motionEvent) ? 1 : 0);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A03(564055402);
        throw new NullPointerException("getCurrentMediaId");
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0fD.A0A(1618540188, AnonymousClass0fD.A03(-244675548));
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleScrollTopLockingListView(Context context) {
        this(context, (AttributeSet) null);
    }
}

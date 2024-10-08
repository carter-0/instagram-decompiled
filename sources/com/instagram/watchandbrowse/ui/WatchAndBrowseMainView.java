package com.instagram.watchandbrowse.ui;

import X.0qQ;
import X.C14060Tp8;
import X.C19698We0;
import X.C273654mx;
import X.C71382cm;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.gesture.GestureManagerFrameLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class WatchAndBrowseMainView extends IgFrameLayout {
    public IgFrameLayout A00;
    public IgFrameLayout A01;
    public IgView A02;
    public Integer A03;
    public IgFrameLayout A04;
    public GestureManagerFrameLayout A05;
    public final IgSimpleImageView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_and_browse, this);
        0qQ.A0C(inflate, C273654mx.A00(25));
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A04 = igFrameLayout;
        this.A02 = (IgView) igFrameLayout.requireViewById(R.id.browser_shadow);
        this.A00 = (IgFrameLayout) this.A04.requireViewById(R.id.dismiss_button_immersive_gradient);
        this.A06 = (IgSimpleImageView) this.A04.requireViewById(R.id.dismiss_button);
        this.A01 = (IgFrameLayout) this.A04.requireViewById(R.id.watch_and_browse_media_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2S);
            0qQ.A07(obtainStyledAttributes);
            int i2 = 0;
            this.A02.setVisibility(!obtainStyledAttributes.getBoolean(0, false) ? 8 : i2);
            obtainStyledAttributes.recycle();
        }
    }

    public final void A00(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        GestureManagerFrameLayout gestureManagerFrameLayout = (GestureManagerFrameLayout) this.A04.requireViewById(R.id.gesture_manager);
        this.A05 = gestureManagerFrameLayout;
        if (gestureManagerFrameLayout != null) {
            gestureManagerFrameLayout.requestDisallowInterceptTouchEvent(true);
            GestureDetector gestureDetector = new GestureDetector(getContext(), simpleOnGestureListener);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(new C19698We0(gestureDetector));
            new C14060Tp8(gestureManagerFrameLayout, arrayList, arrayList2);
        }
    }

    public final IgSimpleImageView getDismissButton() {
        return this.A06;
    }

    public final Integer getShadowOverlap() {
        return this.A03;
    }

    public final IgFrameLayout getWatchAndBrowseMediaContainer() {
        return this.A01;
    }

    public final void setGradientVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public final void setShadowOverlap(Integer num) {
        this.A03 = num;
    }

    public final void setShadowViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public final void setWatchAndBrowseMediaContainer(IgFrameLayout igFrameLayout) {
        this.A01 = igFrameLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ WatchAndBrowseMainView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

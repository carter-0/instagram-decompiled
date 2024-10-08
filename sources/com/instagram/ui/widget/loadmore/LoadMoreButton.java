package com.instagram.ui.widget.loadmore;

import X.AnonymousClass05K;
import X.AnonymousClass4i7;
import X.AnonymousClass4i8;
import X.C229122ms;
import X.C230682q1;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class LoadMoreButton extends ViewAnimator {
    public C229122ms A00;
    public final float A01;

    public LoadMoreButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void A03(C229122ms r3, C230682q1 r4) {
        String str;
        this.A00 = r3;
        getChildAt(2).setOnClickListener(new AnonymousClass4i7(r3, this, r4));
        getChildAt(3).setOnClickListener(new AnonymousClass4i8(r3, this, r4));
        if (!r3.CWV() || (!r3.isLoading() && !r3.CT5() && !r3.CKB() && r3.CJz())) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (r4 != null) {
            switch (A01(this.A00).intValue()) {
                case 0:
                    str = "INDEX_NO_ITEMS";
                    break;
                case 1:
                    str = "INDEX_LOADING";
                    break;
                case 2:
                    str = "INDEX_LOAD_MORE";
                    break;
                case 3:
                    str = "INDEX_RETRY";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            r4.DOM(str);
        }
        setViewType(r3, r4);
    }

    public static View A00(Context context, int i, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.row_load_more, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.row_load_more_button);
        findViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        View inflate2 = from.inflate(i, viewGroup2, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        SpinnerImageView spinnerImageView = new SpinnerImageView(context);
        spinnerImageView.setBackgroundResource(R.drawable.spinner_large);
        spinnerImageView.setLayoutParams(layoutParams);
        spinnerImageView.setContentDescription(context.getResources().getString(2131965491));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(context.getDrawable(R.drawable.loadmore_add_compound));
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(context.getDrawable(R.drawable.loadmore_icon_refresh_compound));
        imageView2.setContentDescription(context.getResources().getString(2131972371));
        imageView2.setLayoutParams(layoutParams);
        viewGroup2.addView(inflate2, 0);
        viewGroup2.addView(spinnerImageView, 1);
        viewGroup2.addView(imageView, 2);
        viewGroup2.addView(imageView2, 3);
        return inflate;
    }

    public static Integer A01(C229122ms r1) {
        if (r1.isLoading()) {
            return AnonymousClass05K.A01;
        }
        if (r1.CT5()) {
            return AnonymousClass05K.A0N;
        }
        if (!r1.CJz()) {
            return AnonymousClass05K.A00;
        }
        if (r1.CKB()) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0Y;
    }

    /* access modifiers changed from: private */
    public void setViewType(C229122ms r3, C230682q1 r4) {
        if (r3.isLoading() && r4 != null) {
            r4.DjS();
        }
        Integer A012 = A01(r3);
        if (AnonymousClass05K.A0Y != A012) {
            setDisplayedChild(A012.intValue());
        }
    }

    public final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        float f = this.A01;
        if (f == -1.0f) {
            round = getMeasuredHeight();
        } else {
            round = Math.round(((float) getMeasuredWidth()) / f);
        }
        setMeasuredDimension(measuredWidth, round);
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A1f);
        this.A01 = obtainStyledAttributes.getFloat(0, -1.0f);
        obtainStyledAttributes.recycle();
    }
}

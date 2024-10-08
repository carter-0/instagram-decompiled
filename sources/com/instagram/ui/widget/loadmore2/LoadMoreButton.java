package com.instagram.ui.widget.loadmore2;

import X.DbU;
import X.DbW;
import X.EWS;
import X.FP4;
import X.G5G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class LoadMoreButton extends ViewAnimator {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public G5G A03;

    public LoadMoreButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setState(EWS ews) {
        this.A00.setVisibility(DbW.A01(ews.A01 ? 1 : 0));
        this.A01.setVisibility(DbW.A01(ews.A00 ? 1 : 0));
        this.A02.setVisibility(DbW.A01(ews.A02 ? 1 : 0));
        if (ews == EWS.A06) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public void setDelegate(G5G g5g) {
        this.A03 = g5g;
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        Context context2 = getContext();
        SpinnerImageView spinnerImageView = new SpinnerImageView(context2);
        this.A00 = spinnerImageView;
        spinnerImageView.setBackgroundResource(R.drawable.spinner_large);
        this.A00.setLayoutParams(layoutParams);
        addView(this.A00);
        ImageView imageView = new ImageView(context2);
        this.A01 = imageView;
        DbU.A13(context2, imageView, R.drawable.loadmore_add_compound);
        this.A01.setLayoutParams(layoutParams);
        addView(this.A01);
        ImageView imageView2 = new ImageView(context2);
        this.A02 = imageView2;
        DbU.A13(context2, imageView2, R.drawable.loadmore_icon_refresh_compound);
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
        FP4 A002 = FP4.A00(this, 30);
        this.A01.setOnClickListener(A002);
        this.A02.setOnClickListener(A002);
        setState(EWS.A06);
    }
}

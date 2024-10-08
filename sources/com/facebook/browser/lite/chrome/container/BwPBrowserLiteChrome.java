package com.facebook.browser.lite.chrome.container;

import X.C340027ka;
import X.C340037kb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;

public class BwPBrowserLiteChrome extends RelativeLayout {
    public Intent A00;
    public Bundle A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public BrowserLiteProgressBar A07;
    public C340027ka A08;
    public C340037kb A09;

    public void setControllers(C340027ka r1, C340037kb r2) {
        this.A08 = r1;
        this.A09 = r2;
    }

    public void setProgress(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A07;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setProgress(i);
            BrowserLiteProgressBar browserLiteProgressBar2 = this.A07;
            int i2 = 0;
            if (i == 100) {
                i2 = 8;
            }
            browserLiteProgressBar2.setVisibility(i2);
        }
    }

    public BwPBrowserLiteChrome(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BwPBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent = ((Activity) context).getIntent();
        this.A00 = intent;
        this.A01 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
    }

    public BwPBrowserLiteChrome(Context context) {
        super(context);
    }
}

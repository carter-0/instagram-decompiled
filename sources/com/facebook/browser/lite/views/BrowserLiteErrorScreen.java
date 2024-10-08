package com.facebook.browser.lite.views;

import X.C13415TZv;
import X.SlN;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class BrowserLiteErrorScreen extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public C13415TZv A02;

    public boolean getDisplayed() {
        return false;
    }

    public String getUserAction() {
        return null;
    }

    public final void A00() {
        SlN slN = (SlN) this.A02;
        slN.A01 = 0;
        slN.A00 = 0;
        Runnable runnable = slN.A03;
        if (runnable != null) {
            slN.A02.removeCallbacks(runnable);
        }
    }

    public void setAutoRetryController(C13415TZv tZv) {
        this.A02 = tZv;
    }

    public BrowserLiteErrorScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrowserLiteErrorScreen(Context context) {
        super(context, (AttributeSet) null);
    }
}

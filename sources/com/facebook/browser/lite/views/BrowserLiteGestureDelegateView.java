package com.facebook.browser.lite.views;

import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.TBR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class BrowserLiteGestureDelegateView extends LinearLayout {
    public int A00;
    public GestureDetector A01;
    public View A02;
    public BrowserLiteWrapperView A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    private boolean A00() {
        this.A05 = false;
        if (this.A06) {
            this.A06 = false;
            return false;
        }
        int i = (this.A02.getTranslationY() > (AnonymousClass7TE.A03(this.A03) * 0.2f) ? 1 : (this.A02.getTranslationY() == (AnonymousClass7TE.A03(this.A03) * 0.2f) ? 0 : -1));
        BrowserLiteWrapperView browserLiteWrapperView = this.A03;
        if (i > 0) {
            browserLiteWrapperView.A07.A09(BrowserLiteWrapperView.A0C);
            browserLiteWrapperView.A05(new TBR(browserLiteWrapperView), 0.0d, AnonymousClass7TE.A03(browserLiteWrapperView), true);
            browserLiteWrapperView.A08 = true;
            return true;
        }
        browserLiteWrapperView.A07.A04();
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        2cs r1;
        BrowserLiteWrapperView browserLiteWrapperView = this.A03;
        if (browserLiteWrapperView == null || !this.A08 || browserLiteWrapperView.A08) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            BrowserLiteWrapperView browserLiteWrapperView2 = this.A03;
            if (browserLiteWrapperView2.A08) {
                return false;
            }
            int[] chromeContainerLocationInWindow = browserLiteWrapperView2.getChromeContainerLocationInWindow();
            if (chromeContainerLocationInWindow == null) {
                num = AnonymousClass05K.A0N;
            } else if (((float) chromeContainerLocationInWindow[1]) > motionEvent.getRawY()) {
                num = AnonymousClass05K.A00;
            } else if (motionEvent.getRawY() > ((float) (chromeContainerLocationInWindow[1] + this.A03.A06.getHeightPx()))) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A01;
            }
            this.A04 = num;
            BrowserLiteWrapperView browserLiteWrapperView3 = this.A03;
            if (!browserLiteWrapperView3.A08 && (r1 = browserLiteWrapperView3.A07) != null) {
                r1.A0D.clear();
                r1.A0A(browserLiteWrapperView3.A0B);
                r1.A01();
            }
        } else if (action == 1 || action == 3) {
            A00();
        }
        return this.A01.onTouchEvent(motionEvent);
    }

    public BrowserLiteGestureDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        BrowserLiteWrapperView browserLiteWrapperView;
        int A052 = AnonymousClass0fD.A05(-1134559594);
        boolean z = false;
        if (!this.A08 || (browserLiteWrapperView = this.A03) == null || browserLiteWrapperView.A08) {
            i = -1461012081;
        } else {
            boolean onTouchEvent = this.A01.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                AnonymousClass0fD.A0C(-1808168411, A052);
                return true;
            } else if (action == 1 || action == 3) {
                z = A00();
                i = 332757770;
            } else {
                if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                i = 1411668866;
            }
        }
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }

    public BrowserLiteGestureDelegateView(Context context) {
        super(context);
    }
}

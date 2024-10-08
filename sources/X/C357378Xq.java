package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.8Xq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C357378Xq implements AnonymousClass2gO {
    public final /* synthetic */ TouchInterceptorFrameLayout A00;
    public final /* synthetic */ AnonymousClass0eM A01;

    public /* synthetic */ C357378Xq(TouchInterceptorFrameLayout touchInterceptorFrameLayout, AnonymousClass0eM r2) {
        this.A00 = touchInterceptorFrameLayout;
        this.A01 = r2;
    }

    public final void onChanged(Object obj) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A00;
        AnonymousClass0eM r1 = this.A01;
        Number number = (Number) obj;
        if (touchInterceptorFrameLayout.isLaidOut()) {
            ((C342227oF) r1.getValue()).A00(number.intValue());
        }
    }
}

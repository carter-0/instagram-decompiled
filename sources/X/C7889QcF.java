package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.QcF  reason: case insensitive filesystem */
public final class C7889QcF extends SecureWebView {
    public boolean A00 = false;
    public final C7892QcK A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.S7B, X.QcK] */
    public C7889QcF(Context context) {
        super(context);
        ? s7b = new S7B();
        this.A01 = s7b;
        C11355SOr sOr = new C11355SOr();
        sOr.A03();
        S4j A02 = sOr.A02();
        Pxk.A0T(this);
        Pxk.A0S(this);
        A02(s7b);
        getSettings().setJavaScriptEnabled(true);
        this.A01 = A02;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(1058660271);
        if (this.A00) {
            requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-580636826, A05);
        return onTouchEvent;
    }
}

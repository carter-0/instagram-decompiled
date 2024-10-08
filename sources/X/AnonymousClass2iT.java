package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.2iT  reason: invalid class name */
public final class AnonymousClass2iT extends AnonymousClass2ge {
    public 1QK A00;
    public final Context A01;
    public final C226242fw A02;
    public final AnonymousClass2iS A03;
    public final GestureDetector A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2iT(UserSession userSession, InstagramMainActivity instagramMainActivity, AnonymousClass2iS r10, 1QK r11, ProxyFrameLayout proxyFrameLayout) {
        super(instagramMainActivity);
        C226242fw r0;
        InstagramMainActivity instagramMainActivity2 = instagramMainActivity;
        this.A01 = instagramMainActivity;
        this.A03 = r10;
        ProxyFrameLayout proxyFrameLayout2 = proxyFrameLayout;
        if (proxyFrameLayout instanceof C226242fw) {
            r0 = (C226242fw) proxyFrameLayout2;
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A04 = new GestureDetector(instagramMainActivity, new AnonymousClass2iV(userSession, this, instagramMainActivity2, r11, proxyFrameLayout2));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        super.onTouch(view, motionEvent);
        return this.A04.onTouchEvent(motionEvent);
    }
}

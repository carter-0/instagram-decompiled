package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.4Wi  reason: invalid class name and case insensitive filesystem */
public final class C265804Wi implements View.OnTouchListener {
    public U1U A00;
    public C16145UpW A01;
    public final Context A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TouchInterceptorFrameLayout A06;

    public C265804Wi(View view) {
        View view2;
        0qQ.A0B(view, 1);
        Context context = view.getContext();
        0qQ.A07(context);
        this.A02 = context;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.slider_sticker_stub);
        if (viewStub == null || (view2 = viewStub.inflate()) == null) {
            view2 = view.requireViewById(R.id.slider_sticker_root);
            0qQ.A07(view2);
        }
        this.A03 = view2;
        TouchInterceptorFrameLayout requireViewById = view2.requireViewById(R.id.slider_sticker_container);
        0qQ.A07(requireViewById);
        this.A06 = requireViewById;
        View requireViewById2 = view2.requireViewById(R.id.slider_sticker);
        0qQ.A07(requireViewById2);
        this.A05 = (ImageView) requireViewById2;
        View requireViewById3 = view2.requireViewById(R.id.slider_particle_system);
        0qQ.A07(requireViewById3);
        this.A04 = requireViewById3;
    }

    public final void A01(UserSession userSession, C255783ui r9, C249693kD r10) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A06;
        View view = this.A03;
        C255783ui r2 = r9;
        C306406Ma.A04(touchInterceptorFrameLayout, r2, r10.AcY(userSession), view.getWidth(), view.getHeight(), false);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A06;
        if (touchInterceptorFrameLayout.isEnabled() && motionEvent.getActionMasked() == 0) {
            touchInterceptorFrameLayout.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final C16145UpW A00() {
        C16145UpW upW = this.A01;
        if (upW != null) {
            return upW;
        }
        0qQ.A0F("sliderStickerDrawable");
        throw AnonymousClass00P.createAndThrow();
    }
}

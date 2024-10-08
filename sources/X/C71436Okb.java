package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Okb  reason: case insensitive filesystem */
public final class C71436Okb implements View.OnTouchListener {
    public boolean A00;
    public Rect A01 = AnonymousClass7TE.A0W();
    public final GestureDetector.OnGestureListener A02;
    public final AnonymousClass0eM A03;
    public final 0sP A04;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A01;
            view.getHitRect(rect);
            rect.offsetTo(0, 0);
        }
        if (this.A00) {
            if (motionEvent.getAction() == A1U) {
                this.A00 = false;
                this.A04.invoke(motionEvent);
                return A1U;
            } else if (motionEvent.getAction() == 2 && !this.A01.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A00 = false;
                return false;
            }
        }
        return ((GestureDetector) this.A03.getValue()).onTouchEvent(motionEvent);
    }

    public C71436Okb(Context context, View view, View view2, UserSession userSession, C309426Yf r11, 0sP r12) {
        this.A04 = r12;
        this.A03 = AnonymousClass0eN.A01(new MJ8(44, context, this));
        this.A02 = new C67674MsA(2, view, view2, userSession, r11, this);
    }
}

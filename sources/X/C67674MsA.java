package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MsA  reason: case insensitive filesystem */
public final class C67674MsA extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C67674MsA(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        AnonymousClass78H r0 = (AnonymousClass78H) this.A05;
        new AnonymousClass78G(r0.A01, r0.A02, new AnonymousClass7DT((AnonymousClass7XR) r0.A03)).DA8((AnonymousClass752) this.A03, (C3263876o) this.A04);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (2 - this.A00 != 0) {
            return true;
        }
        0qQ.A0B(motionEvent, 0);
        ((C71436Okb) this.A05).A00 = false;
        0lg r3 = (0lg) this.A04;
        C309426Yf r8 = (C309426Yf) this.A03;
        View view = (View) this.A01;
        View view2 = (View) this.A02;
        if (view2 == null) {
            return true;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, r3, 36324269294628790L)) {
            return true;
        }
        int A042 = DbS.A04(r2, r3, 36605744271267129L);
        long j = r8.A0O;
        if (((double) j) > 0.0d && (r8.A0D > 0 || ((double) (SystemClock.uptimeMillis() - j)) >= ((double) A042))) {
            return true;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        view.getHitRect(A0W);
        Rect A0W2 = AnonymousClass7TE.A0W();
        view2.getHitRect(A0W2);
        int i = A0W.left - A0W2.left;
        int i2 = A0W.top - A0W2.top;
        return C66580MXl.A0C(i, i2, A0W.width() + i, A0W.height() + i2).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                if (!AnonymousClass7TE.A1a(((2Wa) this.A01).A03)) {
                    AnonymousClass3Y5 r2 = (AnonymousClass3Y5) this.A04;
                    C52302GMs.A04((C243673Zt) ((GMQ) this.A02).A05, r2, (2Wa) this.A03, (C52302GMs) this.A05);
                    return;
                }
                return;
            case 2:
                0qQ.A0B(motionEvent, 0);
                ((C71436Okb) this.A05).A00 = true;
                break;
        }
        super.onLongPress(motionEvent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C52302GMs gMs = (C52302GMs) this.A05;
                C52302GMs.A05((AnonymousClass3Y5) this.A04, gMs.A03, gMs);
                return true;
            case 1:
                AnonymousClass78H r3 = (AnonymousClass78H) this.A05;
                UserSession userSession = r3.A02;
                AnonymousClass0iw r4 = r3.A01;
                AnonymousClass7FV r1 = (AnonymousClass7FV) this.A03;
                C67000MgY.A00(r4, userSession, (Long) null, "selfie_thumbnail_xma", "tap", "direct_thread", (String) null, 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("viewer_is_sender", String.valueOf(r1.CU2()))}));
                List A1I = AnonymousClass7TE.A1I(this.A01);
                View view = (View) this.A02;
                ((C332917Wy) r3.A03).Cpz(view, C68168N3i.A00(view), AnonymousClass05K.A00, A1I, 0, r1.BCL(), false);
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (2 - this.A00 != 0) {
            return super.onSingleTapUp(motionEvent);
        }
        0qQ.A0B(motionEvent, 0);
        C71436Okb okb = (C71436Okb) this.A05;
        okb.A00 = false;
        okb.A04.invoke(motionEvent);
        return true;
    }
}

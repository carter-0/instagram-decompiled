package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6Lb  reason: invalid class name and case insensitive filesystem */
public final class C306166Lb implements View.OnTouchListener {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Handler A07;
    public final GestureDetector.OnGestureListener A08;
    public final C239733Hx A09;
    public final UserSession A0A;
    public final C309426Yf A0B;
    public final C309676Ze A0C;
    public final AnonymousClass0eM A0D;
    public final int A0E;
    public final int A0F;
    public final C255773uh A0G;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        C255773uh r1 = this.A0G;
        if (r1.A14() || r1.A1M() || r1.A1I()) {
            return false;
        }
        C309676Ze r2 = this.A0C;
        C255783ui Bw8 = r2.Bw8();
        this.A01 = view.getWidth();
        this.A00 = view.getHeight();
        boolean onTouchEvent = ((GestureDetector) this.A0D.getValue()).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                this.A02 = System.currentTimeMillis();
            }
        } else if (onTouchEvent) {
            if (Bw8 != null && Bw8.A1f.equals("interactive_media_tooltip_from_tap_and_hold") && r2.Bw8() == null) {
                r2.DvB(true);
                return onTouchEvent;
            }
        } else if (this.A03 && C56339Hwq.A01(this.A09)) {
            r2.DIX(A00(motionEvent, this, "interactive_media_tooltip_from_tap_and_hold"), false);
            return onTouchEvent;
        } else if ((Bw8 == null || !Bw8.A1f.equals("interactive_media_tooltip_from_tap_and_hold")) && !r2.CVf()) {
            r2.DvB(false);
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    public static final C255783ui A00(MotionEvent motionEvent, C306166Lb r5, String str) {
        C255783ui r3 = new C255783ui();
        r3.A11 = AnonymousClass3WT.CTA;
        r3.A03 = motionEvent.getRawX();
        r3.A04 = motionEvent.getRawY() - ((float) r5.A0E);
        r3.A1p = true;
        r3.A1f = str;
        r3.A1N = C309506Yn.A03(r5.A06, r5.A0A, r5.A0G);
        r3.A08 = r5.A0F;
        return r3;
    }

    public C306166Lb(Context context, UserSession userSession, Reel reel, C255773uh r7, C309426Yf r8, C309676Ze r9) {
        int i;
        this.A06 = context;
        this.A0A = userSession;
        this.A0G = r7;
        this.A0B = r8;
        this.A0C = r9;
        this.A09 = reel.A0A;
        this.A05 = AnonymousClass0nB.A01(context);
        this.A04 = AnonymousClass4EQ.A02(context);
        this.A0F = (int) 182.A01(0Tu.A06, userSession, 36600534476328855L);
        if (C316216lI.A0B(context)) {
            i = C316216lI.A03(context);
        } else {
            i = 0;
        }
        this.A0E = i;
        this.A0D = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 8));
        this.A07 = new Handler(Looper.getMainLooper());
        this.A08 = new AnonymousClass6Lc(this);
        this.A02 = -1;
    }
}

package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.GdV  reason: case insensitive filesystem */
public final class C52839GdV extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public String A01;
    public MotionEvent A02;
    public View A03;
    public Integer A04 = AnonymousClass05K.A0N;
    public final 2V5 A05;
    public final 2Wa A06;
    public final C267324bN A07;
    public final C52058GDe A08;
    public final UserSession A09;
    public final AnonymousClass4DU A0A;
    public final AnonymousClass3OA A0B;
    public final C56374HxS A0C;
    public final Context A0D;
    public final GestureDetector A0E;
    public final C238863Ds A0F;
    public final 2V5 A0G;
    public final C59543JNp A0H;
    public final C55753Hmo A0I;
    public final C52046GCs A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public final void A02(View view, C70762Uy r7, String str) {
        this.A00 = r7.A01;
        this.A03 = view;
        this.A01 = str;
        MotionEvent motionEvent = r7.A00;
        this.A0E.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    MotionEvent motionEvent2 = this.A02;
                    if (motionEvent2 != null && AnonymousClass7TE.A00(motionEvent.getRawY(), motionEvent2.getRawY()) > 40.0f) {
                        A01(this, false);
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            A01(this, false);
            if (motionEvent.getAction() == 1 && this.A04 == AnonymousClass05K.A0C && Math.abs(C51970G9q.A02(this.A05)) >= ((float) AnonymousClass0nB.A01(this.A0D)) / 2.0f) {
                A00(motionEvent);
            } else {
                C51967G9n.A19(this.A05, 0.0f);
            }
            this.A02 = null;
            View view2 = this.A03;
            if (view2 != null) {
                view2.setPressed(false);
            }
            this.A04 = AnonymousClass05K.A0N;
            C51967G9n.A19(this.A0G, 1.0f);
        } else if (this.A0L || this.A0K) {
            A01(this, true);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        this.A04 = AnonymousClass05K.A00;
        AnonymousClass4DU r13 = this.A0A;
        UserSession userSession = this.A09;
        AnonymousClass3OA r11 = this.A0B;
        C267324bN r10 = this.A07;
        C52058GDe gDe = this.A08;
        C55753Hmo hmo = this.A0I;
        C59543JNp jNp = this.A0H;
        C238863Ds r7 = this.A0F;
        C52046GCs gCs = this.A0J;
        View view = this.A03;
        View view2 = this.A00;
        String str = this.A01;
        2Wa r2 = this.A06;
        0qQ.A0B(r13, 1);
        C51974G9v.A1S(userSession, r11, r10, gDe, hmo);
        C51969G9p.A1O(gCs, 9, r2);
        if (view != null) {
            view.setPressed(false);
        }
        if (!(str == null || view2 == null || view == null)) {
            C55753Hmo hmo2 = hmo;
            AnonymousClass3OA r20 = r11;
            AnonymousClass4DU r19 = r13;
            UserSession userSession2 = userSession;
            C52058GDe gDe2 = gDe;
            C267324bN r16 = r10;
            2Wa r14 = r2;
            C238863Ds r132 = r7;
            View view3 = view2;
            MotionEvent motionEvent3 = motionEvent2;
            C56374HxS.A00(motionEvent3, view3, r132, r14, jNp, r16, gDe2, userSession2, r19, r20, hmo2, gCs, "double_tap", str, false);
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent == null || ((!this.A0K || f > -350.0f) && (!this.A0L || f < 350.0f))) {
            return false;
        }
        A00(motionEvent2);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        Integer num = this.A04;
        if (num == AnonymousClass05K.A00) {
            this.A04 = AnonymousClass05K.A0N;
        } else if (num == AnonymousClass05K.A0N) {
            this.A04 = AnonymousClass05K.A01;
            AnonymousClass4DU r14 = this.A0A;
            UserSession userSession = this.A09;
            AnonymousClass3OA r12 = this.A0B;
            C267324bN r11 = this.A07;
            C52058GDe gDe = this.A08;
            C55753Hmo hmo = this.A0I;
            C59543JNp jNp = this.A0H;
            C238863Ds r7 = this.A0F;
            C52046GCs gCs = this.A0J;
            View view = this.A03;
            View view2 = this.A00;
            String str = this.A01;
            2Wa r3 = this.A06;
            boolean z = this.A0M;
            0qQ.A0B(r14, 1);
            C51974G9v.A1S(userSession, r12, r11, gDe, hmo);
            C51969G9p.A1O(gCs, 9, r3);
            if (view != null) {
                view.setPressed(true);
            }
            if (str != null && view2 != null && view != null) {
                C52046GCs gCs2 = gCs;
                C55753Hmo hmo2 = hmo;
                AnonymousClass3OA r15 = r12;
                C52058GDe gDe2 = gDe;
                C59543JNp jNp2 = jNp;
                C238863Ds r8 = r7;
                View view3 = view2;
                MotionEvent motionEvent3 = motionEvent2;
                C56374HxS.A00(motionEvent3, view3, r8, r3, jNp2, r11, gDe2, userSession, r14, r15, hmo2, gCs2, "long_press", str, z);
            }
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        2V5 r1;
        Float valueOf;
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent == null || (!(z = this.A0L) && !this.A0K)) {
            return false;
        }
        if (AnonymousClass7TE.A00(motionEvent2.getRawY(), motionEvent.getRawY()) > 40.0f) {
            A01(this, false);
        }
        this.A02 = motionEvent;
        this.A04 = AnonymousClass05K.A0C;
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        if ((this.A0K || rawX >= 0.0f) && (z || rawX <= 0.0f)) {
            r1 = this.A05;
            valueOf = Float.valueOf(rawX);
        } else {
            r1 = this.A05;
            valueOf = Float.valueOf(0.0f);
        }
        r1.A00(valueOf);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        AnonymousClass4DU r13 = this.A0A;
        UserSession userSession = this.A09;
        AnonymousClass3OA r11 = this.A0B;
        C267324bN r10 = this.A07;
        C52058GDe gDe = this.A08;
        C55753Hmo hmo = this.A0I;
        C59543JNp jNp = this.A0H;
        C238863Ds r7 = this.A0F;
        C52046GCs gCs = this.A0J;
        View view = this.A03;
        View view2 = this.A00;
        String str = this.A01;
        2Wa r2 = this.A06;
        0qQ.A0B(r13, 1);
        C51974G9v.A1S(userSession, r11, r10, gDe, hmo);
        C51969G9p.A1O(gCs, 9, r2);
        if (view != null) {
            view.setPressed(false);
        }
        if (!(str == null || view2 == null || view == null)) {
            C55753Hmo hmo2 = hmo;
            AnonymousClass3OA r20 = r11;
            AnonymousClass4DU r19 = r13;
            UserSession userSession2 = userSession;
            C52058GDe gDe2 = gDe;
            C267324bN r16 = r10;
            2Wa r14 = r2;
            C238863Ds r132 = r7;
            View view3 = view2;
            MotionEvent motionEvent3 = motionEvent2;
            C56374HxS.A00(motionEvent3, view3, r132, r14, jNp, r16, gDe2, userSession2, r19, r20, hmo2, gCs, "single_tap", str, false);
        }
        return true;
    }

    private final void A00(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.A02;
        if (motionEvent2 != null) {
            int A012 = AnonymousClass0nB.A01(this.A0D);
            if (A012 < 1) {
                A012 = 1;
            }
            2V5 r5 = this.A05;
            int i = (C51970G9q.A02(r5) > 0.0f ? 1 : (C51970G9q.A02(r5) == 0.0f ? 0 : -1));
            float[] fArr = new float[2];
            fArr[0] = C51970G9q.A02(r5);
            float f = (float) A012;
            float f2 = f;
            if (i < 0) {
                f = -f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration((long) ((500.0f * Math.abs(C51970G9q.A02(r5))) / f2));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            I84.A01(ofFloat, this, 32);
            ofFloat.addListener(new C56673I7c(5, this, motionEvent, motionEvent2));
            ofFloat.start();
        }
    }

    public static void A01(C52839GdV gdV, boolean z) {
        ViewParent parent;
        View view = gdV.A00;
        if (view != null && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.A03;
        if (view == null || this.A04 == AnonymousClass05K.A00) {
            return true;
        }
        2V5 r2 = this.A0G;
        boolean z = this.A0M;
        0qQ.A0B(r2, 1);
        if (z) {
            C51967G9n.A19(r2, 0.97f);
        }
        view.setPressed(true);
        return false;
    }

    public C52839GdV(Context context, C238863Ds r5, 2V5 r6, 2V5 r7, 2Wa r8, C59543JNp jNp, C267324bN r10, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r13, AnonymousClass3OA r14, C55753Hmo hmo, C56374HxS hxS, C52046GCs gCs, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1S(userSession, r13, r10, gDe, r14);
        AnonymousClass7TF.A1G(hmo, 7, r8);
        C56374HxS hxS2 = hxS;
        C52046GCs gCs2 = gCs;
        DbW.A1P(gCs2, 11, hxS2);
        C51969G9p.A1S(r6, 16, r7);
        this.A0D = context;
        this.A09 = userSession;
        this.A0A = r13;
        this.A07 = r10;
        this.A08 = gDe;
        this.A0B = r14;
        this.A0I = hmo;
        this.A0H = jNp;
        this.A06 = r8;
        this.A0F = r5;
        this.A0J = gCs2;
        this.A0C = hxS2;
        this.A0M = z;
        this.A0L = z2;
        this.A0K = z3;
        this.A0G = r6;
        this.A05 = r7;
        this.A0E = new GestureDetector(context, new C226372gh(this), AnonymousClass7TF.A0D());
    }
}

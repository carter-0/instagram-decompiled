package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3LT  reason: invalid class name */
public final class AnonymousClass3LT implements GestureDetector.OnGestureListener {
    public long A00 = 0;
    public C296575qI A01;
    public C296505qA A02;
    public C238833Dp A03;
    public Boolean A04;
    public final Context A05;
    public final Handler A06;
    public final GestureDetector A07;
    public final A7M A08;
    public final C21468Xc0 A09;
    public final C381029b3 A0A;
    public final C340067ke A0B;
    public final WeakReference A0C;
    public final Map A0D = new HashMap();
    public final /* synthetic */ C340057kd A0E;

    public AnonymousClass3LT(Context context, A7M a7m, C340057kd r10, C340067ke r11, 0lg r12) {
        this.A0E = r10;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A06 = handler;
        Context context2 = context;
        this.A05 = context.getApplicationContext();
        this.A0C = new WeakReference(r12);
        this.A07 = new GestureDetector(context, this);
        this.A0B = r11;
        this.A08 = a7m;
        A8A a8a = a7m.A02;
        this.A0A = new C381029b3(context2, a8a.A0A ? null : handler, a8a, this, r11.A05);
        this.A09 = new C21468Xc0(r11.A01, a7m.A00, r11.A03, r11.A04);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C296495q9 r6;
        long j;
        Object obj = this.A0B.A05.get();
        A8A a8a = this.A08.A02;
        if (motionEvent == null || motionEvent2 == null || (!a8a.A0F && (obj == null || !a8a.A0E.contains(obj)))) {
            z = false;
        } else {
            z = true;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                r6 = C296495q9.TOUCH_MOVED_RIGHT;
            } else {
                r6 = C296495q9.TOUCH_MOVED_LEFT;
            }
        } else if (f2 > 0.0f) {
            r6 = C296495q9.TOUCH_MOVED_DOWN;
        } else {
            r6 = C296495q9.TOUCH_MOVED_UP;
        }
        MotionEvent motionEvent3 = motionEvent2;
        if (a8a.A0G) {
            motionEvent3 = motionEvent;
        }
        if (motionEvent == null || motionEvent2 == null) {
            j = 0;
        } else {
            j = motionEvent2.getEventTime() - motionEvent.getDownTime();
        }
        boolean A012 = A01(motionEvent3, r6, j, z);
        if (!a8a.A07) {
            return false;
        }
        return A012;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void A00(String str, String str2) {
        XnF xnF = this.A08.A00;
        String str3 = str2;
        if (xnF.A05) {
            C21468Xc0 xc0 = this.A09;
            xc0.A02.post(new Y2O(new C296605qL(str, "ExternalNavigationModule", str3, (String) null), xc0));
            return;
        }
        C296575qI r9 = this.A01;
        C296505qA r8 = this.A02;
        if (r8 != null && r9 != null && r9.A02(new C296605qL(str, "ExternalNavigationModule", str3, (String) null))) {
            C39664A4e a4e = r8.A09;
            if (!a4e.A01 || r8.A0C.now() - r8.A05 <= a4e.A00) {
                this.A06.removeCallbacksAndMessages((Object) null);
                if (!r9.A00()) {
                    this.A0B.A03.A01(r8, r9, (List) this.A0D.get(r8.A0D), 0.0d, xnF.A04);
                }
                this.A0D.clear();
            }
        }
    }

    public final boolean A01(MotionEvent motionEvent, C296495q9 r24, long j, boolean z) {
        Boolean CWF;
        long j2;
        C296565qH A002;
        MotionEvent motionEvent2 = motionEvent;
        if (motionEvent == null) {
            return false;
        }
        C340067ke r5 = this.A0B;
        AnonymousClass0JR r0 = r5.A04;
        C296505qA r14 = this.A02;
        A7M a7m = this.A08;
        C296505qA r12 = new C296505qA(motionEvent2, r14, a7m.A01, r24, r0, j);
        Activity activity = (Activity) AnonymousClass3GM.A00.get();
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        if (z && (A002 = r5.A02.A00(motionEvent2.getRawX(), motionEvent2.getRawY())) != null) {
            r12.A0G.addAll(A002.A03);
            r12.A0F.addAll(A002.A02);
            r12.A00 = A002.A00;
            r12.A0E.addAll(A002.A01);
            r12.A02 = A002.A05;
            r12.A0H.putAll(A002.A04);
        }
        if (a7m.A04) {
            r5.A00.EXY(r12);
        }
        A8A a8a = a7m.A02;
        if (a8a.A0H) {
            C296505qA r8 = this.A02;
            if (r8 != null && r8.A0B == C296495q9.TOUCH_UP) {
                long j3 = r12.A07 - r8.A07;
                if (j3 >= ((long) a8a.A0C) && j3 <= ((long) a8a.A0B)) {
                    float f = r12.A03 - r8.A03;
                    float f2 = r12.A04 - r8.A04;
                    if ((f * f) + (f2 * f2) <= ((float) a8a.A0D)) {
                        j2 = this.A00 + 1;
                        this.A00 = j2;
                        r12.A01 = Long.valueOf(j2);
                    }
                }
            }
            this.A00 = 0;
            j2 = 0;
            r12.A01 = Long.valueOf(j2);
        }
        if (this.A00 == 0) {
            AnonymousClass57r r02 = r12.A00;
            if (r02 == null) {
                CWF = null;
            } else {
                CWF = r02.CWF();
            }
            this.A04 = CWF;
        }
        XnF xnF = a7m.A00;
        if (xnF.A05) {
            C21468Xc0 xc0 = this.A09;
            xc0.A02.post(new Y2N(xc0, r12));
        } else {
            C296575qI r82 = new C296575qI(r5.A01);
            r82.A01();
            if (xnF.A03) {
                this.A0D.put(r12.A0D, new ArrayList());
                this.A06.postDelayed(new C296615qM(r82, r12, this, 0, a7m.A03), xnF.A00);
            }
            this.A01 = r82;
        }
        if (a8a.A05) {
            r5.A05.get();
            C39663A4d A003 = C392379ui.A00(r12, a8a);
            if (A003 != null) {
                r5.A03.A00(r5.A01.A00(), (AnonymousClass57r) null, A003, r12, this.A04);
            }
        }
        this.A02 = r12;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        A01(motionEvent, C296495q9.LONG_TOUCHED, (long) ViewConfiguration.getLongPressTimeout(), true);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j;
        C296495q9 r3 = C296495q9.TOUCH_UP;
        MotionEvent motionEvent2 = motionEvent;
        if (motionEvent != null) {
            j = motionEvent.getEventTime() - motionEvent.getDownTime();
        } else {
            j = 0;
        }
        return A01(motionEvent2, r3, j, true);
    }
}

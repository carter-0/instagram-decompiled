package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.UHy  reason: case insensitive filesystem */
public final class C14980UHy extends C283285Gy {
    public boolean A00;
    public final C14691U1q A01;
    public final C309646Zb A02;
    public final GC9 A03;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00 = false;
        C14691U1q u1q = this.A01;
        u1q.removeCallbacksAndMessages((Object) null);
        u1q.sendEmptyMessageDelayed(1, (long) ViewConfiguration.getLongPressTimeout());
        this.A02.DA9(motionEvent.getRawX());
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent2, 1);
        this.A01.removeCallbacksAndMessages((Object) null);
        MotionEvent motionEvent4 = motionEvent;
        if (motionEvent == null) {
            return false;
        }
        return this.A03.A01(motionEvent4, motionEvent3, this.A02, f, f2, this.A00);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A01.removeCallbacksAndMessages((Object) null);
        if (this.A00) {
            return false;
        }
        this.A02.Dqb(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01.removeCallbacksAndMessages((Object) null);
        if (this.A00) {
            return false;
        }
        this.A02.DhE();
        return true;
    }

    public C14980UHy(Context context, C309646Zb r4) {
        this.A02 = r4;
        C14691U1q u1q = new C14691U1q();
        this.A01 = u1q;
        this.A03 = new GC9(context);
        u1q.A00 = new C17259VOm(this);
    }
}

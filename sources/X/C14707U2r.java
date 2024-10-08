package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.U2r  reason: case insensitive filesystem */
public final class C14707U2r extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public C14707U2r(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                return !((AnonymousClass37F) ((C18903WBw) this.A01).A03.A0H).A0g;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f3 = f;
        float f4 = f2;
        switch (this.A00) {
            case 1:
                if (Math.abs(f4) <= Math.abs(f3)) {
                    return false;
                }
                if (motionEvent4.getRawY() >= motionEvent3.getRawY()) {
                    return true;
                }
                C18903WBw wBw = (C18903WBw) this.A01;
                LOO loo = wBw.A03;
                if (((AnonymousClass37F) loo.A0H).A0g) {
                    return true;
                }
                String str = loo.A07;
                String str2 = wBw.A05;
                String str3 = wBw.A06;
                long j = wBw.A02;
                String str4 = wBw.A07;
                long j2 = wBw.A01;
                boolean z = wBw.A0C;
                boolean z2 = wBw.A09;
                boolean z3 = wBw.A0D;
                boolean z4 = wBw.A0A;
                boolean z5 = z3;
                boolean z6 = z2;
                boolean z7 = z;
                LOO.A00(loo, wBw.A04, str, str2, str3, str4, wBw.A08, j, j2, z7, z6, z5, z4, wBw.A0B);
                return true;
            case 2:
                if (motionEvent4.getRawY() <= motionEvent3.getRawY()) {
                    return true;
                }
                ((ReelDashboardFragment) this.A01).A0G();
                return true;
            default:
                return super.onFling(motionEvent3, motionEvent4, f3, f4);
        }
    }
}

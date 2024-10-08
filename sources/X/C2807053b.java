package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.53b  reason: invalid class name and case insensitive filesystem */
public final class C2807053b implements View.OnTouchListener {
    public final /* synthetic */ C376689Iy A00;
    public final /* synthetic */ AnonymousClass53Y A01;
    public final /* synthetic */ String A02;

    public C2807053b(C376689Iy r1, AnonymousClass53Y r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener Dsc;
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getAction() != 0) {
            return false;
        }
        AnonymousClass53Y r0 = this.A01;
        C376689Iy r4 = this.A00;
        String str = this.A02;
        AnonymousClass4i1 r02 = r0.A00;
        String str2 = r4.A02;
        if (str2 == null || (Dsc = r02.A00.Dsc((1Xj) r4.A01, str2, str)) == null) {
            return false;
        }
        return Dsc.onTouch(view, motionEvent);
    }
}

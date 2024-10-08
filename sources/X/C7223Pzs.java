package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Pzs  reason: case insensitive filesystem */
public final class C7223Pzs implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AnonymousClass37F A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7218Pzn pzn;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        AnonymousClass37F r2 = this.A02;
        if (r2.A0D == null) {
            return false;
        }
        if (r2.A0P && r2.A0O && !r2.A0M) {
            this.A00.onTouchEvent(motionEvent);
        }
        if (!AnonymousClass37F.A07(motionEvent, this.A01, r2) || (pzn = r2.A0D) == null || pzn.onTouch(view, motionEvent) != A1U) {
            return false;
        }
        return true;
    }

    public C7223Pzs(GestureDetector gestureDetector, Fragment fragment, AnonymousClass37F r3) {
        this.A02 = r3;
        this.A00 = gestureDetector;
        this.A01 = fragment;
    }
}

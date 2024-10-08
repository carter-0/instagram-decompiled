package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOt  reason: case insensitive filesystem */
public final class C40037AOt implements View.OnTouchListener {
    public final /* synthetic */ AZU A00;

    public C40037AOt(AZU azu) {
        this.A00 = azu;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        AZU azu = this.A00;
        if (azu.A04 == null && (view3 = azu.A02) != null) {
            C18708VyZ.A00(view3);
        }
        if (azu.A03 == null && (view2 = azu.A01) != null) {
            C18708VyZ.A00(view2);
        }
        view.performClick();
        return true;
    }
}

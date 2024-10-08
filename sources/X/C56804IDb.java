package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IDb  reason: case insensitive filesystem */
public final class C56804IDb implements View.OnTouchListener {
    public final C55845HoS A00;
    public final /* synthetic */ C55778HnD A01;
    public final /* synthetic */ AnonymousClass4GL A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public C56804IDb(C55778HnD hnD, AnonymousClass4GL r9, 1Xj r10, AnonymousClass3W1 r11, int i) {
        this.A02 = r9;
        this.A01 = hnD;
        this.A03 = r10;
        this.A04 = r11;
        this.A00 = new C55845HoS(r9.A00, r9.A02, hnD, r10, r11, i);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (182.A06(0Tu.A06, this.A02.A01, 36321065249088569L)) {
            MediaFrameLayout mediaFrameLayout = this.A01.A03;
            if (mediaFrameLayout.getTouchDelegate() != null && mediaFrameLayout.getTouchDelegate().onTouchEvent(motionEvent)) {
                return true;
            }
        }
        C55845HoS hoS = this.A00;
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout2 = hoS.A03.A03;
            if (mediaFrameLayout2.getParent() != null) {
                mediaFrameLayout2.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            MediaFrameLayout mediaFrameLayout3 = hoS.A03.A03;
            if (mediaFrameLayout3.getParent() != null) {
                mediaFrameLayout3.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        hoS.A06.A01(motionEvent);
        hoS.A01.onTouchEvent(motionEvent);
        return true;
    }
}

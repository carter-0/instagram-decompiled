package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class IDU implements View.OnTouchListener {
    public final C55847HoU A00;
    public final /* synthetic */ C254173s3 A01;
    public final /* synthetic */ C55725HmM A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (182.A06(0Tu.A06, this.A02.A02, 36321065249088569L)) {
            MediaFrameLayout mediaFrameLayout = this.A01.A09;
            if (mediaFrameLayout.getTouchDelegate() != null && mediaFrameLayout.getTouchDelegate().onTouchEvent(motionEvent)) {
                return true;
            }
        }
        C55847HoU hoU = this.A00;
        hoU.A06.A01(motionEvent);
        hoU.A01.onTouchEvent(motionEvent);
        return true;
    }

    public IDU(C376539Ij r2, AnonymousClass4GO r3, C254173s3 r4, C55725HmM hmM) {
        this.A01 = r4;
        this.A02 = hmM;
        this.A00 = (C55847HoU) ((0sL) ((C53400GnX) r2.A01).A00).invoke(r4, r3);
    }
}

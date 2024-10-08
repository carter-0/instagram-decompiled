package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jpz  reason: case insensitive filesystem */
public final class C60714Jpz extends RecyclerView {
    public final /* synthetic */ C65072Lms A00;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00.A03 == C62457Kg7.GRID) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60714Jpz(Context context, C65072Lms lms) {
        super(context, (AttributeSet) null);
        this.A00 = lms;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A03 = DbX.A03(motionEvent, -1454541206);
        if (this.A00.A03 == C62457Kg7.GRID) {
            onTouchEvent = false;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        AnonymousClass0fD.A0C(-973666298, A03);
        return onTouchEvent;
    }
}

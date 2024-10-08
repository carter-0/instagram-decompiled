package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.OkS  reason: case insensitive filesystem */
public final class C71427OkS implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public C71427OkS(Context context, BottomSheetFragment bottomSheetFragment, AnonymousClass37D r5) {
        this.A00 = new GestureDetector(context, new C67675MsB(3, r5, bottomSheetFragment));
    }
}

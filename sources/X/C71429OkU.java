package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.OkU  reason: case insensitive filesystem */
public final class C71429OkU implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public C71429OkU(Context context, C279864zZ r4, IgImageView igImageView, C323296xG r6) {
        this.A00 = new GestureDetector(context, new C67673Ms9(2, igImageView, r4, r6));
    }
}

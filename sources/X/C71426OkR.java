package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.OkR  reason: case insensitive filesystem */
public final class C71426OkR implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public C71426OkR(IgImageView igImageView, AnonymousClass77B r11, AnonymousClass78H r12, AnonymousClass752 r13, C3263876o r14) {
        AnonymousClass77B r4 = r11;
        C3263876o r6 = r14;
        this.A00 = new GestureDetector(r12.A00, new C67674MsA(1, r4, igImageView, r6, r13, r12));
    }
}

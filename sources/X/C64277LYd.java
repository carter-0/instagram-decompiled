package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.LYd  reason: case insensitive filesystem */
public final class C64277LYd implements View.OnTouchListener {
    public final MQC A00;
    public final Folder A01;

    public C64277LYd(MQC mqc, Folder folder) {
        0qQ.A0B(folder, 2);
        this.A00 = mqc;
        this.A01 = folder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        MQC mqc = this.A00;
        Folder folder = this.A01;
        int actionMasked = motionEvent.getActionMasked();
        AnonymousClass8ZW r2 = ((JW9) mqc).A04;
        if (r2 == null || folder.A02 != -5) {
            return false;
        }
        if (actionMasked == A1U) {
            r2.DX6(folder);
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            view.setPressed(A1U);
            return A1U;
        } else if (actionMasked2 != A1U && actionMasked2 != 3) {
            return A1U;
        } else {
            view.setPressed(false);
            return A1U;
        }
    }
}
